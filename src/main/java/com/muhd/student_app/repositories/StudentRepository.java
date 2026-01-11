package com.muhd.student_app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muhd.student_app.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
    List<Student> findByLastName(String lastName);
    List<Student> findByFirstName(String firstName);
    Student findByMatricNumber(String matricNumber);
    List<Student> findByLastNameAndFirstName(String lastName, String firstName);
    List <Student> findByDepartment(String department);
}
