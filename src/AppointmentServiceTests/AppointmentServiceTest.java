package AppointmentServiceTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

import AppointmentService.AppointmentService;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.BeforeEach;

class TaskServiceTest {
	
	@BeforeEach
	void testTaskParameters() {
		AppointmentService app = new AppointmentService();
		assertNotNull(app.add("taskid", "namet", "desc"));
	}
	
	@Test
	void testTaskServiceUpdate() {
		
		AppointmentService app = new AppointmentService();
		//checks to see if they exist 
		assertEquals(true, app.update("appid", "nameapp", "app desc"));
	    assertEquals(true, app.update("appid", "nameapp", "app desc"));
		//updates contact
	    assertEquals(true, app.add("appid", "nameapp", "app desc"));
	    assertEquals(false, app.add("fakeID", "noname", "fake description"));
	}
}
