package com.app.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.classes.Employee_signC;
import com.app.classes.Eployee_LeaveC;
import com.app.database.DBConnection;

public class Employee_Detail 
{
	public static ArrayList<Employee_signC> get_employee_leave()throws SQLException {
		Connection con=DBConnection.getConnection();

		ArrayList<Employee_signC> obj = new ArrayList<Employee_signC>();
		// sql="SELECT l.lid, e.ename, l.fdate,l.tdate,l.data,l.eid,l.confirmation FROM employee_leave l LEFT JOIN employee_sign e ON e.eid=l.eid where confirmation='process'";
		String sql="select * from employee_sign";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		//data from leave table
		while(rs.next()) {
		    Employee_signC x=new Employee_signC();
		    
		       x.setEid(rs.getInt("eid"));
		       x.seteName(rs.getString("ename"));
		       x.seteEmail(rs.getString("eemail"));
		       x.setePhone(rs.getLong("ephone"));
		       
		       obj.add(x);
		      
		}
		 return obj;
		}
}
