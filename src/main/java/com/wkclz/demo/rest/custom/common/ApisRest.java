package com.wkclz.demo.rest.custom.common;

import com.wkclz.core.util.ControllerUtil;
import com.wkclz.demo.rest.custom.Routes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class ApisRest {


    @GetMapping("/download/apis")
    public String downLoadApis(HttpServletResponse rep){

        String lineSeparator = System.getProperty("line.separator");
        List<String> apis = ControllerUtil.getApis("com.wkclz.demo.controller.custom", Routes.class,"/demo");

        StringBuilder sb = new StringBuilder();
        sb.append("import request from './request'");
        sb.append(lineSeparator).append(lineSeparator);
        for (String api :apis) {
            sb.append(api).append(lineSeparator);
        }

        return sb.toString();
    }

}
