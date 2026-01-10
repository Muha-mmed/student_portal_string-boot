package com.muhd.student_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhd.student_app.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Long>{
    
}
