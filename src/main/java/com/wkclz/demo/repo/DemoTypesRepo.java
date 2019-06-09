package com.wkclz.demo.repo;

import com.wkclz.core.base.BaseRepo;
import com.wkclz.core.base.PageData;
import com.wkclz.demo.pojo.entity.DemoTypes;
import org.springframework.stereotype.Component;

/**
 * Description:  Create by Shrimp Generator
 * @author: wangkaicun  @ current time
 */
@Component
public interface DemoTypesRepo extends BaseRepo<DemoTypes> {

    // 示例查询
    PageData<DemoTypes> selectExample(DemoTypes model);

}
