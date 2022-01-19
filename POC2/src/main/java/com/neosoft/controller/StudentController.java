package com.neosoft.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Student;
import com.neosoft.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudentDetails(@Valid @RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudentsDetails(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/student/id/{id}")
	public Optional<Student> getStudentDetailsById(@PathVariable Long id){
		return studentService.getStudentById(id);
	}
	
}
