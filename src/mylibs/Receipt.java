/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

/**
 *
 * @author DESKTOP
 */
public class Receipt extends Document{

    private String transactionID;  // Specific to Receipt
    private String paymentMethod;  // Added paymentMethod

    private Receipt(Builder builder) {
        super(builder);
        this.transactionID = builder.transactionID;
        this.paymentMethod = builder.paymentMethod; // Initialize paymentMethod
    }

    @Override
    public void displayDocument() {
        // Display receipt details, including lot and block information
        System.out.println("Receipt ID: " + documentID);
        System.out.println("Customer: " + username);
        System.out.println("Date: " + date);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Payment Method: " + paymentMethod);  // Display payment method
        System.out.println("Lot Information:");
        System.out.println("Block Number: " + blockNumber);
        System.out.println("Lot Number: " + lotNumber);
        System.out.println("Location: " + location);
        System.out.println("Size: " + size + " sqm");
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getPaymentMethod() {  // Getter for paymentMethod
        return paymentMethod;
    }

    public static class Builder extends Document.Builder<Builder> {
        private String transactionID;
        private String paymentMethod;  // Add paymentMethod to the builder

        public Builder setTransactionID(String transactionID) {
            this.transactionID = transactionID;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Receipt build() {
            return new Receipt(this);
        }
    }
}
