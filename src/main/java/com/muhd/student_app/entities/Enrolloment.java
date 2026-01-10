package com.muhd.student_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@ToString
@Data
@Setter
@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enrolloment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Student student;
    private Course course;
    private String semester;
    private String year;
    private String enrolledAt;
}
