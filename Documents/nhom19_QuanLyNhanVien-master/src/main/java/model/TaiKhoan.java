/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC TINH
 */
public class TaiKhoan {
    private String maTK;
    private String loaiTK;
    private String tenDNhap;
    private String matKhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTK, String loaiTK, String tenDNhap, String matKhau) {
        this.maTK = maTK;
        this.loaiTK = loaiTK;
        this.tenDNhap = tenDNhap;
        this.matKhau = matKhau;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }

    public String getTenDNhap() {
        return tenDNhap;
    }

    public void setTenDNhap(String tenDNhap) {
        this.tenDNhap = tenDNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTK=" + maTK + ", loaiTK=" + loaiTK + ", tenDNhap=" + tenDNhap + ", matKhau=" + matKhau + '}';
    }
    
}
