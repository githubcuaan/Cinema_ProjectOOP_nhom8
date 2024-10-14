package main.cinemaproject.view.Login.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import main.cinemaproject.view.Login.swing.Button;
import main.cinemaproject.view.Login.swing.MyTextField;
import main.cinemaproject.view.Login.swing.MyPasswordField;
import javax.swing.JOptionPane;
import main.cinemaproject.dao.CustomersDAO;
import main.cinemaproject.dao.EmployeeDAO;
import java.sql.Connection;
import main.cinemaproject.database.JBDCUntil;
import main.cinemaproject.model.Customers;
import main.cinemaproject.model.Employee;
import java.awt.event.ActionEvent;
import main.cinemaproject.view.Customer.Customer;
import main.cinemaproject.view.Admin.Admin;
import javax.swing.SwingUtilities;
import main.cinemaproject.dao.IEmployeeDAO;
import java.sql.SQLException;

/**
 *
 * @author DinhAn
 */
public class PanelLoginNRegister extends javax.swing.JLayeredPane {
    
    public PanelLoginNRegister() {
        initComponents();
        initRegister();
        initLogin();
        
        login.setVisible(false);
        register.setVisible(true);
    }
    
    //init register panel
    private void initRegister()
    {
        register.setLayout(new MigLayout("wrap", "push[center]push","push[]25[]10[]10[]25[]push"));

        //title 
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7,164,121));
        register.add(label);
        
        //username
        MyTextField textUser = new MyTextField();
        textUser.setPrefixIcon(new ImageIcon(getClass().getResource("/resources/icon/user.png")));
        textUser.setHint("username");
        register.add(textUser,"w 60%");
        
        //email
        MyTextField textEmail = new MyTextField();
        textEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/resources/icon/mail.png")));
        textEmail.setHint("email");
        register.add(textEmail,"w 60%");
        
        //password
        MyTextField textPass = new MyTextField();
        textPass.setPrefixIcon(new ImageIcon(getClass().getResource("/resources/icon/pass.png")));
        textPass.setHint("password");
        register.add(textPass,"w 60%");
        
        //sign up button
        Button cmd = new Button();
        cmd.setBackground(new Color(7,164,121));
        cmd.setForeground(new Color(250,250,250));
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textUser.getText();
                String email = textEmail.getText();
                String password = textPass.getText();
                register(username, email, password);
            }
        });
        cmd.setText("SIGN UP");
        register.add(cmd, "w 40%, h 40");
    }

    //init login panel 
    private void initLogin()
    {
        login.setLayout(new MigLayout("wrap", "push[center]push","push[]25[]10[]10[]10[]25[]push"));
        
        //title 
        JLabel label = new JLabel("Sign In");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7,164,121));
        login.add(label);
        
        //username
        MyTextField textUser = new MyTextField();
        textUser.setPrefixIcon(new ImageIcon(getClass().getResource("/resources/icon/user.png")));
        textUser.setHint("username");
        login.add(textUser,"w 60%");
        
        //password
        MyPasswordField textPass = new MyPasswordField();
        textPass.setPrefixIcon(new ImageIcon(getClass().getResource("/resources/icon/pass.png")));
        textPass.setHint("password");
        login.add(textPass,"w 60%");
        
        //role selection
        JComboBox<String> roleCombo = new JComboBox<>(new String[]{"User", "Admin"});
        login.add(roleCombo, "w 60%");
        
        //sign in button
        Button cmd = new Button();
        cmd.setBackground(new Color(7,164,121));
        cmd.setForeground(new Color(250,250,250));
        cmd.setText("SIGN IN");
        //thêm sự kiện click vào button, khi click vào button sẽ gọi hàm login
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textUser.getText();
                String password = new String(textPass.getPassword());
                String role = (String) roleCombo.getSelectedItem();
                login(username, password, role);
            }
        });
        login.add(cmd, "w 40%, h 40");
    }

    //hàm login
    private void login(String username, String password, String role)
    {
        try {
            Connection connection = JBDCUntil.getConnection();
            if (role.equals("User")) {
                CustomersDAO customerDAO = new CustomersDAO(connection);
                Customers customer = customerDAO.login(username, password);
                if (customer != null) {
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                    Customer customerScreen = new Customer();
                    customerScreen.setVisible(true);
                    SwingUtilities.getWindowAncestor(this).dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng kiểm tra lại thông tin.");
                }
            } else if (role.equals("Admin")) {
                IEmployeeDAO employeeDAO = new EmployeeDAO(connection);
                try {
                    Employee employee = employeeDAO.login(username, password);
                    if (employee != null) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                        Admin adminScreen = new Admin();
                        adminScreen.setVisible(true);
                        SwingUtilities.getWindowAncestor(this).dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng kiểm tra lại thông tin.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi đăng nhập. Vui lòng thử lại sau.");
                } finally {
                    JBDCUntil.closeConnection(connection);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi đăng nhập. Vui lòng thử lại sau.");
        }
    }
    
    //hàm hiển thị register panel
    public void showRegister(boolean show)
    {
        if(show)
        {
            register.setVisible(true);
            login.setVisible(false);
        }
        else
        {
            register.setVisible(false);
            login.setVisible(true);
        }
    }
    
    //hàm đăng ký
    private void register(String username, String email, String password) {
        try {
            Connection connection = JBDCUntil.getConnection();
            CustomersDAO customerDAO = new CustomersDAO(connection);
            boolean isRegistered = customerDAO.register(username, email, password);
            if (isRegistered) {
                JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
                // TODO: Chuyển đến màn hình đăng nhập hoặc màn hình chính của khách hàng
            } else {
                JOptionPane.showMessageDialog(this, "Đăng ký thất bại. Vui lòng thử lại.");
            }
            JBDCUntil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi đăng ký. Vui lòng thử lại sau.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
