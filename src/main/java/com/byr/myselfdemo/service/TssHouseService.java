package com.byr.myselfdemo.service;

import com.byr.myselfdemo.dto.OrderDTO;

/**
 * @ClassName: TssHouseService
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/6/2019 2:04 PM
 * @Version: 1.0
 */
public interface TssHouseService {
    /**
     * 减少Tss的库存
     * @param orderDTO
     * @return
     */
    Integer reduceTssHouse(OrderDTO orderDTO);
}
