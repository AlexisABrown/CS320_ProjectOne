package ContactServiceTests;

import static org.junit.jupiter.api.Assertions.*;
import ContactService.ContactService;


import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactServiceUpdate() {
		ContactService newc = new ContactService();
		
		//checks to see if they exist 
		assertEquals(true, newc.add("CoolID", "Billy", "Bob", "1562347890", "1811 Anchorage St"));
	    assertEquals(true, newc.add("LameID", "Mary", "Sue", "0001112223", "Runner Rd New York"));
		//updates contact
	    assertEquals(true, newc.update("Strange", "Silly", "Greg", "8675309111", "1118 Fairbanks St"));
	    assertEquals(true, newc.update("WeirdID", "Gary", "Smith", "4024578815", "Walker Rd New Jersey"));
	}
	
	@Test
	void testContactServiceUpdateFail() {
		ContactService newc = new ContactService();
		
		//checks to see if they exist 
		assertEquals(true, newc.add("CoolID", "Billy", "Bob", "1562347890", "1811 Anchorage St"));
	    assertEquals(true, newc.add("LameID", "Mary", "Sue", "0001112223", "Runner Rd New York"));
		//updates contact
	    assertEquals(true, newc.update("CoolID", "Billy", "Bob", "1562347890", "1811 Anchorage St"));
	    assertEquals(false, newc.update("WrongID", "Kary", "Shiba", "4443332221", "Main St"));
	}

}
