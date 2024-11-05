/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

/**
 *
 * @author DESKTOP
 */

//extends
public class Admin extends User {
    private String adminName;
    private String contactNumber;
    private String email;

    // Private constructor to prevent direct instantiation
    private Admin(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.adminName = builder.adminName;
        this.contactNumber = builder.contactNumber;
        this.email = builder.email;
    }

    // Getters
    public String getAdminName() {
        return adminName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", adminName='" + adminName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Static Builder class
    public static class Builder {
        private String username;
        private String password;
        private String adminName;
        private String contactNumber;
        private String email;

        // Setters for the builder
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder adminName(String adminName) {
            this.adminName = adminName;
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

        // Build method to create the Admin object
        public Admin build() {
            return new Admin(this);
        }
    }
}
