package com.ing.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ing.model.Parent;

@Repository
public interface ParentRepo extends CrudRepository<Parent,Long>{

}
