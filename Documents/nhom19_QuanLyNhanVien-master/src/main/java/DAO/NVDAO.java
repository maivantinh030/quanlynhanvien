/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author PC TINH
 */
public class NVDAO {
    private static Connection connection = ConnectDB.getConnection();
    private static final String GET_MANV_LIST = "SELECT maNV FROM tbl_NhanVien";
    private static final String GET_NV_BY_MANV = "SELECT * FROM tbl_NhanVien WHERE maNV = ?";
    private static final String GET_NV_BY_MATK = "SELECT * FROM tbl_NhanVien WHERE maTK = ?";
    private static final String GET_NV_LIST = "SELECT * FROM tbl_NhanVien";
    private static final String GET_MANV_BY_TENNV = "SELECT maNV FROM tbl_NhanVien WHERE hoTen = ?";
    private static final String GET_HOTEN_BY_MANV = "SELECT hoTen FROM tbl_NhanVien WHERE maNV = ?";
    private static final String ADD_NV = "INSERT INTO tbl_NhanVien (hoTen, gioiTinh, diaChi, ngaySinh, CMND_CCCD, SDT, email, maTK) "
    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String DELETE_NV = "DELETE FROM tbl_NhanVien WHERE maNV = ?";
    private static final String UPDATE_NV = "UPDATE tbl_NhanVien SET hoTen = ?, gioiTinh = ?, diaChi = ?, ngaySinh = ?, CMND_CCCD = ?, "
    + "SDT = ?, email = ? WHERE maNV = ?";

    public void themNV(String hoTen, String gioiTinh, String diaChi, Date ngaySinh, String CMND_CCCD, String SDT, String email, String maTK) {
        try (PreparedStatement pst = connection.prepareStatement(ADD_NV)) {
            pst.setString(1, hoTen);
            pst.setString(2, gioiTinh);
            pst.setString(3, diaChi);
            pst.setDate(4, (java.sql.Date) ngaySinh);
            pst.setString(5, CMND_CCCD);
            pst.setString(6, SDT);
            pst.setString(7, email);
            pst.setString(8, maTK);

            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void suaNV(String hoTen, String gioiTinh, String diaChi, Date ngaySinh, String CMND_CCCD, String SDT, String email, String maNV) {
        try (PreparedStatement pst = connection.prepareStatement(UPDATE_NV)) {
            pst.setString(1, hoTen);
            pst.setString(2, gioiTinh);
            pst.setString(3, diaChi);
            pst.setDate(4, (java.sql.Date) ngaySinh);
            pst.setString(5, CMND_CCCD);
            pst.setString(6, SDT);
            pst.setString(7, email);
            pst.setString(8, maNV);

            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void xoaNV(String maNV) {
        try (PreparedStatement pst = connection.prepareStatement(DELETE_NV)) {
            pst.setString(1, maNV);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public NhanVien getNVByMaNV(String maNV) {
        NhanVien nv = new NhanVien();
        try (PreparedStatement pst = connection.prepareStatement(GET_NV_BY_MANV)) {
            pst.setString(1, maNV);

            ResultSet result = pst.executeQuery();
            if (result.next()) {
                nv.setMaNV(result.getString("maNV"));
                nv.setHoTen(result.getString("hoTen"));
                nv.setGioiTinh(result.getString("gioiTinh"));
                nv.setDiaChi(result.getString("diaChi"));
                nv.setNgaySinh(result.getDate("ngaySinh"));
                nv.setCCCD(result.getString("CMND_CCCD"));
                nv.setSdt(result.getString("SDT"));
                nv.setEmail(result.getString("email"));
                nv.setMaTK(result.getString("maTK"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
        return nv;
    }
    public String getHoTenByMaNV(String maNV){
        String hoTen = "";
        try(PreparedStatement pst = connection.prepareStatement(GET_HOTEN_BY_MANV)){
            
            pst.setString(1, maNV);
            ResultSet result = pst.executeQuery();
            if(result.next()){
                hoTen = result.getString("hoTen");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return hoTen;
    }
    public NhanVien getNVByMaTK(String maTK) {
        NhanVien nv = new NhanVien();
        try (PreparedStatement pst = connection.prepareStatement(GET_NV_BY_MATK)) {
            pst.setString(1, maTK);

            ResultSet result = pst.executeQuery();
            if (result.next()) {
                nv.setMaNV(result.getString("maNV"));
                nv.setHoTen(result.getString("hoTen"));
                nv.setGioiTinh(result.getString("gioiTinh"));
                nv.setDiaChi(result.getString("diaChi"));
                nv.setNgaySinh(result.getDate("ngaySinh"));
                nv.setCCCD(result.getString("CMND_CCCD"));
                nv.setSdt(result.getString("SDT"));
                nv.setEmail(result.getString("email"));
                nv.setMaTK(result.getString("maTK"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
        return nv;
    }

    public List<NhanVien> getNVList(){
            try(Statement stm = connection.createStatement()){
                List<NhanVien> NVList = new ArrayList<>();
                ResultSet result = stm.executeQuery(GET_NV_LIST);

                while(result.next()){
                    NhanVien nv = new NhanVien();
                    nv.setMaNV(result.getString("maNV"));
                    nv.setHoTen(result.getString("hoTen"));
                    nv.setGioiTinh(result.getString("gioiTinh"));
                    nv.setDiaChi(result.getString("diaChi"));
                    nv.setNgaySinh(result.getDate("ngaySinh"));
                    nv.setCCCD(result.getString("CMND_CCCD"));
                    nv.setSdt(result.getString("SDT"));
                    nv.setEmail(result.getString("email"));
                    nv.setMaTK(result.getString("maTK"));
                    NVList.add(nv);
                }
                return NVList;
            }catch(Exception e){
                e.printStackTrace();
            }
            return null;
        }

}
