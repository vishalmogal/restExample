package com.etp.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	

	
	
	
	public Employee() {
		super();
	}

	private String eName;
	
	private String empID;

	public Employee(String eName, String empID) {
		super();
		this.eName = eName;
		this.empID = empID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	
	



}
