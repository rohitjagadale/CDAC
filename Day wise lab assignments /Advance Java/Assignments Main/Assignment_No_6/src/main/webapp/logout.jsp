<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout page</title>
</head>
<body>
	<h3> Hello </h3>
	
	${sessionScope.user_details.getUsername()}
	${session.invalidate()}
	<h3> Logout Successful</h3>
	<a href="login.jsp">Login for new User</a>
</body>
</html>