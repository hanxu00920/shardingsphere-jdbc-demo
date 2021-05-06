package com.example.demo.trade.entity;

public class MerInfo {
    private String merccode;

    private String mercname;

    public MerInfo(String merccode, String mercname) {
        this.merccode = merccode;
        this.mercname = mercname;
    }

    public MerInfo() {
        super();
    }

    public String getMerccode() {
        return merccode;
    }

    public void setMerccode(String merccode) {
        this.merccode = merccode == null ? null : merccode.trim();
    }

    public String getMercname() {
        return mercname;
    }

    public void setMercname(String mercname) {
        this.mercname = mercname == null ? null : mercname.trim();
    }
}