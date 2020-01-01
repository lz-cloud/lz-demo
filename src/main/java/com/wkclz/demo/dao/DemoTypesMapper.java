package com.wkclz.demo.dao;

import com.wkclz.core.base.BaseMapper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoTypesMapper extends BaseMapper<DemoTypes> {

    // 示例查询
    Integer example();

}
