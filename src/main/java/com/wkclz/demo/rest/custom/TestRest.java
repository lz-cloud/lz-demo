package com.wkclz.demo.rest.custom;

import com.wkclz.sdk.domain.pay.PayOrder;
import com.wkclz.sdk.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestRest {

    @Autowired
    private PayService payService;

    @GetMapping("/test")
    public void test(HttpServletRequest req, HttpServletResponse rep){
        PayOrder payOrder = new PayOrder();
        payService.payOrderNew(rep, payOrder);
    }
}
