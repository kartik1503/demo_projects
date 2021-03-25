package com.app.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.classes.Eployee_LeaveC;
import com.app.database.DBConnection;

public class Leave_History
{
	public static ArrayList<Eployee_LeaveC> get_employee_leave()throws SQLException {
		Connection con=DBConnection.getConnection();
		ArrayList<Eployee_LeaveC> obj = new ArrayList<Eployee_LeaveC>();
		String sql="SELECT l.lid, e.ename, l.fdate,l.tdate,l.data,l.eid,l.confirmation FROM employee_leave l LEFT JOIN employee_sign e ON e.eid=l.eid where confirmation in ('Accept','Reject')";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		//data from leave table
		while(rs.next()) {
		    Eployee_LeaveC x = new Eployee_LeaveC();
		       x.setLid(rs.getInt("lid"));
		       x.setEname(rs.getString("ename"));
		       x.setFdate(rs.getDate("fdate"));
		       x.setTdate(rs.getDate("tdate"));
		       x.setResion(rs.getString("data"));
		       x.setEid(rs.getInt("eid"));
		       x.setConfirmation(rs.getString("confirmation"));
		       obj.add(x);
		}
		 return obj;
		}
}
