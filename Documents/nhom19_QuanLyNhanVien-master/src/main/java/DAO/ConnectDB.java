/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC TINH
 */
public class ConnectDB {
    private final static String url = "jdbc:mysql://localhost:3306/QLNV";
    private final static String username = "root";
    private final static String passwd = "031203";

    public static Connection getConnection() {
        Connection connection = null;

        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection(url,username,passwd);
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        }
        catch (SQLException e) {
                e.printStackTrace();
        }
        return connection;
    }
}
