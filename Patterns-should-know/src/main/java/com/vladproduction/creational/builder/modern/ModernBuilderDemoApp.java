package com.vladproduction.creational.builder.modern;

// Client code
public class ModernBuilderDemoApp {
    public static void main(String[] args) {

        /*firstName;
        lastName;
        age;
        phone;
        address;
        email;*/

        User user1 = new User.UserBuilder("John", "Doe")
                .age(20)
                .phone("123-456-789")
                .address("London")
                .email("john@doe.com")
                .build();

        System.out.println(user1);

        //and we can use optional as need:
        //different representations with the same builder
        User user2 = new User.UserBuilder("Jane", "Smith")
                .age(25)
                .email("jane.smith@example.com")
                .build();

        System.out.println("\n" + user2);


    }

}
