package com.wkclz.demo.rest.core;

import com.wkclz.core.base.BaseModel;
import com.wkclz.core.base.PageData;
import com.wkclz.core.base.Result;
import com.wkclz.core.helper.BaseHelper;
import com.wkclz.demo.pojo.entity.DemoTypes;
import com.wkclz.demo.repo.DemoTypesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: demo_types (demo-全类型)
 */
// @RestController
public class DemoTypesRest {

    @Autowired
    private DemoTypesRepo demoTypesRepo;

    /**
     * @api {get} /demo/types/page 1、demo-全类型-获取分页
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Integer} [typeInt] <code>param</code>type_int
     * @apiParam {Long} [typeBigint] <code>param</code>type_bigint
     * @apiParam {Boolean} [typeBit] <code>param</code>type_bit
     * @apiParam {String} [typeChar] <code>param</code>type_char
     * @apiParam {Date} [typeDate] <code>param</code>type_date
     * @apiParam {Date} [typeDatetime] <code>param</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>param</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>param</code>type_double
     * @apiParam {Float} [typeFloat] <code>param</code>type_float
     * @apiParam {Integer} [typeInteger] <code>param</code>type_integer
     * @apiParam {Integer} [typeMediumint] <code>param</code>type_mediumint
     * @apiParam {BigDecimal} [typeNumeric] <code>param</code>type_numeric
     * @apiParam {Double} [typeReal] <code>param</code>type_real
     * @apiParam {Date} [typeTime] <code>param</code>type_time
     * @apiParam {Date} [typeTimestamp] <code>param</code>type_timestamp
     * @apiParam {Byte} [typeTinyint] <code>param</code>type_tinyint
     * @apiParam {String} [typeTinytext] <code>param</code>type_tinytext
     * @apiParam {String} [typeVarchar] <code>param</code>type_varchar
     * @apiParam {Date} [typeYear] <code>param</code>type_year
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Integer} [typeInt] type_int
     * @apiSuccess {Long} [typeBigint] type_bigint
     * @apiSuccess {byte[]} [typeBinary] type_binary
     * @apiSuccess {Boolean} [typeBit] type_bit
     * @apiSuccess {byte[]} [typeBlob] type_blob
     * @apiSuccess {String} [typeChar] type_char
     * @apiSuccess {Date} [typeDate] type_date
     * @apiSuccess {Date} [typeDatetime] type_datetime
     * @apiSuccess {BigDecimal} [typeDecimal] type_decimal
     * @apiSuccess {Double} [typeDouble] type_double
     * @apiSuccess {Float} [typeFloat] type_float
     * @apiSuccess {byte[]} [typeGeometry] type_geometry
     * @apiSuccess {byte[]} [typeGeometrycollection] type_geometrycollection
     * @apiSuccess {Integer} [typeInteger] type_integer
     * @apiSuccess {String} [typeJson] type_json [MBG不支持JSON]
     * @apiSuccess {byte[]} [typeLinestring] type_linestring
     * @apiSuccess {byte[]} [typeLongblob] type_longblob
     * @apiSuccess {String} [typeLongtext] type_longtext
     * @apiSuccess {byte[]} [typeMediumblob] type_mediumblob
     * @apiSuccess {Integer} [typeMediumint] type_mediumint
     * @apiSuccess {String} [typeMediumtext] type_mediumtext
     * @apiSuccess {byte[]} [typeMultilinestring] type_multilinestring
     * @apiSuccess {byte[]} [typeMultipoint] type_multipoint
     * @apiSuccess {byte[]} [typeMultipolygon] type_multipolygon
     * @apiSuccess {BigDecimal} [typeNumeric] type_numeric
     * @apiSuccess {byte[]} [typePoint] type_point
     * @apiSuccess {byte[]} [typePolygon] type_polygon
     * @apiSuccess {Double} [typeReal] type_real
     * @apiSuccess {String} [typeText] type_text
     * @apiSuccess {Date} [typeTime] type_time
     * @apiSuccess {Date} [typeTimestamp] type_timestamp
     * @apiSuccess {byte[]} [typeTinyblob] type_tinyblob
     * @apiSuccess {Byte} [typeTinyint] type_tinyint
     * @apiSuccess {String} [typeTinytext] type_tinytext
     * @apiSuccess {byte[]} [typeVarbinary] type_varbinary
     * @apiSuccess {String} [typeVarchar] type_varchar
     * @apiSuccess {Date} [typeYear] type_year
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *         "rows": [
     *             {
     *                 "id": "id",
     *                 "typeInt": "typeInt",
     *                 "typeBigint": "typeBigint",
     *                 "typeBinary": "typeBinary",
     *                 "typeBit": "typeBit",
     *                 "typeBlob": "typeBlob",
     *                 "typeChar": "typeChar",
     *                 "typeDate": "typeDate",
     *                 "typeDatetime": "typeDatetime",
     *                 "typeDecimal": "typeDecimal",
     *                 "typeDouble": "typeDouble",
     *                 "typeFloat": "typeFloat",
     *                 "typeGeometry": "typeGeometry",
     *                 "typeGeometrycollection": "typeGeometrycollection",
     *                 "typeInteger": "typeInteger",
     *                 "typeJson": "typeJson",
     *                 "typeLinestring": "typeLinestring",
     *                 "typeLongblob": "typeLongblob",
     *                 "typeLongtext": "typeLongtext",
     *                 "typeMediumblob": "typeMediumblob",
     *                 "typeMediumint": "typeMediumint",
     *                 "typeMediumtext": "typeMediumtext",
     *                 "typeMultilinestring": "typeMultilinestring",
     *                 "typeMultipoint": "typeMultipoint",
     *                 "typeMultipolygon": "typeMultipolygon",
     *                 "typeNumeric": "typeNumeric",
     *                 "typePoint": "typePoint",
     *                 "typePolygon": "typePolygon",
     *                 "typeReal": "typeReal",
     *                 "typeText": "typeText",
     *                 "typeTime": "typeTime",
     *                 "typeTimestamp": "typeTimestamp",
     *                 "typeTinyblob": "typeTinyblob",
     *                 "typeTinyint": "typeTinyint",
     *                 "typeTinytext": "typeTinytext",
     *                 "typeVarbinary": "typeVarbinary",
     *                 "typeVarchar": "typeVarchar",
     *                 "typeYear": "typeYear",
     *             },
     *             ...
     *         ],
     *         "totalCount": 1,
     *         "totalPage": 1,
     *         "pageNo": 1,
     *         "pageSize": 10
     *     }
     * }
     *
     */
    @GetMapping("/demo/types/page")
    public Result demoTypesPage(DemoTypes model){
        Result result = new Result();
        PageData<DemoTypes> demoTypess = demoTypesRepo.page(model);
        return result.setData(demoTypess);
    }

