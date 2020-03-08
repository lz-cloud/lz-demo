package com.wkclz.demo.service.custom;

import com.wkclz.core.base.PageData;
import com.wkclz.core.base.PageHandle;
import com.wkclz.demo.dao.DemoTypesMapper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 自定义 service, 可任意添加内容，可注入产 coreService
 * @Author wangkaicun
 */
 
@Service
public class DemoService {

    @Autowired
    private DemoTypesMapper demoTypesMapper;

    public PageData selectPage(DemoTypes demoTypes){
        return new PageHandle(demoTypes).page(demoTypesMapper.list(demoTypes));
    }

}

