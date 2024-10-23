package main.cinemaproject.view.Admin;

import java.sql.Connection;
import main.cinemaproject.controller.MovieController;
import main.cinemaproject.model.Movie;
import main.cinemaproject.model.MovieStatistics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.cinemaproject.utils.JBDCUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 *
 * @author DinhAn
 */
public class DoanhThu extends javax.swing.JPanel {

    private MovieController movieController;

    /**
     * Creates new form DoanhThu
     */
    public DoanhThu() {
        initComponents();
        movieController = new MovieController();
        loadMovies();
        loadMovieStatistics();
    }

    private void loadMovies() {
        ArrayList<Movie> movies = movieController.getAllMovies();
        BoxChonPhim.removeAllItems();
        BoxChonPhim.addItem("Tất cả phim");
        for (Movie movie : movies) {
            BoxChonPhim.addItem(movie.getName());
        }
    }
    
    private void loadMovieStatistics() {
        List<MovieStatistics> movieStatsList = movieController.getMovieStatistics();
        updateTable(movieStatsList);
    }
    
    private void updateTable(List<MovieStatistics> movieStatsList) {
        DefaultTableModel model = (DefaultTableModel) BangDoanhThu.getModel();
        model.setRowCount(0); // Clear existing data
        
        for (MovieStatistics stats : movieStatsList) {
            model.addRow(new Object[]{
                stats.getMovieName(),
                stats.getDirector(),
                stats.getReleaseDate(),
                stats.getTotalTicketsSold(),
                stats.getTotalRevenue()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datefrom = new com.raven.datechooser.DateChooser();
        dateto = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        BoxChonPhim = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateToText = new javax.swing.JTextField();
        dateFromText = new javax.swing.JTextField();
        ThongKeBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangDoanhThu = new javax.swing.JTable();

        datefrom.setForeground(new java.awt.Color(27, 209, 59));
        datefrom.setTextRefernce(dateFromText);

        dateto.setForeground(new java.awt.Color(27, 209, 59));
        dateto.setTextRefernce(dateToText);

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(920, 650));
        setPreferredSize(new java.awt.Dimension(920, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Doanh Thu "));

        

        jLabel1.setText("Chọn Phim :");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Từ Ngày :");

        jLabel3.setText("Đến Ngày :");

        

       

        ThongKeBut.setText("Thống Kê");
        ThongKeBut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ThongKeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKeButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxChonPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateFromText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateToText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ThongKeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(dateToText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(dateFromText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ThongKeBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxChonPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 890, 120));

        BangDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên Phim", "Đạo Diễn", "Ngày Chiếu", "Số Vé Đã Bán", "Tổng Tiền Vé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BangDoanhThu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 810, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void ThongKeButActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedMovie = (String) BoxChonPhim.getSelectedItem();
        String fromDate = dateFromText.getText();
        String toDate = dateToText.getText();
        
        List<MovieStatistics> filteredStats;
        
        SimpleDateFormat userFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sqlFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date fromDateParsed = null;
            Date toDateParsed = null;
            
            if (!fromDate.isEmpty()) {
                fromDateParsed = userFormat.parse(fromDate);
            }
            if (!toDate.isEmpty()) {
                toDateParsed = userFormat.parse(toDate);
            }
            
            if (fromDateParsed != null && toDateParsed != null && toDateParsed.before(fromDateParsed)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ngày kết thúc không thể nhỏ hơn ngày bắt đầu.");
                return;
            }
            
            String sqlFromDate = (fromDateParsed != null) ? sqlFormat.format(fromDateParsed) : null;
            String sqlToDate = (toDateParsed != null) ? sqlFormat.format(toDateParsed) : null;
            
            if (selectedMovie.equals("Tất cả phim")) {
                if (sqlFromDate == null || sqlToDate == null) {
                    filteredStats = movieController.getMovieStatistics();
                } else {
                    filteredStats = movieController.getMovieStatistics(sqlFromDate, sqlToDate);
                }
            } else {
                if (sqlFromDate == null || sqlToDate == null) {
                    filteredStats = movieController.getMovieStatistics(selectedMovie);
                } else {
                    filteredStats = movieController.getMovieStatistics(selectedMovie, sqlFromDate, sqlToDate);
                }
            }
            
            updateTable(filteredStats);
        } catch (ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ. Vui lòng sử dụng dd-MM-yyyy");
        }
    }                                          


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangDoanhThu;
    private javax.swing.JComboBox<String> BoxChonPhim;
    private javax.swing.JButton ThongKeBut;
    private javax.swing.JTextField dateFromText;
    private javax.swing.JTextField dateToText;
    private com.raven.datechooser.DateChooser datefrom;
    private com.raven.datechooser.DateChooser dateto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
