package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.classes.Admin_SignC;
import com.app.database.DBConnection;

public class Admin_signS extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
			
	Admin_SignC a=new Admin_SignC();
	
	a.setaId(Integer.parseInt(req.getParameter("aId")));
	a.setaName(req.getParameter("aName"));
	a.setaEmail(req.getParameter("aEmail"));
	a.setaPassword(req.getParameter("aPassword"));
	a.setaDate(Date.valueOf(req.getParameter("adate")));
	a.setaMobile(Long.parseLong(req.getParameter("amobile")));
	
	//database code
	PreparedStatement pstmt=null;
	String sql="insert into admin_sing values(?,?,?,?,?,?)";
	Connection con=DBConnection.getConnection();
	try {
		pstmt=con.prepareStatement(sql);
		
		//set date 
		pstmt.setInt(1, a.getaId());
		pstmt.setString(2, a.getaName());
		pstmt.setString(3,a.getaEmail());
		pstmt.setString(4,a.getaPassword());
		pstmt.setDate(5, a.getaDate());
		pstmt.setLong(6,a.getaId());
		
		int i=pstmt.executeUpdate();
		if(i!=0)
		{
			System.out.println("Update sucessfully");
		}
		else
		{
			System.out.println("not updated");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
