package main;

/**
 * A class to hold information for a specific contact.
 * 
 * Note: The id variable is immutable and can only be set in the constructor.
 * 
 * @author Austin Fuchs - CS 320 Milestone 1
 * @since 2022-01-22
 */

public class Contact {

	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// constructor
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		
		if (id == null || id.length() > 10) 
			throw new IllegalArgumentException("Invalid ID.");
		
		if (firstName == null || firstName.length() > 10)
			throw new IllegalArgumentException("Invalid first name.");
		
		if (lastName == null || lastName.length() > 10)
			throw new IllegalArgumentException("Invalid last name.");
		
		if (phone == null || phone.length() != 10)
			throw new IllegalArgumentException("Invalid phone number.");
		
		if (address == null || address.length() > 30)
			throw new IllegalArgumentException("Invalid address");
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}

	// getters and setters
	// no setter for id, which is immutable after object instantiation
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		if (firstName == null || firstName.length() > 10)
			throw new IllegalArgumentException("Invalid first name.");
		
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		
		if (lastName == null || lastName.length() > 10)
			throw new IllegalArgumentException("Invalid last name.");
		
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		
		if (phone == null || phone.length() != 10)
			throw new IllegalArgumentException("Invalid phone number.");
		
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		
		if (address == null || address.length() > 30)
			throw new IllegalArgumentException("Invalid address");
		
		this.address = address;
	}

	public String getId() {
		return id;
	}

}
