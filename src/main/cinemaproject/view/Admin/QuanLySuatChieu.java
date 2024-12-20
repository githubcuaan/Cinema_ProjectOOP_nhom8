package main.cinemaproject.view.Admin;


import main.cinemaproject.controller.ScreeningStatusController;
import main.cinemaproject.model.ScreeningStatus;
import javax.swing.table.DefaultTableModel;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author DinhAn
 */
public class QuanLySuatChieu extends javax.swing.JPanel {
    private ScreeningStatusController screeningStatusController;
    private static QuanLySuatChieu instance;

    /**
     * Creates new form QuanLySuatChieu
     */
    public QuanLySuatChieu() {
        initComponents();
        instance = this;
        screeningStatusController = new ScreeningStatusController();
        loadScreeningData(); // Gọi phương thức để tải dữ liệu vào bảng
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
        jPanel1 = new javax.swing.JPanel();
        xoaBut = new main.cinemaproject.view.Admin.conponents.buttonWhite();
        jLabel4 = new javax.swing.JLabel();
        suaBut = new main.cinemaproject.view.Admin.conponents.buttonWhite();
        jLabel3 = new javax.swing.JLabel();
        ThemBut = new main.cinemaproject.view.Admin.conponents.buttonWhite();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        timTx = new javax.swing.JTextField();
        timBut = new main.cinemaproject.view.Admin.conponents.buttonWhite();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangSuatChieu = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Công Cụ"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xoaBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaButMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8_delete_40px.png"))); // NOI18N
        jLabel4.setText("Xóa");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setIconTextGap(0);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout xoaButLayout = new javax.swing.GroupLayout(xoaBut);
        xoaBut.setLayout(xoaButLayout);
        xoaButLayout.setHorizontalGroup(
            xoaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xoaButLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        xoaButLayout.setVerticalGroup(
            xoaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xoaButLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(xoaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        suaBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suaButMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8_edit_40px.png"))); // NOI18N
        jLabel3.setText("Sửa");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setIconTextGap(0);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout suaButLayout = new javax.swing.GroupLayout(suaBut);
        suaBut.setLayout(suaButLayout);
        suaButLayout.setHorizontalGroup(
            suaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suaButLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        suaButLayout.setVerticalGroup(
            suaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suaButLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(suaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        ThemBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThemButMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8_add_40px.png"))); // NOI18N
        jLabel2.setText("Thêm");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout ThemButLayout = new javax.swing.GroupLayout(ThemBut);
        ThemBut.setLayout(ThemButLayout);
        ThemButLayout.setHorizontalGroup(
            ThemButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemButLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThemButLayout.setVerticalGroup(
            ThemButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThemButLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(ThemBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 370, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timTx.setText("Tìm Kiếm");
        jPanel2.add(timTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 175, 37));

        timBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timButMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-search-40.png"))); // NOI18N
        jLabel5.setText("Tìm Kiếm");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setIconTextGap(0);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout timButLayout = new javax.swing.GroupLayout(timBut);
        timBut.setLayout(timButLayout);
        timButLayout.setHorizontalGroup(
            timButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timButLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timButLayout.setVerticalGroup(
            timButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timButLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(timBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 60, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 370, 90));

        BangSuatChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Phim", "Giờ Chiếu", "Ngày Chiếu", "Giá Vé", "Số Ghế Trống", "Tổng Số Ghế", "Tên Rạp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BangSuatChieu);
        if (BangSuatChieu.getColumnModel().getColumnCount() > 0) {
            BangSuatChieu.getColumnModel().getColumn(0).setResizable(false);
            BangSuatChieu.getColumnModel().getColumn(1).setResizable(false);
            BangSuatChieu.getColumnModel().getColumn(2).setResizable(false);
            BangSuatChieu.getColumnModel().getColumn(3).setResizable(false);
            BangSuatChieu.getColumnModel().getColumn(4).setResizable(false);
            BangSuatChieu.getColumnModel().getColumn(5).setResizable(false);
            BangSuatChieu.getColumnModel().getColumn(6).setResizable(false);
            BangSuatChieu.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 750, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void ThemButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThemButMouseClicked
        ThemSuat themSuat = new ThemSuat();
        themSuat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đảm bảo rằng khi ThemSuat được đóng, frame cha không bị tắt
        themSuat.setVisible(true);
    }//GEN-LAST:event_ThemButMouseClicked

    private void suaButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suaButMouseClicked
        int selectedRow = BangSuatChieu.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một suất chiếu để sửa!");
            return;
        }
        
        int screeningId = (int)BangSuatChieu.getValueAt(selectedRow, 0);

        SuaSuat suaSuat = new SuaSuat(screeningId);
        suaSuat.setScreeningId(screeningId);
        suaSuat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        suaSuat.setVisible(true);
    }//GEN-LAST:event_suaButMouseClicked

    private void xoaButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaButMouseClicked
        int selectedRow = BangSuatChieu.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một suất chiếu để xóa!");
            return;
        }
        
        int screeningId = (int)BangSuatChieu.getValueAt(selectedRow, 0);

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa suất chiếu này không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = screeningStatusController.deleteScreening(screeningId);
            if (success) {
                JOptionPane.showMessageDialog(this, "Xóa suất chiếu thành công!");
                loadScreeningData(); // Tải lại dữ liệu sau khi xóa
            } else {
                JOptionPane.showMessageDialog(this, "Xóa suất chiếu thất bại!");
            }
        }
    }//GEN-LAST:event_xoaButMouseClicked

    private void timButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timButMouseClicked
        String searchText = timTx.getText().trim(); // Lấy giá trị từ trường tìm kiếm
        List<ScreeningStatus> screenings = screeningStatusController.searchScreening(searchText); // Gọi phương thức tìm kiếm
        updateTable(screenings); // Cập nhật bảng với kết quả tìm kiếm
    }//GEN-LAST:event_timButMouseClicked

    //lấy dữ liệu từ screeningstatus cho vào bảng
    public void loadScreeningData() {
        List<ScreeningStatus> screenings = screeningStatusController.getAllScreening();
        updateTable(screenings);
    }

    //nhập thông tin vào bảng
    private void updateTable(List<ScreeningStatus> screenings) {
        DefaultTableModel model = (DefaultTableModel) BangSuatChieu.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ trong bảng
        // Thêm dữ liệu mới vào bảng
        for (ScreeningStatus screening : screenings) {
            model.addRow(new Object[]{
                screening.getId(),
                screening.getMovieName(),
                screening.getShowtime(),
                screening.getShowdate(),
                screening.getPrice(),
                screening.getSeatsAvailable(),
                screening.getTotalSeats(),
                screening.getTheaterName()
            });
        }
    }

    public static void refreshScreeningData() {
        SwingUtilities.invokeLater(() -> {
            // Giả sử bạn có một instance của QuanLySuatChieu
            // Gọi loadScreeningData() từ instance đó
            instance.loadScreeningData();
        });
    }

    public static QuanLySuatChieu getInstance() {
        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangSuatChieu;
    private main.cinemaproject.view.Admin.conponents.buttonWhite ThemBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private main.cinemaproject.view.Admin.conponents.buttonWhite suaBut;
    private main.cinemaproject.view.Admin.conponents.buttonWhite timBut;
    private javax.swing.JTextField timTx;
    private main.cinemaproject.view.Admin.conponents.buttonWhite xoaBut;
    // End of variables declaration//GEN-END:variables
}
