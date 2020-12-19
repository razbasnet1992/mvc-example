<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
<style>
body {
  background-color: yellow; 
}
</style>
<body>
	<h2>Hello World</h2>
	<form action="<c:url value='/hello'/>" method='POST'>
	  <label>Username:</label>
		 <input type="text" name="username"><br>
		<label>Password:</label>
			<input type="password" name="password"><br> 
			<input type="submit" value="Enter" />
	</form>
</body>
</html>
