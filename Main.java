package com.bridgelabz.addressbook;

import com.bridgelabz.addressbook.contactdata.DataBase;
import com.bridgelabz.addressbook.service.AddressBookService;
import com.bridgelabz.addressbook.utils.PrintUtils;

public class Main {

    // Main Method
    public static void main(String[] args) {
        System.out.println("*********************************************************");
        System.out.println("**********Welcome to Address Book System Service*********");
        System.out.println("*********************************************************");
        /* UC-1 */
        // Add Contact to the Address Book
        AddressBookDTO addressBookDTO = new AddressBookDTO("Sachin", "Tendulkar", "UK", "Manchester",
                "birmingham", "10456", "9997887776", "sachin@456");
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.addData(addressBookDTO);
        PrintUtils.print(DataBase.dtoMap);
    }
}
