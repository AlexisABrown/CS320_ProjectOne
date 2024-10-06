package TaskServiceTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import TaskService.Task;

class TaskTest {

	@Test
	void testTaskClass() {
		Task task = new Task("Task id", "name test", "description description");
		assertTrue(task.getTaskID().equals("Task id"));
		assertTrue(task.getTaskName().equals("name test"));
		assertTrue(task.getDescription().equals("description description"));
	}
		
		@Test
		void testTaskIDLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("Very Long Task id", "name test", "description description");
			 });      }
		
		@Test
		void testNameLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("Task id", "the name of this task will end up way tooooo looong", "description description");
			 });      }
		
		@Test
		void testDescriptionLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("Task id", "name test", "tell me why is this task description so super ver extremely way too long of a weird task description??????? Its too much for a simple task list right?");
			 });      }
		
		@Test
		void testIDNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task(null, "name test", "description description");
			 });      }
		
		@Test
		void testNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("Task id", null, "description description");
			 });      }
		
		@Test
		void testDescriptionNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("Task id", "name test", null);
			 });      
	}
  
}
