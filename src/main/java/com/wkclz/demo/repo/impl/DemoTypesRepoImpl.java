package com.wkclz.demo.repo.impl;

import com.wkclz.core.base.PageData;
import com.wkclz.core.base.impl.BaseRepoImpl;
import com.wkclz.demo.dao.DemoTypesMapper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import com.wkclz.demo.pojo.entity.DemoTypesExample;
import com.wkclz.demo.repo.DemoTypesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* Description:  Create by Shrimp Generator
* @author: wangkaicun  @ current time
*/
@Component
public class DemoTypesRepoImpl extends BaseRepoImpl<DemoTypes, DemoTypesExample> implements DemoTypesRepo {

    private DemoTypesMapper mapper;

    @Autowired
    private void setMapper(DemoTypesMapper mapper) {
        super.modelClazz = DemoTypes.class;
        super.mapper = mapper;
        this.mapper = mapper;
    }


    /**
    * 示例查询
    */
    @Override
    public PageData<DemoTypes> selectExample(DemoTypes model){
        pagePreHandle(model);
        List<DemoTypes> dtos = mapper.selectExample(model);
        return pageSelect(model,dtos);
    }

}
