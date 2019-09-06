package com.gitee.taven.myselfdemo.service;

import com.gitee.taven.myselfdemo.entity.CAccount;
import com.gitee.taven.myselfdemo.entity.House;
import com.gitee.taven.myselfdemo.entity.Order;
import com.gitee.taven.myselfdemo.entity.PAccount;
import tk.mybatis.mapper.common.BaseMapper;

public interface AccountOrderService{
    /**
     * 增加运单
     * @return
     */
    Integer addOrder(Order order);

    /**
     * 减少库存
     * @param count 库存变化的数量
     * @return
     */
    Integer lessHouse(House house,Integer count);
    /**
     * 减少库存
     * @param count 库存变化的数量
     * @return
     */
    Integer addHouse(House house,Integer count);
    /**
     * 将个人用户的金额减去
     * @param pAccountVO
     * @return
     */
    Integer lessPcount(PAccount pAccountVO,Integer changeMoney);

    /**
     * 将金额加到商户的账户上
     * @param cAccountVO
     * @return
     */
    Integer addCount(CAccount cAccountVO,Integer changeMoney);
}
