package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.AddressBookDTO;
import com.bridgelabz.addressbook.contactdata.DataBase;
import java.util.Map;

public class AddressBookService {
    // Making First Name as key and other contact details as value
    Map<String, AddressBookDTO> dtoMap = DataBase.dtoMap;
    public void addData(AddressBookDTO dto){
        DataBase.dtoMap.put(dto.getFirstName(), dto);
    }
}
