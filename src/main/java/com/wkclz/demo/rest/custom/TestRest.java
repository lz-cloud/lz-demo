package com.wkclz.demo.rest.custom;

import com.wkclz.core.base.BaseModel;
import com.wkclz.core.base.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

    private static final Logger logger = LoggerFactory.getLogger(TestRest.class);

    @PostMapping("/test")
    public Result test(@RequestBody BaseModel model, String xx){
        logger.info("info {}", model);
        return Result.data(xx);
    }


    @GetMapping("/test/delay")
    public Result testDelay(Integer delay){
        if (delay == null){
            delay = 3000;
        }

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Result.data(delay);
    }
}
