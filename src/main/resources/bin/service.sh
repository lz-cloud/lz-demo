#!/bin/sh

JAVA_HOME=/opt/jdk1.8
APP_NAME=lz-demo.jar
APP_GROUP=lz
EUREKA_REGISTER_ADDR=http://127.0.0.1:8001/eureka
ENV=dev
BAK_NUM=3

APP_HOME=$(cd `dirname $0`; pwd)

psid=0
checkpid() {
   ps=`ps -ef | grep $APP_NAME | grep -v grep`
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
      nohup $JAVA_HOME/bin/java -server -Xms128m -Xmx128m -Xmn100m -Djava.security.egd=file:/dev/./urandom -jar $APP_HOME/$APP_NAME --eureka.client.service-url.defaultZone=$EUREKA_REGISTER_ADDR --spring.profiles.active=$ENV --spring.application.group=$APP_GROUP >/dev/null 2>&1 &

      sleep 2s
      checkpid
      if [ $psid -ne 0 ]; then
         echo "(pid=$psid) [OK]"
         bakfile
      else
         echo "[Failed]"
      fi
   fi
}


bakfile() {
   echo "----------------------------------backup----------------------------------"
   # startup and backup
   if [ ! -d 'bak' ]; then
      mkdir bak
   fi

   FILE_NUM=$(cd `dirname $0`;cd $APP_HOME/bak;ls -l *.tar.gz | grep ^- | wc -l)
   echo "$FILE_NUM backup jars in ./bak"
   echo "$BAK_NUM backup jars will be keep in ./bak"
   while(($FILE_NUM > $BAK_NUM))
   do
      OLD_FILE=$(cd `dirname $0`;cd ./bak;ls -rt *.tar.gz | head -1)
      echo "Remove old backup jars:"$APP_HOME'/bak/'$OLD_FILE
      rm -f $APP_HOME'/bak/'$OLD_FILE
      let "FILE_NUM--"
   done

   echo -n "Backuping $APP_NAME to ./bak/$APP_NAME.`date +%Y%m%d%H%M%S`.tar.gz ..."
   tar -zcf ./bak/$APP_NAME.`date +%Y%m%d%H%M%S`.tar.gz $APP_NAME
   echo "[OK]"
   echo "----------------------------------backup----------------------------------"
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
