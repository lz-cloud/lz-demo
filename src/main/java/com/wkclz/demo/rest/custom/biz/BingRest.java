package com.wkclz.demo.rest.custom.biz;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BingRest {

    private static final String BING = "https://cn.bing.com/HPImageArchive.aspx?format=js&n=1";

    @GetMapping("/test/bing")
    public JSONObject testBing(){
        HttpRequest get = HttpUtil.createGet(BING);
        HttpResponse response = get.execute();
        String body = response.body();
        JSONObject jsonObject = JSONObject.parseObject(body);
        return jsonObject;
    }
}
