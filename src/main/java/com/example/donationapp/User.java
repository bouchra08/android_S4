package com.example.donationapp;

public class User {

    public String fullname,email,password,sexe,address,age,dateOfBirth;

    public User(){

    }
    public User(String fullname,String email,String password,String sexe,String address,String age,String dateOfBirth){
        //this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.sexe = sexe;
        this.address = address;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }
}
