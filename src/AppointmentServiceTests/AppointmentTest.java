package AppointmentServiceTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

import AppointmentService.Appointment;

class AppointmentTest {
	//set date and time for testing
	Calendar c = Calendar.getInstance();
	Date date = c.getTime();
	
	@Test
	void testAppoitnemntClass() {
		c.set(2024, 10, 11, 12, 13);
		
		Appointment a = new Appointment("appt id", date, "appt description");
		assertTrue(a.getAppointmentId().equals("appt id"));
		assertTrue(a.getDate().equals(date));
		assertTrue(a.getAppointmentDescription().equals("appt description"));
	}
	
	//@Test check appointment parameters 
	
	@Test 
	void setterTest() {
		c.set(2024, 10, 11, 12, 13);
		Appointment a = new Appointment("numberid", date, "testing description");
		
		a.setAppointmentDescription("write a description");
		assertTrue(a.getAppointmentDescription().equals("testing description"));
	}
	
	//@Test remove appointments
}