package com.bridgelabz.addressbook.utils;

import com.bridgelabz.addressbook.AddressBookDTO;
import java.util.Map;

public class PrintUtils {

    public static void print(Map<String, AddressBookDTO> dtoMap) {
        // Display the contact list of address book
        for(Map.Entry<String, AddressBookDTO> entry : dtoMap.entrySet()) {
            System.out.println("Contact Details of " +  entry.getValue().getFirstName() + " " + entry.getValue().toString());
        }

    }
}
