package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public void addContact() {
        Contacts contactPerson = new Contacts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details Person");
        System.out.println("=========================");
        System.out.print("Enter first name : ");
        contactPerson.setFirstName(sc.next());
        System.out.print("Enter Last name : ");
        contactPerson.setLastName(sc.next());
        System.out.println("Enter the Address : ");
        contactPerson.setAddress(sc.next());
        System.out.println("Enter the City : ");
        contactPerson.setCity(sc.next());
        System.out.println("Enter the State : ");
        contactPerson.setState(sc.next());
        System.out.println("Enter the ZipCode : ");
        contactPerson.setZip(sc.nextInt());
        System.out.println("Enter the Mobile no : ");
        contactPerson.setPhoneNo(sc.nextInt());
        System.out.println("Enter email Address : ");
        contactPerson.setEmail(sc.next());
    }
}
