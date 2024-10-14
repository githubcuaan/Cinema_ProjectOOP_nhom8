package main.cinemaproject.view.Admin;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import javax.swing.JOptionPane;
import main.cinemaproject.controller.ProductController;
import main.cinemaproject.model.Product;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DinhAn
 */
public class SanPham extends javax.swing.JPanel {

    private ProductController productController;

    /**
     * Creates new form SanPham
     */
    public SanPham() {
        initComponents();
        productController = new ProductController();
        loadLoaiSP();
        loadAllProducts();
    }

    // Load loại sản phẩm vào combobox
    public void loadLoaiSP()
    {
        List<Product> products = productController.getAllProducts();
        
        // Sử dụng Set để lưu trữ các loại sản phẩm duy nhất
        Set<String> uniqueProductTypes = new HashSet<>();
        
        for (Product product : products) {
            uniqueProductTypes.add(product.getLoaiSanPham());
        }        
        // Thêm các loại sản phẩm duy nhất vào loaiSPBox
        for (String productType : uniqueProductTypes) {
            loaiSPBox.addItem(productType);
        }
    }
    
    // Load tất cả sản phẩm vào bảng
    private void loadAllProducts() {
        List<Product> products = productController.getAllProducts();
        
        // Clear existing rows
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) BangSanPham.getModel();
        model.setRowCount(0);
        
        // Add products to the table
        for (Product product : products) {
            Object[] row = {
                product.getId(),
                product.getTen(),
                product.getLoaiSanPham(),
                product.getGiaBan(),
                product.getSoLuong(),
                product.getNhaCungCap()
            };
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nofication = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        soLuongTextField = new javax.swing.JTextField();
        loaiSPBox = new javax.swing.JComboBox<>();
        nameTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        NhaCungCapTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangSanPham = new javax.swing.JTable();
        ThemBut = new javax.swing.JButton();
        SuaBut = new javax.swing.JButton();
        XoaBut = new javax.swing.JButton();
        XemBut1 = new javax.swing.JButton();
        ClearBut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        findTextField = new javax.swing.JTextField();
        findBut = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(920, 650));
        setPreferredSize(new java.awt.Dimension(920, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nofication.setBackground(new java.awt.Color(255, 255, 255));
        nofication.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sản Phẩm"));

        jLabel1.setText("Mã Sản Phẩm");

        jLabel2.setText("Tên Sản Phẩm");

        idTextField.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel3.setText("Loại Sản Phẩm");

        jLabel4.setText("Giá Bán");

        jLabel5.setText("Số Lượng");

        nameTextField.setPreferredSize(new java.awt.Dimension(71, 30));

        priceTextField.setPreferredSize(new java.awt.Dimension(71, 30));

        NhaCungCapTextField.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel6.setText("Nhà Cung Cấp");

        javax.swing.GroupLayout noficationLayout = new javax.swing.GroupLayout(nofication);
        nofication.setLayout(noficationLayout);
        noficationLayout.setHorizontalGroup(
            noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noficationLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loaiSPBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NhaCungCapTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        noficationLayout.setVerticalGroup(
            noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noficationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(soLuongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiSPBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(noficationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NhaCungCapTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25))
        );

        add(nofication, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 860, 130));

        BangSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Loại Sản Phẩm", "Giá Bán", "Số Lượng", "Nhà Cung Cấp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            BangSanPham.getColumnModel().getColumn(3).setResizable(false);
            BangSanPham.getColumnModel().getColumn(4).setResizable(false);
            BangSanPham.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 800, 380));

