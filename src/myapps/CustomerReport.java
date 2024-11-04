/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myapps;

import mylibs.Customer;
import static mylibs.Data.customers;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DESKTOP
 */
public class CustomerReport extends javax.swing.JFrame {

    public CustomerReport() {
        initComponents();
        setLocationRelativeTo(null); // Center the form on the screen
        pack(); // Pack the components to their preferred sizes
        displayCustomerReport();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        managependingsnav = new javax.swing.JLabel();
        generatereportnav = new javax.swing.JLabel();
        managelotnav = new javax.swing.JLabel();
        managecustomersnav = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel5.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel5.setLayout(null);

        managependingsnav.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        managependingsnav.setText("Manage Purchases");
        managependingsnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managependingsnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managependingsnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managependingsnavMouseExited(evt);
            }
        });
        jPanel5.add(managependingsnav);
        managependingsnav.setBounds(10, 20, 230, 30);

        generatereportnav.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        generatereportnav.setText("Generate Report");
        generatereportnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generatereportnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generatereportnavMouseExited(evt);
            }
        });
        jPanel5.add(generatereportnav);
        generatereportnav.setBounds(270, 20, 200, 32);

        managelotnav.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        managelotnav.setText("Manage Lots");
        managelotnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managelotnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managelotnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managelotnavMouseExited(evt);
            }
        });
        jPanel5.add(managelotnav);
        managelotnav.setBounds(520, 20, 160, 32);

        managecustomersnav.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        managecustomersnav.setText("Manage Users");
        managecustomersnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managecustomersnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managecustomersnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managecustomersnavMouseExited(evt);
            }
        });
        jPanel5.add(managecustomersnav);
        managecustomersnav.setBounds(710, 20, 240, 32);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(690, 10, 10, 50);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(250, 10, 10, 50);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator3);
        jSeparator3.setBounds(490, 10, 10, 50);

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/back.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbtnMouseExited(evt);
            }
        });
        jPanel5.add(backbtn);
        backbtn.setBounds(1130, 10, 48, 48);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managependingsnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managependingsnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManagePurchasesGUI managepurchases = new ManagePurchasesGUI();
        managepurchases.setVisible(true);
    }//GEN-LAST:event_managependingsnavMouseClicked

    private void managependingsnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managependingsnavMouseEntered
        // TODO add your handling code here:
        managependingsnav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_managependingsnavMouseEntered

    private void managependingsnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managependingsnavMouseExited
        // TODO add your handling code here:
        managependingsnav.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_managependingsnavMouseExited

    private void generatereportnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatereportnavMouseEntered
        // TODO add your handling code here:
        generatereportnav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_generatereportnavMouseEntered

    private void generatereportnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatereportnavMouseExited
        // TODO add your handling code here:
        generatereportnav.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_generatereportnavMouseExited

    private void managelotnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managelotnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageLotGUI managelot = new ManageLotGUI();
        managelot.setVisible(true);
    }//GEN-LAST:event_managelotnavMouseClicked

    private void managelotnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managelotnavMouseEntered
        // TODO add your handling code here:
        managelotnav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_managelotnavMouseEntered

    private void managelotnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managelotnavMouseExited
        // TODO add your handling code here:
        managelotnav.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_managelotnavMouseExited

    private void managecustomersnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managecustomersnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageCustomersGUI managecustomers = new ManageCustomersGUI();
        managecustomers.setVisible(true);
    }//GEN-LAST:event_managecustomersnavMouseClicked

    private void managecustomersnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managecustomersnavMouseEntered
        // TODO add your handling code here:
        managecustomersnav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_managecustomersnavMouseEntered

    private void managecustomersnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managecustomersnavMouseExited
        // TODO add your handling code here:
        managecustomersnav.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_managecustomersnavMouseExited

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageReportGUI manage = new ManageReportGUI();
        manage.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
        // TODO add your handling code here:
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_backbtnMouseEntered

    private void backbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseExited
        // TODO add your handling code here:
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_backbtnMouseExited

    
    private void displayCustomerReport() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDate = LocalDate.now().format(dateFormatter);

        StringBuilder report = new StringBuilder();
        report.append("Customers Report\n\n")
          .append("Total Customers: \t").append(customers.size()).append("\n\n")
          .append("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n")
          .append("\t\t\tCustomer List\n")
          .append("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");

        // Table Header
        report.append(String.format("%-15s %-25s %-10s %-15s %-30s %-40s\n", 
            "Username", "Name", "Gender", "Contact", "Email", "Address"))
              .append("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

       
        for (Customer customer : customers) {
            report.append(String.format("%-15s %-25s %-10s %-15s %-30s %-40s\n",
                    customer.getUsername(),
                    customer.getCustomerName(),
                    customer.getGender(),
                    customer.getContactNumber(),
                    customer.getEmail(),
                    customer.getAddress()));
        }

        // Append end of report message
        report.append("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n")
              .append("End of report!\n")
              .append("Generated on ").append(currentDate);

            // Display the formatted report in jTextArea1
            jTextArea1.setText(report.toString());
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel generatereportnav;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel managecustomersnav;
    private javax.swing.JLabel managelotnav;
    private javax.swing.JLabel managependingsnav;
    // End of variables declaration//GEN-END:variables
}
