package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.service.EmployeeService;


@Component(value = "controller")
public class MainController {

	@Autowired
	public EmployeeService employeeService;

	static {
		System.out.println("MainController.class file is loading...");
	}

	public MainController() {
		System.out.println("MainController :: Zero param constructor...");
	}
	

	@Override
	public String toString() {
		return "MainController [employeeService=" + employeeService + "]";
	}

}
