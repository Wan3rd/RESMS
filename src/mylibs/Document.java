/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

/**
 *
 * @author DESKTOP
 */

//Abstract
public abstract class Document {
    protected String documentID;
    protected String username;    // Customer's username
    protected String name;        // Customer's full name
    protected String date;
    protected double totalAmount;
    protected int blockNumber;
    protected int lotNumber;
    protected String location;
    protected double size;
    protected String contactNumber; // Customer's contact number
    protected String email;         // Customer's email address

    // Constructor using the builder
    protected Document(Builder<?> builder) {
        this.documentID = builder.documentID;
        this.username = builder.username;
        this.name = builder.name;
        this.date = builder.date;
        this.totalAmount = builder.totalAmount;
        this.blockNumber = builder.blockNumber;
        this.lotNumber = builder.lotNumber;
        this.location = builder.location;
        this.size = builder.size;
        this.contactNumber = builder.contactNumber;  // Assigning contactNumber
        this.email = builder.email;                  // Assigning email
    }

    // Abstract method for displaying document information (Invoice or Receipt)
    public abstract void displayDocument();

    // Getters
    public String getDocumentID() {
        return documentID;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public String getDate() {
        return date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPaymentMethod() {
        return email;
    }

    // Static abstract Builder class for creating subclasses
    public static abstract class Builder<T extends Builder<T>> {
        private String documentID;
        private String username;
        private String name;
        private String date;
        private double totalAmount;
        private int blockNumber;
        private int lotNumber;
        private String location;
        private double size;
        private String contactNumber;
        private String email;

        public T setDocumentID(String documentID) {
            this.documentID = documentID;
            return self();
        }

        public T setUsername(String username) {
            this.username = username;
            return self();
        }

        public T setName(String name) {
            this.name = name;
            return self();
        }

        public T setDate(String date) {
            this.date = date;
            return self();
        }

        public T setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return self();
        }

        public T setBlockNumber(int blockNumber) {
            this.blockNumber = blockNumber;
            return self();
        }

        public T setLotNumber(int lotNumber) {
            this.lotNumber = lotNumber;
            return self();
        }

        public T setLocation(String location) {
            this.location = location;
            return self();
        }

        public T setSize(double size) {
            this.size = size;
            return self();
        }

        public T setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return self();
        }

        public T setEmail(String email) {
            this.email = email;
            return self();
        }

        // Abstract method to return the builder itself
        protected abstract T self();

        // Abstract build method to be implemented in subclasses
        public abstract Document build();
    }
}