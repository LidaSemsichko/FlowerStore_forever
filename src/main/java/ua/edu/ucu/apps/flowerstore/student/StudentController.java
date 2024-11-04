package ua.edu.ucu.apps.flowerstore.student;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> getStudents(){
        return new ArrayList<Student>();
    };
    void addStudent(Student st){};
}