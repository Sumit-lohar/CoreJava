package com.Ptpl;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
      
	private String studentName;
	private int studentAge;
	
	
	public Person(String studentName, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public abstract void displayInfo();
	
}


class Student extends Person implements Displayable {

	   private final int studentId;
	   
	    // in array //private String[] courses;
	   
	   //Private List<String> courses;
	
	
	public Student(String studentName, int studentAge,int studentId) {
		super(studentName, studentAge);
		this.studentId =  studentId;
	}

	
	public int getStudentId() {
		return studentId;
	}


	@Override
	public void displayInfo() {
         System.out.println("Student Name : "+getStudentName());
         System.out.println("Student Age : "+getStudentAge());
         System.out.println("Student Id : "+getStudentId());
         
         
        
	}
}

interface Displayable{
	void displayInfo();
}

class StudentManagement {
	
	private List<Student> students = new ArrayList<Student>();
	
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public Student findStudent(int studentId) {
		for(Student stu : students) {
			if(stu.getStudentId() == studentId) {
				return stu;
			}
		}
		return null;
		
	}
	
	public void updateStudent(Student stud) {
		for(int i = 0; i<students.size();i++) {
			if(students.get(i).getStudentId() == stud.getStudentId()) {
			  students.set(i, stud);
			}
		}
	}
	
	public void deleteStudent(int studentId) {
		students.removeIf(stude -> stude.getStudentId() == studentId);
	}

	
	
}


