package com.app.classes;

import java.sql.Date;

public class Admin_SignC 
{
	private int aId;
	private String aName;
	private String aEmail;
	private String aPassword;
	private Date  aDate;
	private long aMobile;
	
	
	public Admin_SignC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin_SignC(int aId, String aName, String aEmail, String aPassword, Date aDate, long aMobile) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aEmail = aEmail;
		this.aPassword = aPassword;
		this.aDate = aDate;
		this.aMobile = aMobile;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	public Date getaDate() {
		return aDate;
	}
	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}
	public long getaMobile() {
		return aMobile;
	}
	public void setaMobile(long aMobile) {
		this.aMobile = aMobile;
	}
	
	

}
