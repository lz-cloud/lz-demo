package com.wkclz.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

@Component
@MapperScan("com.wkclz.demo.dao")
public class AppDruidDataSource {
    // do nothing
}
