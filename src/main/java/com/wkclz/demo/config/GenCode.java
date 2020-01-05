package com.wkclz.demo.config;

import com.wkclz.core.helper.GenHelper;

public class GenCode {

    // 授权码 ，一个模块一个码
    private final static String AUTH_CODE = "e80a180b2e7d4c45acdd8d2b6c15c284";

    public static void main(String[] args) {
        GenHelper.setBaseUrl("http://127.0.0.1:8051");
        GenHelper.genCode(AUTH_CODE);
    }

}
