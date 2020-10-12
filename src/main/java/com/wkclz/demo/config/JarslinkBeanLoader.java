package com.wkclz.demo.config;

import com.alipay.jarslink.api.impl.ModuleLoaderImpl;
import com.alipay.jarslink.api.impl.ModuleManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JarslinkBeanLoader {

    @Bean("moduleLoader")
    public ModuleLoaderImpl moduleLoader(){
        ModuleLoaderImpl loader = new  ModuleLoaderImpl();
        return loader;
    }
    @Bean("moduleManager")
    public ModuleManagerImpl moduleManager(){
        ModuleManagerImpl manager = new  ModuleManagerImpl();
        return manager;
    }

}
