package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;
import com.example.demo.entities.Lesson;

public interface TrainerService {
	
	public void addCourse(Course course);
	
	public void saveCourse(Course course);
	
	public void addLesson(Lesson lesson);
	
	//public Course getCourse(int courseId);
	
	public List<Course> courseList();

	public boolean courseExists(int courseId);

	public boolean lessonExists(int lessonId);
	

}
