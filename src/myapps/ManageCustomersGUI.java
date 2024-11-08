/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myapps;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mylibs.Customer;
import static mylibs.Data.customers;

/**
 *
 * @author DESKTOP
 */
public class ManageCustomersGUI extends javax.swing.JFrame {

  
    public ManageCustomersGUI() {
        initComponents();
        setLocationRelativeTo(null); // Center the form on the screen
        pack(); // Pack the components to their preferred sizes
        showCustomerDetails();
        deletebutton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        managependingsnav = new javax.swing.JLabel();
        generatereportnav = new javax.swing.JLabel();
        managelotnav = new javax.swing.JLabel();
        managecustomersnav = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backbtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        showfullname = new javax.swing.JLabel();
        showgender = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        showcontact = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        showemail = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showaddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        showusername = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/logout_logo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

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
        jPanel1.add(managependingsnav);
        managependingsnav.setBounds(10, 20, 230, 30);

        generatereportnav.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        generatereportnav.setText("Generate Report");
        generatereportnav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generatereportnavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generatereportnavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generatereportnavMouseExited(evt);
            }
        });
        jPanel1.add(generatereportnav);
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
        jPanel1.add(managelotnav);
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
        jPanel1.add(managecustomersnav);
        managecustomersnav.setBounds(710, 20, 240, 32);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(690, 10, 10, 50);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(250, 10, 10, 50);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3);
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
        jPanel1.add(backbtn);
        backbtn.setBounds(1130, 10, 48, 48);

        userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Full Name", "Password", "Gender", "Contact Number", "Email", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userstable.setGridColor(new java.awt.Color(0, 0, 0));
        userstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userstable);
        if (userstable.getColumnModel().getColumnCount() > 0) {
            userstable.getColumnModel().getColumn(2).setMaxWidth(150);
            userstable.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Currently Managing");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 10, 270, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Address");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 370, 80, 19);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Full Name");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 130, 110, 19);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Gender");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 190, 110, 19);

        showfullname.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel3.add(showfullname);
        showfullname.setBounds(10, 150, 270, 40);

        showgender.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel3.add(showgender);
        showgender.setBounds(10, 209, 200, 40);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Contact Number");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 250, 160, 19);

        showcontact.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel3.add(showcontact);
        showcontact.setBounds(10, 269, 180, 40);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setText("Email");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 310, 80, 19);

        showemail.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel3.add(showemail);
        showemail.setBounds(10, 329, 280, 40);

        deletebutton.setBackground(new java.awt.Color(255, 0, 0));
        deletebutton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton.setText("Delete Account");
        deletebutton.setBorder(null);
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel3.add(deletebutton);
        deletebutton.setBounds(70, 540, 160, 40);

        showaddress.setColumns(20);
        showaddress.setRows(5);
        jScrollPane2.setViewportView(showaddress);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 400, 280, 110);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Username");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 70, 110, 19);

        showusername.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel3.add(showusername);
        showusername.setBounds(10, 90, 270, 30);

        searchField.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText(" Search...");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userstableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = userstable.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex != -1) {
            // Get the model to extract data
            deletebutton.setEnabled(true);
            DefaultTableModel model = (DefaultTableModel) userstable.getModel();

            // Extract values from the selected row
            String username = model.getValueAt(selectedRowIndex, 0).toString();
            String customerName = model.getValueAt(selectedRowIndex, 1).toString();
            String gender = model.getValueAt(selectedRowIndex, 3).toString();
            String contactNumber = model.getValueAt(selectedRowIndex, 4).toString();
            String email = model.getValueAt(selectedRowIndex, 5).toString();
            String address = model.getValueAt(selectedRowIndex, 6).toString();

            // Set values to your display fields (Assume you have text fields like txtUsername, txtCustomerName, etc.)
            showusername.setText(username);
            showfullname.setText(customerName);
            showgender.setText(gender);
            showcontact.setText(contactNumber);
            showemail.setText(email);
            showaddress.setText(address);
        }
    }//GEN-LAST:event_userstableMouseClicked

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRowIndex = userstable.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex != -1) {
            // Confirm deletion
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this customer?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                // Remove from the table
                DefaultTableModel model = (DefaultTableModel) userstable.getModel();

                // Remove the corresponding customer from the list
                customers.remove(selectedRowIndex);  // Ensure your customers list is aligned with the table

                // Remove the row from the table model
                model.removeRow(selectedRowIndex);

                // Disable the Delete button after deletion
                deletebutton.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminUI admin = new AdminUI();
        admin.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

    private void managecustomersnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managecustomersnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageCustomersGUI managecustomers = new ManageCustomersGUI();
        managecustomers.setVisible(true);
    }//GEN-LAST:event_managecustomersnavMouseClicked

    private void managelotnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managelotnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageLotGUI managelot = new ManageLotGUI();
        managelot.setVisible(true);
    }//GEN-LAST:event_managelotnavMouseClicked

    private void managependingsnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managependingsnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManagePurchasesGUI managepurchases = new ManagePurchasesGUI();
        managepurchases.setVisible(true);
    }//GEN-LAST:event_managependingsnavMouseClicked

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if(searchField.getText().equals(" Search...")){
            searchField.setText("");
            searchField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if(searchField.getText().equals("")){
            searchField.setText(" Search...");
            searchField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        String searchQuery = searchField.getText().toLowerCase(); // Get the search query and convert to lowercase for case-insensitive search
        filterLots(searchQuery); // Call method to filter lots
    }//GEN-LAST:event_searchFieldKeyReleased

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

    private void managelotnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managelotnavMouseEntered
        // TODO add your handling code here:
        managelotnav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_managelotnavMouseEntered

    private void managelotnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managelotnavMouseExited
        // TODO add your handling code here:
        managelotnav.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_managelotnavMouseExited

    private void managecustomersnavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managecustomersnavMouseEntered
        // TODO add your handling code here:
        managecustomersnav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_managecustomersnavMouseEntered

    private void managecustomersnavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managecustomersnavMouseExited
        // TODO add your handling code here:
        managecustomersnav.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_managecustomersnavMouseExited

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
        // TODO add your handling code here:
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_backbtnMouseEntered

    private void backbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseExited
        // TODO add your handling code here:
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_backbtnMouseExited

    private void generatereportnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatereportnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageReportGUI manage = new ManageReportGUI();
        manage.setVisible(true);
    }//GEN-LAST:event_generatereportnavMouseClicked


    private void showCustomerDetails()
    {
        DefaultTableModel model = (DefaultTableModel) userstable.getModel();
        model.setRowCount(0); // Reset table
        
        for (Customer customer : customers) {
            model.addRow(new Object[] {
                    customer.getUsername(),
                    customer.getCustomerName(),
                    "*******", 
                    customer.getGender(),
                    customer.getContactNumber(),
                    customer.getEmail(),
                    customer.getAddress()
            });
        }
    }
    
    private void filterLots(String query) {
    DefaultTableModel model = (DefaultTableModel) userstable.getModel();
    model.setRowCount(0); // Reset the table before filtering
    
    for (Customer customer : customers) {
        // Check if any of the relevant fields contain the search query
        if (customer.getUsername().toLowerCase().contains(query) ||
            customer.getCustomerName().toLowerCase().contains(query) ||
            customer.getGender().toLowerCase().contains(query) || 
            customer.getContactNumber().toLowerCase().contains(query) ||
            customer.getEmail().toLowerCase().contains(query) ||
            customer.getAddress().toLowerCase().contains(query)) {
            
            // If a match is found, add the row to the table
            model.addRow(new Object[] {
                    customer.getUsername(),
                    customer.getCustomerName(),
                    "*******", 
                    customer.getGender(),
                    customer.getContactNumber(),
                    customer.getEmail(),
                    customer.getAddress()
            });
        }
    }
}
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbtn;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel generatereportnav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel managecustomersnav;
    private javax.swing.JLabel managelotnav;
    private javax.swing.JLabel managependingsnav;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea showaddress;
    private javax.swing.JLabel showcontact;
    private javax.swing.JLabel showemail;
    private javax.swing.JLabel showfullname;
    private javax.swing.JLabel showgender;
    private javax.swing.JLabel showusername;
    private javax.swing.JTable userstable;
    // End of variables declaration//GEN-END:variables
}
