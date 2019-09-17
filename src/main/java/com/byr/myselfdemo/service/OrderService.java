package com.byr.myselfdemo.service;

import com.byr.myselfdemo.dto.OrderDTO;

public interface OrderService {
    /**
     * 添加订单，从Tss库从往Saas库调用
     * @return
     */
    Integer addOrder(OrderDTO orderDTO) throws Exception;
}
