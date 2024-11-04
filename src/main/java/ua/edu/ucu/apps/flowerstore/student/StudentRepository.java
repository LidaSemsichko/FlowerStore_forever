package ua.edu.ucu.apps.flowerstore.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    @Query("SELECT u FROM Student u WHERE u.name = ?1")
    Optional<Student> findByFirstName(String name);
}