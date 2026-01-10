package com.muhd.student_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhd.student_app.entities.Instructor;

public interface InstructorRepo extends JpaRepository<Instructor, Long>{
    
}
