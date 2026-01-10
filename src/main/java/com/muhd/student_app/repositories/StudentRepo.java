package com.muhd.student_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhd.student_app.entities.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{
    
}
