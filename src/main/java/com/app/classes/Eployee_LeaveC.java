package com.app.classes;

import java.sql.Date;

public class Eployee_LeaveC
{
private int lid;
private String ename;
private Date fdate;
private Date tdate;
private String resion;
private int eid;
private String confirmation;


public Eployee_LeaveC() {
	super();
	// TODO Auto-generated constructor stub
}


public Eployee_LeaveC(int lid,String ename, Date fdate, Date tdate, String resion, int eid, String confirmation) {
	super();
	this.lid = lid;
	this.ename=ename;
	this.fdate = fdate;
	this.tdate = tdate;
	this.resion = resion;
	this.eid = eid;
	this.confirmation = confirmation;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public int getLid() {
	return lid;
}


public void setLid(int lid) {
	this.lid = lid;
}


public Date getFdate() {
	return fdate;
}


public void setFdate(Date fdate) {
	this.fdate = fdate;
}


public Date getTdate() {
	return tdate;
}


public void setTdate(Date tdate) {
	this.tdate = tdate;
}


public String getResion() {
	return resion;
}


public void setResion(String resion) {
	this.resion = resion;
}


public int getEid() {
	return eid;
}


public void setEid(int eid) {
	this.eid = eid;
}


public String getConfirmation() {
	return confirmation;
}


public void setConfirmation(String confirmation) {
	this.confirmation = confirmation;
}


@Override
public String toString() {
	return "Eployee_LeaveC [lid=" + lid + ", ename=" + ename + ", fdate=" + fdate + ", tdate=" + tdate + ", resion="
			+ resion + ", eid=" + eid + ", confirmation=" + confirmation + "]";
}






}
