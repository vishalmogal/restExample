package com.etp.rest.db;

import java.util.HashMap;
import java.util.Map;

import com.etp.rest.model.Employee;


public class DatabaseUtil {
	
	
	private static Map<Long, Employee> employee = new HashMap<>();

	public static Map<Long, Employee> getEmployee() {
		return employee;
	}

	public static void setEmployee(Map<Long, Employee> employee) {
		DatabaseUtil.employee = employee;
	}
	
	
	

	 


}
