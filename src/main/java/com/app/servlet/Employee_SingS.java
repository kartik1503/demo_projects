package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.classes.Employee_signC;
import com.app.database.DBConnection;
//@WebServlet("/fs")
public class Employee_SingS extends HttpServlet
{
		
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	Employee_signC e=new Employee_signC();
	
	e.setEid(Integer.parseInt(req.getParameter("eId")));
	e.seteName(req.getParameter("eName"));
	e.seteEmail(req.getParameter("eEmail"));
	e.setePassword(req.getParameter("ePassword"));
	e.setePhone(Long.parseLong(req.getParameter("ePhone")));
	
	//Database 
	PreparedStatement pstmt=null;
	String s="insert into leave_management.employee_sign values(?,?,?,?,?)";
	Connection con = DBConnection.getConnection();
	try {
		pstmt=con.prepareStatement(s);
		//set data
		pstmt.setInt(1, e.getEid());
		pstmt.setString(2, e.geteName());
		pstmt.setString(3, e.geteEmail());
		pstmt.setString(4, e.getePassword());
		pstmt.setLong(5, e.getePhone());
		resp.sendRedirect("home.jsp");
	int i=pstmt.executeUpdate();
	if(i!=0)
	{
		System.out.println("Update sucessfully");
	}
	else
	{
		System.out.println("not updated");
	}
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
}
}
