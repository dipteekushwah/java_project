package com.Studentcurdoperation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Studentcurdoperation.entity.Students;
@Repository
public interface StudentsRepo extends JpaRepository<Students, Long> {

	
	

}
