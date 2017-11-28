<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo !!!!! FROM JSP</title>
</head>
<body>
<form action="login.do" method ="post">
Enter your name <input id="crate" type="text" name="name"/> Password<input type="password" name="password"/> <input type="submit" value="Submit"/>
<form action="login.do" method="get">
  Choose your favorite subject:
  <button name="subject" type="submit" value="HTML">HTML</button>
  <button name="subject" type="submit" value="CSS">CSS</button>
</form>
</form>
</body>
</html>

<!-- Valid User -> welcome.jsp -->>
<!-- Invalid User -> login.jsp-->>