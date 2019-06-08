package com.wkclz.demo.controller.custom;

import com.wkclz.core.base.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @GetMapping("/test")
    public Result test(HttpServletRequest req){
        Result result = new Result();
        return result.setOk();
    }
}
