package com.gitee.taven.myselfdemo.entity;

import lombok.Data;

/**
 * @ClassName: CAccountVO
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 4:19 PM
 * @Version: 1.0
 */
@Data
public class CAccountVO {
    private Integer id;
    private String accountName;
    private String accountCode;
    private Long accontMoney;
    private String orderCode;
    private Integer price;
}
