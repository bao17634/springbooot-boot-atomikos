package com.gitee.taven.myselfdemo.dao.impl;

import com.gitee.taven.myselfdemo.dao.AccountOrderDao;
import com.gitee.taven.myselfdemo.entity.CAccountVO;
import com.gitee.taven.myselfdemo.entity.OrderVO;
import com.gitee.taven.myselfdemo.entity.PAccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AccountOrderDaoImpl
 * @Description: TODO
 * @Author: yanrong
 * @Date: 9/4/2019 4:15 PM
 * @Version: 1.0
 */
@Repository
public class AccountOrderDaoImpl implements AccountOrderDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer addOrder(OrderVO orderVO) {
        StringBuffer sqlBuff=new StringBuffer();
        List queryList=new ArrayList();
        sqlBuff.append("insert into order(");
        sqlBuff.append("order_code");    queryList.add(orderVO.getOrderCode());
        sqlBuff.append("order_name");    queryList.add(orderVO.getOrderName());
        sqlBuff.append("order_count)");  queryList.add(orderVO.getOrderCount());
        sqlBuff.append(" values(?,?,?)");
        Integer a=jdbcTemplate.update(sqlBuff.toString(),queryList.toArray());
        return a;
    }

    @Override
    public Integer lessHouse(String commodityId) {
        String sql="update house set number= number-1 where commodityId=?";
        Integer a=jdbcTemplate.update(sql,commodityId);
        return a;
    }

    @Override
    public Integer lessPcount(PAccountVO pAccountVO) {
        String sql="update p_account set account_money-? and order_code=?";
        Integer a=jdbcTemplate.update(sql,pAccountVO.getPrice(),pAccountVO.getOrderCode());
        return a;
    }

    @Override
    public Integer addCount(CAccountVO cAccountVO) {
        String sql="update c_account set account_money-? and order_code=?";
        Integer a=jdbcTemplate.update(sql,cAccountVO.getPrice(),cAccountVO.getOrderCode());
        return a;
    }
}
