package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.AddressBookDTO;
import com.bridgelabz.addressbook.contactdata.DataBase;
import java.util.Map;

public class AddressBookService {
    // Making First Name as key and other contact details as value
    Map<String, AddressBookDTO> dtoMap = DataBase.dtoMap;
    /* UC-1 */
    public void addData(AddressBookDTO dto){
        DataBase.dtoMap.put(dto.getFirstName(), dto);
    }

    /* UC-3 */
    public void updateAddressBook(AddressBookDTO addressBookDTO) {
        Map<String, AddressBookDTO> dtoMap = DataBase.dtoMap;
        if(dtoMap.containsKey(addressBookDTO.getFirstName())){
            DataBase.dtoMap.put(addressBookDTO.getFirstName(), addressBookDTO);
        } else
            addData(addressBookDTO);
    }
}
