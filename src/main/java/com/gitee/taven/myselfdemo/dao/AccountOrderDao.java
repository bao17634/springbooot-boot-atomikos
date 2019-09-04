package com.gitee.taven.myselfdemo.dao;

import com.gitee.taven.myselfdemo.entity.CAccountVO;
import com.gitee.taven.myselfdemo.entity.OrderVO;
import com.gitee.taven.myselfdemo.entity.PAccountVO;

public interface AccountOrderDao {
    /**
     * 增加运单
     * @return
     */
    Integer addOrder(OrderVO orderVO);

    /**
     * 减少库存
     * @param commodityId
     * @return
     */
    Integer lessHouse(String commodityId);

    /**
     * 将个人用户的金额减去
     * @param pAccountVO
     * @return
     */
    Integer lessPcount(PAccountVO pAccountVO);

    /**
     * 将金额加到商户的账户上
     * @param cAccountVO
     * @return
     */
    Integer addCount(CAccountVO cAccountVO);
}
