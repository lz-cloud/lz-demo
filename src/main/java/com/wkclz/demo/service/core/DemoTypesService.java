package com.wkclz.demo.service.core;

import com.wkclz.core.base.BaseService;
import com.wkclz.demo.dao.DemoTypesMapper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import org.springframework.stereotype.Service;


/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: demo_types (demo-全类型)
 */
@Service
public class DemoTypesService extends BaseService<DemoTypes, DemoTypesMapper> {

    public Integer example(){
        return  mapper.example();
    }

}
