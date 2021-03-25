<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#main {
margin-left: 400px;


}
</style>
</head>
<body>
<div id="main">
<form action="leave" method="post">
<h1>MENTION FOR LEAVE</h1>
<br>
From :<input type="date" placeholder="D.O.B" name="fdate"> 
<br>
<br>
To :<input type="date" placeholder="D.O.B" name="tdate"> 
<br>
<br>
Resion <br>
<textarea  name="area" rows="4" cols="50"> </textarea>
<br>
<br>
 <button type="submit">Apply</button>
 <br></br>
 <input type="reset" value="Reset">
 <br></br>
 </div>
</form>
</body>
</html>