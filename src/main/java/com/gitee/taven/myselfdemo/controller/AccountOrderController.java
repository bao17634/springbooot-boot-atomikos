package com.gitee.taven.myselfdemo.controller;

import com.gitee.taven.myselfdemo.service.AccountOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.transaction.Transactional;

/**
 * @ClassName: AccountOrderController
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 3:32 PM
 * @Version: 1.0
 */
@RestController
public class AccountOrderController {
    @Autowired
    private AccountOrderService service;
    @RequestMapping(value = "")
    @Transactional
    public Integer accountOrder(){

        return null;
    }
}
