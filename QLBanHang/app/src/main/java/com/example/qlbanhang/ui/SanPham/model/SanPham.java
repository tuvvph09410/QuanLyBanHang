package com.example.qlbanhang.ui.SanPham.model;

import android.media.Image;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "SanPham")
public class SanPham {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name="maSP")
    private String maSP;

    @ColumnInfo(name="tenSP")
    private String tenSP;

    @ColumnInfo(name="imgSP")
    private String imgSP;

    @ColumnInfo(name="giaSP")
    private String giaSP;

    @ColumnInfo(name="ThuongHieu")
    private String ThuongHieu;

    @ColumnInfo(name="NSX")
    private int NSX;

    @ColumnInfo(name="HSD")
    private int HSD;
    public SanPham(){}
    public SanPham(String maSP, String tenSP, String imgSP, String giaSP, String thuongHieu, int NSX, int HSD) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.imgSP = imgSP;
        this.giaSP = giaSP;
        this.ThuongHieu = thuongHieu;
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getImgSP() {
        return imgSP;
    }

    public void setImgSP(String  imgSP) {
        this.imgSP = imgSP;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        ThuongHieu = thuongHieu;
    }

    public int getNSX() {
        return NSX;
    }

    public void setNSX(int NSX) {
        this.NSX = NSX;
    }

    public int getHSD() {
        return HSD;
    }

    public void setHSD(int HSD) {
        this.HSD = HSD;
    }
}
