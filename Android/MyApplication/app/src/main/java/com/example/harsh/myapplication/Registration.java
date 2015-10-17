package com.example.harsh.myapplication;

/**
 * Created by Harsh on 10/17/2015.
 */
public class Registration {

   private String name;
   private String email;
   private String address;

    public Registration(String n, String e, String a) {
        super();
        this.name = n;
        this.email = e;
        this.address = a;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return  this.address;
    }

}
