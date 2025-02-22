/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ChucNang_DuyetNghiPhep;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Duyet extends javax.swing.JFrame {

    /**
     * Creates new form Duyet
     */
    public Duyet() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
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

        Duyet = new javax.swing.JPanel();
        lbTieude = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        lbMaNhanVien = new javax.swing.JLabel();
        lbLyDo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taLyDo = new javax.swing.JTextArea();
        lbMaNhanVien1 = new javax.swing.JLabel();
        lbMaNhanVien2 = new javax.swing.JLabel();
        tfTenNhanVien = new javax.swing.JTextField();
        tfMaNhanVien = new javax.swing.JTextField();
        tfNgayNghiPhep = new javax.swing.JTextField();
        tfSoNgayNghi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Duyet.setBackground(new java.awt.Color(255, 255, 255));
        Duyet.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        lbTieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTieude.setText("Duyệt nghỉ phép");
        lbTieude.setOpaque(true);

        lbTenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTenNhanVien.setText("Tên nhân viên: ");

        lbMaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbMaNhanVien.setText("Mã nhân viên: ");

        lbLyDo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbLyDo.setText("Lý do: ");

        taLyDo.setColumns(20);
        taLyDo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        taLyDo.setRows(5);
        jScrollPane1.setViewportView(taLyDo);

        lbMaNhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbMaNhanVien1.setText("Ngày nghỉ phép:");

        lbMaNhanVien2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbMaNhanVien2.setText("Số ngày nghỉ:");

        tfTenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfTenNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfMaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfMaNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaNhanVienActionPerformed(evt);
            }
        });

        tfNgayNghiPhep.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfNgayNghiPhep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfSoNgayNghi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfSoNgayNghi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout DuyetLayout = new javax.swing.GroupLayout(Duyet);
        Duyet.setLayout(DuyetLayout);
        DuyetLayout.setHorizontalGroup(
            DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DuyetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(DuyetLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMaNhanVien2)
                    .addComponent(lbMaNhanVien1)
                    .addGroup(DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbLyDo)
                        .addComponent(lbTenNhanVien, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbMaNhanVien, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNgayNghiPhep, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSoNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DuyetLayout.setVerticalGroup(
            DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DuyetLayout.createSequentialGroup()
                .addComponent(lbTieude, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenNhanVien)
                    .addComponent(tfTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNhanVien)
                    .addComponent(tfMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNhanVien1)
                    .addComponent(tfNgayNghiPhep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DuyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNhanVien2)
                    .addComponent(tfSoNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Duyet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Duyet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuyetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnDuyetActionPerformed

    private void btnKhongDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongDuyetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnKhongDuyetActionPerformed

    private void tfMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaNhanVienActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Duyet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Duyet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Duyet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Duyet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Duyet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Duyet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLyDo;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lbMaNhanVien1;
    private javax.swing.JLabel lbMaNhanVien2;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JLabel lbTieude;
    private javax.swing.JTextArea taLyDo;
    private javax.swing.JTextField tfMaNhanVien;
    private javax.swing.JTextField tfNgayNghiPhep;
    private javax.swing.JTextField tfSoNgayNghi;
    private javax.swing.JTextField tfTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
