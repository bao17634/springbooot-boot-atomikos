package com.gitee.taven.myselfdemo.entity;

import lombok.Data;

/**
 * @ClassName: OrderByEntity
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/5/2019 5:41 PM
 * @Version: 1.0
 */
@Data
public class OrderByEntity {
    private CAccount cAccount;
    private PAccount pAccount;
    private Commodity commodity;
    private House house;
    private Order order;
    /**
     * 变化金额数量
     */
    private Integer changeMoney;
    /**
     * 变化库存数量
     */
    private Integer changeCount;
}