    /**
     * @api {get} /demo/types/count 2、demo-全类型-获取数量
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Integer} [typeInt] <code>param</code>type_int
     * @apiParam {Long} [typeBigint] <code>param</code>type_bigint
     * @apiParam {Boolean} [typeBit] <code>param</code>type_bit
     * @apiParam {String} [typeChar] <code>param</code>type_char
     * @apiParam {Date} [typeDate] <code>param</code>type_date
     * @apiParam {Date} [typeDatetime] <code>param</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>param</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>param</code>type_double
     * @apiParam {Float} [typeFloat] <code>param</code>type_float
     * @apiParam {Integer} [typeInteger] <code>param</code>type_integer
     * @apiParam {Integer} [typeMediumint] <code>param</code>type_mediumint
     * @apiParam {BigDecimal} [typeNumeric] <code>param</code>type_numeric
     * @apiParam {Double} [typeReal] <code>param</code>type_real
     * @apiParam {Date} [typeTime] <code>param</code>type_time
     * @apiParam {Date} [typeTimestamp] <code>param</code>type_timestamp
     * @apiParam {Byte} [typeTinyint] <code>param</code>type_tinyint
     * @apiParam {String} [typeTinytext] <code>param</code>type_tinytext
     * @apiParam {String} [typeVarchar] <code>param</code>type_varchar
     * @apiParam {Date} [typeYear] <code>param</code>type_year
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} count 统计结果
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *          "count":12
     *      }
     * }
     *
     */
    @GetMapping("/demo/types/count")
    public Result demoTypesCount(DemoTypes model){
        Result result = new Result();
        BaseModel baseModel = new BaseModel();
        baseModel.setCount(demoTypesRepo.count(model));
        return result.setData(baseModel);
    }

