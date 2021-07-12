package com.Studentcurdoperation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Studentcurdoperation.entity.Students;
import com.Studentcurdoperation.repo.StudentsRepo;

@Service
public class Studentsserviceiml implements StudentService{

	@Autowired
private	StudentsRepo studentsrepo;
	@Override
	public List<Students> getallstudent() {
		// TODO Auto-generated method stub
		return studentsrepo.findAll();
	}

	@Override
	public Students createStudents(Students students) {
		// TODO Auto-generated method stub
		return studentsrepo.save(students);
	}

	

	@Override
	public Students getstudents(long id) {
		// TODO Auto-generated method stub
		return studentsrepo.getById(id);
	}

	@Override
	public String deletestudent(long id) {
		// TODO Auto-generated method stub
		 studentsrepo.deleteById(id);
		 return "delete data";
	}

	

	
	

}
