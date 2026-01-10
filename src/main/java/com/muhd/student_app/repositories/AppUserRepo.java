package com.muhd.student_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhd.student_app.entities.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser,Long>{
    
}
