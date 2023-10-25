package utils;

import java.util.List;

import com.app.task.Task;

import custom_exception.TaskHandlingException;

public class TaskUtils {
	public static Task findTaskById(int id,List<Task> taskList) throws TaskHandlingException {
		Task t = new Task(id);
		int index = taskList.indexOf(t);
		if(index == -1)
			throw new TaskHandlingException("Task is not found : Invalid taskId");
	
		return taskList.get(index);
		
	}
}
