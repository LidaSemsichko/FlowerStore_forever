package ua.edu.ucu.apps.flowerstore.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> getStudents(){
        return new ArrayList<>();
    };
    void addStudent(Student st){};
}