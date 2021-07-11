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
            System.out.println("Pick up the correct choice!");
            System.out.println("1. Add New Contact");
            System.out.println("2. Update Existing Contact");
            System.out.println("3. Delete Contact");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    addressBookService.addData(UserInput.userInputFromConsole());
                    break;
                case 2:
                    updateRecords();
                    break;
                case 3:
                    addressBookService.deleteRecord(UserInput.userInputFromConsole());
                    break;
                default:
                    System.out.println("Please Enter valid choice!!");
                    break;
            }
            PrintUtils.print(DataBase.dtoMap);
            input = sc.nextLine();
        }
    }
    * UC-3 */
    // To update the records of address book
    private static void updateRecords() {
        addressBookService.updateAddressBook(UserInput.userInputFromConsole());
    }
}
