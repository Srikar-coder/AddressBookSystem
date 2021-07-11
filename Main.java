package com.bridgelabz.addressbook;

import com.bridgelabz.addressbook.contactdata.DataBase;
import com.bridgelabz.addressbook.service.AddressBookService;
import com.bridgelabz.addressbook.utils.PrintUtils;
import com.bridgelabz.addressbook.utils.UserInput;
import java.util.Scanner;

public class Main {

    // Main Method
    public static void main(String[] args) {
        System.out.println("*********************************************************");
        System.out.println("**********Welcome to Address Book System Service*********");
        System.out.println("*********************************************************");
        /* UC-1 */
        // Add Contact to the Address Book

        /* UC-2 */
        // Add New Contact to the Address Book

        Scanner sc = new Scanner(System.in);
        AddressBookDTO addressBookDTO = new AddressBookDTO("Sachin", "Tendulkar", "UK", "Manchester",
                "Birmingham", "10456", "9998888776", "sachin@456");
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.addData(addressBookDTO);
        PrintUtils.print(DataBase.dtoMap);

        String input = "Start";
        while(!input.equalsIgnoreCase("quit")) {
           // PrintUtils.print(DataBase.dtoMap);
            addressBookService.addData(UserInput.userInputFromConsole());
            PrintUtils.print(DataBase.dtoMap);
            input = sc.nextLine();
        }
    }
}
