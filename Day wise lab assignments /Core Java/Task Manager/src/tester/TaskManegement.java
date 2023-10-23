package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import static utils.TaskValidation.*;

import com.app.core.Status;
import com.app.core.Task;

import custom_exception.TaskHandlingException;

public class TaskManegement {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner (System.in)){
			boolean close=false;
			HashMap<Integer, Task> tasks=new HashMap<>();
			
			while(!close) {
				try {
//					a. Add New Task                       
//					b. Delete a task                         
//					c. Update task status               
//					d. Display all pending tasks     
//					e. Display all pending tasks for today           
//					f.  Display all tasks sorted by taskDate 
					System.out.println("Enter Option :\n"+"1. Add New Task\n"+ "2.Delete a task\n"
							+ "3. Update task status\n"+ "4. Display all pending tasks\n"
							+ "5.Display all pending tasks for today\n"
							+ "6.Display all tasks sorted by taskDate\n"+"7. Exit");
					switch(sc.nextInt()) {
					case 1:
						System.out.println(" taskName,  description,  taskDate yyyy-mm-dd)");
						Task newTask=validateAll(sc.next(),sc.next(),sc.next(),tasks);
						tasks.put(newTask.getTaskId(), newTask);
						System.out.println("Task added successfulyy");
						break;
					case 2:
						System.out.println("Enter the task ID");
						 newTask=tasks.get(sc.nextInt());
						 if(newTask==null) {
							 throw new TaskHandlingException("Ivalid id");
						if(newTask.getStatus()==false) {
							
						}
						 }
						
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						tasks.forEach((k,v) -> System.out.println("Task Id is :"+k+"Values are :"+v));
						break;
					case 7:
						break;
					}
					
				} catch (Exception e) {
					 System.out.println("An unexpected error occurred: " + e.getMessage());
					e.printStackTrace();
					sc.nextLine();
				}
			}
			
		}//scanner close

	}

	

}
