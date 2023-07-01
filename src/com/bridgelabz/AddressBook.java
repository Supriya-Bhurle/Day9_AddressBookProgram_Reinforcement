package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    public void add(int person, Contacts[] array) {
        for (int i = 0; i < person; i++) {
            System.out.println("Enter " + (i + 1) + " person firstname : ");
            String firstName = sc.next();

            System.out.println("Enter " + (i + 1) + " person lastname : ");
            String lastName = sc.next();

            System.out.println("Enter " + (i + 1) + " person address : ");
            String address = sc.next();

            System.out.println("Enter " + (i + 1) + " person city : ");
            String city = sc.next();

            System.out.println("Enter " + (i + 1) + " person state : ");
            String state = sc.next();

            System.out.println("Enter " + (i + 1) + " person email : ");
            String email = sc.next();

            System.out.println("Enter " + (i + 1) + " person phoneNo : ");
            int phoneNo = sc.nextInt();

            System.out.println("Enter " + (i + 1) + " person zip : ");
            int zip = sc.nextInt();

            Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, phoneNo, email);
            array[i] = contacts;
        }
    }
    public void print(int person, Contacts[] array) {
        for (int i = 0; i < person; i++) {
            System.out.println(array[i].getFirstName() + " " + array[i].getLastName() + " " + array[i].getAddress() + " "
                    + array[i].getCity() + " " + array[i].getState() + " " + array[i].getEmail() + " " + array[i].getZip() + " " + array[i].getPhoneNo());
        }
    }

    public void edit(int person, Contacts[] array) {
        System.out.println("What you want to Edit, select from following menu :");
        System.out.println("firstName, lastName, address, city, state, zip, phoneNo, email");
        String toEdit = sc.next();

        switch (toEdit) {
            case "firstName":
                System.out.println("whose name you want to Edit");
                String oldName = sc.next();
                for (int j = 0; j < person; j++) {
                    if (oldName.equals(array[j].getFirstName())) {
                        System.out.println("enter new firstname :");
                        String newName = sc.next();
                        array[j].setFirstName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "lastName":
                System.out.println("whose lastname you want to Edit");
                String oldLastname = sc.next();
                for (int j = 0; j < person; j++) {
                    if (oldLastname.equals(array[j].getLastName())) {
                        System.out.println("enter new lastname :");
                        String newName = sc.next();
                        array[j].setLastName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;

            case "address":
                System.out.println("whose address you want to Edit");
                String oldAddress = sc.next();
                for (int j = 0; j < person; j++) {
                    if (oldAddress.equals(array[j].getAddress())) {
                        System.out.println("enter new lastname :");
                        String newName = sc.next();
                        array[j].setAddress(newName);
                    }
                }
                System.out.println("Successfully done");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public void delete(int person,Contacts[] array) {
        System.out.println("Enter name you want to delete:");
        String deleteName = sc.next();
        for (int i = 0; i < person; i++){
            if (deleteName.equals(array[i].getFirstName())){
                for (int j=i; j<person-1;j++){
                    array[j] = array[j+1];
                }
            }
        }
        for (int i=0;i<person-1;i++){
            System.out.println(array[i].getFirstName() + " " + array[i].getLastName() + " " + array[i].getAddress() + " "
                    + array[i].getCity() + " " + array[i].getState() + " " + array[i].getEmail() + " " + array[i].getZip() + " "+array[i].getPhoneNo());
        }
    }
}
