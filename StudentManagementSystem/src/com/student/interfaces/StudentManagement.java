package com.student.interfaces;

import java.util.List;

import com.student.model.Student;

public interface StudentManagement {
	
	void addNewStudent(final Student student);
	
	void updateStudentByRollNo(Student student, int rollNo);
	
	Student removeStudentByRollNo(int rollNo);
	
	void findStudentByRollNo(int rollNo);
	
	Student findByRollNo(int rollNo);
	
	Student findByFName(String fNAme);
	
	List<Student> findAllStudent();
}
