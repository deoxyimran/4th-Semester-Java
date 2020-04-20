import java.util.Date

public class Task extends Date {
	private int id; // getter
	private String taskName; //getter, setter
	private boolean isDone; // getter, setter
	private Date taskCreated; // getter, setter
	private Date taskCompleted; // getter, setter
	private Date deadline; // getter, setter
	private static int autoIncrementingId = 1;
	
	public Task(String taskName, Date deadline) {
		this.taskName = taskName;
		id = autoIncrementingId++;
		this.deadline = deadline;
		isDone = false;
		taskCreated = new Date();
	}
	// getters and setters below
	public int getId() { return id; }
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}

	public boolean getIsDone() { return isDone; }
	
	public void setTaskCreatedDate(Date taskCreated) {
		this.taskCreated = taskCreated;
	}
	
	public Date getTaskCreatedDate() {
		return taskCreated;
	}
	
	public void setTaskCompletedDate(Date taskCompleted) {
		this.taskCompleted = taskCompleted;
	}
	
	public void getTaskCompletedDate() {
		return taskCompleted;
	}
	
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	public void getDeadline() {
		return deadline;
	}
}