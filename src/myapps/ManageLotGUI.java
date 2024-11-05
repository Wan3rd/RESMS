/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package myapps;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import mylibs.*;
import mylibs.Lot;
/**
 *
 * @author DESKTOP
 */
public class ManageLotGUI extends javax.swing.JFrame {
    
    private Lot lot; // Aggregation
    private ArrayList<Lot> lots;

    public ManageLotGUI() {
        lots = new ArrayList<>();
        initComponents();
        sortLots();
        updateTable();
        setLocationRelativeTo(null); // Center the form on the screen
        pack(); // Pack the components to their preferred sizes
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addLotBtn = new javax.swing.JButton();
        displayLotBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewLotsTable = new javax.swing.JTable();
        findLotBtn = new javax.swing.JButton();
        updateLotBtn = new javax.swing.JButton();
        changeLotStatusBtn = new javax.swing.JButton();
        deleteLotBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        managependingsnav = new javax.swing.JLabel();
        generatereportnav = new javax.swing.JLabel();
        managelotnav = new javax.swing.JLabel();
        managecustomersnav = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backbtn = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        addLotBtn.setBackground(new java.awt.Color(51, 51, 51));
        addLotBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addLotBtn.setForeground(new java.awt.Color(255, 255, 255));
        addLotBtn.setText("Add Lot");
        addLotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLotBtnActionPerformed(evt);
            }
        });

        displayLotBtn.setBackground(new java.awt.Color(51, 51, 51));
        displayLotBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        displayLotBtn.setForeground(new java.awt.Color(255, 255, 255));
        displayLotBtn.setText("Display Lots");
        displayLotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayLotBtnActionPerformed(evt);
            }
        });

        viewLotsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Block Number", "Lot Number", "Size (sqm)", "Price", "Status", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewLotsTable);
        if (viewLotsTable.getColumnModel().getColumnCount() > 0) {
            viewLotsTable.getColumnModel().getColumn(0).setResizable(false);
            viewLotsTable.getColumnModel().getColumn(1).setResizable(false);
            viewLotsTable.getColumnModel().getColumn(2).setResizable(false);
            viewLotsTable.getColumnModel().getColumn(3).setResizable(false);
            viewLotsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        findLotBtn.setBackground(new java.awt.Color(51, 51, 51));
        findLotBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        findLotBtn.setForeground(new java.awt.Color(255, 255, 255));
        findLotBtn.setText("Find Lot");
        findLotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findLotBtnActionPerformed(evt);
            }
        });

        updateLotBtn.setBackground(new java.awt.Color(51, 51, 51));
        updateLotBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        updateLotBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateLotBtn.setText("Update Lot");
        updateLotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLotBtnActionPerformed(evt);
            }
        });

        changeLotStatusBtn.setBackground(new java.awt.Color(51, 51, 51));
        changeLotStatusBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        changeLotStatusBtn.setForeground(new java.awt.Color(255, 255, 255));
        changeLotStatusBtn.setText("Change Lot Status");
        changeLotStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLotStatusBtnActionPerformed(evt);
            }
        });

        deleteLotBtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteLotBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        deleteLotBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteLotBtn.setText("Delete Lot");
        deleteLotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLotBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

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
        jPanel2.add(managependingsnav);
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
        jPanel2.add(generatereportnav);
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
        jPanel2.add(managelotnav);
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
        jPanel2.add(managecustomersnav);
        managecustomersnav.setBounds(710, 20, 240, 32);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(690, 10, 10, 50);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(250, 10, 10, 50);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3);
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
        jPanel2.add(backbtn);
        backbtn.setBounds(1130, 10, 48, 48);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addLotBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayLotBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findLotBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeLotStatusBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteLotBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateLotBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLotBtn)
                    .addComponent(displayLotBtn)
                    .addComponent(findLotBtn)
                    .addComponent(changeLotStatusBtn)
                    .addComponent(deleteLotBtn)
                    .addComponent(updateLotBtn)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteLotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLotBtnActionPerformed
        // TODO add your handling code here:
        deleteLot delLot = new deleteLot(Data.lots,this);
        delLot.setVisible(true);
    }//GEN-LAST:event_deleteLotBtnActionPerformed

    private void changeLotStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLotStatusBtnActionPerformed
        // TODO add your handling code here:
        changeStatus changestat = new changeStatus(Data.lots,this);
        changestat.setVisible(true);
    }//GEN-LAST:event_changeLotStatusBtnActionPerformed

    private void updateLotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLotBtnActionPerformed
        // TODO add your handling code here:
        updateLot updLot = new updateLot(Data.lots, this);
        updLot.setVisible(true);
    }//GEN-LAST:event_updateLotBtnActionPerformed

    private void findLotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findLotBtnActionPerformed
        // TODO add your handling code here:
        FindLotForm findLotForm = new FindLotForm(Data.lots, this);

        // Set the FindLotForm to be visible
        findLotForm.setVisible(true);
    }//GEN-LAST:event_findLotBtnActionPerformed

    // Display Button
    private void displayLotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayLotBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) viewLotsTable.getModel();
        model.setRowCount(0); // Reset table

        if (!Data.lots.isEmpty()) {
            // Loop through the ArrayList of lots and add each lot as a row in the table
            for (Lot lot : Data.lots)
            {
                Object[] rowData =
                {
                    lot.getBlock(),     // Block Number
                    lot.getLotNumber(), // Lot Number
                    lot.getSize(),      // Size in sqm
                    lot.getPrice(),     // Price in PHP
                    lot.getStatus(),      // Status
                    lot.getLocation()
                };
                model.addRow(rowData); // Add row to table
      
            }
        } else
        {
            // Show a message if no lots are added yet
            JOptionPane.showMessageDialog(this, "No lot information available. Please add a lot first.");
        }
    }//GEN-LAST:event_displayLotBtnActionPerformed

    // Add Lot Button
    private void addLotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLotBtnActionPerformed
        addLot aL = new addLot(Data.lots, this);
        aL.setVisible(true);
    }//GEN-LAST:event_addLotBtnActionPerformed

    private void managependingsnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managependingsnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManagePurchasesGUI managepurchases = new ManagePurchasesGUI();
        managepurchases.setVisible(true);
    }//GEN-LAST:event_managependingsnavMouseClicked

    private void managelotnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managelotnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageLotGUI managelot = new ManageLotGUI();
        managelot.setVisible(true);
    }//GEN-LAST:event_managelotnavMouseClicked

    private void managecustomersnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managecustomersnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageCustomersGUI managecustomers = new ManageCustomersGUI();
        managecustomers.setVisible(true);
    }//GEN-LAST:event_managecustomersnavMouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminUI admin = new AdminUI();
        admin.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

    private void generatereportnavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatereportnavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManageReportGUI manage = new ManageReportGUI();
        manage.setVisible(true);
    }//GEN-LAST:event_generatereportnavMouseClicked

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

    // Hover
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

    
    private void filterLots(String searchQuery) {
    DefaultTableModel model = (DefaultTableModel) viewLotsTable.getModel();
    model.setRowCount(0); // Clear the table

    for (Lot lot : Data.lots) {
        // Check if lot matches the search criteria
        if (String.valueOf(lot.getBlock()).contains(searchQuery) ||
            String.valueOf(lot.getLotNumber()).contains(searchQuery) ||
            lot.getLocation().toLowerCase().contains(searchQuery) ||
            String.valueOf(lot.getSize()).contains(searchQuery) ||
            String.valueOf(lot.getPrice()).contains(searchQuery) ||
            lot.getStatus().toLowerCase().contains(searchQuery)) {
            // Add matching lots to the table
            model.addRow(new Object[]{
                lot.getBlock(),
                lot.getLotNumber(),
                lot.getSize(),
                lot.getPrice(),
                lot.getStatus(),
                lot.getLocation()
            });
        }
    }
}
    
    
    //Found Lot Function
    public void updateTableFoundLot(Lot foundLot) 
    {
        DefaultTableModel model = (DefaultTableModel) viewLotsTable.getModel();
        model.setRowCount(0); // Clear the table

        // Add only the found lot to the table
        Object[] rowData = 
        {
            foundLot.getBlock(),     // Block Number
            foundLot.getLotNumber(), // Lot Number
            foundLot.getSize(),      // Size in sqm
            foundLot.getPrice(),     // Price in PHP
            foundLot.getStatus(),
            foundLot.getLocation()// Status
        };
        model.addRow(rowData); // Add found lot to the table
    }
    
    public void updateTable()   
    {
        DefaultTableModel model = (DefaultTableModel) viewLotsTable.getModel();

            // Clear existing rows
        model.setRowCount(0);

            // Add new rows from the lots ArrayList
        for (Lot lot : Data.lots) 
        {
            model.addRow(new Object[]{lot.getBlock(), lot.getLotNumber(), lot.getSize(), lot.getPrice(), lot.getStatus(), lot.getLocation()});
        }
    }
    
    

    public void refreshTable() 
    {
        DefaultTableModel model = (DefaultTableModel) viewLotsTable.getModel();
        model.setRowCount(0); // Clear the table

        // Add all lots back into the table
        for (Lot lot : Data.lots) 
        {
            Object[] rowData = 
            {
                lot.getBlock(),     // Block Number
                lot.getLotNumber(), // Lot Number
                lot.getSize(),      // Size in sqm
                lot.getPrice(),     // Price in PHP
                lot.getStatus(),      // Status
                lot.getLocation()
            };
            model.addRow(rowData); // Add each lot to the table
        }
    }

    public void sortLots() {
    Collections.sort(Data.lots, new Comparator<Lot>() {
        @Override
        public int compare(Lot lot1, Lot lot2) {
            // First, compare by block number
            int blockComparison = Integer.compare(lot1.getBlock(), lot2.getBlock());
            if (blockComparison != 0) {
                return blockComparison; // If blocks are not equal, return comparison result
            }
            // If block numbers are equal, compare by lot number
            return Integer.compare(lot1.getLotNumber(), lot2.getLotNumber());
        }
    });
    refreshTable(); // Refresh the table after sorting
    }
    
    public javax.swing.table.DefaultTableModel getLotsTableModel() {
        return (javax.swing.table.DefaultTableModel) viewLotsTable.getModel();
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLotBtn;
    private javax.swing.JLabel backbtn;
    private javax.swing.JButton changeLotStatusBtn;
    private javax.swing.JButton deleteLotBtn;
    private javax.swing.JButton displayLotBtn;
    private javax.swing.JButton findLotBtn;
    private javax.swing.JLabel generatereportnav;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel managecustomersnav;
    private javax.swing.JLabel managelotnav;
    private javax.swing.JLabel managependingsnav;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateLotBtn;
    private javax.swing.JTable viewLotsTable;
    // End of variables declaration//GEN-END:variables
}
