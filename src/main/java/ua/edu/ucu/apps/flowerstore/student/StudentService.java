package ua.edu.ucu.apps.flowerstore.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> studentList = new ArrayList<>();

    public List<Student> fetchAllStudents() {
        return new ArrayList<>(studentList);
    }

    public void enrollStudent(Student student) {
        studentList.add(student);
    }
}
