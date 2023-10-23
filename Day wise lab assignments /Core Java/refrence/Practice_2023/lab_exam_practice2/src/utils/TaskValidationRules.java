package utils;

import java.time.LocalDate;
import java.util.List;

import com.app.task.*;

import com.app.task.Task;

import custom_exception.TaskHandlingException;

public class TaskValidationRules {
	public static void checkDupTaskId(int id,List<Task> tList) throws TaskHandlingException {
		Task t1 = new Task(id);
		if(tList.contains(t1))
			throw new TaskHandlingException("Duplicate task id detected");
		System.out.println("No duplicates");
	}
	
	public static Status parseAndValidateStatus(String status) {
		return Status.valueOf(status.toUpperCase());
	}
	
	public static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}
	
	
}
