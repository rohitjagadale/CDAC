package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Student;

/**
 * Servlet implementation class Result
 */
@WebServlet("/result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){
			Student stu = (Student) request.getAttribute("studentDetails");
			if(stu!=null) {
				pw.print("<h4>Hello " + stu.getFirstName() + " " + stu.getLastName() + "</h4>");
				if(stu.isAdmissionStatus()) 
					pw.print("Congratulations!! You are admitted to " + stu.getSelectedCourse() + ".");
				else
					pw.print("BLNT!! You couldnt be admitted to " + stu.getSelectedCourse() + ".");
			}
		}
		
		
	}

}
