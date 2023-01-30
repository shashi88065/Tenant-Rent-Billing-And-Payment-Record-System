
package TenantRentBillingSystem;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PayRent extends javax.swing.JFrame {

    
    public PayRent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rn1 = new javax.swing.JTextField();
        hn1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Rb1 = new javax.swing.JTextField();
        Ub1 = new javax.swing.JTextField();
        Eb1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Bl1 = new javax.swing.JTextField();
        Ttl1 = new javax.swing.JTextField();
        Ebill = new javax.swing.JButton();
        Ttl = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        plmr = new javax.swing.JTextField();
        pcmr = new javax.swing.JTextField();
        UnitB = new javax.swing.JButton();
        ResetB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        pym1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jblc = new javax.swing.JTextField();
        psts = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        blcr = new javax.swing.JTextArea();
        fdate = new com.toedter.calendar.JDateChooser();
        tdate = new com.toedter.calendar.JDateChooser();
        saveB = new javax.swing.JButton();
        printB = new javax.swing.JButton();
        jP7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta1 = new javax.swing.JTextArea();
        srch = new javax.swing.JTextField();
        srchB = new javax.swing.JButton();
        updtB = new javax.swing.JButton();
        viewR = new javax.swing.JButton();

        label1.setText("label1");

        label2.setText("label2");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(210, 120));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("PAYMENT ENTRY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("House No");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Room No.");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Room Rent");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Balance");

        Ebill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ebill.setText("Elec. Bill");
        Ebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EbillActionPerformed(evt);
            }
        });

        Ttl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ttl.setText("Total");
        Ttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("LMR");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("CMR");

        UnitB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UnitB.setText("Unit       ");
        UnitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitBActionPerformed(evt);
            }
        });

        ResetB.setText("Reset");
        ResetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plmr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcmr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bl1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(UnitB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ebill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ub1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ttl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResetB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Ttl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(plmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(pcmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnitB))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ebill)
                    .addComponent(Eb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Bl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ttl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ttl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResetB)
                .addGap(8, 8, 8))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Pay Mode");

        pym1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pym1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Pay Status");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("From");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Till");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Bal. Amt");

        psts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Balance" }));

        blcr.setColumns(20);
        blcr.setRows(5);
        jScrollPane3.setViewportView(blcr);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(1, 1, 1))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel15))
                                    .addGap(8, 8, 8)))
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(jblc)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(pym1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(psts, 0, 80, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(fdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(hn1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rn1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(hn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13))
                                .addComponent(fdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(pym1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(psts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jblc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        saveB.setText("Save");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });

        printB.setText("Print");
        printB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBActionPerformed(evt);
            }
        });

        jP7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jta1.setColumns(20);
        jta1.setRows(5);
        jScrollPane1.setViewportView(jta1);

        javax.swing.GroupLayout jP7Layout = new javax.swing.GroupLayout(jP7);
        jP7.setLayout(jP7Layout);
        jP7Layout.setHorizontalGroup(
            jP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        jP7Layout.setVerticalGroup(
            jP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        srch.setForeground(new java.awt.Color(153, 153, 153));
        srch.setText("Enter room number");
        srch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                srchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                srchFocusLost(evt);
            }
        });
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });

        srchB.setText("Search");
        srchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchBActionPerformed(evt);
            }
        });

        updtB.setText("Update");
        updtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtBActionPerformed(evt);
            }
        });

        viewR.setText("View Record");
        viewR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(srch, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(viewR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updtB)
                            .addComponent(srchB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveB, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jP7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jP7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(printB)
                                    .addComponent(updtB)
                                    .addComponent(viewR))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(saveB)
                                    .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(srchB))))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBActionPerformed
        try {
            jta1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PayRent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printBActionPerformed

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        if(evt.getSource()== saveB)
        {  
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
                String s = "insert into p1(phn,prn,pf,pt,pnm,pmd,pst,blcamt,prnt,plmr,pcmr,punt,pebl,pblc,pttl,pblcr) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(s);
                ps.setString(1, hn1.getText());
                ps.setString(2, rn1.getText());
                ps.setString(3, fdate.getDate().toString());
                ps.setString(4, tdate.getDate().toString());
                ps.setString(5, name.getText());
                ps.setString(6, pym1.getText());
                ps.setString(7, psts.getSelectedItem().toString());
                ps.setString(8, jblc.getText());
                ps.setString(9, Rb1.getText());
                ps.setString(10, plmr.getText());
                ps.setString(11, pcmr.getText());
                ps.setString(12, Ub1.getText());
                ps.setString(13, Eb1.getText());
                ps.setString(14, Bl1.getText());
                ps.setString(15, Ttl1.getText());
                ps.setString(16, blcr.getText());

                
                //ResultSet rs = ps.executeQuery();
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "saved successfully!");
            }catch(Exception e){
                System.out.print(e);
        } 
    }                                  

