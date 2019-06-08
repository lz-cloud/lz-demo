package com.wkclz.demo.config;

import com.wkclz.core.base.Sys;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 系统配置初始化
 */
@Component
@Configuration
public class SystemConfigInit implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${spring.application.group}")
    private String applicationGroup;
    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public void run(ApplicationArguments args) {
        logger.info("===================>  System startup init begin...");

        // 初始化信息，需要应用名做前缀
        String appGroup = applicationGroup;
        if (StringUtils.isBlank(appGroup)){
            appGroup = applicationName;
        }
        appGroup = appGroup.toUpperCase();
        appGroup = appGroup.replace("-", "_");
        Sys.APPLICATION_GROUP = appGroup;

        logger.info("===================>  系统应用名称： {} ", appGroup);
    }


}
