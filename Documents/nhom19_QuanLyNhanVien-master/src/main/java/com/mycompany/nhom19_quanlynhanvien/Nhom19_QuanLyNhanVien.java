/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nhom19_quanlynhanvien;

import DangNhap.DangNhap;
import UI_QuanLy.TrangChu;
import UI_QuanLy.UI_QuanLy;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import util.ImageUtill;
import util.PanelGradient;

/**
 *
 * @author Admin
 */
public class Nhom19_QuanLyNhanVien {

    public static boolean kiemTraRong(JPanel jpanel){
        
        
        Component[] comp = jpanel.getComponents();
        for(Component component: comp){
            
            if(component instanceof JTextField){
                JTextField textField = (JTextField) component;
                if(textField.getText().isEmpty()){
                    return false;
                }
            }
                else if(component instanceof JPasswordField){
                    JPasswordField passwordFiled = (JPasswordField) component;
                    if(passwordFiled.getPassword().length == 0){
                        return false;
                    }
                }
                else if(component instanceof JComboBox){
                    JComboBox comboBox = (JComboBox) component;
                    if(comboBox.getSelectedItem().toString().equals("")){
                        return false; 
                    }
                }
                else if(component instanceof JTextArea){
                    JTextArea ta = (JTextArea) component;
                    if(!ta.getText().isEmpty()){
                        return false;
                    }
                }
            }
        
        return true;
    }
    public static void main(String[] args) {
       DangNhap dn = new DangNhap();
       dn.setVisible(true);
      
    }
}
