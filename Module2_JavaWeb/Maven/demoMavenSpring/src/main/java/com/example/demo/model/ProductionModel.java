package com.example.demo.model;

public class ProductionModel {
    private int id;
    private String ten;
    private double gia;
    private String hangSanXuat;

    public ProductionModel() {
    }

    public ProductionModel(int id, String ten, double gia, String hangSanXuat) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
}
