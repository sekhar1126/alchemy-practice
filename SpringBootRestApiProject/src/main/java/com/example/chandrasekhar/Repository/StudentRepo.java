package com.example.chandrasekhar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chandrasekhar.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	
}
