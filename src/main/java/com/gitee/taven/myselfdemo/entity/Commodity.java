package com.gitee.taven.myselfdemo.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table public.commodity
 */

public class Commodity {
    private Integer id;
    /**
     * Database Column Remarks:
     *   商品名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.commodity.commodity_name
     *
     * @mbg.generated
     */
    private String commodityName;

    /**
     * Database Column Remarks:
     *   价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.commodity.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   商品代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.commodity.commodity_code
     *
     * @mbg.generated
     */
    private String commodityCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.commodity.commodity_name
     *
     * @return the value of public.commodity.commodity_name
     *
     * @mbg.generated
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.commodity.commodity_name
     *
     * @param commodityName the value for public.commodity.commodity_name
     *
     * @mbg.generated
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.commodity.price
     *
     * @return the value of public.commodity.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.commodity.price
     *
     * @param price the value for public.commodity.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.commodity.commodity_code
     *
     * @return the value of public.commodity.commodity_code
     *
     * @mbg.generated
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.commodity.commodity_code
     *
     * @param commodityCode the value for public.commodity.commodity_code
     *
     * @mbg.generated
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }
}