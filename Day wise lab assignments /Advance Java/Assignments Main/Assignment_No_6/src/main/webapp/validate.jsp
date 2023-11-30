<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="pojos.User"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate</title>
</head>

	<%!

		HashMap<String,User> users ;	
		
	public void jspInit() {
		System.out.println("In init of validate"+ Thread.currentThread());
		
		System.out.println("init " + Thread.currentThread());
		users = new HashMap<>();
		users.put("Rama Vaidya", new User("Rama Vaidya", "1234", 30));
		users.put("Mihir Rao", new User("Mihir Rao", "2234", 34));
		
	}
	
	%>
	<!--  init end -->
<body>
	<%
	String name = request.getParameter("nm");
	String pwd = request.getParameter("pass");
	
	User newUser = users.get(name);
	
	if(newUser!=null){
		
		if(newUser.getPassword().equals(pwd)){
			session.setAttribute("user_details", newUser);
			response.sendRedirect("details.jsp");
		}
		else{
			%>
			<h4 style="color:red">Invalid Password pls </h4>
			<a href="login.jsp">RETRY</a>
			<% 
		}
	}
	
	else{
		%>
		<h4 style ="color:red;">
		
		New user!!!
		<a href="new_user.jsp">Register for new user</a>
		</h4>
		
		
		
		<%
	}
	%>
	
	
	
</body>
</html>