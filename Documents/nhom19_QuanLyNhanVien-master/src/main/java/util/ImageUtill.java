/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class ImageUtill {
    String linkImage = "C:\\Users\\PC TINH\\Documents\\nhom19_QuanLyNhanVien-master\\Image\\";
    
    public void addImage(JLabel txt, String filePath, int width, int height) {
        try {
            BufferedImage bfImage = ImageIO.read(new File(linkImage + filePath));
            if (bfImage != null) {
                Image i = bfImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(i);
                txt.setIcon(icon);
            } else {
                System.out.println("Không tìm thấy file ảnh: " + filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
