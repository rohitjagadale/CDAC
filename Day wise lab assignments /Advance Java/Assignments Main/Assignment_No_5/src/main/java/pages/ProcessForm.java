package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Course;
import pojos.Student;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/processForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){
			pw.print("<h4>Student not found!! Kindly go to <a href='admission_form.html'>register page</a> and try again></h4> ");
			//pw.print("<h4>From first page</h4>");
			String fName = request.getParameter("fname");
			String lName = request.getParameter("lname");
			if(fName.isBlank() || lName.isBlank()) {
				pw.print("Name cannot be blank!!");
				throw new ServletException("Name cannot be blank!!");
			}
			int marks = Integer.parseInt(request.getParameter("score"));
			Course course = Course.valueOf(request.getParameter("course"));
			Student stu = new Student(fName, lName, marks, course);
			if(marks>course.getMinMarks())
				stu.setAdmissionStatus(true);
			request.setAttribute("studentDetails", stu);
			RequestDispatcher rd = request.getRequestDispatcher("result");
			rd.forward(request, response);
			System.out.println("Control comes back...");
		}
	}

}
