package com.wkclz.demo.dao;

import com.wkclz.core.base.BaseMapper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: Create by lz-gen
 * @author: wangkaicun
 * @table: demo_types (demo-全类型) DAO 接口，代码重新生成不覆盖
 */

@Mapper
public interface DemoTypesMapper extends BaseMapper<DemoTypes> {

    // 示例查询,可删除
    Integer example();

    List<DemoTypes> pageDemo(DemoTypes demoTypes);

}

