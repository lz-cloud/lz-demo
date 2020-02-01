package com.wkclz.demo.util;

import com.wkclz.core.util.ClassUtil;
import com.wkclz.core.util.ControllerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class RestUtil {

    private static final Logger logger = LoggerFactory.getLogger(ControllerUtil.class);

    public static void main(String[] args) throws ClassNotFoundException {
         Map<String, String> mappings = getMapping();
    }




    /**
     * 读取 controller
     * @return
     */
    public static Map<String, String> getMapping() {
        Map<String, String> funs = new HashMap<>();

        // 获取二级域下的所有 Class
        String clazzName = RestUtil.class.getName();
        int index = clazzName.indexOf(".", clazzName.indexOf(".") + 1);
        String packagePath = clazzName.substring(0, index);
        logger.info("package {} mappings...", packagePath);

        // 筛选出有 Controller 标识的类
        Set<Class<?>> classes = ClassUtil.getClasses(packagePath);
        List<Class> clazzList = classes.stream().filter(clazz -> clazz.isAnnotationPresent(RestController.class) || clazz.isAnnotationPresent(Controller.class)).collect(Collectors.toList());

        clazzList.forEach(clazz->logger.info(clazz.getName()));

        return funs;
    }

}

