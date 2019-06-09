package com.wkclz.demo.pojo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wkclz.demo.pojo.entity.DemoTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: demo_types (demo-全类型)
 */

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
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
