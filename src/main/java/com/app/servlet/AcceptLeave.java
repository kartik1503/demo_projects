package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.classes.Eployee_LeaveC;
import com.app.database.DBConnection;
import com.mysql.jdbc.Statement;

public class AcceptLeave extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	java.sql.PreparedStatement pstmt1=null;
	java.sql.PreparedStatement pstmt2=null;
	
//	Eployee_LeaveC leave=new Eployee_LeaveC();
	
//	int id=leave.getLid();
	
	String reject="update employee_leave set confirmation='Reject' where lid=?";
	String accept="update employee_leave set confirmation='Accept' where lid=?";
	Connection con=DBConnection.getConnection();
	String a=req.getParameter("confirm");
	int id=Integer.parseInt(req.getParameter("lid"));
	
	
	if(a.equals("Accept"))
	{
		try {
			pstmt1=con.prepareStatement(accept);
			//set data
			pstmt1.setInt(1, id);
			pstmt1.executeUpdate();
			resp.sendRedirect("leave_request_so_admin.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	else
	{
		try {
			pstmt2=con.prepareStatement(reject);
			//set data
			pstmt2.setInt(1, id);
			pstmt2.executeUpdate();
			resp.sendRedirect("leave_request_so_admin.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
}
