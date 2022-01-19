package com.neosoft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Student;
import com.neosoft.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public Optional<Student> getStudentById(Long id){
		return studentRepo.findById(id);
	}
}
