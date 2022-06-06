package com.student.services;

import java.util.ArrayList;
import java.util.List;

import com.student.interfaces.StudentManagement;
import com.student.model.Student;

public class StdMngntInplementation implements StudentManagement {
	
	final List<Student> student1 = new ArrayList<Student>();
	

	@Override
	public void addNewStudent(Student student) {
		student1.add(student);
		System.out.println("New Student Added Success");
		
	}

	@Override
	public void updateStudentByRollNo(Student student, int rollNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student removeStudentByRollNo(int rollNo) {
		for(int i = 0; i<student1.size();i++) {
			Student student = student1.get(i);
			if(rollNo == student.getRollNo()) {
				student1.remove(student);
			}
			else {
				System.out.println("Student not found ! Enter valid rollno");
			}
		}
		
		return null;
	
		
		
	}

	@Override
	public void findStudentByRollNo(int rollNo) {
		
		
		
	}

	@Override
	public Student findByRollNo(int rollNo) {
		
		for(int i = 0; i<student1.size();i++) {
			Student student = student1.get(i);
			if(rollNo == student.getRollNo()) {
				return student;
			}
		}
		return null;
	}

	@Override
	public Student findByFName(String fNAme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudent() {
		
		return student1;
	}
 
}
