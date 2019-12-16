/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author dell
 */
public class frmPhongBan extends javax.swing.JFrame {

    private ListPhongBan qlpb = new ListPhongBan();
    private ListPhongBan qlpbSearch = new ListPhongBan();

    private int pos = 0;

    /**
     * Creates new form frmPhongBan
     */
    public frmPhongBan() {

        qlpb = new ListPhongBan(qlpb.readPhongBan("PhongBan.txt"));

        initComponents();
        hienThi();
        btnSuaPhong.setEnabled(false);
        btnXoaPhong.setEnabled(false);
        btnHuyPhong.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenPhong = new javax.swing.JTextField();
        btnThemPhong = new javax.swing.JButton();
        btnXoaPhong = new javax.swing.JButton();
        btnSuaPhong = new javax.swing.JButton();
        btnLuuPhong = new javax.swing.JButton();
        btnHuyPhong = new javax.swing.JButton();
        btnTrovePhong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhongBan = new javax.swing.JTable();
        txtSoNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSearchMa = new javax.swing.JTextField();
        txtSearchTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboSort = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Phòng Ban Sẽ được tạo mặc định");

        jLabel2.setText("Tên Phòng");

        btnThemPhong.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_sign-add_299068.png")); // NOI18N
        btnThemPhong.setText("Thêm");
        btnThemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhongActionPerformed(evt);
            }
        });

        btnXoaPhong.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_sign-add_299068.png")); // NOI18N
        btnXoaPhong.setText("Xóa");
        btnXoaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhongActionPerformed(evt);
            }
        });

        btnSuaPhong.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_Folder_folder_up_folder_upload_update_folder_upload_1886931.png")); // NOI18N
        btnSuaPhong.setText("Sửa");
        btnSuaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPhongActionPerformed(evt);
            }
        });

        btnLuuPhong.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_Save_70652.png")); // NOI18N
        btnLuuPhong.setText("Lưu");
        btnLuuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuPhongActionPerformed(evt);
            }
        });

        btnHuyPhong.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_error_1646012.png")); // NOI18N
        btnHuyPhong.setText("Hủy");
        btnHuyPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyPhongActionPerformed(evt);
            }
        });

        btnTrovePhong.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_39_Exit_Arrow_Door_Signout_Out_Close_2142693.png")); // NOI18N
        btnTrovePhong.setText("Trở về");
        btnTrovePhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrovePhongActionPerformed(evt);
            }
        });

        tbPhongBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Số Nhân Viên tối đa"
            }
        ));
        tbPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPhongBan);

        txtSoNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoNVKeyTyped(evt);
            }
        });

        jLabel3.setText("Số Nhân Viên tối đa");

        txtSearchMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchMaKeyReleased(evt);
            }
        });

        txtSearchTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchTenKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_Search_icon_2541673.png")); // NOI18N
        jLabel4.setText("Tìm Kiếm Theo Tên Phòng");

        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_Search_icon_2541673.png")); // NOI18N
        jLabel5.setText("Tìm Kiếm Theo Mã Phòng");

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\Java\\Project\\src\\project\\icon\\iconfinder_arrows-22_808395.png")); // NOI18N
        jLabel7.setText("Sắp xếp");

        cboSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Tên Phòng", "Số Nhân Viên" }));
        cboSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSortActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("PHÒNG BAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThemPhong)
                        .addGap(55, 55, 55)
                        .addComponent(btnXoaPhong)
                        .addGap(72, 72, 72)
                        .addComponent(btnSuaPhong)
                        .addGap(92, 92, 92)
                        .addComponent(btnLuuPhong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cboSort, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchTen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHuyPhong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTrovePhong))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoNV, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchMa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSearchMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtSoNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearchTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemPhong)
                            .addComponent(btnXoaPhong)
                            .addComponent(btnSuaPhong)
                            .addComponent(btnLuuPhong)
                            .addComponent(btnHuyPhong)
                            .addComponent(btnTrovePhong))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void hienThi() {
        DefaultTableModel model = (DefaultTableModel) tbPhongBan.getModel();

        model.setRowCount(0);
        for (PhongBan nv : qlpb.getList()) {
            model.addRow(new Object[]{nv.getMaPhong(), nv.getTenPhong(), nv.getSoNV()});

        }
    }

    public void showAllRows(ListPhongBan qlpb) {
        DefaultTableModel model = (DefaultTableModel) tbPhongBan.getModel();

        model.setRowCount(0);
        for (PhongBan nv : qlpb.getList()) {
            model.addRow(new Object[]{nv.getMaPhong(), nv.getTenPhong()});

        }
    }

    public void clearAllRows() {
        DefaultTableModel model = (DefaultTableModel) tbPhongBan.getModel();
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }

    public PhongBan khoiTao() {

        String sTen = txtTenPhong.getText();
        int sonv = Integer.parseInt(txtSoNV.getText());
        int ma = 100;
        for (PhongBan nv : qlpb.getList()) {
            ma++;
        }
        PhongBan pb = new PhongBan(ma, sTen, sonv);
        return pb;
    }
    private void btnThemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhongActionPerformed
        // TODO add your handling code here:
        if (txtTenPhong.getText().length() != 0 && txtSoNV.getText().length() != 0) {
            qlpb.insertPB(khoiTao());
            JOptionPane.showMessageDialog(rootPane, "Thêm Thành Công!");
            hienThi();
            clearField();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nhap day du thong tin!");
        }
    }//GEN-LAST:event_btnThemPhongActionPerformed
    public void clearField() {
        txtTenPhong.setText("");
        txtSoNV.setText("");

    }
    private void btnXoaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhongActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(null, "Ban co muon xoa khong") == 0) {
            clearAllRows();
            qlpb.deletePhongBanByViTri(pos);
            hienThi();
        }

    }//GEN-LAST:event_btnXoaPhongActionPerformed

    private void tbPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongBanMouseClicked
        // TODO add your handling code here:
        pos = tbPhongBan.getSelectedRow();
        btnHuyPhong.setEnabled(true);
        btnSuaPhong.setEnabled(true);
        btnXoaPhong.setEnabled(true);
        btnThemPhong.setEnabled(false);
        int row = tbPhongBan.getSelectedRow();
        txtTenPhong.setText(qlpb.getList().get(row).getTenPhong());

    }//GEN-LAST:event_tbPhongBanMouseClicked

    private void btnSuaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPhongActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) tbPhongBan.getModel();
