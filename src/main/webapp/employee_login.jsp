<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee login</title>
<style type="text/css">
#main {
margin-left: 400px;


}

</style>
</head>
<body>
<div id="main">
<h1>EMPLOYEE LOGIN PAGE</h1>
<form action="elogin" method="post">

 <input type="text" placeholder="Email Id" name="eId">
 <br></br>
  <input type="password" placeholder="password" name="pass">
   <br></br>
  <a href="employee_option.jsp"><button>Login</button></a>
  <br></br>
  
</form>
<a href="employee_sign.jsp"><button>Create Account</button></a>
</div>
</body>
</html>