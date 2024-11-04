package ua.edu.ucu.apps.flowerstore.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter @Setter @AllArgsConstructor
@Table @Entity
public class Student {
    String name;
    String gender;
    @Transient
    int age;
    LocalDate dateOfBirth;
    @Id
    private Long id;

    public int getAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}