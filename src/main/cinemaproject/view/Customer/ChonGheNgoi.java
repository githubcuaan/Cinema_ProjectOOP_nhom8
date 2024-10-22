
package main.cinemaproject.view.Customer;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

/**
 *
 * @author DinhAn
 */
public class ChonGheNgoi extends javax.swing.JPanel {
    
    private List<String> selectedSeats = new ArrayList<>();
    /**
     * Creates new form ChonGheNgoi
     */
    public ChonGheNgoi() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TenRap1 = new javax.swing.JLabel();
        TenPhim = new javax.swing.JLabel();
        NgayChieu = new javax.swing.JLabel();
        GioChieu = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        ManChieu = new javax.swing.JLabel();
        GheA1 = new javax.swing.JButton();
        GheA2 = new javax.swing.JButton();
        GheA3 = new javax.swing.JButton();
        GheA4 = new javax.swing.JButton();
        GheA5 = new javax.swing.JButton();
        GheA6 = new javax.swing.JButton();
        GheA7 = new javax.swing.JButton();
        GheA8 = new javax.swing.JButton();
        GheB8 = new javax.swing.JButton();
        GheB7 = new javax.swing.JButton();
        GheB6 = new javax.swing.JButton();
        GheB5 = new javax.swing.JButton();
        GheB4 = new javax.swing.JButton();
        GheB3 = new javax.swing.JButton();
        GheB2 = new javax.swing.JButton();
        GheB1 = new javax.swing.JButton();
        GheC4 = new javax.swing.JButton();
        GheC3 = new javax.swing.JButton();
        GheC2 = new javax.swing.JButton();
        GheC1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nextBut = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(920, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TenRap1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TenRap1.setText("Tên Rạp");
        jPanel1.add(TenRap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        TenPhim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TenPhim.setText("Tên Phim");
        jPanel1.add(TenPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        NgayChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NgayChieu.setText("Ngày Chiếu");
        jPanel1.add(NgayChieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        GioChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GioChieu.setText("Giờ Chiếu");
        jPanel1.add(GioChieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 10, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 10, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        ManChieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ManChieu.setText("Màn Chiếu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(ManChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(ManChieu)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 920, 50));

        GheA1.setText("A1");
        GheA1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA1ActionPerformed(evt);
            }
        });
        add(GheA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 50, 30));

        GheA2.setText("A2");
        GheA2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA2ActionPerformed(evt);
            }
        });
        add(GheA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 50, 30));

        GheA3.setText("A3");
        GheA3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA3ActionPerformed(evt);
            }
        });
        add(GheA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 50, 30));

        GheA4.setText("A4");
        GheA4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA4ActionPerformed(evt);
            }
        });
        add(GheA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 50, 30));

        GheA5.setText("A5");
        GheA5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA5ActionPerformed(evt);
            }
        });
        add(GheA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 50, 30));

        GheA6.setText("A6");
        GheA6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA6ActionPerformed(evt);
            }
        });
        add(GheA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 50, 30));

        GheA7.setText("A7");
        GheA7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA7ActionPerformed(evt);
            }
        });
        add(GheA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 50, 30));

        GheA8.setText("A8");
        GheA8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheA8ActionPerformed(evt);
            }
        });
        add(GheA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 50, 30));

        GheB8.setText("B8");
        GheB8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB8ActionPerformed(evt);
            }
        });
        add(GheB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 50, 30));

        GheB7.setText("B7");
        GheB7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB7ActionPerformed(evt);
            }
        });
        add(GheB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 50, 30));

        GheB6.setText("B6");
        GheB6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB6ActionPerformed(evt);
            }
        });
        add(GheB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 50, 30));

        GheB5.setText("B5");
        GheB5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB5ActionPerformed(evt);
            }
        });
        add(GheB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 50, 30));

        GheB4.setText("B4");
        GheB4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB4ActionPerformed(evt);
            }
        });
        add(GheB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 50, 30));

        GheB3.setText("B3");
        GheB3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB3ActionPerformed(evt);
            }
        });
        add(GheB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 50, 30));

        GheB2.setText("B2");
        GheB2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB2ActionPerformed(evt);
            }
        });
        add(GheB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 50, 30));

        GheB1.setText("B1");
        GheB1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheB1ActionPerformed(evt);
            }
        });
        add(GheB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 50, 30));

        GheC4.setText("C4");
        GheC4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheC4ActionPerformed(evt);
            }
        });
        add(GheC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 50, 30));

        GheC3.setText("C3");
        GheC3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheC3ActionPerformed(evt);
            }
        });
        add(GheC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 50, 30));

        GheC2.setText("C2");
        GheC2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheC2ActionPerformed(evt);
            }
        });
        add(GheC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 50, 30));

        GheC1.setText("C1");
        GheC1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GheC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GheC1ActionPerformed(evt);
            }
        });
        add(GheC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 50, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Note"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 42, -1));

        jLabel1.setText("Đang Chọn");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel2.setText("Đã Đặt");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jPanel6.setBackground(Color.GREEN);
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setText("Chưa Đặt");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 210));

        nextBut.setText("Tiếp Theo");
        nextBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nextBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButActionPerformed(evt);
            }
        });
        add(nextBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 573, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void nextButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButActionPerformed
        int tabIndex = 2;
        JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
        tabbedPane.setSelectedIndex(tabIndex);

        ChonDoAn chonDoAn = (ChonDoAn) tabbedPane.getComponentAt(tabIndex);
        chonDoAn.setSelectedSeats(selectedSeats);
    }//GEN-LAST:event_nextButActionPerformed

    public void setInfo(String theater, String movieName, String showtime, String date) {
        TenRap1.setText(theater);
        TenPhim.setText(movieName);
        GioChieu.setText(showtime);
        NgayChieu.setText(date);
    }

    private void GheA1ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheA1);
    }

    private void GheA2ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheA2);
    }

    private void GheA3ActionPerformed(java.awt.event.ActionEvent evt) {
            handleSeatSelection(GheA3);
    }

    private void GheA4ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheA4);
    }

    private void GheA5ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheA5);
    }

    private void GheA6ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheA6);
    }

    private void GheA7ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheA7);
    }

    private void GheA8ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheA8);
    }

    private void GheB1ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB1);
    }

    private void GheB2ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB2);
    }

    private void GheB3ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB3);
    }

    private void GheB4ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB4);
    }

    private void GheB5ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB5);
    }

    private void GheB6ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB6);
    }

    private void GheB7ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB7);
    }

    private void GheB8ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheB8);
    }

    private void GheC1ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheC1);
    }

    private void GheC2ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheC2);
    }

    private void GheC3ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheC3);
    }

    private void GheC4ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSeatSelection(GheC4);
    }

    private void handleSeatSelection(JButton seatButton) {
        if (selectedSeats.contains(seatButton.getText())) {
            selectedSeats.remove(seatButton.getText());
            seatButton.setBackground(null);
        } else {
            selectedSeats.add(seatButton.getText());
            seatButton.setBackground(Color.GREEN);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GheA1;
    private javax.swing.JButton GheA2;
    private javax.swing.JButton GheA3;
    private javax.swing.JButton GheA4;
    private javax.swing.JButton GheA5;
    private javax.swing.JButton GheA6;
    private javax.swing.JButton GheA7;
    private javax.swing.JButton GheA8;
    private javax.swing.JButton GheB1;
    private javax.swing.JButton GheB2;
    private javax.swing.JButton GheB3;
    private javax.swing.JButton GheB4;
    private javax.swing.JButton GheB5;
    private javax.swing.JButton GheB6;
    private javax.swing.JButton GheB7;
    private javax.swing.JButton GheB8;
    private javax.swing.JButton GheC1;
    private javax.swing.JButton GheC2;
    private javax.swing.JButton GheC3;
    private javax.swing.JButton GheC4;
    private javax.swing.JLabel GioChieu;
    private javax.swing.JLabel ManChieu;
    private javax.swing.JLabel NgayChieu;
    private javax.swing.JLabel TenPhim;
    private javax.swing.JLabel TenRap1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton nextBut;
    // End of variables declaration//GEN-END:variables
}