package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class RegisterNewVoter
 */
@WebServlet("/signup")
public class RegisterNewVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDaoImpl userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void init() throws ServletException {
		System.out.println("in init of " + getClass());
		try {
			// create user dao instance
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// centralized err handling
			throw new ServletException("err in init of " + getClass(), e);
		}
	}
    public void destroy() {
		System.out.println("in destroy of " + getClass());
		try {
			userDao.cleanUp();
		} catch (Exception e) {
			// inform WC about the err : OPTIONAL !
			throw new RuntimeException("err in destroy of " + getClass(), e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter()){
			String firstName = request.getParameter("fname");
			String lastName = request.getParameter("lname");
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			Date dateOfBirth = Date.valueOf(request.getParameter("dob"));
			
			Period p1 = Period.between(dateOfBirth.toLocalDate(),LocalDate.now());
			int y = p1.getYears();
			if(y<21) {
				pw.print("Age is not valid<a href='register.html'>Go Back</a>");
			}
			else {
				try {
					
					String mesg = userDao.registerNewVoter(new User(firstName,lastName,email,pwd,dateOfBirth));
					pw.print(mesg);
				}catch (Exception e) {
					pw.print("<h4>"+e.getMessage()+"<a href='register.html'> Go Back </a>"+"</h4>");
				}
				
			}
//			if ((LocalDate.now().getYear() - dateOfBirth.toLocalDate().getYear()) < 21) {
//				pw.print("Age below 21 <a href='register.html'> Go Back </a>");
//
//			} else {
//				try {
//					String msg = userDao.registerNewVoter(new User(firstName,lastName,email,pwd,dateOfBirth));
//					pw.print(msg);
//				} catch (Exception e) {
//					pw.print("<h4>"+e.getMessage()+"<a href='register.html'> Go Back </a>"+"</h4>");
//				}
//			}
		}
	}

}
