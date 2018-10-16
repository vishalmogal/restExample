package com.etp.rest.resource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.etp.rest.model.Employee;
import com.etp.rest.service.EmpployeeService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("empresource")
public class EmpResource {

	private static EmpployeeService empployeeService = new EmpployeeService();

	// Get LIST OF EMPLOYEE
	// http://localhost:8080/MyRESTPROJ/webapi/empresource/

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmployee() {

		return empployeeService.getAllEmployee();
	}

	// GET SINGLE EMP BY ID

	// http://localhost:8080/MyRESTPROJ/webapi/empresource/1

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{empID}")
	public Employee EmployeeByID(@PathParam("empID") Long empID) {

		return empployeeService.getEmployeeByID(empID);
	}

	// http://localhost:8080/MyRESTPROJ/webapi/empresource/saveEmp

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Path("/saveEmp")
	public Employee saveEmployee() {

		return empployeeService.saveEmp();
	}

	// http://localhost:8080/MyRESTPROJ/webapi/empresource/

	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{empID}")
	public Employee delEmployee(@PathParam("empID") Long empID) {

		return empployeeService.delEmp(empID);
	}

	//http://localhost:8080/MyRESTPROJ/webapi/empresource/1/pratik
	
	@PUT
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{empID}/{empName}")
	public Employee updateEmployee(@PathParam("empID") Long empID,@PathParam("empName") String empName) {

		return empployeeService.updateEmp(empID,empName);
	}


}
