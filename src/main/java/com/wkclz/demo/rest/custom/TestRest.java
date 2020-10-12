package com.wkclz.demo.rest.custom;

import com.wkclz.core.base.PageData;
import com.wkclz.core.base.Result;
import com.wkclz.core.base.annotation.Desc;
import com.wkclz.demo.pojo.entity.DemoTypes;
import com.wkclz.demo.service.core.DemoTypesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRest {

    private static final Logger logger = LoggerFactory.getLogger(TestRest.class);

    @Autowired
    private DemoTypesService demoTypesService;
    @Autowired
    private ApplicationContext applicationContext;


    @Desc("分页测试")
    @GetMapping("/test/page")
    public Result page(DemoTypes demoTypes) {
        PageData<DemoTypes> page = demoTypesService.pageDemo(demoTypes);
        return Result.data(page);
    }

    @Desc("列表测试")
    @GetMapping("/test/list")
    public Result list(DemoTypes demoTypes) {
        List<DemoTypes> list = demoTypesService.list(demoTypes);
        return Result.data(list);
    }

    @Desc("查询测试")
    @GetMapping("/test/query")
    public Result query() {
        DemoTypes demoTypes = demoTypesService.get(1L);
        return Result.data(demoTypes);
    }

    @Desc("更新测试")
    @GetMapping("/test/update")
    public Result update() {
        DemoTypes demoTypes = demoTypesService.get(1L);
        demoTypes.setTypeInteger(demoTypes.getTypeInteger() + 1);
        Integer integer = demoTypesService.updateAll(demoTypes);
        return Result.data(integer);
    }

    @Desc("插入测试")
    @GetMapping("/test/insert")
    public Result insert() {
        DemoTypes demoTypes = new DemoTypes();
        demoTypes.setTypeInteger(89);
        Long insert = demoTypesService.insert(demoTypes);
        return Result.data(insert);
    }

    @GetMapping("/test/bean")
    public Result bean(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        return Result.data(beanDefinitionNames);
    }

}
