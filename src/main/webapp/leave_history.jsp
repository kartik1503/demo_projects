
<%@page import="com.app.servlet.Leave_History"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 	uri="http://java.sun.com/jsp/jstl/core"%> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*,com.app.servlet.Employee_leave_Data,com.app.classes.Eployee_LeaveC"%>  
 
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
</head>  
<body>  
  

  
<h1>EMPLOYEE LEAVE HISTORY</h1>  
  
<%  
ArrayList<Eployee_LeaveC> list= Leave_History.get_employee_leave();  
request.setAttribute("list",list);
%>  
  
<table border="1" width="90%">  
<tr><th>Employee Id</th><th>Name</th><th>From</th><th>To</th><th>Reason</th>  
<th>Confirmation</th></tr>  
<c:forEach items="${list}" var="u">
<tr><td>${u.getEid()}</td>
<td>${u.getEname()}</td>
<td>${u.getFdate()}</td>
<td>${u.getTdate()}</td>  
<td>${u.getResion()}</td>
<td>${u.getConfirmation()}</td>
</tr>  
</c:forEach>
</table>  
</body>  
</html>  