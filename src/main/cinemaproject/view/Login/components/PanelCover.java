package main.cinemaproject.view.Login.components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import main.cinemaproject.view.Login.swing.ButtonOutLine;
/**
 *
 * @author DinhAn
 */
public class PanelCover extends javax.swing.JPanel {
    private final DecimalFormat df=new DecimalFormat("#.##");
    private ActionListener e;
    private MigLayout layout;
    private JLabel title;
    private JLabel description;
    private JLabel description1;
    private ButtonOutLine but;
    private boolean isLogin;
    
    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]25[]10[]25[]push");
        setLayout(layout);
        init();
    }
    
    private void init()
    {
        title = new JLabel("Hello, Friend!");
        title.setFont(new Font("sansserif", 1, 30));
        title.setForeground(new Color(245,245,245));
        add(title);
        
        description = new JLabel("Enter your personal details");
        description.setForeground(new Color(245,245,245));
        add(description);
        
        description1 = new JLabel("and start journey with us");
        description1.setForeground(new Color(245,245,245));
        add(description1);
        
        but = new ButtonOutLine();
        but.setBackground(new Color(255,255,255));
        but.setForeground(new Color(255,255,255));
        but.setText("SIGN IN");
        but.setFocusable(false);
        but.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                e.actionPerformed(ae);
            }
        });
        add(but, "w 60%, h 40");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override 
    protected void paintComponent(Graphics grphcs)
    {
        Graphics2D g2 = (Graphics2D)grphcs;
        super.paintComponent(grphcs);
        GradientPaint gra = new GradientPaint(0, 0, new Color(35, 166, 97),0,  getHeight(), new Color(22, 116, 66));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public void addEvent(ActionListener e)
    {
        this.e = e;
    }

    public void registerLeft(double v) {
        updateComponentConstraints(false, v, true);
    }

    public void registerRight(double v) {
        updateComponentConstraints(false, v, false);
    }
    
    public void loginLeft(double v) {
        updateComponentConstraints(true, v, true);
    }

    public void loginRight(double v) {
        updateComponentConstraints(true, v, false);
    }

    private void updateComponentConstraints(boolean isLogin, double v, boolean isLeft) {
        v = Double.valueOf(df.format(v));
        login(isLogin);
        String padding = isLogin ? v + "%" : "-" + v + "%";
        String constraint = isLeft ? "pad 0 " + padding + " 0 0" : "pad 0 " + padding + " 0 " + padding;
        
        layout.setComponentConstraints(title, constraint);
        layout.setComponentConstraints(description, constraint);
        layout.setComponentConstraints(description1, constraint);
        
        revalidate();
        repaint();
    }
    
    private void login(boolean login)
    {
        if(this.isLogin != login)
        {
            this.isLogin = login;
            if(login)
            {
                title.setText("Welcome Back!");
                description.setText("To get started,");
                description1.setText("please log in to your account");
                but.setText("SIGN UP");
            }
            else
            {
                title.setText("Hello, Friend!");
                description.setText("Enter your personal details");
                description1.setText("and start journey with us");
                but.setText("SIGN IN");
            }
            revalidate();
            repaint();
        }
    }
    // Variables declaration - do not modify                     
    // End of variables declaration//GEN-ENDIFICATIONS
}
