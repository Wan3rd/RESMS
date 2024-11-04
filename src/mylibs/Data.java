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
        // Block 1
        lots.add(new Lot(1, 1, 150, 1500000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 2, 200, 2500000, "Reserved", "Green Meadows"));
        lots.add(new Lot(1, 3, 250, 3500000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 4, 300, 4000000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 5, 450, 6000000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 6, 500, 7000000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 7, 350, 4200000, "Reserved", "Green Meadows"));
        lots.add(new Lot(1, 8, 400, 5500000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 9, 300, 3800000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 10, 370, 4900000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 11, 280, 3600000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 12, 350, 4700000, "Reserved", "Green Meadows"));
        lots.add(new Lot(1, 13, 320, 4300000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 14, 400, 5000000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 15, 500, 7500000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 16, 550, 8200000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 17, 290, 3700000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 18, 330, 4600000, "Reserved", "Green Meadows"));
        lots.add(new Lot(1, 19, 310, 4500000, "Available", "Green Meadows"));
        lots.add(new Lot(1, 20, 340, 4900000, "Available", "Green Meadows"));

// Block 2
        lots.add(new Lot(2, 1, 150, 1600000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 2, 220, 2600000, "Reserved", "Palm Grove"));
        lots.add(new Lot(2, 3, 270, 3700000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 4, 310, 4100000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 5, 460, 6100000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 6, 510, 7100000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 7, 360, 4300000, "Reserved", "Palm Grove"));
        lots.add(new Lot(2, 8, 410, 5600000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 9, 310, 3900000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 10, 380, 5000000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 11, 290, 3700000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 12, 360, 4800000, "Reserved", "Palm Grove"));
        lots.add(new Lot(2, 13, 330, 4400000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 14, 410, 5100000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 15, 520, 7600000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 16, 560, 8300000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 17, 300, 3800000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 18, 340, 4700000, "Reserved", "Palm Grove"));
        lots.add(new Lot(2, 19, 320, 4600000, "Available", "Palm Grove"));
        lots.add(new Lot(2, 20, 350, 5000000, "Available", "Palm Grove"));

// Block 3
        lots.add(new Lot(3, 1, 160, 1700000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 2, 230, 2700000, "Reserved", "Cedar Hills"));
        lots.add(new Lot(3, 3, 280, 3800000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 4, 320, 4200000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 5, 470, 6200000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 6, 520, 7300000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 7, 370, 4400000, "Reserved", "Cedar Hills"));
        lots.add(new Lot(3, 8, 420, 5700000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 9, 320, 4000000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 10, 390, 5100000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 11, 300, 3800000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 12, 370, 4900000, "Reserved", "Cedar Hills"));
        lots.add(new Lot(3, 13, 340, 4500000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 14, 430, 5200000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 15, 530, 7700000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 16, 570, 8400000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 17, 310, 3900000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 18, 350, 4800000, "Reserved", "Cedar Hills"));
        lots.add(new Lot(3, 19, 330, 4700000, "Available", "Cedar Hills"));
        lots.add(new Lot(3, 20, 360, 5100000, "Available", "Cedar Hills"));

// Block 4
        lots.add(new Lot(4, 1, 170, 1800000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 2, 240, 2800000, "Reserved", "Sunset Valley"));
        lots.add(new Lot(4, 3, 290, 3900000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 4, 330, 4300000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 5, 480, 6300000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 6, 530, 7400000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 7, 380, 4500000, "Reserved", "Sunset Valley"));
        lots.add(new Lot(4, 8, 430, 5800000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 9, 330, 4100000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 10, 400, 5200000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 11, 310, 3900000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 12, 380, 5000000, "Reserved", "Sunset Valley"));
        lots.add(new Lot(4, 13, 350, 4600000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 14, 440, 5300000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 15, 540, 7800000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 16, 580, 8500000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 17, 320, 4000000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 18, 360, 4900000, "Reserved", "Sunset Valley"));
        lots.add(new Lot(4, 19, 340, 4800000, "Available", "Sunset Valley"));
        lots.add(new Lot(4, 20, 370, 5200000, "Available", "Sunset Valley"));

// Block 5
        lots.add(new Lot(5, 1, 180, 1900000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 2, 250, 2900000, "Reserved", "Lakeside Park"));
        lots.add(new Lot(5, 3, 300, 4000000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 4, 340, 4400000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 5, 490, 6400000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 6, 540, 7500000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 7, 390, 4600000, "Reserved", "Lakeside Park"));
        lots.add(new Lot(5, 8, 440, 5900000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 9, 340, 4200000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 10, 410, 5300000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 11, 320, 4000000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 12, 390, 5100000, "Reserved", "Lakeside Park"));
        lots.add(new Lot(5, 13, 360, 4700000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 14, 450, 5400000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 15, 550, 7900000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 16, 590, 8600000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 17, 330, 4100000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 18, 370, 5000000, "Reserved", "Lakeside Park"));
        lots.add(new Lot(5, 19, 350, 4900000, "Available", "Lakeside Park"));
        lots.add(new Lot(5, 20, 380, 5300000, "Available", "Lakeside Park"));
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
    