//*******************for reciept*************************************** 
       jta1.setText("***********************************************************\n");
       jta1.setText(jta1.getText()+"                     PAYMENT RECIEPT                      \n");
       jta1.setText(jta1.getText()+"***********************************************************\n");
       
       Date obj=new Date();
      // String date=obj.toString();
       SimpleDateFormat dateForm=new SimpleDateFormat("MM/dd/Y HH:MM");
       dateForm.format(obj);
       
       //jta1.setText(jta1.getText()+"\n"+"                         "+dateForm.format(obj)+"\n\n");
      // jta1.setText(jta1.getText()+"***********************************************************\n");
       jta1.setText(jta1.getText()+"Payer:  "+name.getText());
       jta1.setText(jta1.getText()+"                        "+dateForm.format(obj)+"\n");
       jta1.setText(jta1.getText()+"H.No.:  "+hn1.getText()+"\n");
       jta1.setText(jta1.getText()+"Room No:  "+rn1.getText()+"\n");
       //jta1.setText(jta1.getText()+.getText()+"\n");
       jta1.setText(jta1.getText()+"---------------------------------------------------------------------\n");
       jta1.setText(jta1.getText()+"---------------------------------------------------------------------\n");

      // jta1.setText(jta1.getText()+fdate.getDate().toString()+"     ");
       //jta1.setText(jta1.getText()+tdate.getDate().toString()+"\n");
       jta1.setText(jta1.getText()+"Room Rent:                                                 "+Rb1.getText()+"\n\n");
       jta1.setText(jta1.getText()+"Meter Unit                                                     "+Ub1.getText()+"\n\n");
       jta1.setText(jta1.getText()+"Elect Bill                                                     "+Eb1.getText()+"\n\n");
       jta1.setText(jta1.getText()+"Bal. Amt                                                       "+Bl1.getText()+"\n\n");
       
       jta1.setText(jta1.getText()+"---------------------------------------------------------------------\n");
       jta1.setText(jta1.getText()+"Total                                                          "+Ttl1.getText()+"\n");
       jta1.setText(jta1.getText()+"---------------------------------------------------------------------\n");
       
       jta1.setText(jta1.getText()+"Pay Mode                                                        "+pym1.getText()+"\n");
       jta1.setText(jta1.getText()+"---------------------------------------------------------------------\n");
       
       jta1.setText(jta1.getText()+"Pay status                                                      "+psts.getSelectedItem().toString()+"\n");
       jta1.setText(jta1.getText()+"---------------------------------------------------------------------\n");
       
       jta1.setText(jta1.getText()+"Bal. Amt                                                         "+jblc.getText()+"\n");
       jta1.setText(jta1.getText()+"***********************************************************\n");
       jta1.setText(jta1.getText()+"                          THANK YOU                               \n");
       jta1.setText(jta1.getText()+"***********************************************************");
       
    }//GEN-LAST:event_saveBActionPerformed

    private void viewRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRActionPerformed
        if(evt.getSource()==viewR){
            setVisible(false);
            new PaymentRecord ().setVisible(true);
        }
    }//GEN-LAST:event_viewRActionPerformed

    private void srchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchBActionPerformed
       
        String a=srch.getText();
        if("".equals(a)){
            JOptionPane.showMessageDialog(null, "Enter something to search");
        }
        else if(evt.getSource()==srchB){ try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
            String s ="select* from p1 where prn=?";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, a);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                hn1.setText(rs.getString(2));
                rn1.setText(rs.getString(3));
                //fdate.setText(rs.getString(3));
                //tdate.setText(rs.getString(4));
                name.setText(rs.getString(6));
                pym1.setText(rs.getString(7));
                // psts.setSelectedItem(r); //setText(rs.getString(1));
                jblc.setText(rs.getString(9));
                Rb1.setText(rs.getString(10));
                plmr.setText(rs.getString(11));
                pcmr.setText(rs.getString(12));
                Ub1.setText(rs.getString(13));
                Eb1.setText(rs.getString(14));
                Bl1.setText(rs.getString(15));
                Ttl1.setText(rs.getString(16));
                blcr.setText(rs.getString(17));
            }else{
               JOptionPane.showMessageDialog(null, "No such record is found!\nPlease try again"); 
            }
            
        } catch (Exception e) {
            System.out.print(e);
        }
        }
    }//GEN-LAST:event_srchBActionPerformed

    private void updtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtBActionPerformed
        
        String a=srch.getText();
        if("".equals(a)){
            JOptionPane.showMessageDialog(null, "Enter to search");
        }
        else if(evt.getSource() == updtB){
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
            String s ="update p1 set phn=?,pnm=?,pmd=?,blcamt=?,prnt=?,plmr=?,pcmr=?,punt=?,pebl=?,pblc=?,pttl=?,pblcr=? where prn=? ";
            PreparedStatement ps = con.prepareStatement(s);
           // ps.setString(1, a);
           // ResultSet rs=ps.executeQuery();
         ps.setString(1, hn1.getText());
         ps.setString(2, name.getText());
        //  ps.setString(, rn1.getText());
         ps.setString(3, pym1.getText());
         ps.setString(4, jblc.getText());
         ps.setString(5, Rb1.getText());
         ps.setString(6, plmr.getText());
         ps.setString(7, pcmr.getText());
         ps.setString(8, Ub1.getText());
         ps.setString(9, Eb1.getText());
         ps.setString(10, Bl1.getText());
         ps.setString(11, Ttl.getText());
         ps.setString(12, blcr.getText());
          ps.setString(13, rn1.getText());
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null,"updated successfully!" );
            
        } catch (Exception e) {
            System.out.print(e);
        }
        }
    }//GEN-LAST:event_updtBActionPerformed

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchActionPerformed

    private void srchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srchFocusGained
        if(evt.getSource()==srch){
        if(srch.getText().equals("Enter room number")){
          srch.setText("");
         srch.setForeground(new Color(0,0,0));
          
      }
     }
    }//GEN-LAST:event_srchFocusGained

    private void srchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srchFocusLost
         if(evt.getSource()==srch){
        if(srch.getText().equals("")){
          srch.setText("Enter room number");
          srch.setForeground(new Color(153,153,153));
        }   
      }
    }//GEN-LAST:event_srchFocusLost

    private void pym1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pym1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pym1ActionPerformed

    private void ResetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBActionPerformed
        if(evt.getSource()==ResetB){
            hn1.setText("");
            rn1.setText("");
            name.setText("");
            pym1.setText("");
            jblc.setText("");
            Rb1.setText("");
            plmr.setText("");
            pcmr.setText("");
            Ub1.setText("");
            Eb1.setText("");
            Bl1.setText("");
            Ttl1.setText("");
            blcr.setText("");
            srch.setText("");
        }
    }//GEN-LAST:event_ResetBActionPerformed

    private void UnitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitBActionPerformed

        if(evt.getSource()==UnitB){
            double cmr= Double.parseDouble(pcmr.getText());
            double lmr= Double.parseDouble(plmr.getText());
            double unit=cmr-lmr;
            String t=unit+"";
            Ub1.setText(t);
        }

    }//GEN-LAST:event_UnitBActionPerformed

    private void TtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlActionPerformed
        if("".equals(Rb1.getText())||"".equals(Ub1.getText())||"".equals(Eb1.getText())||"".equals(Bl1.getText())){
            Ttl1.setText("0");
        }
        if(evt.getSource()==Ttl){
            double Rb = Double.parseDouble(Rb1.getText());
            double Ub = Double.parseDouble(Ub1.getText());
            double Eb = Ub * 10;
            double Bl = Double.parseDouble(Bl1.getText());
            double Ttl = Rb + Eb + Bl;
            String ttl = Ttl + "";
            Ttl1.setText(ttl);

        }

    }//GEN-LAST:event_TtlActionPerformed

    private void EbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EbillActionPerformed
        if(evt.getSource()==Ebill){
            double Ub= Double.parseDouble(Ub1.getText());
            double Eb=Ub*10;
            String t=Eb+"";
            Eb1.setText(t);

        }
    }//GEN-LAST:event_EbillActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayRent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bl1;
    private javax.swing.JTextField Eb1;
    private javax.swing.JButton Ebill;
    private javax.swing.JTextField Rb1;
    private javax.swing.JButton ResetB;
    private javax.swing.JButton Ttl;
    private javax.swing.JTextField Ttl1;
    private javax.swing.JTextField Ub1;
    private javax.swing.JButton UnitB;
    private javax.swing.JTextArea blcr;
    private com.toedter.calendar.JDateChooser fdate;
    private javax.swing.JTextField hn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jblc;
    private javax.swing.JTextArea jta1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pcmr;
    private javax.swing.JTextField plmr;
    private javax.swing.JButton printB;
    private javax.swing.JComboBox<String> psts;
    private javax.swing.JTextField pym1;
    private javax.swing.JTextField rn1;
    private javax.swing.JButton saveB;
    private javax.swing.JTextField srch;
    private javax.swing.JButton srchB;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JButton updtB;
    private javax.swing.JButton viewR;
    // End of variables declaration//GEN-END:variables
}
