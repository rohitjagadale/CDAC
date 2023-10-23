package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;

import com.app.core.Status;
import com.app.core.Task;

import custom_exception.TaskHandlingException;

public class TaskValidation  {
	public static void checkDups(int taskId,HashMap<Integer,Task>tasks) throws TaskHandlingException {
		if(tasks.containsKey(taskId)) {
			throw new TaskHandlingException("Duplicate Task Found"); 
		}
		System.out.println("No dulpicate Found");
	}
	
	public static LocalDate parseAndValiDate(String date) throws DateTimeParseException{
		return LocalDate.parse(date);
	}
	
	public static Status parseStatus(String status)throws IllegalArgumentException{
		return Status.valueOf(status.toUpperCase());
	}
	
	public static Task validateAll(String taskName, String description, String taskDate,HashMap<Integer, Task>tasks)throws TaskHandlingException,DateTimeParseException,IllegalArgumentException{
		LocalDate newDate=parseAndValiDate(taskDate);
		
		return new Task( taskName,  description,  newDate);
	}
}
