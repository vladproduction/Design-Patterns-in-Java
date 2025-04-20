package com.vladproduction.creational.builder.modern;

public class User {

    // Required parameters
    private final String firstName;
    private final String lastName;

    //optional parameters
    private final int age;
    private final String phone;
    private final String address;
    private final String email;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.email = builder.email;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

//    @Override
//    public String toString() {
//        return "User: " + firstName + " " + lastName + ", " + age + " years old\n" +
//                "Contact: " + phone + ", " + email + "\n" +
//                "Address: " + address;
//    }

    //if we do not need to print empty parts
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User: " + firstName + " " + lastName + ", " + age + " years old\n");

        // Check and append contact details
        if (!phone.isEmpty() || !email.isEmpty()) {
            sb.append("Contact: ");
            if (!phone.isEmpty()) {
                sb.append(phone);
            }
            if (!phone.isEmpty() && !email.isEmpty()) {
                sb.append(", ");
            }
            if (!email.isEmpty()) {
                sb.append(email);
            }
            sb.append("\n");
        }

        // Check and append address details
        if (!address.isEmpty()) {
            sb.append("Address: ").append(address);
        }

        return sb.toString();
    }


    //Builder class
    public static class UserBuilder {

        // Required parameters
        private final String firstName;
        private final String lastName;

        // Optional parameters - initialized with default values
        private int age = 0;
        private String phone = "";
        private String address = "";
        private String email = "";

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }


    }


}
