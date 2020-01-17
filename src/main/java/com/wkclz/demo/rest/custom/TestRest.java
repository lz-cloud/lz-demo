package com.wkclz.demo.rest.custom;

import com.wkclz.core.base.PageData;
import com.wkclz.core.base.Result;
import com.wkclz.demo.pojo.entity.DemoTypes;
import com.wkclz.demo.service.core.DemoTypesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRest {

    private static final Logger logger = LoggerFactory.getLogger(TestRest.class);

    @Autowired
    private DemoTypesService demoTypesService;

    @GetMapping("/test/page")
    public Result page(DemoTypes demoTypes) {
        PageData<DemoTypes> page = demoTypesService.pageDemo(demoTypes);
        return Result.data(page);
    }

    @GetMapping("/test/list")
    public Result list(DemoTypes demoTypes) {
        List<DemoTypes> list = demoTypesService.list(demoTypes);
        return Result.data(list);
    }

    @GetMapping("/test/query")
    public Result query() {
        DemoTypes demoTypes = demoTypesService.get(1L);
        return Result.data(demoTypes);
    }

    @GetMapping("/test/update")
    public Result update() {
        DemoTypes demoTypes = demoTypesService.get(1L);
        demoTypes.setTypeInteger(demoTypes.getTypeInteger() + 1);
        Integer integer = demoTypesService.updateAll(demoTypes);
        return Result.data(integer);
    }

    @GetMapping("/test/insert")
    public Result insert() {
        DemoTypes demoTypes = new DemoTypes();
        demoTypes.setTypeInteger(89);
        Long insert = demoTypesService.insert(demoTypes);
        return Result.data(insert);
    }


}
