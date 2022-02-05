package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	// test variables
	String id = "1234567890";
	String firstName = "Austin";
	String lastName = "Fuchs";
	String phone = "5551234567";
	String address = "New Hampshire";

	@Test
	void testContactClass() {
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		
		assertTrue(contact.getId().equals(id));
		assertTrue(contact.getFirstName().equals(firstName));
		assertTrue(contact.getLastName().equals(lastName));
		assertTrue(contact.getPhone().equals(phone));
		assertTrue(contact.getAddress().equals(address));
	}
	
	@Test
	void testContactClassIdException() {
		String tooLongId = "1234567890987654321";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tooLongId, firstName, lastName, phone, address);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, firstName, lastName, phone, address);
		});
	}
	
	@Test
	void testContactClassFirstNameException() {
		String tooLongFirstName = "A very very long first name";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, tooLongFirstName, lastName, phone, address);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, null, lastName, phone, address);
		});
	}
	
	@Test
	void testContactClassLastNameException() {
		String tooLongLastName = "A very very long last name";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, tooLongLastName, phone, address);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, tooLongLastName, phone, address);
		});
	}
	
	@Test
	void testContactClassPhoneException() {
		String tooLongPhone = "1234567890987654321";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, tooLongPhone, address);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, null, address);
		});
	}
	
	@Test
	void testContactClassAddressException() {
		String tooLongAddress = "A very very very very very very very very very long address";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, tooLongAddress);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, null);
		});
	}
	
	@Test
	void testContactFirstNameSetter() {
		
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		String newFirstName = "Jean-Luc";
		
		// test new first name set
		contact.setFirstName(newFirstName);
		assertTrue(contact.getFirstName().equals(newFirstName));
		
		// test exception thrown for too long first name set
		String tooLongFirstName = "A very very long first name";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(tooLongFirstName);
		});
		
		// test exception thrown for null first name set
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}

	@Test
	void testContactLastNameSetter() {
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		String newLastName = "Picard";
		
		// test new last name set
		contact.setLastName(newLastName);
		assertTrue(contact.getLastName().equals(newLastName));
		
		// test exception thrown for too long last name set
		String tooLongLastName = "A very very long last name";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(tooLongLastName);
		});
		
		// test exception thrown for null last name set
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(null);
		});
	}
	
	@Test
	void testContactPhoneSetter() {
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		String newPhone = "0001234567";
		
		// test new phone set
		contact.setPhone(newPhone);
		assertTrue(contact.getPhone().equals(newPhone));
		
		// test exception thrown for too long phone number
		String tooLongPhone = "1234567890987654321";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone(tooLongPhone);
		});
		
		// test exception thrown for too short phone number
		String tooShortPhone = "123";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone(tooShortPhone);
		});
		
		// text exception thrown for null phone number set
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone(null);
		});
	}
	
	@Test
	void testContactAddressSetter() {
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		String newAddress = "U.S.S. Enterprise";
		
		// test new address set
		contact.setAddress(newAddress);
		assertTrue(contact.getAddress().equals(newAddress));
		
		// test exception thrown for too long address set
		String tooLongAddress = "Starfleet HQ, Starbase 1, Earth, Sol System, Alpha Quadrant, Milky Way Galaxy";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress(tooLongAddress);
		});
		
		// test exception thrown for null address set
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress(null);
		});
	}
	
	
	
}
