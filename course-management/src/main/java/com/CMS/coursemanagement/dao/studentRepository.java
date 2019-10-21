package com.CMS.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.CMS.coursemanagement.models.Student;

public interface studentRepository extends CrudRepository<Student, Integer> {

}
