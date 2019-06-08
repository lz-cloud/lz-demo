package com.wkclz.demo.controller.custom;

import com.wkclz.core.base.annotation.Desc;

/**
 * Description:
 * Created: wangkaicun @ 2017-10-19 上午12:46
 */
public interface Routes {

    /**
     * 一个接口组对应一个 Controller
     */

    @Desc("1. 下载API 信息")
    String DOWNLOAD = "/download/apis";



}
