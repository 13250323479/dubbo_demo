package com.dubbo.common.req.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class ReqPage implements Serializable {

    /**
     * 页号
     */
    private int pageIndex = 1;

    /**
     * 页大小
     */
    private int pageSize = 20;

}
