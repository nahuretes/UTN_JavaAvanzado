/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.java.addressbook;

/**
 *
 * @author juan.pablo.tyrlik
 */
public class Test {
    public static void main(String[] args) {
        
    Account account = new Account();
    AddressBook addressBook = new AddressBook(account);
    Contact contact = new Contact(addressBook);
    ContactGroup contactGroup = new ContactGroup(addressBook);
    contact.setName("Juan");
    addressBook.addContact(contact);
    contactGroup.addContactGroup(new ContactGroup(addressBook));
    try {
    System.out.println(addressBook.getContact("Juan").toString());
    System.out.println(contactGroup.toString());
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
