package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.database.DBConnection;

public class Admin_Login extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username=req.getParameter("eId");
		String password=req.getParameter("pass");
		
		String s="select * from admin_sing where aemail=? and apassword=?";
		
		Connection con=DBConnection.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=con.prepareStatement(s);
			//set data
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
		  rs=pstmt.executeQuery();
		  
		  //chack emailid and password
		  if(rs.next())
		  {
			  RequestDispatcher rd=req.getRequestDispatcher("/admin_dashboard.jsp");   
			  rd.forward(req, resp);
		  }
		  else
		  {
			  RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
			  rd.forward(req, resp);
		  }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
