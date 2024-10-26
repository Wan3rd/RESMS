/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

/**
 *
 * Author: DESKTOP
 */
public class Reserve {
    private String reserveID;
    private String name;
    private String contact;
    private String email;
    private String message;
    private String status;
    private int blockNumber;
    private int lotNumber;
    private String username;

    // Private constructor to prevent direct object creation
    private Reserve(Builder builder) {
        this.reserveID = builder.reserveID;
        this.name = builder.name;
        this.contact = builder.contact;
        this.email = builder.email;
        this.message = builder.message;
        this.status = builder.status;
        this.blockNumber = builder.blockNumber;
        this.lotNumber = builder.lotNumber;
        this.username = builder.username;
    }

    // Getters for Reserve attributes
    public String getReserveID() {
        return reserveID;
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

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
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
        private String reserveID;
        private String name;
        private String contact;
        private String email;
        private String message;
        private String status;
        private int blockNumber;
        private int lotNumber;
        private String username;

        // Public constructor for the Builder
        public Builder() {
        }

        // Setters for Builder fields
        public Builder setReserveID(String reserveID) {
            this.reserveID = reserveID;
            return this;
        }

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

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
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

        // Build method to create the Reserve object
        public Reserve build() {
            return new Reserve(this);
        }
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "reserveID='" + reserveID + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", blockNumber=" + blockNumber +
                ", lotNumber=" + lotNumber +
                ", username='" + username + '\'' +
                '}';
    }

    public Builder toBuilder() {
        return new Builder()
                .setReserveID(this.reserveID)
                .setName(this.name)
                .setContact(this.contact)
                .setEmail(this.email)
                .setMessage(this.message)
                .setStatus(this.status)
                .setBlockNumber(this.blockNumber)
                .setLotNumber(this.lotNumber)
                .setUsername(this.username);
    }
}
