package com.student.controller;

import com.student.model.Address;
import com.student.model.Student;
import com.student.util.ScannerUtil;

public class StudentController {
	
	
	
	public Student addNewStudent() {
		
		Student student = new Student();
		Address address = new Address();
		
		student.setRollNo(ScannerUtil.getInt("Enter roll no : "));
		student.setfName(ScannerUtil.getString("Enter First Name : "));
		student.setlName(ScannerUtil.getString("Enter last Name :"));
		student.setMobileNo(ScannerUtil.getLong("Enter Mobile number : "));
		
		address.setStreet(ScannerUtil.getString("Enter Street :"));
		address.setTown(ScannerUtil.getString("Enter Town : "));
		address.setCity(ScannerUtil.getString("Enter City : "));
		address.setPincode(ScannerUtil.getInt("Enter pincode : "));
		address.setState(ScannerUtil.getString("Enter State : "));
		
		student.setAddress(address);
		
		return student;
	}
}
