package com.springresttest.springresttest.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springresttest.springresttest.entities.Course;


@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<Course>();
		list.add(new Course(121,"java ","this course is for basics of java"));
		list.add(new Course(122,"pythan","this course is for pythan basics"));
		list.add(new Course(1,"spring boot","this book is for spring boot basics"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(Long courseId) {
		
		Course c = null;
		for(Course course : list) {
			if (course.getId()==courseId) {
				c=course;
				break;
				
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
