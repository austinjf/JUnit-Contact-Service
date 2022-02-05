package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class that adds, deletes, and updates instances of Contact objects within
 * an ArrayList of Contact objects. 
 * 
 * @author Austin Fuchs - CS 320 Milestone 1
 * @since 2022-01-22
 *
 */

public class ContactService {

	// ArrayList of Contact objects
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	Iterator<Contact> contactsIterator; // used to iterate through ArrayList of Contacts

	
	// FIXME: Add constructor?
	
	/**
	 * Adds a Contact object to the ArrayList of Contact objects while
	 * ensuring that the id of the new Contact object is unique within
	 * the ArrayList. If the id is not unique, an exception is thrown.
	 * 
	 * @param contact	The Contact object to be added.
	 */
	public void addContact(Contact contact) {
		
		// initialize iterator
		contactsIterator = contacts.iterator();
		
		// iterate over the ArrayList of Contacts
		while (contactsIterator.hasNext()) {
			
			// check to ensure new Contact ID is unique, if not throw exception
			if (contactsIterator.next().getId().equals(contact.getId()))
				throw new IllegalArgumentException("New Contact ID is not unique.");
				
		}
		
		// new Contact ID is unique, add contact to ArrayList
		contacts.add(contact);
	}
	
	/**
	 * Removes the Contact object that matches the param id from the ArrayList of
	 * Contact objects. If the id is not found, an exception is thrown.
	 * 
	 * @param id	The id of the Contact object to be removed
	 */
	public void deleteContact(String id) {
		
		// initialize iterator
		contactsIterator = contacts.iterator();
		
		// iterate over the ArrayList of Contacts
		while (contactsIterator.hasNext()) {
				
			// check to ensure id of Contact exists
			if (contactsIterator.next().getId().equals(id)) {
					
				// contact with id exists, remove contact
				contactsIterator.remove();					
				return;
			}			
		} 
		
		// iterated over ArrayList of contacts and id not found
		throw new IllegalArgumentException("Contact ID entered does not exist.");
	}

	/**
	 * Updates the first name of the Contact object within the ArrayList of
	 * Contact objects that has the same id.
	 * 
	 * @param id			The id of the Contact to be updated.
	 * @param firstName		The new first name to be updated.
	 */
	public void updateContactFirstName(String id, String firstName) {
		
		// initialize the iterator & index variable
		int i = 0;
		contactsIterator = contacts.iterator();
		
		while (contactsIterator.hasNext()) {
			// check to ensure id of Contact exists
			if (contactsIterator.next().getId().equals(id)) {
				
				// contact exists, update first name
				contacts.get(i).setFirstName(firstName);
				return;
			}
			
			i++; // increment index for next loop iteration
		}
		
		// iterated over ArrayList of Contacts and id not found
		throw new IllegalArgumentException("Contact ID entered does not exist.");
	}
	
	/**
	 * Updates the last name of the Contact object within the ArrayList of
	 * Contact objects that has the same id.
	 * 
	 * @param id			The id of the Contact to be updated.
	 * @param lastName		The new last name to be updated.
	 */
	public void updateContactLastName(String id, String lastName) {
		
		// initialize the iterator & index variable
		int i = 0;
		contactsIterator = contacts.iterator();
		
		while (contactsIterator.hasNext()) {
			// check to ensure id of Contact exists
			if (contactsIterator.next().getId().equals(id)) {
				
				// contact exists, update last name
				contacts.get(i).setLastName(lastName);
				return;
			}
			
			i++; // increment index for next loop iteration
		}
		
		// iterated over ArrayList of Contacts and id not found
		throw new IllegalArgumentException("Contact ID entered does not exist.");
	}
	
	/**
	 * Updates the phone of the Contact object within the ArrayList of
	 * Contact objects that has the same id.
	 * 
	 * @param id			The id of the Contact to be updated.
	 * @param phone			The new phone to be updated.
	 */
	public void updateContactPhone(String id, String phone) {
		
		// initialize the iterator & index variable
		int i = 0;
		contactsIterator = contacts.iterator();
		
		while (contactsIterator.hasNext()) {
			// check to ensure id of Contact exists
			if (contactsIterator.next().getId().equals(id)) {
				
				// contact exists, update phone
				contacts.get(i).setPhone(phone);
				return;
			}
			
			i++; // increment index for next loop iteration
		}
		
		// iterated over ArrayList of Contacts and id not found
		throw new IllegalArgumentException("Contact ID entered does not exist.");
	}
	
	/**
	 * Updates the address of the Contact object within the ArrayList of
	 * Contact objects that has the same id.
	 * 
	 * @param id			The id of the Contact to be updated.
	 * @param address		The new address to be updated.
	 */
	public void updateContactAddress(String id, String address) {
		
		// initialize the iterator & index variable
		int i = 0;
		contactsIterator = contacts.iterator();
		
		while (contactsIterator.hasNext()) {
			// check to ensure id of Contact exists
			if (contactsIterator.next().getId().equals(id)) {
				
				// contact exists, update address
				contacts.get(i).setAddress(address);
				return;
			}
			
			i++; // increment index for next loop iteration
		}
		
		// iterated over ArrayList of Contacts and id not found
		throw new IllegalArgumentException("Contact ID entered does not exist.");
	}
		
}
