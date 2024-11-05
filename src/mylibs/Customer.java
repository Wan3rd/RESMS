/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;


import mylibs.User;

/**
 *
 * @author DESKTOP
 */
//Polymorphism
//Inheritance extends
public class Customer extends User {
    private String customerName;
    private String gender;
    private String contactNumber;
    private String email;
    private String address;

    // Private constructor to prevent direct instantiation
    private Customer(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.customerName = builder.customerName;
        this.gender = builder.gender;
        this.contactNumber = builder.contactNumber;
        this.email = builder.email;
        this.address = builder.address;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Static Builder class
    public static class Builder {
        private String username;
        private String password;
        private String customerName;
        private String gender;
        private String contactNumber;
        private String email;
        private String address;

        // Setters for builder
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder contactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // Build method to create the Customer object
        public Customer build() {
            return new Customer(this);
        }
    }
}
