package main.cinemaproject.view.Admin;

import java.util.ArrayList;
import main.cinemaproject.model.Customers;
import main.cinemaproject.controller.CustomerController;
import main.cinemaproject.utils.ValidationUtils;

/**
 *
 * @author DinhAn
 */
public class KhachHang extends javax.swing.JPanel {

    private CustomerController customerController;
    /**
     * Creates new form NhanVien
     */
    public KhachHang() {
        initComponents();
        customerController = new CustomerController();
        showCustomerTable();
    }
    
    // Phương thức để lấy danh sách khách hàng từ cơ sở dữ liệu
    public ArrayList<Customers> cList() {
        ArrayList<Customers> cList = new ArrayList<>();
        CustomerController customerController = new CustomerController();
        cList = customerController.getAllCustomers();
        return cList;
    }

    // Phương thức để hiển thị danh sách khách hàng trong bảng
    public void showCustomerTable() {
        ArrayList<Customers> cTable = cList();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) BangKhachHang.getModel();
        model.setRowCount(0);
        
        for (Customers customer : cTable) {
            model.addRow(new Object[]{
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getMembershipLevel()
            });
        }
        
        // Tự động điều chỉnh kích thước các cột
        BangKhachHang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

        // Tạo một renderer tùy chỉnh để wrap text
        javax.swing.table.DefaultTableCellRenderer renderer = new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                java.awt.Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (c instanceof javax.swing.JLabel) {
                    ((javax.swing.JLabel) c).setVerticalAlignment(javax.swing.SwingConstants.TOP);
                }
                return c;
            }
        };
        
        // Áp dụng renderer cho tất cả các cột
        for (int i = 0; i < BangKhachHang.getColumnCount(); i++) {
            BangKhachHang.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CustomersMemberLevel = new javax.swing.JComboBox<>();
        ClearBut = new javax.swing.JButton();
        XemBut = new javax.swing.JButton();
        ThemBut = new javax.swing.JButton();
        SuaBut = new javax.swing.JButton();
        XoaBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangKhachHang = new javax.swing.JTable();
        findTextField = new javax.swing.JTextField();
        findBut = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(920, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Khách Hàng"));

        jLabel1.setText("ID");

        idTextField.setEditable(false);
     

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Email");

        jLabel4.setText("Số điện Thoại");

        jLabel5.setText("Cấp độ Khách");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        

        jLabel6.setText("Tài Khoản");

        jLabel7.setText("Mật Khẩu");

        CustomersMemberLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắt Vụn ", "Nhôm", "Vàng", "Kim Cương" }));
        

        ClearBut.setText("Clear");
        ClearBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomersMemberLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(CustomersMemberLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ClearBut))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        XemBut.setText("Xem");
        XemBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        XemBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XemButActionPerformed(evt);
            }
        });

        ThemBut.setText("Thêm");
        ThemBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ThemBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButActionPerformed(evt);
            }
        });

        SuaBut.setText("Sửa");
        SuaBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SuaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaButActionPerformed(evt);
            }
        });

        XoaBut.setText("Xóa");
        XoaBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        XoaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaButActionPerformed(evt);
            }
        });

        BangKhachHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BangKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ Tên", "Email", "Số Điện Thoại", "Cấp Độ Khách"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        BangKhachHang.setRowHeight(BangKhachHang.getRowHeight() + 5);
        jScrollPane1.setViewportView(BangKhachHang);

        

        findBut.setText("Tìm Kiếm");
        findBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        findBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(XemBut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ThemBut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SuaBut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(XoaBut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(findTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findBut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XoaBut)
                    .addComponent(SuaBut)
                    .addComponent(ThemBut)
                    .addComponent(XemBut)
                    .addComponent(findTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //ThemBut Action khi được bấm
    private void ThemButActionPerformed(java.awt.event.ActionEvent evt) {
        // Lấy thông tin từ các trường nhập liệu
        String name = nameTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String phone = phoneTextField.getText().trim();
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();
        String membershipLevel = CustomersMemberLevel.getSelectedItem().toString(); 

        // Kiểm tra các trường bắt buộc
        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty() || membershipLevel.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
            return;
        }

        if (!ValidationUtils.isValidEmail(email)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Email không hợp lệ.");
            return;
        }

        if (!ValidationUtils.isValidPhoneNumber(phone)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ.");
            return;
        }
        // Tạo đối tượng Customer mới
        Customers newCustomer = new Customers();
        newCustomer.setName(name);
        newCustomer.setEmail(email);
        newCustomer.setPhone(phone);
        newCustomer.setMembershipLevel(membershipLevel);
        newCustomer.setUsername(username);
        newCustomer.setPassword(password);

        boolean success = customerController.addCustomer(newCustomer);

        if (success) {
            // Cập nhật bảng hiển thị
            showCustomerTable();

            // Xóa nội dung các trường nhập liệu
            clearInputFields();

            javax.swing.JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Không thể thêm khách hàng. Vui lòng kiểm tra lại thông tin.");
        }
    }

    //XoaBut Action khi được bấm
    private void XoaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButActionPerformed
        // Lấy chỉ số hàng được chọn
        int selectedRow = BangKhachHang.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để xóa.");
            return;
        }

        // Lấy ID của khách hàng từ hàng được chọn
        int customerId = (int) BangKhachHang.getValueAt(selectedRow, 0);

        // Hiển thị hộp thoại xác nhận
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn xóa khách hàng này?",
                "Xác nhận xóa",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            boolean success = customerController.deleteCustomer(customerId);
            
            if (success) {
                // Cập nhật bảng hiển thị
                showCustomerTable();
                
                // Xóa nội dung các trường nhập liệu
                clearInputFields();
                
                javax.swing.JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi xóa khách hàng. Vui lòng thử lại.");
            }
        }
    }//GEN-LAST:event_XoaButActionPerformed

    //XemBut Action khi được bấm
    private void XemButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemButActionPerformed
        // Lấy chỉ số hàng được chọn
        int selectedRow = BangKhachHang.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để xem thông tin.");
            return;
        }

        // Lấy ID của khách hàng từ hàng được chọn
        int customerId = (int) BangKhachHang.getValueAt(selectedRow, 0);

        Customers customer = customerController.getCustomerById(customerId);
        
        if (customer != null) {
            // Hiển thị thông tin trong các TextField
            idTextField.setText(String.valueOf(customer.getId()));
            nameTextField.setText(customer.getName());
            emailTextField.setText(customer.getEmail());
            phoneTextField.setText(customer.getPhone());
            CustomersMemberLevel.setSelectedItem(customer.getMembershipLevel());
            usernameTextField.setText(customer.getUsername());
            passwordTextField.setText(customer.getPassword());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin khách hàng.");
        }
    }//GEN-LAST:event_XemButActionPerformed
    
    //SuaBut Action khi được bấm
    private void SuaButActionPerformed(java.awt.event.ActionEvent evt) {
        // Get the customer ID from the text field
        String idText = idTextField.getText().trim();
        if (idText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để cập nhật.");
            return;
        }

        int customerId;
        try {
            customerId = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "ID khách hàng không hợp lệ.");
            return;
        }

        // Get the updated information from text fields
        String name = nameTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String phone = phoneTextField.getText().trim();
        String membershipLevel = CustomersMemberLevel.getSelectedItem().toString(); 
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();

        // Validate input
        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || membershipLevel.isEmpty() || username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
            return;
        }

        //kiểm tra email hợp lệ
        if (!ValidationUtils.isValidEmail(email)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Email không hợp lệ.");
            return;
        }   
        
        //kiểm tra số điện thoại hợp lệ
        if(!ValidationUtils.isValidPhoneNumber(phone)){
            javax.swing.JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ.");
            return;
        }
        try {
            // Create an updated Customer object
            Customers updatedCustomer = new Customers(customerId, name, email, phone, username, password, membershipLevel);

            // Update the customer using the controller
            boolean success = customerController.updateCustomer(updatedCustomer);

            if (success) {
                javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công.");
                // Refresh the table to show updated data
                showCustomerTable();
                // Clear input fields
                clearInputFields();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Không thể cập nhật khách hàng. Vui lòng thử lại.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật khách hàng: " + e.getMessage());
        }
    }

    //findBut Action khi được bấm
    private void findButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButActionPerformed
        // Lấy từ khóa tìm kiếm từ findTextField
        String searchTerm = findTextField.getText().trim().toLowerCase();
        if (searchTerm.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm.");
            return;
        }

        try {
            ArrayList<Customers> filteredCustomers = customerController.searchCustomers(searchTerm);

            if (filteredCustomers.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng phù hợp.");
                return;
            }

            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) BangKhachHang.getModel();
            model.setRowCount(0);

            for (Customers customer : filteredCustomers) {
                model.addRow(new Object[]{
                    customer.getId(),
                    customer.getName(),
                    customer.getEmail(),
                    customer.getPhone(),
                    customer.getMembershipLevel()
                });
            }

            javax.swing.JOptionPane.showMessageDialog(this, "Tìm thấy " + filteredCustomers.size() + " khách hàng.");

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm khách hàng: " + e.getMessage());
        }
    }//GEN-LAST:event_findButActionPerformed

    //clear thông tin và load lại bảng
    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButActionPerformed
        // TODO add your handling code here:
        this.clearInputFields();
        this.showCustomerTable();
    }//GEN-LAST:event_ClearButActionPerformed
    
    //phương thức clear thông tin trong các trường nhập liệu
    public void clearInputFields() {
        idTextField.setText("");
        nameTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");
        CustomersMemberLevel.setSelectedItem("Sắt Vụn");
        usernameTextField.setText("");
        passwordTextField.setText("");
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangKhachHang;
    private javax.swing.JButton ClearBut;
    private javax.swing.JComboBox<String> CustomersMemberLevel;
    private javax.swing.JButton SuaBut;
    private javax.swing.JButton ThemBut;
    private javax.swing.JButton XemBut;
    private javax.swing.JButton XoaBut;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton findBut;
    private javax.swing.JTextField findTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
