package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import static utils.TaskValidationRules.*;
import static utils.TaskUtils.findTaskById;

import com.app.task.Status;
import com.app.task.Task;
import static com.app.task.Status.valueOf;
import custom_exception.TaskHandlingException;
//import custom_ordering.TaskComparator;

public class TaskManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			List<Task> taskList = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Option :\n"+"1. Add New Task\n"+ "2. Delete a task\n"
						+ "3. Update task status\n"+ "4. Display all pending tasks\n"
						+ "5. Display all pending tasks for today\n"
						+ "6. Display all tasks sorted by taskDate\n"+"7. Exit");
				try {
					switch(sc.nextInt()) {
					case 1://Add new task
						System.out.println("Enter taskName, description,taskDate");
						Task t1 = new Task(sc.next(),sc.next(), parseAndValidateDate(sc.next()));
						taskList.add(t1);
						System.out.println("Task is added");
						break;
						
					case 2://Delete a task
						System.out.println("Enter the taskId");
						Task task = findTaskById(sc.nextInt(), taskList);
						boolean check = taskList.remove(task);
						if(check)
							System.out.println("Task is deleted");
						else
							throw new TaskHandlingException("Task is not deleted : Invalid taskId");
						break;
						
					case 3://Update task status
						
						System.out.println("Enter the taskid & status to be updated");
						task = findTaskById(sc.nextInt(), taskList);
					    Status s = parseAndValidateStatus(sc.next());
						task.setStatus(s);
						System.out.println("Status is updated");
						break;
						
					case 4://Display all pending tasks
						System.out.println("All pending tasks");
						for(Task t:taskList) {
							if(t.getStatus()==Status.PENDING)
								System.out.println(t);
						}
						break;
						
					case 5://Display all pending tasks for today
						System.out.println("All pending tasks");
						for(Task t:taskList) {
							if(t.getStatus()==Status.PENDING && t.getTaskDate().equals(LocalDate.now()))
								System.out.println(t);
						}
						break;
						
					case 6://Display all tasks sorted by taskDate
						//Collections.sort(taskList,new TaskComparator());
						System.out.println("All tasks sorted by taskDate");
						Collections.sort(taskList,(p1,p2)->p1.getTaskDate().compareTo(p2.getTaskDate()));
						for(Task t:taskList) {
								System.out.println(t);
						}
						break;
						
					case 7://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
					}
					
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		
		}
	}

}
