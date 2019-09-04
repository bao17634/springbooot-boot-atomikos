package com.gitee.taven.myselfdemo.entity;

import lombok.Data;

/**
 * @ClassName: PAccountVO
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 4:23 PM
 * @Version: 1.0
 */
@Data
public class PAccountVO {
    private Integer id;
    private String accountCode;
    private String accountName;
    private Long accountMoney;
    private String orderCode;
    private Integer price;
}
