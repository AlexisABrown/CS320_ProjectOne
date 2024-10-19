/*
Task Service Requirements

    The task service shall be able to add tasks with a unique ID.
    The task service shall be able to delete tasks per task ID.
    The task service shall be able to update task fields per task ID. The following fields are updatable:
        Name
        Description
*/
package TaskService;

import java.util.ArrayList;

public class TaskService {
	private ArrayList<Task> taskList;
	
	public TaskService() {
		taskList = new ArrayList<>();
	}
	public boolean update(String taskID, String taskName, String description) {
	       for (Task t : taskList) {
	           if (t.getTaskID().equals(taskID)) {
	               if (!taskName.equals(""))
	                   t.setTaskName(taskName);
	               if (!description.equals(""))
	                   t.setDescription(description);
	               return true;
	           }
	       }
	       return false;
	   }
	
	public Object add(String taskID, String taskName, String description) {
		return null;
	}
	
	public Object remove(String taskID, String taskName, String description) {
		return null;
	}
}