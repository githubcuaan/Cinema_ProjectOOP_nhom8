package main.cinemaproject.view.Admin;

import javax.swing.JDialog;
import main.cinemaproject.view.Login.LoginFrame.LoginFrame;

/**
 *
 * @author DinhAn
 */
public class Admin extends javax.swing.JFrame {
    private String username;
    public Admin(String username) {
        initComponents();
        this.username = username;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTab = new javax.swing.JPanel();
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
        adminName = new javax.swing.JLabel();
        panelup = new javax.swing.JPanel();
        TabTong = new javax.swing.JTabbedPane();
        khachHang1 = new main.cinemaproject.view.Admin.KhachHang();
        nhanVien1 = new main.cinemaproject.view.Admin.NhanVien();
        doanhThu1 = new main.cinemaproject.view.Admin.DoanhThu();
        sanPham1 = new main.cinemaproject.view.Admin.SanPham();
        tongQuanLy1 = new main.cinemaproject.view.Admin.TongQuanLy();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelTab.setBackground(new java.awt.Color(54, 127, 80));
        panelTab.setPreferredSize(new java.awt.Dimension(200, 730));

        DangXuat.setPreferredSize(new java.awt.Dimension(50, 25));
        DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8_shutdown_25px (1).png"))); // NOI18N
        jLabel8.setText("Đăng Xuất");

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        NhanVienBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        NhanVienBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienButMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-employee-48.png"))); // NOI18N
        jLabel1.setText("Nhân Viên");

        javax.swing.GroupLayout NhanVienButLayout = new javax.swing.GroupLayout(NhanVienBut);
        NhanVienBut.setLayout(NhanVienButLayout);
        NhanVienButLayout.setHorizontalGroup(
            NhanVienButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        NhanVienButLayout.setVerticalGroup(
            NhanVienButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhanVienButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        KhachHangBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        KhachHangBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangButMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-budget-48.png"))); // NOI18N
        jLabel2.setText("Khách Hàng");

        javax.swing.GroupLayout KhachHangButLayout = new javax.swing.GroupLayout(KhachHangBut);
        KhachHangBut.setLayout(KhachHangButLayout);
        KhachHangButLayout.setHorizontalGroup(
            KhachHangButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        KhachHangButLayout.setVerticalGroup(
            KhachHangButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhachHangButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        DoanhThuBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        DoanhThuBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoanhThuButMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-money-48.png"))); // NOI18N
        jLabel3.setText("Doanh Thu");

        javax.swing.GroupLayout DoanhThuButLayout = new javax.swing.GroupLayout(DoanhThuBut);
        DoanhThuBut.setLayout(DoanhThuButLayout);
        DoanhThuButLayout.setHorizontalGroup(
            DoanhThuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoanhThuButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DoanhThuButLayout.setVerticalGroup(
            DoanhThuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoanhThuButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        SanPhamBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        SanPhamBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanPhamButMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/ticket.png"))); // NOI18N
        jLabel4.setText("Sản Phẩm");

        javax.swing.GroupLayout SanPhamButLayout = new javax.swing.GroupLayout(SanPhamBut);
        SanPhamBut.setLayout(SanPhamButLayout);
        SanPhamButLayout.setHorizontalGroup(
            SanPhamButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SanPhamButLayout.setVerticalGroup(
            SanPhamButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SanPhamButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        LichSuBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        LichSuBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LichSuButMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-history-48.png"))); // NOI18N
        jLabel5.setText("Quản Lý Phim");

        javax.swing.GroupLayout LichSuButLayout = new javax.swing.GroupLayout(LichSuBut);
        LichSuBut.setLayout(LichSuButLayout);
        LichSuButLayout.setHorizontalGroup(
            LichSuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LichSuButLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LichSuButLayout.setVerticalGroup(
            LichSuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LichSuButLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hi!");

        ThongTinCaNhan.setPreferredSize(new java.awt.Dimension(50, 25));
        ThongTinCaNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongTinCaNhanMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8_test_account_25px.png"))); // NOI18N
        jLabel7.setText("Thông Tin Cá Nhân");

        javax.swing.GroupLayout ThongTinCaNhanLayout = new javax.swing.GroupLayout(ThongTinCaNhan);
        ThongTinCaNhan.setLayout(ThongTinCaNhanLayout);
        ThongTinCaNhanLayout.setHorizontalGroup(
            ThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinCaNhanLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        ThongTinCaNhanLayout.setVerticalGroup(
            ThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinCaNhanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        adminName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminName.setForeground(new java.awt.Color(255, 255, 255));
        adminName.setText("Admin");

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLayout.createSequentialGroup()
                .addComponent(DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelTabLayout.createSequentialGroup()
                .addGroup(panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTabLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTabLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(adminName))
                    .addGroup(panelTabLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(LichSuBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SanPhamBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DoanhThuBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NhanVienBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(KhachHangBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(KhachHangBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NhanVienBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoanhThuBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SanPhamBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LichSuBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(ThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        getContentPane().add(panelTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelup.setBackground(new java.awt.Color(54, 127, 80));
        panelup.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout panelupLayout = new javax.swing.GroupLayout(panelup);
        panelup.setLayout(panelupLayout);
        panelupLayout.setHorizontalGroup(
            panelupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        panelupLayout.setVerticalGroup(
            panelupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        getContentPane().add(panelup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 930, 60));

        TabTong.setBackground(new java.awt.Color(255, 255, 255));
        TabTong.setPreferredSize(new java.awt.Dimension(920, 650));

        khachHang1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        khachHang1.setForeground(new java.awt.Color(255, 255, 255));
        TabTong.addTab("tab1", khachHang1);
        TabTong.addTab("tab2", nhanVien1);
        TabTong.addTab("tab3", doanhThu1);
        TabTong.addTab("tab4", sanPham1);
        TabTong.addTab("tab5", tongQuanLy1);

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

    private void ThongTinCaNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongTinCaNhanMouseClicked
        DoiThongTinNhanVien doiThongTin = new DoiThongTinNhanVien();
        doiThongTin.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Đảm bảo rằng nó không đóng cửa sổ cha
        doiThongTin.setUserId(username);
        doiThongTin.setVisible(true);
    }//GEN-LAST:event_ThongTinCaNhanMouseClicked

    private void LichSuButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LichSuButMouseClicked
        TabTong.setSelectedComponent(tongQuanLy1);
    }//GEN-LAST:event_LichSuButMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.cinemaproject.view.Admin.conponents.Button4Cover DangXuat;
    private main.cinemaproject.view.Admin.conponents.Button4Cover DoanhThuBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover KhachHangBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover LichSuBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover NhanVienBut;
    private main.cinemaproject.view.Admin.conponents.Button4Cover SanPhamBut;
    private javax.swing.JTabbedPane TabTong;
    private main.cinemaproject.view.Admin.conponents.Button4Cover ThongTinCaNhan;
    private javax.swing.JLabel adminName;
    private main.cinemaproject.view.Admin.DoanhThu doanhThu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private main.cinemaproject.view.Admin.KhachHang khachHang1;
    private main.cinemaproject.view.Admin.NhanVien nhanVien1;
    private javax.swing.JPanel panelTab;
    private javax.swing.JPanel panelup;
    private main.cinemaproject.view.Admin.SanPham sanPham1;
    private main.cinemaproject.view.Admin.TongQuanLy tongQuanLy1;
    // End of variables declaration//GEN-END:variables
}
