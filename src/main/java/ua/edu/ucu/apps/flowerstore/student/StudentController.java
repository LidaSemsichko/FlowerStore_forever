package ua.edu.ucu.apps.flowerstore.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private final List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> retrieveStudents() {
        return new ArrayList<>(students);
    }

    @PostMapping("/students")
    public void registerStudent(@RequestBody Student student) {
        students.add(student);
    }
}
