/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class frmTrangChu extends javax.swing.JFrame {

    /**
     * Creates new form frmTrangChu
     */
    public frmTrangChu() {
        initComponents();
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
        btnThoat = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnPhongBan = new javax.swing.JButton();
        btnDuAn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnThoat.setBackground(new java.awt.Color(153, 153, 0));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_exit_3226.png")); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 24, true));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat);
        btnThoat.setBounds(330, 310, 200, 90);

        btnNhanVien.setBackground(new java.awt.Color(153, 153, 0));
        btnNhanVien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_3_avatar_2754579 (1).png")); // NOI18N
        btnNhanVien.setText("NHÂN VIÊN");
        btnNhanVien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 24, true));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jPanel1.add(btnNhanVien);
        btnNhanVien.setBounds(70, 160, 200, 90);

        btnPhongBan.setBackground(new java.awt.Color(153, 153, 0));
        btnPhongBan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPhongBan.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_furniture_living_room_house-39_3799041.png")); // NOI18N
        btnPhongBan.setText("PHÒNG BAN");
        btnPhongBan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 24, true));
        btnPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongBanActionPerformed(evt);
            }
        });
        jPanel1.add(btnPhongBan);
        btnPhongBan.setBounds(330, 160, 200, 90);

        btnDuAn.setBackground(new java.awt.Color(153, 153, 0));
        btnDuAn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDuAn.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_hotel_3688478 (1).png")); // NOI18N
        btnDuAn.setText("DỰ ÁN");
        btnDuAn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 24, true));
        btnDuAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuAnActionPerformed(evt);
            }
        });
        jPanel1.add(btnDuAn);
        btnDuAn.setBounds(640, 160, 200, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\layout.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-20, 0, 920, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int hoi = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không?",
                null, JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        frmNhanVien frm = new frmNhanVien();
            frm.setVisible(true);
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongBanActionPerformed
        // TODO add your handling code here:
         frmPhongBan frm = new frmPhongBan();
            frm.setVisible(true);
    }//GEN-LAST:event_btnPhongBanActionPerformed

    private void btnDuAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuAnActionPerformed
        // TODO add your handling code here:
        frmDuAn frm = new frmDuAn();
            frm.setVisible(true);
    }//GEN-LAST:event_btnDuAnActionPerformed

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
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuAn;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhongBan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
