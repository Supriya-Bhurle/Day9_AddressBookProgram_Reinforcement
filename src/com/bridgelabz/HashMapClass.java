package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass {
    Scanner scanner = new Scanner(System.in);
    public void addBook(HashMap<String, ArrayList<Contacts>> hashMap) {
        AddressBook inputMethods = new AddressBook();
        ArrayList<Contacts> array = new ArrayList<>();
        System.out.println("Enter name of the Address Book : ");
        String bookName = scanner.next();
        if (hashMap.containsKey(bookName)){
            System.out.println("Address Book name already exist" );
            System.out.println("Entered to " +bookName + " book");
            inputMethods.add(hashMap.get(bookName));
        }else{
            int choice = 0 ;
            while(choice!=5){
                System.out.println("What do you want to perform inside " + bookName+ " book:");
                System.out.println("1.Add\n2.Edit\n3.Delete\n4.Print\n5.Stop");
                choice=scanner.nextInt();
                switch (choice){
                    case 1 : inputMethods.add(array);
                        break;
                    case 2 : inputMethods.edit(array);
                        break;
                    case 3 : inputMethods.delete(array);
                        break;
                    case 4:  inputMethods.print(array);
                        break;
                    case 5:  System.out.println("\nThank You for " + bookName + " Book \n");
                        break;
                }
                hashMap.put(bookName,array);
            }
        }
    }

    public void toEdit(HashMap<String, ArrayList<Contacts>> hashMap) {
    }

    public void toDeleteBook(HashMap<String, ArrayList<Contacts>> hashMap){

    }

    public void listOfBookNames(HashMap<String, ArrayList<Contacts>> hashMap) {
    }

    public void particularBookName(HashMap<String, ArrayList<Contacts>> hashMap) {
    }

    public void printMap(HashMap<String, ArrayList<Contacts>> hashMap) {
        for (Map.Entry<String,ArrayList<Contacts>> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+ " -> ");
            for (int i = 0; i<entry.getValue().size();i++){
                System.out.println(entry.getValue().get(i).getFirstName()+ " "+
                        entry.getValue().get(i).getLastName()+ " "+
                        entry.getValue().get(i).getAddress()+ " "+
                        entry.getValue().get(i).getCity()+ " "+
                        entry.getValue().get(i).getState()+ " "+
                        entry.getValue().get(i).getPhoneNo()+ " "+
                        entry.getValue().get(i).getZip());
            }
        }
    }

    public void searchBookWithName(HashMap<String, ArrayList<Contacts>> hashMap) {
    }
    }

