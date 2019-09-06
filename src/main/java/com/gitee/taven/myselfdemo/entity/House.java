package com.gitee.taven.myselfdemo.entity;

import lombok.Data;

import javax.persistence.*;
@Data
public class House {
    private Integer id;

    /**
     * 库存数量
     */
    private Integer number;

    /**
     * 商品代码
     */
    @Column(name = "commodity_code")
    private String commodityCode;

    /**
     * 商品名
     */
    @Column(name = "commodity_name")
    private String commodityName;
}