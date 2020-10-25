package com.wkclz.demo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.wkclz.core.base.Sys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEncryptableProperties
public class Application {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Application.class);
        ApplicationContext applicationContext = app.run(args);
        Sys.setEnv(applicationContext);

    }

}

