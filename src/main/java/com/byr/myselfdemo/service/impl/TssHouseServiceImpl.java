package com.byr.myselfdemo.service.impl;

import com.byr.myselfdemo.dto.OrderDTO;
import com.byr.myselfdemo.entity.TssHouse;
import com.byr.myselfdemo.entity.TssHouseExample;
import com.byr.myselfdemo.mapper.postgresql_mapper.TssHouseMapper;
import com.byr.myselfdemo.service.TssHouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: TssHouseServiceImpl
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/6/2019 2:04 PM
 * @Version: 1.0
 */
@Service
@Slf4j
public class TssHouseServiceImpl implements TssHouseService {
    @Autowired
    TssHouseMapper tssHouseMapper;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Integer reduceTssHouse(OrderDTO orderDTO) {
        TssHouseExample example = new TssHouseExample();
        TssHouse tssHouse=new TssHouse();
        example.createCriteria().andCommodityCodeEqualTo(orderDTO.getOrder().getOrderCode());
        List<TssHouse> listTss = tssHouseMapper.selectByExample(example);
        if (listTss == null || listTss.size() < 1) {
            log.error("TSS没有此商品的库存");
            throw new RuntimeException("TSS没有此商品的库存");
        }else if (listTss.get(0).getNumber() < orderDTO.getOrder().getOrderCount()) {
            log.error("此商品在Tss库存不足");
            throw new RuntimeException("此商品在Tss库存不足");
        }
        tssHouse.setNumber(listTss.get(0).getNumber() - orderDTO.getOrder().getOrderCount());
        Integer a = tssHouseMapper.updateByExampleSelective(tssHouse, example);
//        int i=10/0;
        return a;
    }
}
