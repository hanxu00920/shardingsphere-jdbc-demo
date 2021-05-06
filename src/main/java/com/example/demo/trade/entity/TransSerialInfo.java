package com.example.demo.trade.entity;

public class TransSerialInfo {
    private Long serialId;

    private String transsqe;

    private String ordernum;

    private String transamt;

    private String actualtransamt;

    private String dctamt;

    private String paytype;

    private String transtime;

    private String merccode;

    private String transstatus;

    public TransSerialInfo(Long serialId, String transsqe, String ordernum, String transamt, String actualtransamt, String dctamt, String paytype, String transtime, String merccode, String transstatus) {
        this.serialId = serialId;
        this.transsqe = transsqe;
        this.ordernum = ordernum;
        this.transamt = transamt;
        this.actualtransamt = actualtransamt;
        this.dctamt = dctamt;
        this.paytype = paytype;
        this.transtime = transtime;
        this.merccode = merccode;
        this.transstatus = transstatus;
    }

    public TransSerialInfo() {
        super();
    }

    public Long getSerialId() {
        return serialId;
    }

    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

    public String getTranssqe() {
        return transsqe;
    }

    public void setTranssqe(String transsqe) {
        this.transsqe = transsqe == null ? null : transsqe.trim();
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getTransamt() {
        return transamt;
    }

    public void setTransamt(String transamt) {
        this.transamt = transamt == null ? null : transamt.trim();
    }

    public String getActualtransamt() {
        return actualtransamt;
    }

    public void setActualtransamt(String actualtransamt) {
        this.actualtransamt = actualtransamt == null ? null : actualtransamt.trim();
    }

    public String getDctamt() {
        return dctamt;
    }

    public void setDctamt(String dctamt) {
        this.dctamt = dctamt == null ? null : dctamt.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getTranstime() {
        return transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime == null ? null : transtime.trim();
    }

    public String getMerccode() {
        return merccode;
    }

    public void setMerccode(String merccode) {
        this.merccode = merccode == null ? null : merccode.trim();
    }

    public String getTransstatus() {
        return transstatus;
    }

    public void setTransstatus(String transstatus) {
        this.transstatus = transstatus == null ? null : transstatus.trim();
    }
}