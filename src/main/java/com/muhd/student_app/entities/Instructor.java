package com.muhd.student_app.entities;

import lombok.*;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@ToString
@Data
@Setter
@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    private String department;
    
    private String staffNumber;

    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    // One instructor can teach many courses
    @OneToMany(mappedBy = "instructor")
    private Set<Course> courses;
}
