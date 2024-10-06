/*
    Task Class Requirements

    The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
    The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
    The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null. 
 */

package TaskService;

public class Task {
	private String taskID;
	private String taskName;
	private String description;
	
	public Task(String taskID, String taskName, String description) {
		if(taskID == null || taskID.length()>10) {
			throw new IllegalArgumentException("Task ID needs to be between 1 and 10 characters");
		}
		if(taskName == null || taskName.length()>20) {
			throw new IllegalArgumentException("Task name needs to be between 1 and 20 characters");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Description needs to be between 1 and 50 characters");
		}
	}
	{
		this.setTaskID(taskID);
		this.setTaskName(taskName);
		this.setDescription(description);
	}
	
	//Getters and Setters 
		public String getTaskID() {
			return taskID;
		}

		public void setTaskID(String taskID) {
			this.taskID = taskID;
		}
		
		public String getTaskName() {
			return taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
}