package main.cinemaproject.view.Login.LoginFrame;

import main.cinemaproject.view.Login.components.PanelCover;
import main.cinemaproject.view.Login.components.PanelLoginNRegister;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import javax.swing.*;

/**
 * LoginFrame class to handle the login and registration interface.
 * 
 * @author DinhAn
 */
public class LoginFrame extends javax.swing.JFrame {
    private MigLayout layout;
    private PanelCover cover;
    private PanelLoginNRegister loginNRegister;
    private boolean isLogin;
    private final double addSize = 30;
    private final double loginSize = 60;
    private final double coverSize = 40;

    public LoginFrame() {
        initComponents();
        init();
        this.setTitle("Login");
        this.setResizable(false);
        // Center the frame on the screen
        this.setLocationRelativeTo(null);
    }

    private void init() {
        layout = new MigLayout("fill, inset 0");
        cover = new PanelCover();
        loginNRegister = new PanelLoginNRegister();
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double fractionCover;
                double fractionLogin;
                double size = coverSize;
                if (fraction <= 0.5f) {
                    size += fraction * addSize;
                } else {
                    size += addSize - fraction * addSize;
                }
                if (isLogin) {
                    fractionCover = 1f - fraction;
                    fractionLogin = fraction;
                    if (fraction <= 0.5) {
                        cover.loginRight(fractionLogin * 100);
                    } else {
                        cover.registerRight(fractionCover * 100);
                    }
                } else {
                    fractionCover = fraction;
                    fractionLogin = 1f - fraction;
                    if (fraction <= 0.5) {
                        cover.registerLeft(fractionCover * 100);
                    } else {
                        cover.loginLeft(fractionLogin * 100);
                    }
                }

                if (fraction >= 0.5f) {
                    loginNRegister.showRegister(isLogin);
                }

                // Update layout constraints
                String constraints = String.format("width %.2f%%, pos %.2fal 0 n 100%%", size, fractionCover);
                String constraints4Login = String.format("width %.2f%%, pos %.2fal 0 n 100%%", loginSize, fractionLogin);
                layout.setComponentConstraints(cover, constraints);
                layout.setComponentConstraints(loginNRegister, constraints4Login);
                bg.revalidate();  // Update layout
            }

            //change login and register - sau mỗi lần animation kết thúc thì đảo isLogin
            @Override
            public void end() {
                isLogin = !isLogin;
            }
        };

        Animator anime = new Animator(800, target);
        anime.setAcceleration(0.5f);
        anime.setDeceleration(0.5f);
        anime.setResolution(0);

        bg.setLayout(layout);
        bg.add(cover, "width " + coverSize + "%, pos 0al 0 n 100%");
        bg.add(loginNRegister, "width " + loginSize + "%, pos 1al 0 n 100%");

        cover.addEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!anime.isRunning()) {
                    anime.start();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        bg = new javax.swing.JLayeredPane();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
    }

    // Variables declaration
    private javax.swing.JLayeredPane bg;
}
