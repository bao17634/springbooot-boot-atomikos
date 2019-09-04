package com.gitee.taven.testdemo.controller;

import com.gitee.taven.testdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: OrderAcountController
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 11:56 AM
 * @Version: 1.0
 */
@RestController
public class OrderAccountController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "test")
    public void contextLoads() {
        userService.testJTA();
    }

}