//       
//           model.setValueAt(txtTenPhong.getText(),tbPhongBan.getSelectedRow(),1);
//       JOptionPane.showMessageDialog(rootPane, "Thông tin đã được cập nhật!");
        int ma = qlpb.getPhongBanAt(pos).getMaPhong();
        String sTen = this.txtTenPhong.getText();
        int nSoNV = Integer.parseInt(this.txtSoNV.getText());
        PhongBan pb = new PhongBan(ma, sTen, nSoNV);

        qlpb = new ListPhongBan(qlpb.editPhongBan(ma, pb));
        clearAllRows();
        hienThi();

    }//GEN-LAST:event_btnSuaPhongActionPerformed

    private void btnLuuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuPhongActionPerformed
        if (qlpb.writePhongBan("PhongBan.txt") && qlpb.writeTenPhong("TenPhong.txt")) {
            JOptionPane.showMessageDialog(rootPane, "Đã lưu danh sách xuống file!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Có lỗi trong quá trình lưu file!");
        }

    }//GEN-LAST:event_btnLuuPhongActionPerformed

    private void txtSearchMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchMaKeyReleased
        clearAllRows();
        String search = txtSearchMa.getText();
        if (search.equals("")) {
            hienThi();
        }
        if (!isNumber(search)) {
            return;
        }
        qlpbSearch = new ListPhongBan(qlpb.timKiemTheoMa(Integer.parseInt(search)));
        showAllRows(qlpbSearch);
    }//GEN-LAST:event_txtSearchMaKeyReleased

    private void txtSearchTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchTenKeyReleased
        clearAllRows();
        String search = txtSearchTen.getText();
        if (search.equals("")) {
            hienThi();
            return;
        }
        qlpbSearch = new ListPhongBan(qlpb.timKiemTheoTen(search));
        showAllRows(qlpbSearch);
    }//GEN-LAST:event_txtSearchTenKeyReleased

    private void cboSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSortActionPerformed
        int index = cboSort.getSelectedIndex();
        clearAllRows();
        switch (index) {
            case 0:
                //Do something please ><
                break;
            case 1:
                qlpb = new ListPhongBan(qlpb.sortTheoTen());
                break;
            case 2:
                qlpb = new ListPhongBan(qlpb.sortTheoSoNV());
                break;
        }
        hienThi();
    }//GEN-LAST:event_cboSortActionPerformed

    private void btnHuyPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyPhongActionPerformed
        // TODO add your handling code here:
        btnThemPhong.setEnabled(true);
        btnXoaPhong.setEnabled(false);
        btnSuaPhong.setEnabled(false);
        btnHuyPhong.setEnabled(false);

    }//GEN-LAST:event_btnHuyPhongActionPerformed

    private void btnTrovePhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrovePhongActionPerformed
        // TODO add your handling code here:
        frmTrangChu frm = new frmTrangChu();
        frm.setVisible(true);
    }//GEN-LAST:event_btnTrovePhongActionPerformed

    private void txtSoNVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoNVKeyTyped
        // TODO add your handling code here:
        String tuoi = txtSoNV.getText();
        int length = tuoi.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                txtSoNV.setEditable(true);
            } else {
                txtSoNV.setEditable(false);
            }
        } else {
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtSoNVKeyTyped
    public boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(frmPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPhongBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyPhong;
    private javax.swing.JButton btnLuuPhong;
    private javax.swing.JButton btnSuaPhong;
    private javax.swing.JButton btnThemPhong;
    private javax.swing.JButton btnTrovePhong;
    private javax.swing.JButton btnXoaPhong;
    private javax.swing.JComboBox cboSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPhongBan;
    private javax.swing.JTextField txtSearchMa;
    private javax.swing.JTextField txtSearchTen;
    private javax.swing.JTextField txtSoNV;
    private javax.swing.JTextField txtTenPhong;
    // End of variables declaration//GEN-END:variables
}
