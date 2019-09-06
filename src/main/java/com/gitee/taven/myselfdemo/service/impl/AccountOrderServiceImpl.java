package com.gitee.taven.myselfdemo.service.impl;

import com.gitee.taven.myselfdemo.entity.*;
import com.gitee.taven.myselfdemo.mapper.mysql_mapper.HouseMapper;
import com.gitee.taven.myselfdemo.mapper.mysql_mapper.PAccountMapper;
import com.gitee.taven.myselfdemo.mapper.postgresql_mapper.CAccountMapper;
import com.gitee.taven.myselfdemo.mapper.postgresql_mapper.OrderMapper;
import com.gitee.taven.myselfdemo.service.AccountOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.entity.Example;

import java.util.Base64;
import java.util.List;

/**
 * @ClassName: AccountOrderDaoImpl
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 4:15 PM
 * @Version: 1.0
 */
@Service
public class AccountOrderServiceImpl  implements AccountOrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    HouseMapper houseMapper;
    @Autowired
    PAccountMapper pAccountMapper;
    @Autowired
    CAccountMapper cAccountMapper;
    @Override
    @Transactional
    public Integer addOrder(Order orderVO) {
        return orderMapper.insert(orderVO);
    }
    // 事务隔离级别不允许脏读
    @Override
    @Transactional(rollbackFor = RuntimeException.class,isolation =Isolation.READ_COMMITTED)
    public Integer lessHouse(House house, Integer count) {
        Example example=new Example(House.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo(Integer.valueOf(house.getCommodityCode()));
        List<House> listHost=houseMapper.selectByExample(example);
        if(listHost == null || listHost.size() == 0 || listHost.get(0).getNumber() == 0){
            throw new RuntimeException("此商品的库存为空！");
        }
        house.setNumber(listHost.get(0).getNumber()-count);
        Integer a=houseMapper.updateByExample(house,example);
        if( a != 1){
            throw new RuntimeException("此商品的库存更新失败，请稍后再试！");
        }
        return a;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class,isolation = Isolation.READ_COMMITTED)
    public Integer addHouse(House house, Integer count) {
        Integer a=null;
        Example example=new Example(House.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo(house.getCommodityCode());
        List<House> listHost=houseMapper.selectByExample(example);
        if(listHost == null || listHost.size() == 0 ){
            house.setNumber(count);
            a=houseMapper.insert(house);
        }else {
            house.setNumber(listHost.get(0).getNumber()+count);
            house.setId(listHost.get(0). getId());
            a=houseMapper.updateByExample(house,example);
        }
        if( a != 1 ){
            throw new RuntimeException("此商品的库存更新失败，请稍后再试！");
        }
        return a;
    }

    // 事务隔离级别不允许脏读
    @Override
    @Transactional(rollbackFor = RuntimeException.class,isolation =Isolation.READ_COMMITTED)
    public Integer lessPcount(PAccount pAccountVO, Integer changeMoney) {
        Example example=new Example(PAccount.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo(pAccountVO.getOrderCode());
        List<PAccount> listPaccount=pAccountMapper.selectByExample(example);
        if(listPaccount == null || listPaccount.size() == 0 ){
            throw new RuntimeException("无此账号信息！");
        }else if(listPaccount.get(0).getAccountMoey() < changeMoney){
            throw new RuntimeException("此账号金额不足！");
        }
        Integer a=pAccountMapper.updateByExampleSelective(pAccountVO,example);
        if( a != 1){
            throw new RuntimeException("商品购买失败请稍后再试");
        }
        return a;
    }

    // 事务隔离级别不允许脏读
    @Override
    @Transactional(rollbackFor = RuntimeException.class,isolation =Isolation.READ_COMMITTED)
    public Integer addCount(CAccount cAccountVO, Integer changeMoney) {
        Example example=new Example(CAccount.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo(cAccountVO.getOrderCode());
        List<CAccount> listCaccount=cAccountMapper.selectByExample(example);
        if (listCaccount ==null || listCaccount.size() == 0){
            throw new RuntimeException("无此账号信息！");
        }
        cAccountVO.setAccountMoey(listCaccount. get(0).getAccountMoey()+changeMoney);
        Integer a=cAccountMapper.updateByExampleSelective(cAccountVO,example);
        if(a != 1){
            throw new RuntimeException("商品购买失败请稍后再试");
        }
        return a;
    }


}
