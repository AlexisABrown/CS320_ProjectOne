/*
    The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
    The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
    The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
    The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
    The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
 */

package ContactService;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("ID needs to be 10 characters");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("First name needs to be between 1 and 10 characters");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Last name needs to be between 1 and 10 characters");
		}
		if(phone == null || phone.length()>10) {
			throw new IllegalArgumentException("Phone number needs to be 10 digits");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Address must be between 1 and 30 characters");
		}
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
		this.setAddress(address);
	}

	//Getters and Setters 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
