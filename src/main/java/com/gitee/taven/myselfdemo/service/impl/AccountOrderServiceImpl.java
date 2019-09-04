package com.gitee.taven.myselfdemo.service.impl;

import com.gitee.taven.myselfdemo.dao.AccountOrderDao;
import com.gitee.taven.myselfdemo.entity.CAccountVO;
import com.gitee.taven.myselfdemo.entity.OrderVO;
import com.gitee.taven.myselfdemo.entity.PAccountVO;
import com.gitee.taven.myselfdemo.service.AccountOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @ClassName: AccountOrderDaoImpl
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 4:15 PM
 * @Version: 1.0
 */
@Service
public class AccountOrderServiceImpl implements AccountOrderService {
    @Autowired
    private AccountOrderDao accountOrderDao;
    @Override
    public Integer addOrder(OrderVO orderVO) {
        return accountOrderDao.addOrder(orderVO);
    }

    @Override
    public Integer lessHouse(String commodityId) {
        return accountOrderDao.lessHouse(commodityId);
    }

    @Override
    public Integer lessPcount(PAccountVO pAccountVO) {
        return accountOrderDao.lessPcount(pAccountVO);
    }

    @Override
    public Integer addCount(CAccountVO cAccountVO) {
        return accountOrderDao.addCount(cAccountVO);
    }
}
