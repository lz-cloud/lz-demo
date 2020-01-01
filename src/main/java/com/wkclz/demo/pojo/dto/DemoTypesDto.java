package com.wkclz.demo.pojo.dto;

import com.wkclz.demo.pojo.entity.DemoTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: demo_types (demo-全类型)
 */

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class DemoTypesDto extends DemoTypes {




    /**
     * model 转 Dto
     * @param source
     * @return
     */
    public static DemoTypesDto copy(DemoTypes source){
        DemoTypesDto target = new DemoTypesDto();
        DemoTypes.copy(source, target);
        return target;
    }
}
