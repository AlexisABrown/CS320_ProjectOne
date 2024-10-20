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
	
	private Task searchForTask(String taskID) throws Exception {
	    int index = 0;
	    while (index < taskList.size()) {
	      if (taskID.equals(taskList.get(index).getTaskID())) {
	        return taskList.get(index);
	      }
	      index++;
	    }
	    throw new Exception("The Task does not exist!");
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
	
	public void remove(String taskID, String taskName, String description) throws Exception {
		searchForTask(taskID);
		taskList.remove(taskID);
	}
}