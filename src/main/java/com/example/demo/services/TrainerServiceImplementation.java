package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;
import com.example.demo.entities.Lesson;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.repositories.LessonRepository;

@Service
public class TrainerServiceImplementation implements TrainerService{

	@Autowired
	CourseRepository repo;
	
	@Autowired
	LessonRepository lessonrepo;
	
	@Override
	public void addCourse(Course course) {
		repo.save(course);
	}

	@Override
	public boolean courseExists(int courseId) {
		Course course=repo.findByCourseId(courseId);
		if(course==null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void addLesson(Lesson lesson) {
		lessonrepo.save(lesson);
	}

	@Override
	public boolean lessonExists(int lessonId) {
		Lesson lesson=lessonrepo.findByLessonId(lessonId);
		if(lesson==null) {
			return false;
		}
		else {
			return true;
		}
	}


	@Override
	public List<Course> courseList() {
		return repo.findAll();
	}

	@Override
	public void saveCourse(Course course) {
		repo.save(course);
	}

	
}
