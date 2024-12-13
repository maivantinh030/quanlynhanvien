/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.TaiKhoan;

/**
 *
 * @author PC TINH
 */
public class TaiKhoanDAO {
    private static Connection connection = ConnectDB.getConnection();
    private static final String ADD_NEW_TK = "INSERT INTO tbl_TaiKhoan (loaiTK, tenDNhap, matKhau) VALUES (?, ?, ?)";
    private static final String DELETE_TK = "DELETE FROM tbl_TaiKhoan WHERE maTK = ?";
    private static final String IS_ADMIN = "SELECT loaiTK FROM tbl_TaiKhoan WHERE maTK = ?";
    private static final String UPDATE_TK = "UPDATE tbl_TaiKhoan SET loaiTK = ?, tenDNhap = ?, matKhau = ? WHERE maTK = ?";
    private static final String VALID_ACC = "SELECT * FROM tbl_TaiKhoan WHERE tenDNhap = ? AND matKhau = ?";
    private static final String CHECK_PW = "SELECT * FROM tbl_TaiKhoan WHERE maTK = ? AND matKhau = ?";
    private static final String GET_TK_LIST = "SELECT * FROM tbl_TaiKhoan";
    private static final String UPDATE_PASSWORD = "UPDATE tbl_TaiKhoan SET matKhau = ? WHERE maTK = ?";
    
    public void themTaiKhoan(String loaiTK, String tenDNhap,String matKhau){
        try(PreparedStatement pst = connection.prepareStatement(ADD_NEW_TK)){
            pst.setString(0, loaiTK);
            pst.setString(1, tenDNhap);
            pst.setString(2, matKhau);
            
            pst.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void xoaTaiKhoan(String maTK) {
        try (PreparedStatement pst = connection.prepareStatement(DELETE_TK)) {
            pst.setString(1, maTK);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void suaTaiKhoan(String loaiTK, String tenDNhap, String matKhau, String maTK) {
        try (PreparedStatement pst = connection.prepareStatement(UPDATE_TK)) {
            pst.setString(1, loaiTK); // Chỉnh sửa loaiTK (nhanvien/admin)
            pst.setString(2, tenDNhap); // Chỉnh sửa tên đăng nhập
            pst.setString(3, matKhau); // Chỉnh sửa mật khẩu
            pst.setString(4, maTK); // Dùng maTK để xác định tài khoản cần sửa

            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updatePassword(String maTK,String matKhau){
        try(PreparedStatement pst = connection.prepareStatement(UPDATE_PASSWORD)){
            pst.setString(1, matKhau);
            pst.setString(2, maTK);
            pst.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public model.TaiKhoan isValidAccount(String tenDangNhap, String matKhau) {
        try (PreparedStatement pst = connection.prepareStatement(VALID_ACC)) {
            pst.setString(1, tenDangNhap);
            pst.setString(2, matKhau);
            ResultSet result = pst.executeQuery();
            if (result.next()) {
                model.TaiKhoan tk = new model.TaiKhoan();
                tk.setMaTK(result.getString("maTK"));
                tk.setLoaiTK(result.getString("loaiTK")); // Cập nhật maLoaiTK
                tk.setTenDNhap(result.getString("tenDNhap"));
                tk.setMatKhau(result.getString("matKhau"));
                System.out.println("có tài khoản");
                return tk;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean checkPassword(String maTK, String matKhau){
        try(PreparedStatement pst = connection.prepareStatement(CHECK_PW)){
            pst.setString(1, maTK);
            pst.setString(2, matKhau);
            ResultSet result = pst.executeQuery();
            if(result.next()){
                return true;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean isAdmin(String maTK){
        String loaiTK = "";
        try (PreparedStatement pst = connection.prepareStatement(IS_ADMIN)){
            pst.setString(1,maTK);
            ResultSet result = pst.executeQuery();
            if(result.next()){
                loaiTK = result.getString("loaiTK");
            }
            if(loaiTK.equalsIgnoreCase("admin")){
                return true;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
