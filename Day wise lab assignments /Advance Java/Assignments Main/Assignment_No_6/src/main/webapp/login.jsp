<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="validate.jsp" method="post">
      <table style="background-color: aqua; margin: auto">
        <tr>
          <td>Enter User Email</td>
          <td><input type="text" name="nm" /></td>
        </tr>
        <tr>
          <td>Enter Password</td>
          <td><input type="password" name="pass" /></td>
        </tr>
        <tr>
          <td><input type="submit" value="Login" /></td>
        </tr>
      </table>
    </form>
</body>
</html>