/*
The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
    firstName
    lastName
    Number
    Address
*/
package ContactService;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<>();
	}
	public boolean update(String id, String firstName, String lastName, String phone, String address) {
	       for (Contact c : contactList) {
	           if (c.getId().equals(id)) {
	               if (!firstName.equals(""))
	                   c.setFirstName(firstName);
	               if (!lastName.equals(""))
	                   c.setLastName(lastName);
	               if (!phone.equals(""))
	                   c.setPhone(phone);
	               if (!address.equals(""))
	                   c.setAddress(address);
	               return true;
	           }
	       }
	       return false;
	   }
	public Object add(String id, String firstName, String lastName, String phone, String address) {
		
		return null;
	}
}