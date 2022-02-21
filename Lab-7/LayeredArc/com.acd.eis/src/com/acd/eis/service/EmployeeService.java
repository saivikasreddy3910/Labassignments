package com.acd.eis.service;

import com.acd.eis.bean.Employee;

public interface EmployeeService 
{
	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);

}
