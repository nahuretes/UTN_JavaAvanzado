/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.java.addressbook;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan.pablo.tyrlik
 */
public class Account {
    protected String name;
    protected String emailAddress;
    private List<AddressBook> addressBooks = new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }    
   
    public List<AddressBook> getAddressBooks() {
        return addressBooks;
    }
    
    public void addAddressBook(AddressBook ad) {
        addressBooks.add(ad);
    }
    
    public void removeAddressBook(AddressBook ad) {
        addressBooks.remove(ad);
    }
}
