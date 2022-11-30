package com.example.thuchanhcuoiki;

public class Thongtin {
    private String tentacgia;
    private String mota;
    private int hinh;

    public Thongtin(String tentacgia, String mota, int hinh) {
        this.tentacgia = tentacgia;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void getTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
