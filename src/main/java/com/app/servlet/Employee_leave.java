package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.classes.Employee_signC;
import com.app.database.DBConnection;
import com.mysql.jdbc.Statement;

public class Employee_leave extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Date fdate=Date.valueOf(req.getParameter("fdate"));
		Date tdate=Date.valueOf(req.getParameter("tdate"));
		String data=req.getParameter("area");
		
		String sql="insert into employee_leave(fdate,tdate,data,eid,confirmation) values(?,?,?,?,?)";
		//data base code
		Connection con=DBConnection.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=con.prepareStatement(sql);
			
			 
			//set data..
		    
			pstmt.setDate(1,fdate);
			pstmt.setDate(2,tdate);
			pstmt.setString(3,data);
			pstmt.setInt(4, employee_login.e.getEid());
			pstmt.setString(5,"process");
			pstmt.executeUpdate();
	         resp.sendRedirect("employee_dashboard.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
