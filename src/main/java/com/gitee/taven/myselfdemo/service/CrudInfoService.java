package com.gitee.taven.myselfdemo.service;

import com.gitee.taven.myselfdemo.entity.*;

public interface CrudInfoService {
    /**
     * 购买商品
     * @param orderByEntity
     * @return
     */
    Integer orderBy(OrderByEntity orderByEntity);
    /**
     * 添加商户账号
     * @param cAccount
     * @return
     */
    Integer saveCaccout(CAccount cAccount);

    /**
     * 添加个人账号
     * @param pAccount
     * @return
     */
    Integer savePaccount(PAccount pAccount);

    /**
     * 添加商品信息
     * @param orderByEntity
     * @return
     */
    Integer saveCommodity(OrderByEntity orderByEntity);

    /**
     * 添加库存
     * @param house
     * @return
     */
    Integer saveHouse(House house);
}
