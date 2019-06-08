package com.wkclz.demo.config;

import com.wkclz.core.config.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description:
 * Created: wangkaicun @ 2017-10-18 下午11:45
 */
// @Configuration
public class AppInterceptor implements WebMvcConfigurer {

    @Autowired
    private AccessLogInterceptor accessLogInterceptor;
    @Autowired
    private AuthInterceptor authInterceptor;


    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                // 多个拦截器组成一个拦截器链
                // addPathPatterns 用于添加拦截规则
                // excludePathPatterns 用户排除拦截
                // TODO 在 sys 之后，此处需要拦截
                // registry.addInterceptor(accessLogInterceptor).addPathPatterns("/**");
                // registry.addInterceptor(authInterceptor).addPathPatterns("/**");
            }
        };
    }

}
