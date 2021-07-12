package com.Studentcurdoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Studentcurdoperation.entity.Students;
import com.Studentcurdoperation.services.StudentService;

@RestController
public class StudentController {
 @Autowired
	private  StudentService studentsservice;
	@PostMapping("save")
	public Students createstudents(@RequestBody Students student)
	{
	return	studentsservice.createStudents( student);
		
		
	}

	@GetMapping("Student{id}")
	public  Students getstudents(@RequestBody long id)
	{
		return studentsservice.getstudents(id);
		
	}
	@GetMapping("students")
	public List<Students> getallStudents(List<Students> students)
	{
		return studentsservice.getallstudent();
		
	}
	@DeleteMapping("student{id}")
	public String deletestudent(long id)
	{
		return studentsservice.deletestudent(id);
		
	}
	
}
