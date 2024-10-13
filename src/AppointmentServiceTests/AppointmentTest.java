package AppointmentServiceTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

import AppointmentService.Appointment;

class AppointmentTest {
	@Test
	void testAppoitnemntClass() {
		//set date and time for testing
		Calendar c = Calendar.getInstance();
		c.set(2024, 10, 11, 12, 13);
		Date date = c.getTime();
		
		Appointment a = new Appointment("appt id", date, "appt description");
		assertTrue(a.getAppointmentId().equals("appt id"));
		assertTrue(a.getDate().equals(date));
		assertTrue(a.getAppointmentDescription().equals("appt description"));
	}
	
	//@Test check appointment parameters 
	
	//@Test update appointments
	
	//@Test remove appointments
}