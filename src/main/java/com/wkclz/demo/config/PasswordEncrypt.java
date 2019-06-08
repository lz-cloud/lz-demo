package com.wkclz.demo.config;

import com.wkclz.core.base.Constant;
import com.wkclz.core.util.SecretUtil;

public class PasswordEncrypt {

    public static void main(String[] args) {
        String password = SecretUtil.getEncryptPassword("password");
        System.out.println("处理后的密码是：" +Constant.CONFIG_ENCRYPTED_PREFIX + password);
    }
}
