package com.gitee.taven.myselfdemo.controller;

import com.gitee.taven.myselfdemo.entity.Commodity;
import com.gitee.taven.myselfdemo.entity.OrderByEntity;
import com.gitee.taven.myselfdemo.service.CrudInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @ClassName: CrudInfoController
 * @Description: 对表的增删改查
 * @Author: yanrong
 * @Date: 9/4/2019 4:57 PM
 * @Version: 1.0
 */
@RequestMapping(value = "/CrudInfoController")
@RestController
public class CrudInfoController {
    @Autowired
    private CrudInfoService service;
    @RequestMapping(value = "/addCommodity")
    public Integer addCommodity(){
        UUID uuid=UUID.randomUUID();
        String code=uuid.toString().replace("-","");
        OrderByEntity orderByEntity=new OrderByEntity();
        Commodity commodity=new Commodity();
        commodity.setCommodityName("手机");
        commodity.setPrice(BigDecimal.valueOf(1000.00));
        commodity.setCommodityCode(code);
        orderByEntity.setChangeCount(10);
        orderByEntity.setCommodity(commodity);
        Integer a=service.saveCommodity(orderByEntity);
        if(a != 2){
            throw new RuntimeException("商品添加失败");
        }
        return a;
    }
}
