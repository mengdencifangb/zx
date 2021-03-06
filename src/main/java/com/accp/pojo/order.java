package com.accp.pojo;

import java.util.Date;

public class order {
    private String orderid;

    private Integer userid;

    private Integer serviceid;

    private Integer ordertype;

    private Date ordertime;

    private Date paymenttime;

    private Date receipttime;

    private Date provideservicestime;

    private Date completetime;

    private Date scheduledstarttime;

    private Date scheduledendtime;

    private Integer population;

    private Integer number;

    private Float smallplan;

    private String uploadpath;

    private Double weight;

    private Integer integral;

    private Integer addressid;

    private Integer addressid2;

    private Integer orderstatus;

    private Integer auditstatus;

    private String remarks;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getReceipttime() {
        return receipttime;
    }

    public void setReceipttime(Date receipttime) {
        this.receipttime = receipttime;
    }

    public Date getProvideservicestime() {
        return provideservicestime;
    }

    public void setProvideservicestime(Date provideservicestime) {
        this.provideservicestime = provideservicestime;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public Date getScheduledstarttime() {
        return scheduledstarttime;
    }

    public void setScheduledstarttime(Date scheduledstarttime) {
        this.scheduledstarttime = scheduledstarttime;
    }

    public Date getScheduledendtime() {
        return scheduledendtime;
    }

    public void setScheduledendtime(Date scheduledendtime) {
        this.scheduledendtime = scheduledendtime;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getSmallplan() {
        return smallplan;
    }

    public void setSmallplan(Float smallplan) {
        this.smallplan = smallplan;
    }

    public String getUploadpath() {
        return uploadpath;
    }

    public void setUploadpath(String uploadpath) {
        this.uploadpath = uploadpath == null ? null : uploadpath.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getAddressid2() {
        return addressid2;
    }

    public void setAddressid2(Integer addressid2) {
        this.addressid2 = addressid2;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}