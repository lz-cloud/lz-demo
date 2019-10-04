package com.wkclz.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * 系统启动后执行一次
 */
// @Configuration
public class SystemConfigInit implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(ApplicationArguments args) {
        // notice: 系统启动后执行一次
    }

}
