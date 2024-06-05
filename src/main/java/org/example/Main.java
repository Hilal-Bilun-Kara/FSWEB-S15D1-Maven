package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Grocery grocery = new Grocery();
        grocery.startGrocery();*/


        System.out.println("******");

        MobilePhone mobilePhone = new MobilePhone("045747574",new ArrayList<>());
        mobilePhone.addNewContact(new Contact("Bilun","45435443546"));
        mobilePhone.addNewContact(new Contact("Bilun",null));
        mobilePhone.addNewContact(new Contact("Hilal","45435443243"));
        mobilePhone.printContacts();
    }
}