        ThemBut.setText("Thêm");
        ThemBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ThemBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButActionPerformed(evt);
            }
        });
        add(ThemBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, 20));

        SuaBut.setText("Sửa");
        SuaBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SuaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaButActionPerformed(evt);
            }
        });
        add(SuaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 80, 20));

        XoaBut.setText("Xóa");
        XoaBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        XoaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaButActionPerformed(evt);
            }
        });
        add(XoaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 80, 20));

        XemBut1.setText("Xem");
        XemBut1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        XemBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XemBut1ActionPerformed(evt);
            }
        });
        add(XemBut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, 20));

        ClearBut.setText("Clear");
        ClearBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });
        add(ClearBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 80, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 20, 50));
        add(findTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 180, -1));

        findBut.setText("Tìm Kiếm");
        findBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButActionPerformed(evt);
            }
        });
        add(findBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    private void XemBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemBut1ActionPerformed
        // xem sản phẩm cụ thể
        int selectedRow = BangSanPham.getSelectedRow();
        if (selectedRow == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một sản phẩm để xem thông tin.");
            return;
        }

        int productId = (int) BangSanPham.getValueAt(selectedRow, 0);
        try {
            Product product = productController.getProductById(productId);
            
            if (product != null) {
                idTextField.setText(String.valueOf(product.getId()));
                nameTextField.setText(product.getTen());
                loaiSPBox.setSelectedItem(product.getLoaiSanPham());
                priceTextField.setText(String.valueOf(product.getGiaBan()));
                soLuongTextField.setText(String.valueOf(product.getSoLuong()));
                NhaCungCapTextField.setText(product.getNhaCungCap());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy thông tin sản phẩm: " + e.getMessage());
        }
    }//GEN-LAST:event_XemBut1ActionPerformed

    private void ThemButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButActionPerformed
        // Lấy thông tin từ các trường nhập liệu
        String name = nameTextField.getText().trim();
        String loaiSP = (String) loaiSPBox.getSelectedItem();
        String priceText = priceTextField.getText().trim();
        String soLuongText = soLuongTextField.getText().trim();
        String nhaCungCap = NhaCungCapTextField.getText().trim();

        // Kiểm tra các trường không được để trống
        if (name.isEmpty() || loaiSP == null || loaiSP.isEmpty() || priceText.isEmpty() || soLuongText.isEmpty() || nhaCungCap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin sản phẩm.");
            return;
        }

        // Chuyển đổi giá và số lượng sang kiểu số
        double price;
        int soLuong;
        try {
            price = Double.parseDouble(priceText);
            soLuong = Integer.parseInt(soLuongText);
            
            if (price < 0 || soLuong < 0) {
                JOptionPane.showMessageDialog(this, "Giá bán và số lượng phải là số không âm.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá bán và số lượng phải là số hợp lệ.");
            return;
        }

        try {
            // Kiểm tra xem sản phẩm đã tồn tại chưa
            if (productController.isProductExist(name, nhaCungCap)) {
                // Nếu sản phẩm đã tồn tại, cập nhật số lượng
                Product existingProduct = productController.getProductByNameAndSupplier(name, nhaCungCap);
                if (existingProduct != null) {
                    int newQuantity = existingProduct.getSoLuong() + soLuong;
                    existingProduct.setSoLuong(newQuantity);
                    productController.updateProduct(existingProduct);
                    JOptionPane.showMessageDialog(this, "Sản phẩm đã tồn tại. Đã cập nhật số lượng.");
                }
            } else {
                // Nếu sản phẩm chưa tồn tại, tạo mới
                Product newProduct = new Product();
                newProduct.setTen(name);
                newProduct.setLoaiSanPham(loaiSP);
                newProduct.setGiaBan(price);
                newProduct.setSoLuong(soLuong);
                newProduct.setNhaCungCap(nhaCungCap);
                
                // Thêm sản phẩm vào cơ sở dữ liệu
                productController.addProduct(newProduct);
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm mới thành công.");
            }
            
            // Cập nhật lại bảng sản phẩm
            loadAllProducts();
            
            // Xóa nội dung các trường nhập liệu
            clearInputFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm/cập nhật sản phẩm: " + e.getMessage());
        }
    }//GEN-LAST:event_ThemButActionPerformed

    private void SuaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaButActionPerformed
        // Lấy thông tin sản phẩm từ các trường nhập liệu
        String idStr = idTextField.getText().trim();
        String name = nameTextField.getText().trim();
        String loaiSP = (String) loaiSPBox.getSelectedItem();
        String priceStr = priceTextField.getText().trim();
        String soLuongStr = soLuongTextField.getText().trim();
        String nhaCungCap = NhaCungCapTextField.getText().trim();

        // Kiểm tra các trường không được để trống
        if (idStr.isEmpty() || name.isEmpty() || loaiSP.isEmpty() || priceStr.isEmpty() || soLuongStr.isEmpty() || nhaCungCap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin sản phẩm.");
            return;
        }

        int id, soLuong;
        double price;

        try {
            id = Integer.parseInt(idStr);
            price = Double.parseDouble(priceStr);
            soLuong = Integer.parseInt(soLuongStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID, giá bán và số lượng phải là số hợp lệ.");
            return;
        }

        try {
            // Kiểm tra xem sản phẩm có tồn tại không
            Product existingProduct = productController.getProductById(id);
            if (existingProduct == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm với ID đã cho.");
                return;
            }

            // Cập nhật thông tin sản phẩm
            existingProduct.setTen(name);
            existingProduct.setLoaiSanPham(loaiSP);
            existingProduct.setGiaBan(price);
            existingProduct.setSoLuong(soLuong);
            existingProduct.setNhaCungCap(nhaCungCap);
            
            // Cập nhật sản phẩm trong cơ sở dữ liệu
            productController.updateProduct(existingProduct);
            JOptionPane.showMessageDialog(this, "Cập nhật sản phẩm thành công.");
            
            // Cập nhật lại bảng sản phẩm
            loadAllProducts();
            
            // Xóa nội dung các trường nhập liệu
            clearInputFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật sản phẩm: " + e.getMessage());
        }
    }//GEN-LAST:event_SuaButActionPerformed

    private void XoaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButActionPerformed
        // Lấy ID sản phẩm cần xóa
        String idStr = idTextField.getText().trim();
        if (idStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ID sản phẩm cần xóa.");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID phải là số nguyên hợp lệ.");
            return;
        }

        // Xác nhận xóa
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sản phẩm này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            // Kiểm tra xem sản phẩm có tồn tại không
            Product existingProduct = productController.getProductById(id);
            if (existingProduct == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm với ID đã cho.");
                return;
            }

            // Xóa sản phẩm
            productController.deleteProduct(id);
            JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công.");
            
            // Cập nhật lại bảng sản phẩm
            loadAllProducts();
            
            // Xóa nội dung các trường nhập liệu
            clearInputFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa sản phẩm: " + e.getMessage());
        }
    }//GEN-LAST:event_XoaButActionPerformed

    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButActionPerformed
        // TODO add your handling code here:
        clearInputFields();
        loadAllProducts();
    }//GEN-LAST:event_ClearButActionPerformed

    private void findButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButActionPerformed
        // TODO add your handling code here:
        String searchTerm = findTextField.getText().trim().toLowerCase();
        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm.");
            return;
        }

        try {
            List<Product> allProducts = productController.getAllProducts();
            List<Product> filteredProducts = new ArrayList<>();

            for (Product product : allProducts) {
                if (product.getTen().toLowerCase().contains(searchTerm) ||
                    product.getLoaiSanPham().toLowerCase().contains(searchTerm) ||
                    product.getNhaCungCap().toLowerCase().contains(searchTerm) ||
                    String.valueOf(product.getId()).contains(searchTerm) ||
                    String.valueOf(product.getGiaBan()).contains(searchTerm) ||
                    String.valueOf(product.getSoLuong()).contains(searchTerm)) {
                    filteredProducts.add(product);
                }
            }

            if (filteredProducts.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm phù hợp.");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) BangSanPham.getModel();
            model.setRowCount(0);

            for (Product product : filteredProducts) {
                model.addRow(new Object[]{
                    product.getId(),
                    product.getTen(),
                    product.getLoaiSanPham(),
                    product.getGiaBan(),
                    product.getSoLuong(),
                    product.getNhaCungCap()
                });
            }

            JOptionPane.showMessageDialog(this, "Tìm thấy " + filteredProducts.size() + " sản phẩm.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm sản phẩm: " + e.getMessage());
        }
    }//GEN-LAST:event_findButActionPerformed

    public void clearInputFields() {
        idTextField.setText("");
        nameTextField.setText("");
        loaiSPBox.setSelectedItem("");
        priceTextField.setText("");
        soLuongTextField.setText("");
        NhaCungCapTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangSanPham;
    private javax.swing.JButton ClearBut;
    private javax.swing.JTextField NhaCungCapTextField;
    private javax.swing.JButton SuaBut;
    private javax.swing.JButton ThemBut;
    private javax.swing.JButton XemBut1;
    private javax.swing.JButton XoaBut;
    private javax.swing.JButton findBut;
    private javax.swing.JTextField findTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> loaiSPBox;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel nofication;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField soLuongTextField;
    // End of variables declaration//GEN-END:variables
}