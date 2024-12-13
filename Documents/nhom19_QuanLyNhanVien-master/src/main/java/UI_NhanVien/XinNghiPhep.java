/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_NhanVien;

import DAO.NVDAO;
import DAO.NghiPhepDAO;
import java.awt.Color;
import java.time.LocalDate;
import java.util.Calendar;
import java.sql.Date;
import javax.swing.JOptionPane;
import model.NghiPhep;
import util.ImageUtill;

/**
 *
 * @author Admin
 */
public class XinNghiPhep extends javax.swing.JPanel {

    /**
     * Creates new form XinNghiPhep
     */
    String maNV;
    NVDAO nvDAO ;
    NghiPhepDAO npDAO;
    public XinNghiPhep(String maNV) {
        this.maNV = maNV;
        initComponents();
        ImageUtill imageUtil = new ImageUtill();
        imageUtil.addImage(lbXinNghiPhep, "nghi_phep.png", 90, 90);
        lbTieude.setBackground(new Color(8, 86, 168));
        lbTieude.setForeground(Color.WHITE);
        lbTieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTieude.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        nvDAO = new NVDAO();
        npDAO = new NghiPhepDAO();
        tfHoTen.setText(nvDAO.getHoTenByMaNV(maNV));
        tfMaNhanVien.setText(maNV);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTieude = new javax.swing.JLabel();
        lbXinNghiPhep = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        lbMaNhanVien = new javax.swing.JLabel();
        lbNgayXinNghi = new javax.swing.JLabel();
        lbLyDoXinNghi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taXinNghiPhep = new javax.swing.JTextArea();
        lbSoNgayNghi = new javax.swing.JLabel();
        tfSoNgayNghi = new javax.swing.JTextField();
        tfMaNhanVien = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        buttonDarkBlue1 = new util.ButtonDarkBlue();
        buttonDarkBlue2 = new util.ButtonDarkBlue();
        dateNgayNghi = new com.toedter.calendar.JDateChooser();

        lbTieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTieude.setText("Xin nghỉ phép");
        lbTieude.setOpaque(true);

        lbHoTen.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbHoTen.setText("Họ tên:");

        lbMaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbMaNhanVien.setText("Mã nhân viên:");

        lbNgayXinNghi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbNgayXinNghi.setText("Ngày xin nghỉ:");

        lbLyDoXinNghi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbLyDoXinNghi.setText("Lý do xin nghỉ:");

        taXinNghiPhep.setColumns(20);
        taXinNghiPhep.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        taXinNghiPhep.setRows(5);
        jScrollPane1.setViewportView(taXinNghiPhep);

        lbSoNgayNghi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbSoNgayNghi.setText("Số ngày nghỉ:");

        tfSoNgayNghi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfSoNgayNghi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfMaNhanVien.setEditable(false);
        tfMaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfMaNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfHoTen.setEditable(false);
        tfHoTen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfHoTen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoTenActionPerformed(evt);
            }
        });

        buttonDarkBlue1.setText("Xác nhận");
        buttonDarkBlue1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDarkBlue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDarkBlue1ActionPerformed(evt);
            }
        });

        buttonDarkBlue2.setText("Lịch sử");
        buttonDarkBlue2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonDarkBlue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDarkBlue2ActionPerformed(evt);
            }
        });

        dateNgayNghi.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbMaNhanVien)
                                    .addComponent(lbHoTen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(tfMaNhanVien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbXinNghiPhep, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNgayXinNghi)
                                    .addComponent(lbSoNgayNghi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSoNgayNghi, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(dateNgayNghi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbLyDoXinNghi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonDarkBlue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonDarkBlue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTieude, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNgayXinNghi)
                            .addComponent(dateNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoNgayNghi)
                            .addComponent(tfSoNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbXinNghiPhep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMaNhanVien))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLyDoXinNghi)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDarkBlue1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDarkBlue2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDarkBlue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDarkBlue1ActionPerformed
        String hoTen = tfHoTen.getText();
        java.util.Date util_ngayBatDau = dateNgayNghi.getDate();
        java.sql.Date sql_ngayBatDau = new java.sql.Date(util_ngayBatDau.getTime());
        int soNgayNghi = Integer.parseInt(tfSoNgayNghi.getText());

        Calendar calender = Calendar.getInstance();
        calender.setTime(util_ngayBatDau);
        calender.add(Calendar.DAY_OF_MONTH, soNgayNghi);

        java.util.Date ngayKetThuc = calender.getTime(); // Trả về java.util.Date
        java.sql.Date sql_ngayKetThuc = new java.sql.Date(ngayKetThuc.getTime()); // Chuyển đổi sang java.sql.Date

        String lyDo = taXinNghiPhep.getText();

        npDAO.themNghiPhep(maNV, hoTen, lyDo, sql_ngayBatDau, sql_ngayKetThuc);
        JOptionPane.showMessageDialog(null, "Thêm thành công");
        
    }//GEN-LAST:event_buttonDarkBlue1ActionPerformed

    private void tfHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoTenActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfHoTenActionPerformed

    private void buttonDarkBlue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDarkBlue2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDarkBlue2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.ButtonDarkBlue buttonDarkBlue1;
    private util.ButtonDarkBlue buttonDarkBlue2;
    private com.toedter.calendar.JDateChooser dateNgayNghi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbLyDoXinNghi;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lbNgayXinNghi;
    private javax.swing.JLabel lbSoNgayNghi;
    private javax.swing.JLabel lbTieude;
    private javax.swing.JLabel lbXinNghiPhep;
    private javax.swing.JTextArea taXinNghiPhep;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfMaNhanVien;
    private javax.swing.JTextField tfSoNgayNghi;
    // End of variables declaration//GEN-END:variables
}
