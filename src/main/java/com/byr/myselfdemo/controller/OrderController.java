package com.byr.myselfdemo.controller;

import com.byr.myselfdemo.dto.OrderDTO;
import com.byr.myselfdemo.entity.Commodity;
import com.byr.myselfdemo.entity.Order;
import com.byr.myselfdemo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
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
@RequestMapping(value = "/orderController")
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService service;

    @RequestMapping(value = "/addOrder")
    public Integer addOrder() throws Exception {
        UUID uuid = UUID.randomUUID();
        String code = uuid.toString().replace("-", "");
        OrderDTO orderDTO = new OrderDTO();
        Order order = new Order();
        order.setOrderCode("fdsf212sd12d1g1gd");
        order.setOrderName("手机");
        order.setCommodityCode(1);
        order.setOrderCount(10);
        orderDTO.setOrder(order);
        Integer count=null;
        for(int i=0 ;i< 1;i++){
            count= service.addOrder(orderDTO);
        }
        if (count != 3) {
            log.error("订单添加失败！");
            throw new RuntimeException("商品添加失败");
        } else {
            return count;
        }

    }
}
