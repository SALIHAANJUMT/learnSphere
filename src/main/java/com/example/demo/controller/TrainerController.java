package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Course;
import com.example.demo.entities.Lesson;
import com.example.demo.services.TrainerService;

@Controller
public class TrainerController {
	@Autowired
	TrainerService service;
	
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute Course course) {
		
		boolean courseStatus=service.courseExists(course.getCourseId());
		if(courseStatus ==false) {
		service.addCourse(course);
		System.out.println("Course added sucessfully");
		}
		else {
			System.out.println("Course already exist");
		}
		return "trainerHome";
	}
	
	@PostMapping("/addLessons")
	public String addLessons(@ModelAttribute Lesson lesson) {
		
		boolean lessonStatus=service.lessonExists(lesson.getLessonId());
		if(lessonStatus ==false) {
		service.addLesson(lesson);
		System.out.println("Lesson added sucessfully");
		}
		else {
			System.out.println("Lesson already exist");
		}
		return "trainerHome";
	}
	
	@GetMapping("/viewCourse")
	public String viewCourse(Model model) {
		List<Course> courseList=service.courseList();
		model.addAttribute("lesson",courseList);
		return "courses";
	}
	
	
	

}
