package com.springrest.springrest.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Courses;
import com.springrest.springrest.CoursesService.CoursesService;

@RestController
public class CoursesController {
	
	@Autowired
	private CoursesService cservice;
	//List<Courses> course = new ArrayList<Courses>();
		
	@GetMapping("/courses")
	public List<Courses> getAllCourses() {
		return this.cservice.getAllCourses();
		//return course;
	}
	
	@GetMapping("/courses/{id}")
	public Courses getCourse(@PathVariable int id) {
		return this.cservice.getCourse(id);
	}
	
	@PostMapping(path = "/courses", consumes = "application/json")
	public Courses addCourse(@RequestBody Courses course) {
		Courses c = cservice.addCourse(course);
		return c;
	}
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course) {
		Courses c = cservice.updateCourse(course);
		return c;
	}

}
