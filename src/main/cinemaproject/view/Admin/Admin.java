
package main.cinemaproject.view.Admin;

import main.cinemaproject.view.Login.LoginFrame.LoginFrame;

/**
 *
 * @author DinhAn
 */
public class Admin extends javax.swing.JFrame {

   
    public Admin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DangXuat = new main.cinemaproject.view.Admin.conponents.Button4Cover();
        jLabel8 = new javax.swing.JLabel();
        NhanVienBut = new main.cinemaproject.view.Admin.conponents.Button4Cover();
        jLabel1 = new javax.swing.JLabel();
        KhachHangBut = new main.cinemaproject.view.Admin.conponents.Button4Cover();
        jLabel2 = new javax.swing.JLabel();
        DoanhThuBut = new main.cinemaproject.view.Admin.conponents.Button4Cover();
        jLabel3 = new javax.swing.JLabel();
        SanPhamBut = new main.cinemaproject.view.Admin.conponents.Button4Cover();
        jLabel4 = new javax.swing.JLabel();
        LichSuBut = new main.cinemaproject.view.Admin.conponents.Button4Cover();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ThongTinCaNhan = new main.cinemaproject.view.Admin.conponents.Button4Cover();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TabTong = new javax.swing.JTabbedPane();
        khachHang1 = new main.cinemaproject.view.Admin.KhachHang();
        nhanVien1 = new main.cinemaproject.view.Admin.NhanVien();
        doanhThu1 = new main.cinemaproject.view.Admin.DoanhThu();
        sanPham1 = new main.cinemaproject.view.Admin.SanPham();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 730));

        DangXuat.setPreferredSize(new java.awt.Dimension(50, 25));
        DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8_shutdown_25px (1).png"))); // NOI18N
        jLabel8.setText("Đăng Xuất");

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(54, 54, 54))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        NhanVienBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienButMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-employee-48.png"))); // NOI18N
        jLabel1.setText("Nhân Viên");

        javax.swing.GroupLayout NhanVienButLayout = new javax.swing.GroupLayout(NhanVienBut);
        NhanVienBut.setLayout(NhanVienButLayout);
        NhanVienButLayout.setHorizontalGroup(
            NhanVienButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        NhanVienButLayout.setVerticalGroup(
            NhanVienButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhanVienButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        KhachHangBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangButMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-budget-48.png"))); // NOI18N
        jLabel2.setText("Khách Hàng");

        javax.swing.GroupLayout KhachHangButLayout = new javax.swing.GroupLayout(KhachHangBut);
        KhachHangBut.setLayout(KhachHangButLayout);
        KhachHangButLayout.setHorizontalGroup(
            KhachHangButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        KhachHangButLayout.setVerticalGroup(
            KhachHangButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhachHangButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        DoanhThuBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoanhThuButMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-money-48.png"))); // NOI18N
        jLabel3.setText("Doanh Thu");

        javax.swing.GroupLayout DoanhThuButLayout = new javax.swing.GroupLayout(DoanhThuBut);
        DoanhThuBut.setLayout(DoanhThuButLayout);
        DoanhThuButLayout.setHorizontalGroup(
            DoanhThuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoanhThuButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        DoanhThuButLayout.setVerticalGroup(
            DoanhThuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoanhThuButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        SanPhamBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanPhamButMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/ticket.png"))); // NOI18N
        jLabel4.setText("Sản Phẩm");

        javax.swing.GroupLayout SanPhamButLayout = new javax.swing.GroupLayout(SanPhamBut);
        SanPhamBut.setLayout(SanPhamButLayout);
        SanPhamButLayout.setHorizontalGroup(
            SanPhamButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        SanPhamButLayout.setVerticalGroup(
            SanPhamButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SanPhamButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-history-48.png"))); // NOI18N
        jLabel5.setText("Lịch Sử");

        javax.swing.GroupLayout LichSuButLayout = new javax.swing.GroupLayout(LichSuBut);
        LichSuBut.setLayout(LichSuButLayout);
        LichSuButLayout.setHorizontalGroup(
            LichSuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LichSuButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        LichSuButLayout.setVerticalGroup(
            LichSuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LichSuButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Hi!");

        ThongTinCaNhan.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8_test_account_25px.png"))); // NOI18N
        jLabel7.setText("Thông Tin Cá Nhân");

        javax.swing.GroupLayout ThongTinCaNhanLayout = new javax.swing.GroupLayout(ThongTinCaNhan);
        ThongTinCaNhan.setLayout(ThongTinCaNhanLayout);
        ThongTinCaNhanLayout.setHorizontalGroup(
            ThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinCaNhanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(34, 34, 34))
        );
        ThongTinCaNhanLayout.setVerticalGroup(
            ThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinCaNhanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(KhachHangBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NhanVienBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoanhThuBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SanPhamBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LichSuBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(DangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(ThongTinCaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(108, 108, 108)
                .addComponent(KhachHangBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NhanVienBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoanhThuBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SanPhamBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LichSuBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(ThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 920, 60));

        TabTong.setBackground(new java.awt.Color(255, 255, 255));
        TabTong.setPreferredSize(new java.awt.Dimension(920, 650));
        TabTong.addTab("tab1", khachHang1);
        TabTong.addTab("tab2", nhanVien1);
        TabTong.addTab("tab3", doanhThu1);
        TabTong.addTab("tab4", sanPham1);

        getContentPane().add(TabTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 920, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NhanVienButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienButMouseClicked
        TabTong.setSelectedComponent(nhanVien1);
    }//GEN-LAST:event_NhanVienButMouseClicked

    private void KhachHangButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangButMouseClicked
        TabTong.setSelectedComponent(khachHang1);
    }//GEN-LAST:event_KhachHangButMouseClicked

    private void DoanhThuButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoanhThuButMouseClicked
        // TODO add your handling code here:
        TabTong.setSelectedComponent(doanhThu1);
    }//GEN-LAST:event_DoanhThuButMouseClicked

    private void SanPhamButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamButMouseClicked
        // TODO add your handling code here:
        TabTong.setSelectedComponent(sanPham1);
    }//GEN-LAST:event_SanPhamButMouseClicked

    private void DangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMouseClicked
        int choice = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Bạn có chắc chắn muốn đăng xuất?",
            "Xác nhận đăng xuất",
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );
        
        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            this.dispose();
            LoginFrame login = new LoginFrame();
            login.setLocationRelativeTo(null); // Center the login frame
            login.setVisible(true);
        }
    }//GEN-LAST:event_DangXuatMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.cinemaproject.view.Admin.conponents.Button4Cover DangXuat;
    private main.cinemaproject.view.Admin.conponents.Button4Cover DoanhThuBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover KhachHangBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover LichSuBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover NhanVienBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover SanPhamBut;
    private javax.swing.JTabbedPane TabTong;
    private main.cinemaproject.view.Admin.conponents.Button4Cover ThongTinCaNhan;
    private main.cinemaproject.view.Admin.DoanhThu doanhThu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private main.cinemaproject.view.Admin.KhachHang khachHang1;
    private main.cinemaproject.view.Admin.NhanVien nhanVien1;
    private main.cinemaproject.view.Admin.SanPham sanPham1;
    // End of variables declaration//GEN-END:variables
}
