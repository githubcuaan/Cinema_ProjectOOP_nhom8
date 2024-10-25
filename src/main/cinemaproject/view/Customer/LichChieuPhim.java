package main.cinemaproject.view.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import main.cinemaproject.controller.MovieController;
import main.cinemaproject.controller.ScreeningStatusController;
import main.cinemaproject.model.Movie;
import main.cinemaproject.model.ScreeningInfo;

/**
 *
 * @author DinhAn
 */
public class LichChieuPhim extends javax.swing.JPanel {
    
    MovieController movieController;
    ScreeningStatusController screeningStatusController;

    public LichChieuPhim() {
        initComponents();
        movieController = new MovieController();
        screeningStatusController = new ScreeningStatusController();
        loadMovies();
        loadTheaters();
    }

    private void loadMovies() {
        
        List<Movie> movies = movieController.getAllMovies();
        BoxChonPhim.removeAllItems();
        for (Movie movie : movies) {
            BoxChonPhim.addItem(movie.getName());
        }
    }

    private void loadTheaters() {
        List<String> theaters = screeningStatusController.getAllTheaters();

        BoxChonRap.removeAllItems();
        for (String theater : theaters) {
            BoxChonRap.addItem(theater);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BoxChonPhim = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dateChoose = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BoxChonRap = new javax.swing.JComboBox<>();
        findBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangChieuPhim = new javax.swing.JTable();

        dateChooser1.setForeground(new java.awt.Color(0, 204, 51));
        dateChooser1.setTextRefernce(dateChoose);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Lịch Chiếu Phim");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(333, 333, 333))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Phim Đang Chiếu"));

        jLabel1.setText("Phim :");

        BoxChonPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxChonPhimActionPerformed(evt);
            }
        });

        jLabel2.setText("Thời Gian :");

        dateChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateChooseActionPerformed(evt);
            }
        });

        jLabel3.setText("Cụm Rạp :");

        findBut.setText("Tìm Kiếm");
        findBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxChonPhim, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChoose)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BoxChonRap, 0, 178, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(findBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxChonPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxChonRap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(findBut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 600));

        BangChieuPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cụm Rạp", "Tên Phim", "Giờ Chiếu", "Giá Vé", "Tình Trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BangChieuPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangChieuPhimMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BangChieuPhim);
        if (BangChieuPhim.getColumnModel().getColumnCount() > 0) {
            BangChieuPhim.getColumnModel().getColumn(0).setResizable(false);
            BangChieuPhim.getColumnModel().getColumn(1).setResizable(false);
            BangChieuPhim.getColumnModel().getColumn(2).setResizable(false);
            BangChieuPhim.getColumnModel().getColumn(3).setResizable(false);
            BangChieuPhim.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 720, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void BangChieuPhimMouseClicked(java.awt.event.MouseEvent evt) {
        int row = BangChieuPhim.getSelectedRow();
        if (row != -1) {
            String selectedMovie = (String) BoxChonPhim.getSelectedItem();
            if (selectedMovie == null) {
                JOptionPane.showMessageDialog(this, "Please select a movie first.");
                return; // Exit if no movie is selected
            }
            String theater = (String) BoxChonRap.getSelectedItem();
            String date = dateChoose.getText();
            String showtime = (String) BangChieuPhim.getValueAt(row, 2);
            
            // Convert the date format from dd-MM-yyyy to yyyy-MM-dd for SQL
            SimpleDateFormat userDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat sqlDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = "";
            try {
                Date parsedDate = userDateFormat.parse(date);
                formattedDate = sqlDateFormat.format(parsedDate);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Invalid date format. Please use dd-MM-yyyy.");
                return; // Exit if the date format is invalid
            }

            int screeningStatusId = screeningStatusController.getScreeningStatusId(theater, formattedDate, showtime);
            if (screeningStatusId != 0) {
                // Chuyển đến ChonGheNgoi
                int tabIndex = 1;
                JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
                tabbedPane.setSelectedIndex(tabIndex);

                int ThanhToanIndex = 3;
                ThanhToan thanhToan = (ThanhToan) tabbedPane.getComponentAt(ThanhToanIndex);
                thanhToan.setScreeningStatusId(screeningStatusId);
                
                ChonGheNgoi chonGheNgoi = (ChonGheNgoi) tabbedPane.getComponentAt(tabIndex);
                chonGheNgoi.setScreeningId(screeningStatusId);
                System.out.println(screeningStatusId);
                chonGheNgoi.setInfo(theater, selectedMovie, showtime, formattedDate);
            } else {
                JOptionPane.showMessageDialog(this, "Screening status ID not found.");
            }
        }
    }
    
    private void findButActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedMovie = (String) BoxChonPhim.getSelectedItem();
        String selectedTheater = (String) BoxChonRap.getSelectedItem();
        String selectedDate = dateChoose.getText();

        // Convert the date format from dd-MM-yyyy to yyyy-MM-dd for SQL
        SimpleDateFormat userDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sqlDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = "";
        try {
            Date date = userDateFormat.parse(selectedDate);
            formattedDate = sqlDateFormat.format(date);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use dd-MM-yyyy.");
            return;
        }

        ScreeningStatusController screeningController = new ScreeningStatusController();
        List<ScreeningInfo> screeningInfoList = screeningController.getScreeningInfo(selectedMovie, selectedTheater, formattedDate);

        DefaultTableModel model = (DefaultTableModel) BangChieuPhim.getModel();
        model.setRowCount(0);

        for (ScreeningInfo info : screeningInfoList) {
            model.addRow(new Object[]{
                info.getTheater(),
                info.getMovieName(),
                info.getShowtime(),
                info.getPrice(),
                info.getStatus()
            });
        }
    }

    private void dateChooseActionPerformed(java.awt.event.ActionEvent evt)
    {}
    
    private void BoxChonPhimActionPerformed(java.awt.event.ActionEvent evt)
    {}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangChieuPhim;
    private javax.swing.JComboBox<String> BoxChonPhim;
    private javax.swing.JComboBox<String> BoxChonRap;
    private javax.swing.JTextField dateChoose;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton findBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
