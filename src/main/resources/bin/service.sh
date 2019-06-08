#!/bin/sh

# JDk 路径
JAVA_HOME=/opt/jdk1.8
# APP 文件名
APP_NAME=lz-demo-0.0.1.jar
# 应用组
APP_GROUP=lz
# eureka 注册地址
EUREKA_REGISTER_ADDR=http://127.0.0.1:8001/eureka
# 启动环境
ENV=dev

APP_HOME=$(cd `dirname $0`; pwd)
URANDOM=-Djava.security.egd=file:/dev/./urandom

psid=0
checkpid() {
   ps=`ps -ef | grep $APP_HOME/$APP_NAME | grep -v grep`
   if [ -n "$ps" ]; then
      psid=`echo $ps | awk '{print $2}'`
   else
      psid=0
   fi
}

start() {
   checkpid
   if [ $psid -ne 0 ]; then
      echo "================================"
      echo "warn: $APP_NAME already started! (pid=$psid)"
      echo "================================"
   else
      echo -n "Starting $APP_NAME ..."
      cd $APP_HOME
      nohup $JAVA_HOME/bin/java $URANDOM -jar $APP_HOME/$APP_NAME --eureka.client.service-url.defaultZone=$EUREKA_REGISTER_ADDR --spring.profiles.active=$ENV --spring.application.group=$APP_GROUP >/dev/null 2>&1 &

      checkpid
      if [ $psid -ne 0 ]; then
         echo "(pid=$psid) [OK]"

         # startup and backup
         if [ ! -d 'bak' ]; then
           mkdir bak
         fi

         echo -n "Backuping $APP_NAME to ./bak/$APP_NAME.`date +%Y%m%d%H%M%S`.tar.gz ..."
         tar -zcf ./bak/$APP_NAME.`date +%Y%m%d%H%M%S`.tar.gz $APP_NAME
         echo "[OK]"
      else
         echo "[Failed]"
      fi
   fi
}
stop() {
   checkpid
   if [ $psid -ne 0 ]; then
      echo -n "Stopping $APP_NAME ...(pid=$psid) "
      kill -9 $psid
      if [ $? -eq 0 ]; then
         echo "[OK]"
      else
         echo "[Failed]"
      fi

      checkpid
      if [ $psid -ne 0 ]; then
         stop
      fi
   else
      echo "================================"
   fi
}
case "$1" in
   'start')
      start
      ;;
   'stop')
     stop
     ;;
   'restart')
     stop
     start
     ;;
   'status')
     status
     ;;
   'info')
     info
     ;;
  *)
     echo "Usage: $0 {start|stop|restart}"
     exit 1
esac
exit 0
