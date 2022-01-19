package com.neosoft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Project;
import com.neosoft.repository.ProjectRepository;
import com.neosoft.repository.StudentRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepo;
	
	@Autowired
	private StudentRepository studentRepo;
	
	public Optional<Project> addProject(Long stuId,Project project) {
		return studentRepo.findById(stuId).map(student -> {
			project.setStudent(student);
			return projectRepo.save(project);
		});
	}
	
	public List<Project> getAllProject(){
		return projectRepo.findAll();
	}
	
}
