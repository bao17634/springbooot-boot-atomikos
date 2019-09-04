package com.gitee.taven.myselfdemo.entity;

import lombok.Data;

/**
 * @ClassName: OrderVO
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 4:22 PM
 * @Version: 1.0
 */
@Data
public class OrderVO {
    private Integer id;
    private String orderCode;
    private String orderName;
    private Long orderCount;
    private Long commodityId;
}
