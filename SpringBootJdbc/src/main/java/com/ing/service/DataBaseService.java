package com.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ing.model.Parent;
import com.ing.model.Student;
import com.ing.repo.ParentRepo;
import com.ing.repo.StudentRepo;

@Service
@Component
public class DataBaseService {
	
@Autowired
StudentRepo studentRepo;
@Autowired
ParentRepo parentRepo;

@Transactional
public void create(Student s,Parent p) {
	studentRepo.save(s);
	parentRepo.save(p);
}


}
