package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// test variables
	String id = "1234567890";
	String firstName = "Austin";
	String lastName = "Fuchs";
	String phone = "5551234567";
	String address = "New Hampshire";
	
	@Test
	void testContactServiceAddContact() {
		
		// initialize contact service and add contact
		ContactService service = new ContactService();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		
		// test contact can be added to contact service
		service.addContact(contact);
		assertTrue(service.contacts.get(0).equals(contact));
		
		// test adding contact with non-unique id throws exception
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact);
		});
	}
	
	@Test
	void testContactServiceDeleteContact() {
		
		// initialize contact service and add contacts
		ContactService service = new ContactService();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		Contact anotherContact = new Contact("123", firstName, lastName, phone, address);
		service.addContact(contact);
		service.addContact(anotherContact);
		
		// test contact can be deleted from contact service
		service.deleteContact(id);
		
		// test exception thrown for id not found
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact(id);
		});		
	}
	
	@Test
	void testContactServiceUpdateFirstName() {
		
		// initialize contact service and add contact
		ContactService service = new ContactService();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		service.addContact(contact);
		
		// test contact can update first name
		service.updateContactFirstName(id, "Jean-Luc");
		
		// test exception thrown for id not found
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactFirstName("123", firstName);
		});		
	}

	@Test
	void testContactServiceUpdateLastName() {
		
		// initialize contact service and add contact
		ContactService service = new ContactService();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		service.addContact(contact);
		
		// test contact can update last name
		service.updateContactLastName(id, "Picard");
		
		// test exception thrown for id not found
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactLastName("123", lastName);
		});		
	}

	@Test
	void testContactServiceUpdatePhone() {
		
		// initialize contact service and add contact
		ContactService service = new ContactService();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		service.addContact(contact);
		
		// test contact can update phone
		service.updateContactPhone(id, "9876543210");
		
		// test exception thrown for id not found
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactPhone("123", lastName);
		});		
	}
	
	@Test
	void testContactServiceUpdateAddress() {
		
		// initialize contact service and add contact
		ContactService service = new ContactService();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		service.addContact(contact);
		
		// test contact can update address
		service.updateContactAddress(id, "U.S.S. Enterpise");
		
		// test exception thrown for id not found
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactAddress("123", address);
		});		
	}
		
}
