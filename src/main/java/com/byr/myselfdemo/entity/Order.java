package com.byr.myselfdemo.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table public.order
 */
public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   订单码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order.order_code
     *
     * @mbg.generated
     */
    private String orderCode;

    /**
     * Database Column Remarks:
     *   订单名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order.order_name
     *
     * @mbg.generated
     */
    private String orderName;

    /**
     * Database Column Remarks:
     *   订单数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order.order_count
     *
     * @mbg.generated
     */
    private Integer orderCount;

    /**
     * Database Column Remarks:
     *   商品Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order.commodity_code
     *
     * @mbg.generated
     */
    private String commodityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order.id
     *
     * @return the value of public.order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order.id
     *
     * @param id the value for public.order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order.order_code
     *
     * @return the value of public.order.order_code
     *
     * @mbg.generated
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order.order_code
     *
     * @param orderCode the value for public.order.order_code
     *
     * @mbg.generated
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order.order_name
     *
     * @return the value of public.order.order_name
     *
     * @mbg.generated
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order.order_name
     *
     * @param orderName the value for public.order.order_name
     *
     * @mbg.generated
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order.order_count
     *
     * @return the value of public.order.order_count
     *
     * @mbg.generated
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order.order_count
     *
     * @param orderCount the value for public.order.order_count
     *
     * @mbg.generated
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order.commodity_code
     *
     * @return the value of public.order.commodity_code
     *
     * @mbg.generated
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order.commodity_code
     *
     * @param commodityCode the value for public.order.commodity_code
     *
     * @mbg.generated
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderCount() == null ? other.getOrderCount() == null : this.getOrderCount().equals(other.getOrderCount()))
            && (this.getCommodityCode() == null ? other.getCommodityCode() == null : this.getCommodityCode().equals(other.getCommodityCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderCount() == null) ? 0 : getOrderCount().hashCode());
        result = prime * result + ((getCommodityCode() == null) ? 0 : getCommodityCode().hashCode());
        return result;
    }
}