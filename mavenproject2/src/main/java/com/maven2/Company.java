package com.maven2;

public class Company 
{
	private int companyid;
	private String companyname;
	private String location;
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", location=" + location + "]";
	}
	
}
