package com.CMS.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.CMS.coursemanagement.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