    /**
     * @api {get} /demo/types/detail 3、demo-全类型-获取详情
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Integer} [typeInt] type_int
     * @apiSuccess {Long} [typeBigint] type_bigint
     * @apiSuccess {byte[]} [typeBinary] type_binary
     * @apiSuccess {Boolean} [typeBit] type_bit
     * @apiSuccess {byte[]} [typeBlob] type_blob
     * @apiSuccess {String} [typeChar] type_char
     * @apiSuccess {Date} [typeDate] type_date
     * @apiSuccess {Date} [typeDatetime] type_datetime
     * @apiSuccess {BigDecimal} [typeDecimal] type_decimal
     * @apiSuccess {Double} [typeDouble] type_double
     * @apiSuccess {Float} [typeFloat] type_float
     * @apiSuccess {byte[]} [typeGeometry] type_geometry
     * @apiSuccess {byte[]} [typeGeometrycollection] type_geometrycollection
     * @apiSuccess {Integer} [typeInteger] type_integer
     * @apiSuccess {String} [typeJson] type_json [MBG不支持JSON]
     * @apiSuccess {byte[]} [typeLinestring] type_linestring
     * @apiSuccess {byte[]} [typeLongblob] type_longblob
     * @apiSuccess {String} [typeLongtext] type_longtext
     * @apiSuccess {byte[]} [typeMediumblob] type_mediumblob
     * @apiSuccess {Integer} [typeMediumint] type_mediumint
     * @apiSuccess {String} [typeMediumtext] type_mediumtext
     * @apiSuccess {byte[]} [typeMultilinestring] type_multilinestring
     * @apiSuccess {byte[]} [typeMultipoint] type_multipoint
     * @apiSuccess {byte[]} [typeMultipolygon] type_multipolygon
     * @apiSuccess {BigDecimal} [typeNumeric] type_numeric
     * @apiSuccess {byte[]} [typePoint] type_point
     * @apiSuccess {byte[]} [typePolygon] type_polygon
     * @apiSuccess {Double} [typeReal] type_real
     * @apiSuccess {String} [typeText] type_text
     * @apiSuccess {Date} [typeTime] type_time
     * @apiSuccess {Date} [typeTimestamp] type_timestamp
     * @apiSuccess {byte[]} [typeTinyblob] type_tinyblob
     * @apiSuccess {Byte} [typeTinyint] type_tinyint
     * @apiSuccess {String} [typeTinytext] type_tinytext
     * @apiSuccess {byte[]} [typeVarbinary] type_varbinary
     * @apiSuccess {String} [typeVarchar] type_varchar
     * @apiSuccess {Date} [typeYear] type_year
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *          "id": "id",
     *          "typeInt": "typeInt",
     *          "typeBigint": "typeBigint",
     *          "typeBinary": "typeBinary",
     *          "typeBit": "typeBit",
     *          "typeBlob": "typeBlob",
     *          "typeChar": "typeChar",
     *          "typeDate": "typeDate",
     *          "typeDatetime": "typeDatetime",
     *          "typeDecimal": "typeDecimal",
     *          "typeDouble": "typeDouble",
     *          "typeFloat": "typeFloat",
     *          "typeGeometry": "typeGeometry",
     *          "typeGeometrycollection": "typeGeometrycollection",
     *          "typeInteger": "typeInteger",
     *          "typeJson": "typeJson",
     *          "typeLinestring": "typeLinestring",
     *          "typeLongblob": "typeLongblob",
     *          "typeLongtext": "typeLongtext",
     *          "typeMediumblob": "typeMediumblob",
     *          "typeMediumint": "typeMediumint",
     *          "typeMediumtext": "typeMediumtext",
     *          "typeMultilinestring": "typeMultilinestring",
     *          "typeMultipoint": "typeMultipoint",
     *          "typeMultipolygon": "typeMultipolygon",
     *          "typeNumeric": "typeNumeric",
     *          "typePoint": "typePoint",
     *          "typePolygon": "typePolygon",
     *          "typeReal": "typeReal",
     *          "typeText": "typeText",
     *          "typeTime": "typeTime",
     *          "typeTimestamp": "typeTimestamp",
     *          "typeTinyblob": "typeTinyblob",
     *          "typeTinyint": "typeTinyint",
     *          "typeTinytext": "typeTinytext",
     *          "typeVarbinary": "typeVarbinary",
     *          "typeVarchar": "typeVarchar",
     *          "typeYear": "typeYear",
     *     }
     * }
     *
     */
    @GetMapping("/demo/types/detail")
    public Result demoTypesDetail(DemoTypes model){
        Result result = new Result();
        if (model.getId()==null){
            return result.setError("id can not be null");
        }
        model = demoTypesRepo.get(model.getId());
        if (model == null){
            return result.setError("id is error");
        }
        return result.setData(model);
    }

