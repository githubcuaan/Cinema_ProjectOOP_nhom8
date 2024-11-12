package main.cinemaproject.view.Customer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JOptionPane;


import main.cinemaproject.controller.TicketController;

/**
 *
 * @author DinhAn
 */
public class ChonGheNgoi extends javax.swing.JPanel {
    
    private int screeningId; // Thêm biến để lưu screeningId
    private List<String> selectedSeats = new ArrayList<>();
    private List<String> reservedSeats = new ArrayList<>();

    private TicketController ticketController = new TicketController();


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
        backBut = new javax.swing.JButton();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        add(nextBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 90, 30));

        backBut.setText("Quay Lại");
        backBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });
        add(backBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void nextButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButActionPerformed
        // Kiểm tra xem có ghế nào được chọn không
        if (selectedSeats.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ít nhất một ghế trước khi tiếp tục.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return; // Thoát nếu không có ghế nào được chọn
        }

        int tabIndex = 2;
        JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
        tabbedPane.setSelectedIndex(tabIndex);

        ChonDoAn chonDoAn = (ChonDoAn) tabbedPane.getComponentAt(tabIndex);
        chonDoAn.setSelectedSeats(selectedSeats);
    }//GEN-LAST:event_nextButActionPerformed

    private void backButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButActionPerformed
        // Xóa danh sách ghế đã chọn
        selectedSeats.clear();
        
        // Cập nhật giao diện để làm mới ghế ngồi
        resetSeatSelection();

        // Quay lại tab chọn phim
        int tabIndex = 0;
        JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
        tabbedPane.setSelectedIndex(tabIndex);
    }//GEN-LAST:event_backButActionPerformed

    private void resetSeatSelection() {
        // Đặt lại màu nền cho tất cả các nút ghế
        for (JButton seatButton : new JButton[]{GheA1, GheA2, GheA3, GheA4, GheA5, GheA6, GheA7, GheA8,
                                             GheB1, GheB2, GheB3, GheB4, GheB5, GheB6, GheB7, GheB8,
                                             GheC1, GheC2, GheC3, GheC4}) {
            seatButton.setBackground(null); // Đặt lại màu nền
        }
    }

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
        String seatNumber = seatButton.getText();
        
        // Kiểm tra xem ghế đã được đặt hay chưa
        if (reservedSeats.contains(seatNumber)) {
            // Hiển thị thông báo nếu ghế đã được đặt
            JOptionPane.showMessageDialog(this, "Ghế " + seatNumber + " đã được đặt.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return; // Không cho phép chọn ghế đã đặt
        }

        // Nếu ghế chưa được đặt, cho phép chọn
        if (selectedSeats.contains(seatNumber)) {
            selectedSeats.remove(seatNumber);
            seatButton.setBackground(null);
        } else {
            selectedSeats.add(seatNumber);
            seatButton.setBackground(Color.GREEN);
        }
    }

    private void highlightReservedSeats() {
        for (String seat : reservedSeats) {
            // Tô đỏ ghế đã đặt
            switch (seat) {
                case "A1":
                    GheA1.setBackground(Color.RED);
                    break;
                case "A2":
                    GheA2.setBackground(Color.RED);
                    break;
                case "A3":
                    GheA3.setBackground(Color.RED);
                    break;
                case "A4":
                    GheA4.setBackground(Color.RED);
                    break;
                case "A5":
                    GheA5.setBackground(Color.RED);
                    break;
                case "A6":
                    GheA6.setBackground(Color.RED);
                    break;
                case "A7":
                    GheA7.setBackground(Color.RED);
                    break;
                case "A8":
                    GheA8.setBackground(Color.RED);
                    break;
                case "B1":
                    GheB1.setBackground(Color.RED);
                    break;
                case "B2":
                    GheB2.setBackground(Color.RED);
                    break;
                case "B3":
                    GheB3.setBackground(Color.RED);
                    break;
                case "B4":
                    GheB4.setBackground(Color.RED);
                    break;
                case "B5":
                    GheB5.setBackground(Color.RED);
                    break;
                case "B6":
                    GheB6.setBackground(Color.RED);
                    break;
                case "B7":
                    GheB7.setBackground(Color.RED);
                    break;
                case "B8":
                    GheB8.setBackground(Color.RED);
                    break;
                case "C1":
                    GheC1.setBackground(Color.RED);
                    break;
                case "C2":
                    GheC2.setBackground(Color.RED);
                    break;
                case "C3":
                    GheC3.setBackground(Color.RED);
                    break;
                case "C4":
                    GheC4.setBackground(Color.RED);
                    break;
            }
        }
    }
    
    // Phương thức để cập nhật danh sách ghế đã đặt
    public void setReservedSeats(List<String> reservedSeats) {
        this.reservedSeats = reservedSeats;
        highlightReservedSeats();
    }

    // Phương thức để tải danh sách ghế đã đặt từ TicketController
    public void loadReservedSeats(int screeningId) {
        // Lấy danh sách ghế đã đặt từ TicketController
        reservedSeats = ticketController.getReservedSeats(screeningId);
        // Cập nhật giao diện người dùng để tô đỏ các ghế đã đặt
        setReservedSeats(reservedSeats);
    }

    public void setScreeningId(int screeningId) {
        this.screeningId = screeningId;
        loadReservedSeats(screeningId); // Gọi loadReservedSeats khi screeningId được thiết lập
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
    private javax.swing.JButton backBut;
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
