package com.muhd.student_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muhd.student_app.entities.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long>{
    AppUser findByUsername(String username);
}
