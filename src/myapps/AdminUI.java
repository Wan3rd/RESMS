/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myapps;

/**
 *
 * @author DESKTOP
 */
public class AdminUI extends javax.swing.JFrame {

   
    public AdminUI() {
        initComponents();
        setLocationRelativeTo(null); // Center the form on the screen
        pack(); // Pack the components to their preferred sizes
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        greetingUser = new javax.swing.JLabel();
        managelotsbtn = new javax.swing.JButton();
        managecustomersbtn = new javax.swing.JButton();
        generatereportbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        managepurchasesbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(102, 102, 102));
        Panel.setPreferredSize(new java.awt.Dimension(1200, 700));

        greetingUser.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 48)); // NOI18N
        greetingUser.setText("Welcome to RESMS!");

        managelotsbtn.setBackground(new java.awt.Color(204, 204, 255));
        managelotsbtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        managelotsbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/buy_lot_logo.png"))); // NOI18N
        managelotsbtn.setText("  Manage Lots");
        managelotsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managelotsbtnActionPerformed(evt);
            }
        });

        managecustomersbtn.setBackground(new java.awt.Color(204, 204, 255));
        managecustomersbtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        managecustomersbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/view_lot_logo.png"))); // NOI18N
        managecustomersbtn.setText(" Manage Users");
        managecustomersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managecustomersbtnActionPerformed(evt);
            }
        });

        generatereportbtn.setBackground(new java.awt.Color(204, 204, 255));
        generatereportbtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        generatereportbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/settings_logo.png"))); // NOI18N
        generatereportbtn.setText(" Generate Report");
        generatereportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatereportbtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(204, 204, 255));
        logoutbtn.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/logout_logo.png"))); // NOI18N
        logoutbtn.setText("  Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        managepurchasesbtn.setBackground(new java.awt.Color(204, 204, 255));
        managepurchasesbtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        managepurchasesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/rent_logo.png"))); // NOI18N
        managepurchasesbtn.setText(" Manage Purchases");
        managepurchasesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managepurchasesbtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Announcement");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("Dear Admin Users,");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("We would like to inform you that our real estate system will undergo scheduled \nmaintenance on October 28, 2024, from 12:00 AM to 4:00 AM. During this period, \nthe system will be temporarily unavailable. This maintenance is essential to improve \nsystem performance, security, and introduce new features.\n\nPlease ensure that you have saved all your work and logged out of the system \nbefore the scheduled downtime. We apologize for any inconvenience this may \ncause and appreciate your understanding.\n\nThank you for your cooperation.\n\nBest regards,\nThe IT Support Team\nReal Estate System");
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutbtn)
                .addContainerGap())
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managelotsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(managecustomersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(managepurchasesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generatereportbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(greetingUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(greetingUser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(managelotsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(managepurchasesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(managecustomersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generatereportbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addComponent(logoutbtn)
                .addContainerGap())
        );

        getContentPane().add(Panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managelotsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managelotsbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        ManageLotGUI mng = new ManageLotGUI();
        mng.setVisible(true);
    }//GEN-LAST:event_managelotsbtnActionPerformed

    private void managecustomersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managecustomersbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ManageCustomersGUI managecustom = new ManageCustomersGUI();
        managecustom.setVisible(true);
    }//GEN-LAST:event_managecustomersbtnActionPerformed

    private void generatereportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatereportbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ManageReportGUI managereport = new ManageReportGUI();
        managereport.setVisible(true);
    }//GEN-LAST:event_generatereportbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:

        this.dispose();
        loginPanel login = new loginPanel();
        login.setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void managepurchasesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managepurchasesbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        ManagePurchasesGUI mgpurch = new ManagePurchasesGUI();
        mgpurch.setVisible(true);
    }//GEN-LAST:event_managepurchasesbtnActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton generatereportbtn;
    private javax.swing.JLabel greetingUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton managecustomersbtn;
    private javax.swing.JButton managelotsbtn;
    private javax.swing.JButton managepurchasesbtn;
    // End of variables declaration//GEN-END:variables
}
