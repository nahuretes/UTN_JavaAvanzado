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
public class Contact {
    protected String name;
    protected String primaryContactMethod;
    protected String emailAddress;
    protected String faxNumber;
    private final AddressBook addressBook;
    private List<ContactGroup> contactGroups;

    public Contact(AddressBook ad) {
        super();
        this.addressBook = ad;
        this.contactGroups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryContactMethod() {
        return primaryContactMethod;
    }

    public void setPrimaryContactMethod(String primaryContactMethod) {
        this.primaryContactMethod = primaryContactMethod;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public AddressBook getAddressBook() {
        return addressBook;
    }
  
    public List<ContactGroup> getContactGroups() {
        return contactGroups;
    }
    
    public void addContactGroup(ContactGroup cg) {
        contactGroups.add(cg);
    }
    
    public void removeContactGroup(ContactGroup cg){
        contactGroups.remove(cg);
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", primaryContactMethod=" + primaryContactMethod + ", emailAddress=" + emailAddress + ", faxNumber=" + faxNumber + ", addressBook=" + addressBook + ", contactGroups=" + contactGroups + '}';
    }


}
