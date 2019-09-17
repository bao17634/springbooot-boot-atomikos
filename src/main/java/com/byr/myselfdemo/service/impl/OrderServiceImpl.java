package com.byr.myselfdemo.service.impl;

import com.byr.myselfdemo.dto.OrderDTO;
import com.byr.myselfdemo.entity.OrderExample;
import com.byr.myselfdemo.entity.TssHouseExample;
import com.byr.myselfdemo.mapper.postgresql_mapper.OrderMapper;
import com.byr.myselfdemo.mapper.postgresql_mapper.TssHouseMapper;
import com.byr.myselfdemo.service.OrderService;
import com.byr.myselfdemo.service.SaasHouseService;
import com.byr.myselfdemo.service.TssHouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/6/2019 2:07 PM
 * @Version: 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    SaasHouseService saasHouseService;
    @Autowired
    TssHouseService tssHouseService;

    @Override
    @Transactional( rollbackFor = RuntimeException.class)
    public Integer addOrder(OrderDTO orderDTO) throws Exception{
     try {
         //网order表插一条数据
         Integer orderCount = orderMapper.insert(orderDTO.getOrder());
         if (orderCount != 1) {
             log.error("订单存入失败");
             throw new RuntimeException("订单存入失败");
         }
         //减少Tss库存
         Integer tssConut = tssHouseService.reduceTssHouse(orderDTO);
         if (tssConut != 1) {
             log.error("Tss库存减免失败！");
             throw new RuntimeException("Tss库存减免失败");
         } else {
             log.info("Tss库存减免成功");
         }
         //增加Saas库从
         Integer saasCuunt = saasHouseService.addSaasHouse(orderDTO);
         if (saasCuunt != 1) {
             log.error("Saas库存增加失败！");
             throw new RuntimeException("Saas库存增加失败");
         } else {
             log.info("Saas库存增加成功");
         }
         return orderCount + tssConut + saasCuunt;
     }catch (Exception e){
         throw new RuntimeException(e);
     }
    }
}
