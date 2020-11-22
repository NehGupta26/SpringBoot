package com.springrest.springrest.CoursesService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.Courses;

@Service
public class CoursesService {
	
	List<Courses> courses = new ArrayList<Courses>();
	
	public CoursesService() {
		courses.add(new Courses(1,"Java","Java 8"));
		courses.add(new Courses(2,"Spring","Spring 2"));
		courses.add(new Courses(3,"Maven","Maven 3.5.4"));
	}
	
	public List<Courses> getAllCourses(){
		return courses;
	}
	
	public Courses getCourse(int id) {
		//Courses c = null;
		for(Courses course : courses) {
			if(course.getCid()==id) {
				return course;
			}
		}
		return null;
	}
	
	public Courses addCourse(Courses course) {
		courses.add(course);
		return course;
	}
	
	public Courses updateCourse(Courses course) {
		courses.forEach(e ->{
			if(e.getCid()==course.getCid()) {
				course.setCid(course.getCid());
				course.setCname(course.getCname());
				course.setCtype(course.getCtype());
			}
		});
		return course;
	}
}







