package tn.esprit.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
