package TaskServiceTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TaskService.TaskService;

class TaskServiceTest {
	
	@BeforeEach
	void testTaskParameters() {
		TaskService t = new TaskService();
		assertNotNull(t.add("taskid", "namet", "desc"));
	}
	
	@Test
	void testTaskServiceUpdate() {
		
		TaskService t = new TaskService();
		//checks to see if they exist 
		assertEquals(true, t.add("taskid", "namet", "desc"));
	    assertEquals(true, t.add("taskid", "namet", "desc"));
		//updates contact
	    assertEquals(true, t.update("taskid", "namet", "desc"));
	    assertEquals(false, t.update("fakeID", "noname", "fake description"));
	}
}
