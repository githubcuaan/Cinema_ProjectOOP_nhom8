
package main.cinemaproject.view.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;


import main.cinemaproject.controller.ProductController;
import main.cinemaproject.model.Product;

/**
 *
 * @author DinhAn
 */

public class ChonDoAn extends javax.swing.JPanel {
    private List<String> selectedSeats = new ArrayList<>();
    private ProductController productController;
    /**
     * Creates new form ChonDoAn
     */
    public ChonDoAn() {
        productController = new ProductController();
        initComponents();
        loadProductsIntoTable();
    }
    
    

    private void loadProductsIntoTable() {
        // Lấy danh sách sản phẩm từ controller
        List<Product> products = productController.getAllProducts();
        // Kiểm tra xem có sản phẩm nào không
        if (products != null && !products.isEmpty()) {
            // Lấy model của bảng sản phẩm
            DefaultTableModel model = (DefaultTableModel) BangSanPham.getModel();
            // Xóa sạch bảng trước khi thêm dữ liệu mới
            model.setRowCount(0);
            // Duyệt qua từng sản phẩm và thêm vào bảng
            for (Product product : products) {
                model.addRow(new Object[]{product.getTen(), product.getLoaiSanPham(), product.getGiaBan()});
            }
        }
    }
    
    public void setSelectedSeats(List<String> selectedSeats) {
        this.selectedSeats = selectedSeats;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nextBut = new javax.swing.JButton();
        backBut = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangDaChon = new javax.swing.JTable();
        ThemBut = new javax.swing.JButton();
        SuaBut = new javax.swing.JButton();
        XoaBut = new javax.swing.JButton();
        soLuongSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangSanPham = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Danh Mục Sản Phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(683, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

        nextBut.setText("Tiếp Theo");
        nextBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButActionPerformed(evt);
            }
        });

        backBut.setText("Quay Lại");
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backBut, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(nextBut, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(403, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thanh Toán"));

        BangDaChon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Sản Phẩm", "Số Lượng", "Giá Bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(BangDaChon);
        if (BangDaChon.getColumnModel().getColumnCount() > 0) {
            BangDaChon.getColumnModel().getColumn(0).setResizable(false);
            BangDaChon.getColumnModel().getColumn(1).setResizable(false);
            BangDaChon.getColumnModel().getColumn(2).setResizable(false);
        }

        ThemBut.setText("Thêm ");
        ThemBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButActionPerformed(evt);
            }
        });

        SuaBut.setText("Sửa");
        SuaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaButActionPerformed(evt);
            }
        });

        XoaBut.setText("Xóa");
        XoaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaButActionPerformed(evt);
            }
        });

        jLabel2.setText("Số Lượng");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soLuongSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ThemBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SuaBut)
                        .addGap(12, 12, 12)
                        .addComponent(XoaBut)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soLuongSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemBut)
                    .addComponent(SuaBut)
                    .addComponent(XoaBut))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 330, 600));

        BangSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên", "Loại Hàng", "Giá Bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BangSanPham);
        if (BangSanPham.getColumnModel().getColumnCount() > 0) {
            BangSanPham.getColumnModel().getColumn(0).setResizable(false);
            BangSanPham.getColumnModel().getColumn(1).setResizable(false);
            BangSanPham.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 590, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void ThemButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButActionPerformed
        int selectedRow = BangSanPham.getSelectedRow();
        if (selectedRow != -1) {
            String ten = BangSanPham.getValueAt(selectedRow, 0).toString();
            double giaBan = Double.parseDouble(BangSanPham.getValueAt(selectedRow, 2).toString());
            int soLuong = 1; // Số lượng ban đầu là 1
            // Kiểm tra xem sản phẩm đã được chọn chưa
            boolean isProductSelected = false;
            for (int i = 0; i < BangDaChon.getRowCount(); i++) {
                if (BangDaChon.getValueAt(i, 0).toString().equals(ten)) {
                    // Nếu sản phẩm trùng nhau, cộng thêm 1 vào số lượng
                    soLuong = (int) BangDaChon.getValueAt(i, 1) + 1;
                    BangDaChon.setValueAt(soLuong, i, 1);
                    isProductSelected = true;
                    break;
                }
            }
            if (!isProductSelected) {
                // Nếu sản phẩm chưa được chọn, thêm mới vào BangDaChon
                themSanPhamVaoBangDaChon(ten, soLuong, giaBan);
            }
        }
    }//GEN-LAST:event_ThemButActionPerformed

    private void SuaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaButActionPerformed
        int selectedRow = BangDaChon.getSelectedRow();
        if (selectedRow != -1) {
            int soLuong = (int) soLuongSpinner.getValue();
            BangDaChon.setValueAt(soLuong, selectedRow, 1);
        }
    }//GEN-LAST:event_SuaButActionPerformed

    private void XoaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButActionPerformed
        int selectedRow = BangDaChon.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) BangDaChon.getModel();
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_XoaButActionPerformed

    private void nextButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButActionPerformed
        // Chuyển đến ThanhToanPanel
        int tabIndex = 3;
        JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
        tabbedPane.setSelectedIndex(tabIndex);

        ThanhToan thanhToanPanel = (ThanhToan) tabbedPane.getComponentAt(tabIndex);
        thanhToanPanel.setSelectedSeats(selectedSeats);

        DefaultTableModel model = (DefaultTableModel) BangDaChon.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String tenSanPham = model.getValueAt(i, 0).toString();
            int soLuong = (int) model.getValueAt(i, 1);
            double giaBan = (double) model.getValueAt(i, 2);
            thanhToanPanel.addProductToOrder(tenSanPham, soLuong, giaBan);
        }
    }//GEN-LAST:event_nextButActionPerformed

    private void backButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButActionPerformed
        //xóa các ghế đã chọn từ trước
        selectedSeats.clear();

        //Quay lại tab chọn ghế
        int tabIndex = 1;
        JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
        tabbedPane.setSelectedIndex(tabIndex);
    }//GEN-LAST:event_backButActionPerformed
   
    private void themSanPhamVaoBangDaChon(String ten, int soLuong, double giaBan) {
        DefaultTableModel model = (DefaultTableModel) BangDaChon.getModel();
        model.addRow(new Object[]{ten, soLuong, giaBan});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangDaChon;
    private javax.swing.JTable BangSanPham;
    private javax.swing.JButton SuaBut;
    private javax.swing.JButton ThemBut;
    private javax.swing.JButton XoaBut;
    private javax.swing.JButton backBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextBut;
    private javax.swing.JSpinner soLuongSpinner;
    // End of variables declaration//GEN-END:variables
}
