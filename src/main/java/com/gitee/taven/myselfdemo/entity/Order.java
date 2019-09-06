package com.gitee.taven.myselfdemo.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table public.order
 */
public class Order {
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
     * This field corresponds to the database column public.order.commodityId
     *
     * @mbg.generated
     */
    private Integer commodityid;

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
     * This method returns the value of the database column public.order.commodityId
     *
     * @return the value of public.order.commodityId
     *
     * @mbg.generated
     */
    public Integer getCommodityid() {
        return commodityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order.commodityId
     *
     * @param commodityid the value for public.order.commodityId
     *
     * @mbg.generated
     */
    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }
}