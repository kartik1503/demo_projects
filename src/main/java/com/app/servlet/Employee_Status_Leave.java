package com.app.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.classes.Eployee_LeaveC;
import com.app.database.DBConnection;

public class Employee_Status_Leave {
	public static ArrayList<Eployee_LeaveC> get_employee_status() throws SQLException {
		Connection con = DBConnection.getConnection();

		ArrayList<Eployee_LeaveC> obj = new ArrayList<Eployee_LeaveC>();
		//String sql = "l.eid,e.ename,l.confirmation FROM employee_leave l LEFT JOIN employee_sign e ON e.eid=l.eid ";
		String sql = "select * from employee_sign natural join employee_leave";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		// data from leave table
		while (rs.next()) {
			Eployee_LeaveC x = new Eployee_LeaveC();

			x.setEid(rs.getInt("eid"));
			x.setEname(rs.getString("ename"));
			x.setConfirmation(rs.getString("confirmation"));
			obj.add(x);

		}
		return obj;
	}
}
