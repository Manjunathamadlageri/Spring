package com.jsp;

import java.util.Map;

public class Company {
	private String companyname;
	private Map<Integer,String> empidandempname;
	public Company(String companyname, Map<Integer, String> empidandempname) {
		super();
		this.companyname = companyname;
		this.empidandempname = empidandempname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Map<Integer, String> getEmpidandempname() {
		return empidandempname;
	}
	public void setEmpidandempname(Map<Integer, String> empidandempname) {
		this.empidandempname = empidandempname;
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", empidandempname=" + empidandempname + "]";
	}

}
