package com.example.demo.trade.entity;

public class OrderInfo {
    private Long orderId;

    private String merccode;

    private String ordernum;

    private String transamt;

    private String biztp;

    private String ordercount;

    private String channel;

    private String paytype;

    private String mercdttm;

    private String transstatus;

    private String remark1;

    private String remark2;

    private String tradetype;

    private String mobno;

    private String acctid;

    private String accttype;

    private String mercdate;

    private String extliquidate;

    private String actualtransamt;

    private String transsqe;

    private String mercustid;

    private String refundamt;

    private String dctamt;

    private String oriordernum;

    private String oriactualtransamt;

    private String respcode;

    private String transdate;

    private String merdctamt;

    public OrderInfo(Long orderId, String merccode, String ordernum, String transamt, String biztp, String ordercount, String channel, String paytype, String mercdttm, String transstatus, String remark1, String remark2, String tradetype, String mobno, String acctid, String accttype, String mercdate, String extliquidate, String actualtransamt, String transsqe, String mercustid, String refundamt, String dctamt, String oriordernum, String oriactualtransamt, String respcode, String transdate, String merdctamt) {
        this.orderId = orderId;
        this.merccode = merccode;
        this.ordernum = ordernum;
        this.transamt = transamt;
        this.biztp = biztp;
        this.ordercount = ordercount;
        this.channel = channel;
        this.paytype = paytype;
        this.mercdttm = mercdttm;
        this.transstatus = transstatus;
        this.remark1 = remark1;
        this.remark2 = remark2;
        this.tradetype = tradetype;
        this.mobno = mobno;
        this.acctid = acctid;
        this.accttype = accttype;
        this.mercdate = mercdate;
        this.extliquidate = extliquidate;
        this.actualtransamt = actualtransamt;
        this.transsqe = transsqe;
        this.mercustid = mercustid;
        this.refundamt = refundamt;
        this.dctamt = dctamt;
        this.oriordernum = oriordernum;
        this.oriactualtransamt = oriactualtransamt;
        this.respcode = respcode;
        this.transdate = transdate;
        this.merdctamt = merdctamt;
    }

    public OrderInfo() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getMerccode() {
        return merccode;
    }

    public void setMerccode(String merccode) {
        this.merccode = merccode == null ? null : merccode.trim();
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

    public String getBiztp() {
        return biztp;
    }

    public void setBiztp(String biztp) {
        this.biztp = biztp == null ? null : biztp.trim();
    }

    public String getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(String ordercount) {
        this.ordercount = ordercount == null ? null : ordercount.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getMercdttm() {
        return mercdttm;
    }

    public void setMercdttm(String mercdttm) {
        this.mercdttm = mercdttm == null ? null : mercdttm.trim();
    }

    public String getTransstatus() {
        return transstatus;
    }

    public void setTransstatus(String transstatus) {
        this.transstatus = transstatus == null ? null : transstatus.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype == null ? null : tradetype.trim();
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno == null ? null : mobno.trim();
    }

    public String getAcctid() {
        return acctid;
    }

    public void setAcctid(String acctid) {
        this.acctid = acctid == null ? null : acctid.trim();
    }

    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype == null ? null : accttype.trim();
    }

    public String getMercdate() {
        return mercdate;
    }

    public void setMercdate(String mercdate) {
        this.mercdate = mercdate == null ? null : mercdate.trim();
    }

    public String getExtliquidate() {
        return extliquidate;
    }

    public void setExtliquidate(String extliquidate) {
        this.extliquidate = extliquidate == null ? null : extliquidate.trim();
    }

    public String getActualtransamt() {
        return actualtransamt;
    }

    public void setActualtransamt(String actualtransamt) {
        this.actualtransamt = actualtransamt == null ? null : actualtransamt.trim();
    }

    public String getTranssqe() {
        return transsqe;
    }

    public void setTranssqe(String transsqe) {
        this.transsqe = transsqe == null ? null : transsqe.trim();
    }

    public String getMercustid() {
        return mercustid;
    }

    public void setMercustid(String mercustid) {
        this.mercustid = mercustid == null ? null : mercustid.trim();
    }

    public String getRefundamt() {
        return refundamt;
    }

    public void setRefundamt(String refundamt) {
        this.refundamt = refundamt == null ? null : refundamt.trim();
    }

    public String getDctamt() {
        return dctamt;
    }

    public void setDctamt(String dctamt) {
        this.dctamt = dctamt == null ? null : dctamt.trim();
    }

    public String getOriordernum() {
        return oriordernum;
    }

    public void setOriordernum(String oriordernum) {
        this.oriordernum = oriordernum == null ? null : oriordernum.trim();
    }

    public String getOriactualtransamt() {
        return oriactualtransamt;
    }

    public void setOriactualtransamt(String oriactualtransamt) {
        this.oriactualtransamt = oriactualtransamt == null ? null : oriactualtransamt.trim();
    }

    public String getRespcode() {
        return respcode;
    }

    public void setRespcode(String respcode) {
        this.respcode = respcode == null ? null : respcode.trim();
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate == null ? null : transdate.trim();
    }

    public String getMerdctamt() {
        return merdctamt;
    }

    public void setMerdctamt(String merdctamt) {
        this.merdctamt = merdctamt == null ? null : merdctamt.trim();
    }
}