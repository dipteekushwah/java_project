package com.Studentcurdoperation.services;

import java.util.List;

import com.Studentcurdoperation.entity.Students;

public interface StudentService {
public 	List<Students> getallstudent();
 public	Students createStudents(Students students);
	
public 	Students getstudents(long id);
public 	String deletestudent(long id);
	
	
	
	

}
