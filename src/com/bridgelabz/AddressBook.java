package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public void addContact() {
        Contacts contactPerson = new Contacts();
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Persons you want to add : ");
        int person = sc.nextInt();
        Contacts[] array = new Contacts[person];
        for(int i=0; i< person; i++){
        System.out.println("Enter the details of the Person");
        System.out.println("=========================");
        System.out.print("Enter " + (i+1)+ " persons first name : ");
        contactPerson.setFirstName(sc.next());
        System.out.print("Enter " + (i+1)+ " persons Last name : ");
        contactPerson.setLastName(sc.next());
        System.out.println("Enter " + (i+1)+ " persons the Address : ");
        contactPerson.setAddress(sc.next());
        System.out.println("Enter " + (i+1)+ " persons the City : ");
        contactPerson.setCity(sc.next());
        System.out.println("Enter " + (i+1)+ " persons the State : ");
        contactPerson.setState(sc.next());
        System.out.println("Enter " + (i+1)+ " persons the ZipCode : ");
        contactPerson.setZip(sc.nextInt());
        System.out.println("Enter the " + (i+1)+ " personsMobile no : ");
        contactPerson.setPhoneNo(sc.nextInt());
        System.out.println("Enter email " + (i+1)+ " persons Address : ");
        contactPerson.setEmail(sc.next());

        array[i] =  contactPerson;
    }
}}
