/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author PC TINH
 */
public class LSChamCong {
    private String maLSChamCong;
    private String maNV;
    private LocalDateTime ngayChamCong;

    public LSChamCong(String maLSChamCong, String maNV, LocalDateTime ngayChamCong) {
        this.maLSChamCong = maLSChamCong;
        this.maNV = maNV;
        this.ngayChamCong = ngayChamCong;
    }

    public LSChamCong() {
    }

    public String getMaLSChamCong() {
        return maLSChamCong;
    }

    public void setMaLSChamCong(String maLSChamCong) {
        this.maLSChamCong = maLSChamCong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public LocalDateTime getNgayChamCong() {
        return ngayChamCong;
    }

    public void setNgayChamCong(LocalDateTime ngayChamCong) {
        this.ngayChamCong = ngayChamCong;
    }
    
}
