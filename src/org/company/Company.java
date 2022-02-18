package org.company;

import org.emp.Employee;

public class Company {
	private void CompanyID() {
		System.out.println("company id is 123");

	}
	
	private void CompanyName() {
		System.out.println("Company name RDH");

	}
	public static void main(String[] args) {
		Employee emp =new  Employee();
		emp.empID();
		emp.EmpName();
		
		Company com =new Company();
		com.CompanyName();
		com.CompanyID();
	}

}