    /**
     * @api {post} /demo/types/new 4、demo-全类型-新增信息
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-新增信息
     *
     * @apiParam {Integer} [typeInt] <code>body</code>type_int
     * @apiParam {Long} [typeBigint] <code>body</code>type_bigint
     * @apiParam {byte[]} [typeBinary] <code>body</code>type_binary
     * @apiParam {Boolean} [typeBit] <code>body</code>type_bit
     * @apiParam {byte[]} [typeBlob] <code>body</code>type_blob
     * @apiParam {String} [typeChar] <code>body</code>type_char
     * @apiParam {Date} [typeDate] <code>body</code>type_date
     * @apiParam {Date} [typeDatetime] <code>body</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>body</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>body</code>type_double
     * @apiParam {Float} [typeFloat] <code>body</code>type_float
     * @apiParam {byte[]} [typeGeometry] <code>body</code>type_geometry
     * @apiParam {byte[]} [typeGeometrycollection] <code>body</code>type_geometrycollection
     * @apiParam {Integer} [typeInteger] <code>body</code>type_integer
     * @apiParam {String} [typeJson] <code>body</code>type_json [MBG不支持JSON]
     * @apiParam {byte[]} [typeLinestring] <code>body</code>type_linestring
     * @apiParam {byte[]} [typeLongblob] <code>body</code>type_longblob
     * @apiParam {String} [typeLongtext] <code>body</code>type_longtext
     * @apiParam {byte[]} [typeMediumblob] <code>body</code>type_mediumblob
     * @apiParam {Integer} [typeMediumint] <code>body</code>type_mediumint
     * @apiParam {String} [typeMediumtext] <code>body</code>type_mediumtext
     * @apiParam {byte[]} [typeMultilinestring] <code>body</code>type_multilinestring
     * @apiParam {byte[]} [typeMultipoint] <code>body</code>type_multipoint
     * @apiParam {byte[]} [typeMultipolygon] <code>body</code>type_multipolygon
     * @apiParam {BigDecimal} [typeNumeric] <code>body</code>type_numeric
     * @apiParam {byte[]} [typePoint] <code>body</code>type_point
     * @apiParam {byte[]} [typePolygon] <code>body</code>type_polygon
     * @apiParam {Double} [typeReal] <code>body</code>type_real
     * @apiParam {String} [typeText] <code>body</code>type_text
     * @apiParam {Date} [typeTime] <code>body</code>type_time
     * @apiParam {Date} [typeTimestamp] <code>body</code>type_timestamp
     * @apiParam {byte[]} [typeTinyblob] <code>body</code>type_tinyblob
     * @apiParam {Byte} [typeTinyint] <code>body</code>type_tinyint
     * @apiParam {String} [typeTinytext] <code>body</code>type_tinytext
     * @apiParam {byte[]} [typeVarbinary] <code>body</code>type_varbinary
     * @apiParam {String} [typeVarchar] <code>body</code>type_varchar
     * @apiParam {Date} [typeYear] <code>body</code>type_year
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "typeInt": "typeInt",
     *      "typeBigint": "typeBigint",
     *      "typeBinary": "typeBinary",
     *      "typeBit": "typeBit",
     *      "typeBlob": "typeBlob",
     *      "typeChar": "typeChar",
     *      "typeDate": "typeDate",
     *      "typeDatetime": "typeDatetime",
     *      "typeDecimal": "typeDecimal",
     *      "typeDouble": "typeDouble",
     *      "typeFloat": "typeFloat",
     *      "typeGeometry": "typeGeometry",
     *      "typeGeometrycollection": "typeGeometrycollection",
     *      "typeInteger": "typeInteger",
     *      "typeJson": "typeJson",
     *      "typeLinestring": "typeLinestring",
     *      "typeLongblob": "typeLongblob",
     *      "typeLongtext": "typeLongtext",
     *      "typeMediumblob": "typeMediumblob",
     *      "typeMediumint": "typeMediumint",
     *      "typeMediumtext": "typeMediumtext",
     *      "typeMultilinestring": "typeMultilinestring",
     *      "typeMultipoint": "typeMultipoint",
     *      "typeMultipolygon": "typeMultipolygon",
     *      "typeNumeric": "typeNumeric",
     *      "typePoint": "typePoint",
     *      "typePolygon": "typePolygon",
     *      "typeReal": "typeReal",
     *      "typeText": "typeText",
     *      "typeTime": "typeTime",
     *      "typeTimestamp": "typeTimestamp",
     *      "typeTinyblob": "typeTinyblob",
     *      "typeTinyint": "typeTinyint",
     *      "typeTinytext": "typeTinytext",
     *      "typeVarbinary": "typeVarbinary",
     *      "typeVarchar": "typeVarchar",
     *      "typeYear": "typeYear",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectModel
     * }
     *
     */
    @PostMapping("/demo/types/new")
    @Transactional(rollbackFor = Exception.class)
    public Result demoTypesNew(@RequestBody DemoTypes model){
        Result result = new Result();

        // 按需添加限制条件

        model.setId(null);
        Long id = demoTypesRepo.insert(model);
        model.setId(id);
        return result.setData(model);
    }

