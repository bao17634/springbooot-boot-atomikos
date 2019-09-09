package com.byr.myselfdemo.service.impl;

import com.byr.myselfdemo.dto.OrderDTO;
import com.byr.myselfdemo.entity.SaasHouse;
import com.byr.myselfdemo.entity.SaasHouseExample;
import com.byr.myselfdemo.mapper.mysql_mapper.SaasHouseMapper;
import com.byr.myselfdemo.service.SaasHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: SaasHouseServiceImpl
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/6/2019 2:03 PM
 * @Version: 1.0
 */
@Service
public class SaasHouseServiceImpl implements SaasHouseService {
    @Autowired
    SaasHouseMapper saasHouseMapper;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Integer addSaasHouse(OrderDTO orderDTO) {
        Integer saasCunt = null;
        SaasHouseExample example = new SaasHouseExample();
        SaasHouse saasHouse=new SaasHouse();
        example.createCriteria().andCommodityCodeEqualTo(orderDTO.getOrder().getOrderCode());
        List<SaasHouse> listSaas = saasHouseMapper.selectByExample(example);
        //如果Tss仓库没有这个商品的数据则添加，否则就修改
        if (listSaas == null || listSaas.size() == 0) {
            saasHouse.setCommodityCode(orderDTO.getOrder().getOrderCode());
            saasHouse.setCommodityName(orderDTO.getOrder().getOrderName());
            saasHouse.setNumber(orderDTO.getOrder().getOrderCount());
            saasCunt = saasHouseMapper.insert(saasHouse);
        } else {
            saasHouse.setNumber(orderDTO.getOrder().getOrderCount() + listSaas.get(0).getNumber());
            saasCunt = saasHouseMapper.updateByExampleSelective(saasHouse, example);
        }
        return saasCunt;
    }
}
