/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

/**
 *
 * @author PC TINH
 */
public class ChamCongDAO {
    private static Connection connection = ConnectDB.getConnection();
    private static String ADD_LSCC = "INSERT INTO tbl_LSChamCong ( maNV, ngayChamCong) VALUES"
            + "(?,?)";
    private static String CHECK_LSCC = "SELECT * FROM tbl_LSChamCong WHERE maNV = ? \n" +
"  AND DATE(ngayChamCong) = ? ";
    public void addLS(String maNV,LocalDateTime ngayChamCong){
        try(PreparedStatement pst = connection.prepareStatement(ADD_LSCC)){
            pst.setString(1, maNV);
            pst.setObject(2,ngayChamCong);
            pst.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean checkLSCC(String maNV,LocalDateTime ngayChamCong){
        try(PreparedStatement pst = connection.prepareStatement(CHECK_LSCC)){
            pst.setString(1, maNV);
            pst.setObject(2,ngayChamCong.toLocalDate());
            ResultSet result = pst.executeQuery();
            if(result.next())
                return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
