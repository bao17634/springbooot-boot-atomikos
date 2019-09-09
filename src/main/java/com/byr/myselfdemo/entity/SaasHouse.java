package com.byr.myselfdemo.entity;

import java.io.Serializable;

public class SaasHouse implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saas_house.id
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saas_house.number
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saas_house.commodity_code
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    private String commodityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saas_house.commodity_name
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    private String commodityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table saas_house
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saas_house.id
     *
     * @return the value of saas_house.id
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saas_house.id
     *
     * @param id the value for saas_house.id
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saas_house.number
     *
     * @return the value of saas_house.number
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saas_house.number
     *
     * @param number the value for saas_house.number
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saas_house.commodity_code
     *
     * @return the value of saas_house.commodity_code
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saas_house.commodity_code
     *
     * @param commodityCode the value for saas_house.commodity_code
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saas_house.commodity_name
     *
     * @return the value of saas_house.commodity_name
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saas_house.commodity_name
     *
     * @param commodityName the value for saas_house.commodity_name
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saas_house
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
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
        SaasHouse other = (SaasHouse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getCommodityCode() == null ? other.getCommodityCode() == null : this.getCommodityCode().equals(other.getCommodityCode()))
            && (this.getCommodityName() == null ? other.getCommodityName() == null : this.getCommodityName().equals(other.getCommodityName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saas_house
     *
     * @mbg.generated Fri Sep 06 15:29:41 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getCommodityCode() == null) ? 0 : getCommodityCode().hashCode());
        result = prime * result + ((getCommodityName() == null) ? 0 : getCommodityName().hashCode());
        return result;
    }
}