package com.byr.myselfdemo.service;

import com.byr.myselfdemo.dto.OrderDTO;

public interface SaasHouseService {
    /**
     * 增加Saas库存
     * @param orderDTO
     * @return
     */
    Integer addSaasHouse(OrderDTO orderDTO);
}
