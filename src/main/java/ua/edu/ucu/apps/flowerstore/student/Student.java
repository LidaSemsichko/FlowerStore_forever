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

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    private String fullName;
    private String gender;
    
    @Transient
    private int computedAge;

    private LocalDate birthDate;

    @Id
    private Long studentId;

    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
