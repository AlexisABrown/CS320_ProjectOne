package TaskServiceTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TaskService.TaskService;

class TaskServiceTest {
	
	@BeforeEach
	void testTaskParameters() {
		TaskService t = new TaskService();
		assertEquals(true, t.add("taskid", "namet", "dec"));
	}
	
	@Test
	void testTaskService() {
		
	}
}
