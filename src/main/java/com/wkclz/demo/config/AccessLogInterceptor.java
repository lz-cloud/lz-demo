package com.wkclz.demo.config;

import com.wkclz.core.helper.AccessHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 * Created: wangkaicun @ 2017-10-18 下午11:41
 */
// @Component
public class AccessLogInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private AccessHelper accessHelper;

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse rep, Object handler) {
        /*
        AccessLog accessLog = accessHelper.getAccessLog(req);
        if (accessLog!=null){
            CmaAccessLog casAccessLog = new CmaAccessLog();
            BeanUtils.copyProperties(accessLog, casAccessLog);
            cmsAccessLogRepo.insert(casAccessLog, req);
        }
        */
        return true;
    }

}
