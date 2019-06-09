package com.wkclz.demo.dao;

import com.wkclz.core.base.BaseMapper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import com.wkclz.demo.pojo.entity.DemoTypesExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoTypesMapper extends BaseMapper<DemoTypes, DemoTypesExample> {

    // 示例查询
    List<DemoTypes> selectExample(DemoTypes model);

}
