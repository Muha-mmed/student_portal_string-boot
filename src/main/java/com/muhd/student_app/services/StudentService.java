package com.muhd.student_app.services;

import org.springframework.stereotype.Service;

import com.muhd.student_app.entities.Student;

@Service
public interface StudentService {
    // Service method declarations would go here
    public Student getStudentById(Long studentId);
    public Student addStudent(Student student);
    public Student updateStudent(Long studentId, Student student);
    public void deleteStudent(Long studentId);
}
