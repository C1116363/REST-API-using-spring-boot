package com.springresttest.springresttest.services;

import java.util.List;

import com.springresttest.springresttest.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(Long courseId);

	public Course addCourse(Course course);
	

}
