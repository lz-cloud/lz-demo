package com.wkclz.demo.rest.custom.scheduler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0 0 * * * *")
    public void test() {
        logger.info("=======> 定时任务示例----> {}", "整点执行");
    }


}
