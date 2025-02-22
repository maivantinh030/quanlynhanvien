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
public class GiaoViec extends javax.swing.JPanel {

    /**
     * Creates new form GiaoViec
     */
    public GiaoViec() {
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

        pnGiaoViec = new javax.swing.JPanel();
        lbTieude = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbbChonNhanVien = new javax.swing.JComboBox<>();
        btnGui = new util.ButtonDarkBlue();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taNoiDungCongViec = new javax.swing.JTextArea();

        lbTieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTieude.setText("Giao việc");
        lbTieude.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Chọn nhân viên: ");

        cbbChonNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbChonNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGui.setText("Gửi");
        btnGui.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Nội dung công việc:");

        taNoiDungCongViec.setColumns(20);
        taNoiDungCongViec.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        taNoiDungCongViec.setRows(5);
        jScrollPane2.setViewportView(taNoiDungCongViec);

        javax.swing.GroupLayout pnGiaoViecLayout = new javax.swing.GroupLayout(pnGiaoViec);
        pnGiaoViec.setLayout(pnGiaoViecLayout);
        pnGiaoViecLayout.setHorizontalGroup(
            pnGiaoViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiaoViecLayout.createSequentialGroup()
                .addGroup(pnGiaoViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGiaoViecLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnGiaoViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnGiaoViecLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cbbChonNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnGiaoViecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnGui, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lbTieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnGiaoViecLayout.setVerticalGroup(
            pnGiaoViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiaoViecLayout.createSequentialGroup()
                .addComponent(lbTieude, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnGiaoViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGiaoViecLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(pnGiaoViecLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cbbChonNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnGiaoViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGiaoViecLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(pnGiaoViecLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(btnGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGiaoViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGiaoViec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.ButtonDarkBlue btnGui;
    private javax.swing.JComboBox<String> cbbChonNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTieude;
    private javax.swing.JPanel pnGiaoViec;
    private javax.swing.JTextArea taNoiDungCongViec;
    // End of variables declaration//GEN-END:variables
}
