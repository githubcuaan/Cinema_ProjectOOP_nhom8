package main.cinemaproject.view.Admin;

import java.util.ArrayList;
import main.cinemaproject.model.Employee;
import main.cinemaproject.database.JBDCUntil;
import java.sql.Connection;
import main.cinemaproject.controller.EmployeeController;
import java.sql.SQLException;
/**
 *
 * @author DinhAn
 */
public class NhanVien extends javax.swing.JPanel {

    private EmployeeController employeeController;

    /**
     * Creates new form NhanVien
     */
    public NhanVien() {
        initComponents();
        employeeController = new EmployeeController();
        showEmployeeTable();
    }
    
    // Phương thức để lấy danh sách nhân viên từ cơ sở dữ liệu
    public ArrayList<Employee> eList() throws SQLException {
        return employeeController.getAllEmployees();
    }

    // Phương thức để hiển thị danh sách nhân viên trong bảng
    public void showEmployeeTable() {
        ArrayList<Employee> eTable;
        try {
            eTable = eList();
        } catch (SQLException e) {
            System.err.println("Error fetching employee list: " + e.getMessage());
            return;
        }
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) BangNhanVien.getModel();
        model.setRowCount(0);
        
        for (Employee employee : eTable) {
            model.addRow(new Object[]{
                employee.getId(),
                employee.getName(),
                employee.getRole(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getSalary()
            });
        }
        
        // Tự động điều chỉnh kích thước các cột
        BangNhanVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        // Tự động điều chỉnh chiều cao hàng
        BangNhanVien.setRowHeight(BangNhanVien.getRowHeight() + 5);
        
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
        for (int i = 0; i < BangNhanVien.getColumnCount(); i++) {
            BangNhanVien.getColumnModel().getColumn(i).setCellRenderer(renderer);
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
        salaryTextField = new javax.swing.JTextField();
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
        XemBut = new javax.swing.JButton();
        ThemBut = new javax.swing.JButton();
        SuaBut = new javax.swing.JButton();
        XoaBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangNhanVien = new javax.swing.JTable();
        findTextField = new javax.swing.JTextField();
        findBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(920, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Nhân Viên"));

        jLabel1.setText("ID");

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Email");

        jLabel4.setText("Số điện Thoại");

        jLabel5.setText("Lương");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);


        jLabel6.setText("Tài Khoản");

        jLabel7.setText("Mật Khẩu");

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
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
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
                            .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
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

        BangNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BangNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ Tên", "Vai Trò", "Email", "Số Điện Thoại", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BangNhanVien);


        findBut.setText("Tìm Kiếm");
        findBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        findBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButActionPerformed(evt);
            }
        });

        jLabel8.setText("ID");

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
                                .addGap(105, 105, 105)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(findBut)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThemButActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Lấy thông tin từ các trường nhập liệu
            String name = nameTextField.getText().trim();
            String email = emailTextField.getText().trim();
            String phone = phoneTextField.getText().trim();
            String username = usernameTextField.getText().trim();
            String password = passwordTextField.getText().trim();
            String salaryText = salaryTextField.getText().trim();

            // Kiểm tra các trường bắt buộc
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty() || salaryText.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
                return;
            }

            // Kiểm tra và chuyển đổi lương
            double salary;
            try {
                salary = Double.parseDouble(salaryText);
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Lương phải là một số hợp lệ.");
                return;
            }

            // Tạo đối tượng Employee mới
            Employee newEmployee = new Employee();
            newEmployee.setName(name);
            newEmployee.setEmail(email);
            newEmployee.setPhone(phone);
            newEmployee.setSalary(salary);
            newEmployee.setRole("Employee");
            newEmployee.setUsername(username);
            newEmployee.setPassword(password);

            // Thêm nhân viên sử dụng controller
            boolean success = employeeController.addEmployee(newEmployee);
            
            if (success) {
                showEmployeeTable();
                clearInputFields();
                javax.swing.JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi không xác định: " + e.getMessage());
        }
    }

    private void XoaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButActionPerformed
        // Lấy chỉ số hàng được chọn
        int selectedRow = BangNhanVien.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhân viên để xóa.");
            return;
        }

        // Lấy ID của nhân viên từ hàng được chọn
        int employeeId = (int) BangNhanVien.getValueAt(selectedRow, 0);

        // Hiển thị hộp thoại xác nhận
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn xóa nhân viên này?",
                "Xác nhận xóa",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                // Xóa nhân viên sử dụng controller
                boolean success = employeeController.deleteEmployee(employeeId);
                
                if (success) {
                    // Cập nhật bảng hiển thị
                    showEmployeeTable();
                    
                    // Xóa nội dung các trường nhập liệu
                    clearInputFields();
                    
                    javax.swing.JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Xóa nhân viên thất bại.");
                }
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi xóa nhân viên: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_XoaButActionPerformed

    private void XemButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemButActionPerformed
        // Lấy chỉ số hàng được chọn
        int selectedRow = BangNhanVien.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhân viên để xem thông tin.");
            return;
        }

        // Lấy ID của nhân viên từ hàng được chọn
        int employeeId = (int) BangNhanVien.getValueAt(selectedRow, 0);

        try {
            // Lấy thông tin nhân viên sử dụng controller
            Employee employee = employeeController.getEmployeeById(employeeId);
            
            if (employee != null) {
                // Hiển thị thông tin trong các TextField
                idTextField.setText(String.valueOf(employee.getId()));
                nameTextField.setText(employee.getName());
                emailTextField.setText(employee.getEmail());
                phoneTextField.setText(employee.getPhone());
                salaryTextField.setText(String.valueOf(employee.getSalary()));
                usernameTextField.setText(employee.getUsername());
                passwordTextField.setText(employee.getPassword());
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin nhân viên.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi lấy thông tin nhân viên: " + e.getMessage());
        }
    }//GEN-LAST:event_XemButActionPerformed
   
    private void SuaButActionPerformed(java.awt.event.ActionEvent evt) {
        // Get the employee ID from the text field
        String idText = idTextField.getText().trim();
        if (idText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhân viên để cập nhật.");
            return;
        }

        int employeeId;
        try {
            employeeId = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "ID nhân viên không hợp lệ.");
            return;
        }

        // Get the updated information from text fields
        String name = nameTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String phone = phoneTextField.getText().trim();
        String salaryText = salaryTextField.getText().trim();
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();

        // Validate input
        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || salaryText.isEmpty() || username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
            return;
        }

        double salary;
        try {
            salary = Double.parseDouble(salaryText);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lương không hợp lệ.");
            return;
        }

        try {
            // Create an updated Employee object
            Employee updatedEmployee = new Employee(employeeId, name, email, phone, "", salary, username, password);

            // Update the employee using the controller
            boolean success = employeeController.updateEmployee(updatedEmployee);

            if (success) {
                javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công.");
                // Refresh the table to show updated data
                showEmployeeTable();
                // Clear input fields
                clearInputFields();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thất bại.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật nhân viên: " + e.getMessage());
        }
    }
    
    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    

    private void findButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButActionPerformed
    String searchId = findTextField.getText().trim();
    if (searchId.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập ID nhân viên cần tìm.");
        return;
    }

    try {
        int employeeId = Integer.parseInt(searchId);
        try {
            Employee employee = employeeController.getEmployeeById(employeeId);

            if (employee != null) {
                // Hiển thị thông tin nhân viên tìm được
                idTextField.setText(String.valueOf(employee.getId()));
                nameTextField.setText(employee.getName());
                emailTextField.setText(employee.getEmail());
                phoneTextField.setText(employee.getPhone());
                salaryTextField.setText(String.valueOf(employee.getSalary()));
                
                // Lấy thông tin đăng nhập
                // Giả sử rằng thông tin đăng nhập đã được bao gồm trong đối tượng Employee
                usernameTextField.setText(employee.getUsername());
                passwordTextField.setText(employee.getPassword());

                // Cập nhật bảng để chỉ hiển thị nhân viên tìm được
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) BangNhanVien.getModel();
                model.setRowCount(0);
                model.addRow(new Object[]{
                    employee.getId(),
                    employee.getName(),
                    employee.getRole(),
                    employee.getEmail(),
                    employee.getPhone(),
                    employee.getSalary()
                });
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên với ID: " + employeeId);
                clearInputFields();
                showEmployeeTable(); // Hiển thị lại toàn bộ danh sách nhân viên
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm nhân viên: " + e.getMessage());
        }
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "ID nhân viên phải là một số nguyên.");
    }
}//GEN-LAST:event_findButActionPerformed
    
    public void clearInputFields() {
        nameTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");
        salaryTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangNhanVien;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}