    /**
     * @api {post} /demo/types/update 5、demo-全类型-更新信息
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {Integer} [typeInt] <code>body</code>type_int
     * @apiParam {Long} [typeBigint] <code>body</code>type_bigint
     * @apiParam {byte[]} [typeBinary] <code>body</code>type_binary
     * @apiParam {Boolean} [typeBit] <code>body</code>type_bit
     * @apiParam {byte[]} [typeBlob] <code>body</code>type_blob
     * @apiParam {String} [typeChar] <code>body</code>type_char
     * @apiParam {Date} [typeDate] <code>body</code>type_date
     * @apiParam {Date} [typeDatetime] <code>body</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>body</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>body</code>type_double
     * @apiParam {Float} [typeFloat] <code>body</code>type_float
     * @apiParam {byte[]} [typeGeometry] <code>body</code>type_geometry
     * @apiParam {byte[]} [typeGeometrycollection] <code>body</code>type_geometrycollection
     * @apiParam {Integer} [typeInteger] <code>body</code>type_integer
     * @apiParam {String} [typeJson] <code>body</code>type_json [MBG不支持JSON]
     * @apiParam {byte[]} [typeLinestring] <code>body</code>type_linestring
     * @apiParam {byte[]} [typeLongblob] <code>body</code>type_longblob
     * @apiParam {String} [typeLongtext] <code>body</code>type_longtext
     * @apiParam {byte[]} [typeMediumblob] <code>body</code>type_mediumblob
     * @apiParam {Integer} [typeMediumint] <code>body</code>type_mediumint
     * @apiParam {String} [typeMediumtext] <code>body</code>type_mediumtext
     * @apiParam {byte[]} [typeMultilinestring] <code>body</code>type_multilinestring
     * @apiParam {byte[]} [typeMultipoint] <code>body</code>type_multipoint
     * @apiParam {byte[]} [typeMultipolygon] <code>body</code>type_multipolygon
     * @apiParam {BigDecimal} [typeNumeric] <code>body</code>type_numeric
     * @apiParam {byte[]} [typePoint] <code>body</code>type_point
     * @apiParam {byte[]} [typePolygon] <code>body</code>type_polygon
     * @apiParam {Double} [typeReal] <code>body</code>type_real
     * @apiParam {String} [typeText] <code>body</code>type_text
     * @apiParam {Date} [typeTime] <code>body</code>type_time
     * @apiParam {Date} [typeTimestamp] <code>body</code>type_timestamp
     * @apiParam {byte[]} [typeTinyblob] <code>body</code>type_tinyblob
     * @apiParam {Byte} [typeTinyint] <code>body</code>type_tinyint
     * @apiParam {String} [typeTinytext] <code>body</code>type_tinytext
     * @apiParam {byte[]} [typeVarbinary] <code>body</code>type_varbinary
     * @apiParam {String} [typeVarchar] <code>body</code>type_varchar
     * @apiParam {Date} [typeYear] <code>body</code>type_year
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "id": "id",
     *      "typeInt": "typeInt",
     *      "typeBigint": "typeBigint",
     *      "typeBinary": "typeBinary",
     *      "typeBit": "typeBit",
     *      "typeBlob": "typeBlob",
     *      "typeChar": "typeChar",
     *      "typeDate": "typeDate",
     *      "typeDatetime": "typeDatetime",
     *      "typeDecimal": "typeDecimal",
     *      "typeDouble": "typeDouble",
     *      "typeFloat": "typeFloat",
     *      "typeGeometry": "typeGeometry",
     *      "typeGeometrycollection": "typeGeometrycollection",
     *      "typeInteger": "typeInteger",
     *      "typeJson": "typeJson",
     *      "typeLinestring": "typeLinestring",
     *      "typeLongblob": "typeLongblob",
     *      "typeLongtext": "typeLongtext",
     *      "typeMediumblob": "typeMediumblob",
     *      "typeMediumint": "typeMediumint",
     *      "typeMediumtext": "typeMediumtext",
     *      "typeMultilinestring": "typeMultilinestring",
     *      "typeMultipoint": "typeMultipoint",
     *      "typeMultipolygon": "typeMultipolygon",
     *      "typeNumeric": "typeNumeric",
     *      "typePoint": "typePoint",
     *      "typePolygon": "typePolygon",
     *      "typeReal": "typeReal",
     *      "typeText": "typeText",
     *      "typeTime": "typeTime",
     *      "typeTimestamp": "typeTimestamp",
     *      "typeTinyblob": "typeTinyblob",
     *      "typeTinyint": "typeTinyint",
     *      "typeTinytext": "typeTinytext",
     *      "typeVarbinary": "typeVarbinary",
     *      "typeVarchar": "typeVarchar",
     *      "typeYear": "typeYear",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectModel
     * }
     *
     */
    @PostMapping("/demo/types/update")
    @Transactional(rollbackFor = Exception.class)
    public Result demoTypesUpdate(@RequestBody DemoTypes model){
        Result result = new Result();

        if (model.getId() == null){
            return result.setError("id can not be null");
        }
        DemoTypes target = demoTypesRepo.get(model.getId());
        if (target == null){
            return result.setError("id is error, data is not exist");
        }
        DemoTypes.copyIfNotNull(model, target);

        demoTypesRepo.update(target);
        return result.setData(model);
    }

