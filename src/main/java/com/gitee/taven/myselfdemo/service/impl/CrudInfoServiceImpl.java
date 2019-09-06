package com.gitee.taven.myselfdemo.service.impl;

import com.gitee.taven.myselfdemo.entity.*;
import com.gitee.taven.myselfdemo.mapper.mysql_mapper.HouseMapper;
import com.gitee.taven.myselfdemo.mapper.mysql_mapper.PAccountMapper;
import com.gitee.taven.myselfdemo.mapper.postgresql_mapper.CAccountMapper;
import com.gitee.taven.myselfdemo.mapper.postgresql_mapper.CommodityMapper;
import com.gitee.taven.myselfdemo.mapper.postgresql_mapper.OrderMapper;
import com.gitee.taven.myselfdemo.service.AccountOrderService;
import com.gitee.taven.myselfdemo.service.CrudInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: CrudInfoServiceImpl
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 4:59 PM
 * @Version: 1.0
 */
@Service
public class CrudInfoServiceImpl implements CrudInfoService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    HouseMapper houseMapper;
    @Autowired
    PAccountMapper pAccountMapper;
    @Autowired
    CAccountMapper cAccountMapper;
    @Autowired
    CommodityMapper commodityMapper;
    @Autowired
    AccountOrderService accountOrderService;

    @Override
    @Transactional
    public Integer orderBy(OrderByEntity orderByEntity) {
       // 添加订单
       Integer a=accountOrderService.addOrder(orderByEntity.getOrder());
        //减少库存
       Integer b=accountOrderService.lessHouse(orderByEntity.getHouse(),orderByEntity.getChangeCount());
        //减少个人账户金额
        Integer c=accountOrderService.lessPcount(orderByEntity.getPAccount(),orderByEntity.getChangeMoney());
        //增加商户账户
        Integer d=accountOrderService.addCount(orderByEntity.getCAccount(),orderByEntity.getChangeMoney());
        Integer number=a+b+c+d;
        if( number < 4){
            throw  new RuntimeException("商品购买失败！");
        }
        return number;
    }

    @Override
    public Integer saveCaccout(CAccount cAccount) {
        return cAccountMapper.insert(cAccount);
    }

    @Override
    public Integer savePaccount(PAccount pAccount) {
        return pAccountMapper.insert(pAccount);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Integer saveCommodity(OrderByEntity orderByEntity) {
        //添加商品
        Integer a=commodityMapper.insert(orderByEntity.getCommodity());
        House house=new House();
        house.setCommodityName(orderByEntity. getCommodity().getCommodityName());
        house.setCommodityCode(orderByEntity.getCommodity().getCommodityCode());
        orderByEntity.setHouse(house);
        //增加商品库存
        Integer b=accountOrderService.addHouse(orderByEntity.getHouse(), orderByEntity.getChangeCount());
        return a+b;
    }

    @Override
    public Integer saveHouse(House house) {
        return houseMapper.insert(house);
    }
}
