package tn.esprit.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Course;

public interface ICourseRepository  extends JpaRepository<Course, Long> {
}
