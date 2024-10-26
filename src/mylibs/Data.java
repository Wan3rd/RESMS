/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

import java.util.ArrayList;
import mylibs.*;
import myapps.*;

/**
 *
 * @author DESKTOP
 */
public class Data 
{
    Lot lot = new Lot();
    public static ArrayList<Lot> lots = new ArrayList();
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Admin> admins = new ArrayList<>();
    public static ArrayList<Buy> buys = new ArrayList<>();
    public static ArrayList<Reserve> reserves = new ArrayList<>();
    public static ArrayList<Invoice> invoices = new ArrayList<>();
    public static ArrayList<Receipt> receipts = new ArrayList<>();
    
    
    public void addDefaultLots() 
    {
        lots.add(new Lot(1, 1, 150, 1500000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 2, 200, 2500000, "Reserved", "Green Meadows"));
        lots.add(new Lot(1, 3, 250, 3500000, "Available", "Palm Grove"));
        lots.add(new Lot(1, 4, 300, 4000000, "Available", "Palm Grove"));
        lots.add(new Lot(1, 5, 450, 6000000, "Available", "Cedar Hills"));
        lots.add(new Lot(1, 6, 500, 7000000, "Available", "Cedar Hills"));
        lots.add(new Lot(1, 7, 350, 4200000, "Reserved", "Sunset Valley"));
        lots.add(new Lot(1, 8, 400, 5500000, "Available", "Sunset Valley"));
        lots.add(new Lot(1, 9, 300, 3800000, "Available", "Lakeside Park"));
        lots.add(new Lot(1, 10, 370, 4900000, "Available", "Lakeside Park"));
        lots.add(new Lot(1, 11, 280, 3600000, "Available", "Willow Creek"));
        lots.add(new Lot(1, 12, 350, 4700000, "Reserved", "Willow Creek"));
        lots.add(new Lot(1, 13, 320, 4300000, "Available", "Riverbend"));
        lots.add(new Lot(1, 14, 400, 5000000, "Available", "Riverbend"));
        lots.add(new Lot(1, 15, 500, 7500000, "Available", "Oakwood"));
        lots.add(new Lot(1, 16, 550, 8200000, "Available", "Oakwood"));
        lots.add(new Lot(1, 17, 290, 3700000, "Available", "Pine Grove"));
        lots.add(new Lot(1, 18, 330, 4600000, "Reserved", "Pine Grove"));
        lots.add(new Lot(1, 19, 310, 4500000, "Available", "Maple Heights"));
        lots.add(new Lot(1, 20, 340, 4900000, "Available", "Maple Heights"));
    }

    public void defaultCustomer()
    {
        Customer customer = new Customer.Builder()
                .username("jcsamson")
                .password("jcsamson15")
                .customerName("John Carl Samson")
                .gender("Male")
                .contactNumber("09199767477")
                .email("wan3rd07@gmail.com")
                .address("151 Main St, Mandaluyong City")
                .build();

                customers.add(customer);
                
        Customer customer2 = new Customer.Builder()
                .username("user")
                .password("user123")
                .customerName("User")
                .gender("Male")
                .contactNumber("09199767477")
                .email("wan3rd07@gmail.com")
                .address("151 Main St, Mandaluyong City")
                .build();

                customers.add(customer2);        
                
        Admin admin = new Admin.Builder()
                .username("admin")
                .password("admin123")
                .adminName("John Carl Samson")
                .email("wantedspexz@gmail.com")
                .contactNumber("151 Aglipay St. Mandaluyong City")
                .build();
        
                admins.add(admin);
    }

    
    private static final String ADMIN_USERNAME = "123"; // Change as needed
    private static final String ADMIN_PASSWORD = "123"; // Change as needed
    
    public enum UserType {
        CUSTOMER,
        ADMIN,
        NONE
    }

    // Method to check if the username and password match any registered user
    public static UserType checkUser(String username, String password) {
        // Check customers first
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                return UserType.CUSTOMER; // Match found, it's a customer
            }
        }
        
        if (username.equals("12") && password.equals("12")) {
        return UserType.CUSTOMER; // Customer credentials match
        }

        // Check admins
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return UserType.ADMIN; // Match found, it's an admin
            }
        }
        
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            return UserType.ADMIN; // Admin credentials match
        }

        // No match found
        return UserType.NONE;
    }
    
    
    public static Lot chosenLot(int blocknum, int lotnum) {
        // Loop through the list of lots to find the one that matches
        for (Lot lot : Data.lots) 
        {
            if (lot.getBlock() == blocknum && lot.getLotNumber() == lotnum) 
            {
                return lot; // Return the matching lot
            }
        }
            return null; // Return null if no matching lot is found
    }
    
    public static Buy chosenbuy(String buyID) {
        // Loop through the list of lots to find the one that matches
        for (Buy buy : Data.buys) 
        {
            if (buy.getBuyID() == buyID) 
            {
                return buy; // Return the matching buyID
            }
        }
            return null; // Return null if no matching lot is found
    }
    
    public static Reserve chosenReserve(String reserveID) {
        // Loop through the list of lots to find the one that matches
        for (Reserve reserve : Data.reserves) 
        {
            if (reserve.getReserveID() == reserveID) 
            {
                return reserve; // Return the matching buyID
            }
        }
            return null; // Return null if no matching lot is found
    }

    public static Invoice chosenInvoice(String documentID) {
        // Loop through the list of lots to find the one that matches
        for (Invoice invoice : Data.invoices) 
        {
            if (invoice.getDocumentID().equals(documentID))
            {
                return invoice; // Return the matching buyID
            }
        }
        return null; // Return null if no matching lot is found
    }
    
    
    public static String checkLatestBuy() {
        if (!buys.isEmpty()) {
            return buys.get(buys.size() - 1).getBuyID(); // Get the BuyID of the last Buy object
        } else {
            return "B0"; // Default if list is empty
        }
    }

    public static String checkLatestReserve() {
        if (!reserves.isEmpty()) {
            return reserves.get(reserves.size() - 1).getReserveID(); // Get the ReserveID of the last Buy object
        } else {
            return "R0"; // Default if list is empty
        }
    }

    public static String checkLatestDocumentID() {
        if (!Data.invoices.isEmpty()) {
            // Get the documentID of the last invoice in the list
            return Data.invoices.get(Data.invoices.size() - 1).getDocumentID();
        } else {
            return "D0"; // Return default if list is empty
        }
    }

    public static String checkLatestTransactionID() {
        if (!Data.receipts.isEmpty()) 
        {
            return Data.receipts.get(Data.receipts.size() - 1).getTransactionID();
        } else {
            return "T0";
        }
    }
    
}
    
