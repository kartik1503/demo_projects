<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign employee</title>
<style type="text/css">
#main {
margin-left: 400px;


}
</style>
</head>
<body>
<div id="main">
<form action="employee" method="post">
  <h2>CREATE EMPLOYEE ACCOUNT</h2>
  <br></br>
    <input type="text" placeholder="Id" name="eId">
<br></br>

    <input type="text" placeholder="Name" name="eName">
  <br></br>
  
    <input type="text" placeholder="Email Id" name="eEmail">
<br></br>

    <input type="password" placeholder="Password" name="ePassword">
<br></br>

    <input type="text" placeholder="Mobile No" name="ePhone">
<br></br>
  <br></br>
<a href="employee_login.jsp"><button type="submit">Register</button></a>
<br></br>
  <br>
</form>
<a href="home.jsp"><button type="submit">Home</button></a>
<br></br>
</div>
</body>

</html>