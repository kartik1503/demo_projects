package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.classes.Employee_signC;
import com.app.database.DBConnection;

public class employee_login extends HttpServlet
{
	public static Employee_signC e;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username=req.getParameter("eId");
		String password=req.getParameter("pass");
		
		String s="select * from employee_sign where eemail=? and epassword=?";
		
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
			e=new Employee_signC(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getLong(5));
			  Cookie ck=new Cookie("name",username);  
	            resp.addCookie(ck); 
			  RequestDispatcher rd=req.getRequestDispatcher("/employee_leave.jsp");
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
