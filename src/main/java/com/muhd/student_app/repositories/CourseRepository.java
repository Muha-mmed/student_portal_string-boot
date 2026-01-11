package com.muhd.student_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muhd.student_app.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    Course findByCourseCode(int courseCode);
    Course findByCourseName(String courseTitle);
}
