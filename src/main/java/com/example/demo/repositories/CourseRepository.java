package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Course;
import com.example.demo.entities.Lesson;

public interface CourseRepository extends JpaRepository<Course, Integer>{

	public Course findByCourseId(int courseId);

}
