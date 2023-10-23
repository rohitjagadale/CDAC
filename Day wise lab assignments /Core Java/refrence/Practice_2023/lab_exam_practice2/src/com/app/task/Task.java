package com.app.task;

import java.time.LocalDate;

public class Task {

	

	private int taskId;
	private String taskName;
	private String description; 
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	private static int idGenerator;
	static {
		idGenerator = 1000;
	}
	public Task(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskId = ++idGenerator;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = Status.PENDING;
		this.active = true;
	}
	
	public Task(int taskId) {
		this.taskId = taskId;
	}
	
	public LocalDate getTaskDate() {
		return taskDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Task)
		{
			Task anotherTask = (Task)obj;
			return this.taskId==anotherTask.taskId;
		}
		return false;
	}
	
}
