package ContactServiceTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ContactService.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("Testid", "nametest", "lastname", "1234567890", "32 Street Omaha");
		assertTrue(contact.getId().equals("Testid"));
		assertTrue(contact.getFirstName().equals("nametest"));
		assertTrue(contact.getLastName().equals("lastname"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("32 Street Omaha"));
	}
	
	//See if parameter length tests can be combined into one function 
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("SuperReallyLongID", "nametest", "lastname", "1234567890", "32 Street Omaha");
		 });      }
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("TestID", "ReallySuperLongName", "lastname", "1234567890", "32 Street Omaha");
		 });      }
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("TestID", "nametest", "ReallySuperLongName", "1234567890", "32 Street Omaha");
		 });      }
	
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("TestID", "nametest", "lastname", "123456789012345", "32 Street Omaha");
		 });      }
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("TestID", "nametest", "lastname", "1234567890", "32 Street Omaha Latitude 47 Longitude 48 Near the Equator and Not Antartica");
		 });      }
	
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "nametest", "lastname", "1234567890", "32 Street Omaha");
		 });      }
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("LongID", null, "lastname", "1234567890", "32 Street Omaha");
		 });      }
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("LongID", "nametest", null, "1234567890", "32 Street Omaha");
		 });      }
	
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("LongID", "nametest", "lastname", null, "32 Street Omaha");
		 });      }
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("LongID", "nametest", "lastname", "1234567890", null);
		 });      }

}
