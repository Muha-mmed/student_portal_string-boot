package com.muhd.student_app.entities;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @OneToOne
    private AppUser userID;

    @OneToMany
    private Course course;
}
