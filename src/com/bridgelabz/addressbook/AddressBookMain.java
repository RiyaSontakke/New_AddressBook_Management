package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book Program..");
        ContactOperationsImpl contacts=new ContactOperationsImpl();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter option you want :: ");
            System.out.println("1.Add contact 2.Edit Contact 3.Delete Contact");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    contacts.addContact();
                    break;
                case 2:
                    contacts.editContact();
                    break;
                case 3:
                    contacts.deleteContact();
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
    }

}


