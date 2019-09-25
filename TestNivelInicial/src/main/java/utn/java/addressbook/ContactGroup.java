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
public class ContactGroup {
    protected String name;
    private final AddressBook addressBook;
    private List<Contact> contacts = new ArrayList<>();
    private ContactGroup parent;
    private List<ContactGroup> childs = new ArrayList<>();

    public ContactGroup(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void addContact(Contact c) {
        contacts.add(c);
    }
    
    public void removeContact(Contact c) {
        contacts.remove(c);
    }
    
    public List<ContactGroup> getChilds() {
        return childs;
    }
    
    public void addContactGroup (ContactGroup cg) {
        childs.add(cg);
    }
    
    public void removeContactGroup (ContactGroup cg) {
        childs.remove(cg);
    }

    @Override
    public String toString() {
        return "ContactGroup{" + "name=" + name + ", addressBook=" + addressBook + ", contacts=" + contacts + ", childs=" + childs + '}';
    }

    
}
