/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myapps;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mylibs.Data;
import mylibs.Lot;

/**
 *
 * @author DESKTOP
 */
public class ReserveLot extends javax.swing.JFrame {

    
    private Lot lot;
    private ManageLotGUI mainGUI;
    private ArrayList<Lot> lots;
    private String username;

    public ReserveLot(String username) {
        initComponents();
        this.username = username;
        lots = new ArrayList<>();
        displayAvailableLots();
        setLocationRelativeTo(null); // Center the form on the screen
        pack(); // Pack the components to their preferred sizes
        backbtn.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backbtn = new javax.swing.JButton();
        greetingUser = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        availablelots = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backbtn.setBackground(new java.awt.Color(204, 204, 255));
        backbtn.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/logout_logo.png"))); // NOI18N
        backbtn.setText(" Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        greetingUser.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        greetingUser.setText("Available Lots");

        availablelots.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Block Number", "Lot Number", "Size (sqm)", "Price (Php)", "Status", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        availablelots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availablelotsMouseClicked(evt);
            }
        });
        availablelots.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                availablelotsKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(availablelots);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Double Click to Select the Lot you want to Reserve");

        searchField.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText(" Search...");
        searchField.setMaximumSize(new java.awt.Dimension(1200, 700));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greetingUser, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(greetingUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(backbtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void availablelotsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablelotsMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            // Get selected row index
            int selectedRow = availablelots.getSelectedRow();

            // Extract blocknum and lotnum as integers from the selected row
            int blocknum = Integer.parseInt(availablelots.getValueAt(selectedRow, 0).toString()); // Block Number
            int lotnum = Integer.parseInt(availablelots.getValueAt(selectedRow, 1).toString());   // Lot Number

            // Retrieve the chosen Lot object using the blocknum and lotnum
            Lot selectedLot = Data.chosenLot(blocknum, lotnum);

            // Pass the selectedLot to the ViewDetails form
            ReserveDetails resdet = new ReserveDetails(selectedLot, username);
            resdet.setVisible(true); // Show the ViewDetails form
            this.dispose(); // Close current form if needed
        }
    }//GEN-LAST:event_availablelotsMouseClicked

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CustomerUI custom = new CustomerUI(username);
        custom.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void availablelotsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availablelotsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_availablelotsKeyTyped

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

    
    
    private void filterLots(String query) {
    DefaultTableModel model = (DefaultTableModel) availablelots.getModel();
    model.setRowCount(0); // Clear the current rows in the table

    // Loop through the list of lots and add rows that match the query
    for (Lot lot : Data.lots) {
        if (lotMatchesSearch(lot, query)) {
            Object[] rowData = {
                lot.getBlock(),     // Block Number
                lot.getLotNumber(), // Lot Number
                lot.getSize(),      // Size in sqm
                lot.getPrice(),     // Price in PHP
                lot.getStatus(),    // Status
                lot.getLocation()   // Location
            };
            model.addRow(rowData); // Add matching lot to the table
        }
    }
}

// Helper method to check if a lot matches the search query
    private boolean lotMatchesSearch(Lot lot, String query) 
    {
        // Convert all attributes to strings and check if any of them contain the search query
        return String.valueOf(lot.getBlock()).contains(query)  // Convert block number to string
            || String.valueOf(lot.getLotNumber()).contains(query)  // Convert lot number to string
            || String.valueOf(lot.getSize()).contains(query)  // Convert size to string
            || String.valueOf(lot.getPrice()).contains(query)  // Convert price to string
            || lot.getStatus().toLowerCase().contains(query)  // Status is likely already a string
            || lot.getLocation().toLowerCase().contains(query);  // Location is likely already a string
    }
    
    private void displayAvailableLots() {                                              
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) availablelots.getModel();
        model.setRowCount(0); // Reset table

        if (!Data.lots.isEmpty()) {
            // Loop through the ArrayList of lots and add only available lots as rows in the table
            for (Lot lot : Data.lots)
            {
                // Check if the lot is available
                if ("Available".equalsIgnoreCase(lot.getStatus())) {
                    Object[] rowData =
                    {
                        lot.getBlock(),     // Block Number
                        lot.getLotNumber(), // Lot Number
                        lot.getSize(),      // Size in sqm
                        lot.getPrice(),     // Price in PHP
                        lot.getStatus(),    // Status
                        lot.getLocation()   // Location
                    };
                    model.addRow(rowData); // Add row to table
                }
            }

            // Check if no available lots were added to the table
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No available lots to display.");
            }
        } else {
            // Show a message if no lots are added yet
            JOptionPane.showMessageDialog(this, "No lot information available. Please add a lot first.");
        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availablelots;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel greetingUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
