/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author PC TINH
 */
public class NghiPhepDAO {
    private static Connection connection = ConnectDB.getConnection();
    private static final String ADD_NP = "INSERT INTO tbl_NghiPhep VALUES (NULL,?,?,?,?,?,'Chưa xác nhận')";
    
    public void themNghiPhep(String maNV,String hoTen,String lyDo,Date ngayBatDau,Date ngayKetThuc){
        try(PreparedStatement pst = connection.prepareStatement(ADD_NP)){
            pst.setString(1, maNV);
            pst.setString(2, hoTen);
            pst.setString(3, lyDo);
            pst.setDate(4, ngayBatDau);
            pst.setDate(5, ngayKetThuc);
            
            pst.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
