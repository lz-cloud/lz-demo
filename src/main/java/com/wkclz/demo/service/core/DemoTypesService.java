package com.wkclz.demo.service.core;

import com.wkclz.core.base.BaseService;
import com.wkclz.demo.dao.DemoTypesMapper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import org.springframework.stereotype.Service;

/**
 * Description: Create by lz-gen
 * @Author wangkaicun
 * @table: demo_types (demo-全类型) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class DemoTypesService extends BaseService<DemoTypes, DemoTypesMapper> {

    // 示例方法，可删除
    public Integer example(){
        return  mapper.example();
    }

}

