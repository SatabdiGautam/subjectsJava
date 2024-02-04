package com.satabdi.springBootCRUD.repository;

import org.springframework.data.repository.CrudRepository;

import com.satabdi.springBootCRUD.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String>{
	
}
