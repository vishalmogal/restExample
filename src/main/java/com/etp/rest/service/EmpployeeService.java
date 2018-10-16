package com.etp.rest.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.etp.rest.db.DatabaseUtil;
import com.etp.rest.model.Employee;


public class EmpployeeService {

	private static Map<Long, Employee> employees = DatabaseUtil.getEmployee();

	public EmpployeeService() {

		employees.put(1L, new Employee("Ram", "1"));

		employees.put(2L, new Employee("Sham", "2"));

	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		

		return new ArrayList<Employee>(employees.values());
	}

	public Employee getEmployeeByID(Long empID) {
		return employees.get(empID);
	}

	public Employee saveEmp() {
		
		Employee emp= new Employee();
		emp.setEmpID(employees.size()+1+"");  // 3
		emp.seteName("Mahesh");
		employees.put(Long.parseLong(emp.getEmpID()) , emp);
		
		return emp;
	}

	public Employee delEmp(Long empID) {
		
		employees.remove(empID);
		
		System.out.println(employees);

		
		return 	employees.remove(empID);
	}

	public Employee updateEmp(Long empID, String empName) {
		
		Employee emp= new Employee();
		
		emp.setEmpID(empID +"");
		
		emp.seteName(empName);
		
		employees.put(Long.parseLong(emp.getEmpID()), emp);
		

		// TODO Auto-generated method stub
		return emp;
	}

}