    /**
     * @api {post} /demo/types/save 6、demo-全类型-保存信息
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {Integer} [typeInt] <code>body</code>type_int
     * @apiParam {Long} [typeBigint] <code>body</code>type_bigint
     * @apiParam {byte[]} [typeBinary] <code>body</code>type_binary
     * @apiParam {Boolean} [typeBit] <code>body</code>type_bit
     * @apiParam {byte[]} [typeBlob] <code>body</code>type_blob
     * @apiParam {String} [typeChar] <code>body</code>type_char
     * @apiParam {Date} [typeDate] <code>body</code>type_date
     * @apiParam {Date} [typeDatetime] <code>body</code>type_datetime
     * @apiParam {BigDecimal} [typeDecimal] <code>body</code>type_decimal
     * @apiParam {Double} [typeDouble] <code>body</code>type_double
     * @apiParam {Float} [typeFloat] <code>body</code>type_float
     * @apiParam {byte[]} [typeGeometry] <code>body</code>type_geometry
     * @apiParam {byte[]} [typeGeometrycollection] <code>body</code>type_geometrycollection
     * @apiParam {Integer} [typeInteger] <code>body</code>type_integer
     * @apiParam {String} [typeJson] <code>body</code>type_json [MBG不支持JSON]
     * @apiParam {byte[]} [typeLinestring] <code>body</code>type_linestring
     * @apiParam {byte[]} [typeLongblob] <code>body</code>type_longblob
     * @apiParam {String} [typeLongtext] <code>body</code>type_longtext
     * @apiParam {byte[]} [typeMediumblob] <code>body</code>type_mediumblob
     * @apiParam {Integer} [typeMediumint] <code>body</code>type_mediumint
     * @apiParam {String} [typeMediumtext] <code>body</code>type_mediumtext
     * @apiParam {byte[]} [typeMultilinestring] <code>body</code>type_multilinestring
     * @apiParam {byte[]} [typeMultipoint] <code>body</code>type_multipoint
     * @apiParam {byte[]} [typeMultipolygon] <code>body</code>type_multipolygon
     * @apiParam {BigDecimal} [typeNumeric] <code>body</code>type_numeric
     * @apiParam {byte[]} [typePoint] <code>body</code>type_point
     * @apiParam {byte[]} [typePolygon] <code>body</code>type_polygon
     * @apiParam {Double} [typeReal] <code>body</code>type_real
     * @apiParam {String} [typeText] <code>body</code>type_text
     * @apiParam {Date} [typeTime] <code>body</code>type_time
     * @apiParam {Date} [typeTimestamp] <code>body</code>type_timestamp
     * @apiParam {byte[]} [typeTinyblob] <code>body</code>type_tinyblob
     * @apiParam {Byte} [typeTinyint] <code>body</code>type_tinyint
     * @apiParam {String} [typeTinytext] <code>body</code>type_tinytext
     * @apiParam {byte[]} [typeVarbinary] <code>body</code>type_varbinary
     * @apiParam {String} [typeVarchar] <code>body</code>type_varchar
     * @apiParam {Date} [typeYear] <code>body</code>type_year
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "id": "id",
     *      "typeInt": "typeInt",
     *      "typeBigint": "typeBigint",
     *      "typeBinary": "typeBinary",
     *      "typeBit": "typeBit",
     *      "typeBlob": "typeBlob",
     *      "typeChar": "typeChar",
     *      "typeDate": "typeDate",
     *      "typeDatetime": "typeDatetime",
     *      "typeDecimal": "typeDecimal",
     *      "typeDouble": "typeDouble",
     *      "typeFloat": "typeFloat",
     *      "typeGeometry": "typeGeometry",
     *      "typeGeometrycollection": "typeGeometrycollection",
     *      "typeInteger": "typeInteger",
     *      "typeJson": "typeJson",
     *      "typeLinestring": "typeLinestring",
     *      "typeLongblob": "typeLongblob",
     *      "typeLongtext": "typeLongtext",
     *      "typeMediumblob": "typeMediumblob",
     *      "typeMediumint": "typeMediumint",
     *      "typeMediumtext": "typeMediumtext",
     *      "typeMultilinestring": "typeMultilinestring",
     *      "typeMultipoint": "typeMultipoint",
     *      "typeMultipolygon": "typeMultipolygon",
     *      "typeNumeric": "typeNumeric",
     *      "typePoint": "typePoint",
     *      "typePolygon": "typePolygon",
     *      "typeReal": "typeReal",
     *      "typeText": "typeText",
     *      "typeTime": "typeTime",
     *      "typeTimestamp": "typeTimestamp",
     *      "typeTinyblob": "typeTinyblob",
     *      "typeTinyint": "typeTinyint",
     *      "typeTinytext": "typeTinytext",
     *      "typeVarbinary": "typeVarbinary",
     *      "typeVarchar": "typeVarchar",
     *      "typeYear": "typeYear",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectModel
     * }
     *
     */
    @PostMapping("/demo/types/save")
    @Transactional(rollbackFor = Exception.class)
    public Result demoTypesSave(@RequestBody DemoTypes model){
        Result result = new Result();

        // 条件判断

        if (model.getId() == null){
            Long id = demoTypesRepo.insert(model);
            model.setId(id);
        } else {
            DemoTypes data = demoTypesRepo.get(model.getId());
            if (data == null){
                return result.setError("id错误，数据不存在");
            }
            DemoTypes.copyIfNotNull(model, data);
            demoTypesRepo.update(data);
        }
        return result.setData(model);

    }

    /**
     * @api {post} /demo/types/remove 7、demo-全类型-删除【单个，批量】
     * @apiGroup DEMO_TYPES
     *
     * @apiVersion 0.0.1
     * @apiDescription demo-全类型-删除【单个，批量】
     *
     * @apiParam {Integer} [id] <code>body</code> 主键 id
     * @apiParam {Integer[]} [ids] <code>body</code> 主键 id组
     *
     * @apiParamExample {json} 请求样例:
     * {
     *     "id": 1,
     *     "ids": [1]
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": 1
     * }
     *
     */
    @PostMapping("/demo/types/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result demoTypesRemove(@RequestBody BaseModel model){
        Result result = BaseHelper.removeCheck(model);
        if (result.getError()!=null){
            return result;
        }
        Integer rt = demoTypesRepo.del(model.getIds());
        return result.setData(rt);
    }

}
