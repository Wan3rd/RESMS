/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

/**
 *
 * @author DESKTOP
 */
public class Buy {
    private String buyID;
    private String name;
    private String contact;
    private String email;
    private String paymentMethod;
    private String status;
    private String message;
    private int blockNumber;
    private int lotNumber;
    private String username;

    // Private constructor to prevent direct object creation
    private Buy(Builder builder) {
        this.buyID = builder.buyID;
        this.name = builder.name;
        this.contact = builder.contact;
        this.email = builder.email;
        this.paymentMethod = builder.paymentMethod;
        this.status = builder.status;
        this.message = builder.message;
        this.blockNumber = builder.blockNumber;
        this.lotNumber = builder.lotNumber;
        this.username = builder.username;
    }

    // Getters for Buy attributes
    public String getBuyID() {
        return buyID;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public String getUsername() {
        return username;
    }

    // Static Builder class
    public static class Builder {
        private String buyID;
        private String name;
        private String contact;
        private String email;
        private String paymentMethod;
        private String status;
        private String message;
        private int blockNumber;
        private int lotNumber;
        private String username;

        // Public constructor for required fields (you can add required fields here)
        public Builder() {
        }

 

        public Builder setBuyID(String buyID) {
            this.buyID = buyID;
            return this;
        }

        
        // Methods for setting optional fields
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setContact(String contact) {
            this.contact = contact;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setBlockNumber(int blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }

        public Builder setLotNumber(int lotNumber) {
            this.lotNumber = lotNumber;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        // Build method to create the Buy object
        public Buy build() {
            return new Buy(this);
        }
    }

    @Override
    public String toString() {
        return "Buy{" +
                "buyID='" + buyID + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", blockNumber=" + blockNumber +
                ", lotNumber=" + lotNumber +
                ", username='" + username + '\'' +
                '}';
    }
    
    public Builder toBuilder() 
    {
        return new Builder()
                .setBuyID(this.buyID)
                .setName(this.name)
                .setContact(this.contact)
                .setEmail(this.email)
                .setPaymentMethod(this.paymentMethod)
                .setStatus(this.status)
                .setMessage(this.message)
                .setBlockNumber(this.blockNumber)
                .setLotNumber(this.lotNumber)
                .setUsername(this.username);
    }
}

