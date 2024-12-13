/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC TINH
 */
public class tinhLuong {
    private String maNV;
    private int thang;
    private int nam;
    private int luongCoBan;
    private int soNgayDiMuon;
    private int soNgayCong;
    private int luongThucNhan;

    public tinhLuong() {
    }

    public tinhLuong(String maNV, int thang, int nam, int luongCoBan, int soNgayDiMuon, int soNgayCong, int luongThucNhan) {
        this.maNV = maNV;
        this.thang = thang;
        this.nam = nam;
        this.luongCoBan = luongCoBan;
        this.soNgayDiMuon = soNgayDiMuon;
        this.soNgayCong = soNgayCong;
        this.luongThucNhan = luongThucNhan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getSoNgayDiMuon() {
        return soNgayDiMuon;
    }

    public void setSoNgayDiMuon(int soNgayDiMuon) {
        this.soNgayDiMuon = soNgayDiMuon;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public int getLuongThucNhan() {
        return luongThucNhan;
    }

    public void setLuongThucNhan(int luongThucNhan) {
        this.luongThucNhan = luongThucNhan;
    }

    @Override
    public String toString() {
        return "tinhLuong{" + "maNV=" + maNV + ", thang=" + thang + ", nam=" + nam + ", luongCoBan=" + luongCoBan + ", soNgayDiMuon=" + soNgayDiMuon + ", soNgayCong=" + soNgayCong + ", luongThucNhan=" + luongThucNhan + '}';
    }
    
}
