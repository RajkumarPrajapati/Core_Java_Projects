package com.student.controller;

import java.util.Scanner;

import com.student.model.Student;
import com.student.services.StdMngntInplementation;
import com.student.util.ScannerUtil;

public class Main {

	public static void main(String[] args) {
		
		StudentController sController = new StudentController();
		StdMngntInplementation sManagement  = new StdMngntInplementation();
		
		int x = 1;
		do {
		System.out.println("**********Menu**********\n 1.Add new student\n 2.Remove student\n 3.Show all student\n "
				+"4.Find student by roll no");
		int choice = ScannerUtil.getInt("Enter Your Choice : ");
		
		switch(choice) {
		case 1:
			Student student1 = sController.addNewStudent();
			sManagement.addNewStudent(student1);
			
			
			break;
		case 2:
			int rollNo = ScannerUtil.getInt("Enter roll no to delete student : ");
			sManagement.removeStudentByRollNo(rollNo);
			System.out.println("Student removed success");
			
		
			
			
			break;
		case 3:
			System.out.println(sManagement.findAllStudent());
			break;
			
		case 4:
			Student student = sManagement.findByRollNo(ScannerUtil.getInt("Enter the roll no : "));
			System.out.println(student);
			
			break;
			
			default:
			break;
		}
				
		x = ScannerUtil.getInt("Do you want to continue....Press 1");
		}while(x == 1); 
			
	}

}
