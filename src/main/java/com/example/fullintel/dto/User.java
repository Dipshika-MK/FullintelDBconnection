package com.example.fullintel.dto;

import org.springframework.beans.factory.annotation.Required;

public class User {
    public User() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;


    public User(Integer userId, String userEmail, String password, String firstName, String lastName) {



        this.id = userId;
        this.email = userEmail;
        this.password= password;
        this.firstName = firstName;
        this.lastName = lastName;


        System.out.println("User{" +
                "id=" + this.id +
                ", email='" + this.email + '\'' +
                ", password='" + this.password + '\'' +
                ", firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +

                '}');
    }

}

