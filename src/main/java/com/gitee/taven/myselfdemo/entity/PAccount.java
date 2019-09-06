package com.gitee.taven.myselfdemo.entity;

import javax.persistence.*;

@Table(name = "p_account")
public class PAccount {
    private Integer id;

    /**
     * 用户账号
     */
    @Column(name = "accout_code")
    private String accoutCode;

    /**
     * 用户名
     */
    @Column(name = "accout_name")
    private String accoutName;

    /**
     * 账号金额
     */
    @Column(name = "account_moey")
    private Long accountMoey;

    /**
     * 运单号
     */
    @Column(name = "order_code")
    private Integer orderCode;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户账号
     *
     * @return accout_code - 用户账号
     */
    public String getAccoutCode() {
        return accoutCode;
    }

    /**
     * 设置用户账号
     *
     * @param accoutCode 用户账号
     */
    public void setAccoutCode(String accoutCode) {
        this.accoutCode = accoutCode == null ? null : accoutCode.trim();
    }

    /**
     * 获取用户名
     *
     * @return accout_name - 用户名
     */
    public String getAccoutName() {
        return accoutName;
    }

    /**
     * 设置用户名
     *
     * @param accoutName 用户名
     */
    public void setAccoutName(String accoutName) {
        this.accoutName = accoutName == null ? null : accoutName.trim();
    }

    /**
     * 获取账号金额
     *
     * @return account_moey - 账号金额
     */
    public Long getAccountMoey() {
        return accountMoey;
    }

    /**
     * 设置账号金额
     *
     * @param accountMoey 账号金额
     */
    public void setAccountMoey(Long accountMoey) {
        this.accountMoey = accountMoey;
    }

    /**
     * 获取运单号
     *
     * @return order_code - 运单号
     */
    public Integer getOrderCode() {
        return orderCode;
    }

    /**
     * 设置运单号
     *
     * @param orderCode 运单号
     */
    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }
}