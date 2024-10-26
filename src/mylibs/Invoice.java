/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

/**
 *
 * @author DESKTOP
 */
public class Invoice extends Document {

    private String paymentMethod; // Specific to Invoice

    private Invoice(Builder builder) {
        super(builder);
        this.paymentMethod = builder.paymentMethod;
    }

    @Override
    public void displayDocument() {
        // Display invoice details, including lot and block information
        System.out.println("Invoice ID: " + documentID);
        System.out.println("Customer: " + username);
        System.out.println("Date: " + date);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Lot Information:");
        System.out.println("Block Number: " + blockNumber);
        System.out.println("Lot Number: " + lotNumber);
        System.out.println("Location: " + location);
        System.out.println("Size: " + size + " sqm");
    }

    public static class Builder extends Document.Builder<Builder> {
        private String paymentMethod;

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Invoice build() {
            return new Invoice(this);
        }
    }
}

