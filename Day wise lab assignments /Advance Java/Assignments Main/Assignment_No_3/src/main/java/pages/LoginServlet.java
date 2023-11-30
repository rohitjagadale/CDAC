package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/authenticate", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private UserDaoImpl userDao;

	/**
	 * @see Servlet#init()
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

	/**
	 * @see Servlet#destroy()
	 */
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. set resp cont type
		response.setContentType("text/html");
		// 2. get PW to send buffered text resp to the clnt
		try (PrintWriter pw = response.getWriter()) {
			// 3. Read req params
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			// 4. invoke user dao's method for auth
			User user = userDao.authenticateUser(email, pwd);
			if (user == null) // => invalid login
				pw.print("<h4> Invalid Login Please <a href='login.html'>Retry</a></h4>");
			else // login successful
			{
				pw.print("<h4>Successful Login , User Details " + user + "</h4>");
				//role based authorization
				if(user.getRole().equals("admin"))
					response.sendRedirect("admin_page");
				else { //voter role
					if(user.isVotingStatus()) //alrdy voted voter
						response.sendRedirect("logout");
					else //not yet voted
						response.sendRedirect("candidate_list");						
				}
			}
		} catch (Exception e) {
			throw new ServletException("err in do-post" + getClass(), e);
		}
	}

}
