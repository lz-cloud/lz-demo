package com.wkclz.demo.config;

import com.wkclz.core.helper.GenHelper;

public class GenCode {

    // 授权码 ，一个模块一个码
    private final static String AUTH_CODE = "e80a180b2e7d4c45acdd8d2b6c15c284";

    public static void main(String[] args) {
        // 代码生成
        GenHelper.genCodde(AUTH_CODE);
    }

}
