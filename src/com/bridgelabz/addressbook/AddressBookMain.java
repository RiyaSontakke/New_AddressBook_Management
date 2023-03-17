package com.bridgelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book Program..");
        ContactOperationsImpl contacts=new ContactOperationsImpl ();
        contacts.addContact();
    }

}
