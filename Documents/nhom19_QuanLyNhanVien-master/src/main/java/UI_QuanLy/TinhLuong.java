/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_QuanLy;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class TinhLuong extends javax.swing.JPanel {

    /**
     * Creates new form TinhLuong
     */
    public TinhLuong() {
        initComponents();
        lbTieude.setBackground(new Color(8, 86, 168));
        lbTieude.setForeground(Color.WHITE);
        lbTieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTieude.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTinhLuong = new javax.swing.JPanel();
        lbTieude = new javax.swing.JLabel();
        lbChonNhanVien = new javax.swing.JLabel();
        cbbChonNhanVien = new javax.swing.JComboBox<>();
        lbSoCongMacDinh = new javax.swing.JLabel();
        lbSoNgayNghi = new javax.swing.JLabel();
        tfSoCongMacDinh = new javax.swing.JTextField();
        tfSoNgayNghi = new javax.swing.JTextField();
        btnTinhLuong = new util.ButtonDarkBlue();
        tfTinhLuong = new javax.swing.JTextField();
        btnGuiKetQua = new util.ButtonDarkBlue();
        lbHeSoLuong = new javax.swing.JLabel();
        tfHeSoLuong = new javax.swing.JTextField();
        tbSoLanMuon = new javax.swing.JLabel();
        tfSoLanMuon = new javax.swing.JTextField();

        lbTieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTieude.setText("Tính lương");
        lbTieude.setOpaque(true);

        lbChonNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbChonNhanVien.setText("Chọn nhân viên");

        cbbChonNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbChonNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbSoCongMacDinh.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbSoCongMacDinh.setText("Số công mặc định");

        lbSoNgayNghi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbSoNgayNghi.setText("Số ngày nghỉ");

        tfSoCongMacDinh.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfSoCongMacDinh.setText("26");
        tfSoCongMacDinh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfSoNgayNghi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfSoNgayNghi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnTinhLuong.setText("Tính lương");
        btnTinhLuong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        tfTinhLuong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfTinhLuong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuiKetQua.setText("Gửi kết quả cho nhân viên");
        btnGuiKetQua.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGuiKetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiKetQuaActionPerformed(evt);
            }
        });

        lbHeSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbHeSoLuong.setText("Hệ số lương: ");

        tfHeSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfHeSoLuong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbSoLanMuon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tbSoLanMuon.setText("Số lần muộn: ");

        tfSoLanMuon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfSoLanMuon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnTinhLuongLayout = new javax.swing.GroupLayout(pnTinhLuong);
        pnTinhLuong.setLayout(pnTinhLuongLayout);
        pnTinhLuongLayout.setHorizontalGroup(
            pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnTinhLuongLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTinhLuongLayout.createSequentialGroup()
                        .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnTinhLuongLayout.createSequentialGroup()
                                .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbSoCongMacDinh)
                                    .addComponent(lbChonNhanVien)
                                    .addComponent(lbSoNgayNghi))
                                .addGap(18, 18, 18)
                                .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbChonNhanVien, 0, 171, Short.MAX_VALUE)
                                    .addComponent(tfSoCongMacDinh)
                                    .addComponent(tfSoNgayNghi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHeSoLuong, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbSoLanMuon, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pnTinhLuongLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                                .addComponent(btnGuiKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSoLanMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(pnTinhLuongLayout.createSequentialGroup()
                        .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTinhLuongLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(tfTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnTinhLuongLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnTinhLuongLayout.setVerticalGroup(
            pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTinhLuongLayout.createSequentialGroup()
                .addComponent(lbTieude, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTinhLuongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbChonNhanVien)
                            .addComponent(cbbChonNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoCongMacDinh)
                            .addComponent(tfSoCongMacDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbSoLanMuon)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTinhLuongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSoLanMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHeSoLuong)
                    .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSoNgayNghi)
                        .addComponent(tfSoNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(pnTinhLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnGuiKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiKetQuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuiKetQuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.ButtonDarkBlue btnGuiKetQua;
    private util.ButtonDarkBlue btnTinhLuong;
    private javax.swing.JComboBox<String> cbbChonNhanVien;
    private javax.swing.JLabel lbChonNhanVien;
    private javax.swing.JLabel lbHeSoLuong;
    private javax.swing.JLabel lbSoCongMacDinh;
    private javax.swing.JLabel lbSoNgayNghi;
    private javax.swing.JLabel lbTieude;
    private javax.swing.JPanel pnTinhLuong;
    private javax.swing.JLabel tbSoLanMuon;
    private javax.swing.JTextField tfHeSoLuong;
    private javax.swing.JTextField tfSoCongMacDinh;
    private javax.swing.JTextField tfSoLanMuon;
    private javax.swing.JTextField tfSoNgayNghi;
    private javax.swing.JTextField tfTinhLuong;
    // End of variables declaration//GEN-END:variables
}
