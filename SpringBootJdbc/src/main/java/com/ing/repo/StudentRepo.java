package com.ing.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ing.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long>{

}
