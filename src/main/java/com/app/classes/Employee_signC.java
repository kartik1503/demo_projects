package com.app.classes;

public class Employee_signC 
{

	private int eid;
	private String eName;
	private String eEmail;
	private String ePassword;
	private long ePhone;
	
	
	public Employee_signC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee_signC(int eid, String eName, String eEmail, String ePassword, long ePhone) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eEmail = eEmail;
		this.ePassword = ePassword;
		this.ePhone = ePhone;
	}
	public int getEid() {
		return eid;
		
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public String getePassword() {
		return ePassword;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	public long getePhone() {
		return ePhone;
	}
	public void setePhone(long ePhone) {
		this.ePhone = ePhone;
	}
	
	
	
}
