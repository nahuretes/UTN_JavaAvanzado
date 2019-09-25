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
public class AddressBook {
    protected String name;
    private Account account;
    private List<Contact> contacts = new ArrayList<>();
    private List<ContactGroup> contactGroups = new ArrayList<>();

    public AddressBook(Account account) {
        this.account = account;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Contact getContact(String name) throws ContactNotFoundException{
        for (Contact contact : contacts) {
            if (contact.name.equals(name)) {
                return contact;
            }
        }
        throw new ContactNotFoundException();
    }
    
    public List<Contact> getContacts() {
        return contacts;
    }
    
    public void addContact(Contact c) {
        contacts.add(c);
    }
    
    public void removeContact(Contact c) {
        contacts.remove(c);
    }

    public List<ContactGroup> getContactGroups() {
        return contactGroups;
    }
    
    public void addContactGroup (ContactGroup cg) {
        contactGroups.add(cg);
    }
    
    public void removeContactGroup (ContactGroup cg) {
        contactGroups.remove(cg);
    }
}
