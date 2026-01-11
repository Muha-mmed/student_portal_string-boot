package com.muhd.student_app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muhd.student_app.entities.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{
    List<Instructor> findByLastName(String lastName);
    List<Instructor> findByFirstName(String firstName);
    List<Instructor> findByLastNameAndFirstName(String lastName, String firstName);
    List<Instructor> findByDepartment(String department);
    Instructor findByStaffNumber(String staffNumber);
}
