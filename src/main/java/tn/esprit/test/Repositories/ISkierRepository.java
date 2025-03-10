package tn.esprit.test.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.test.entities.Skier;

import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier,Long> {
    List<Skier>findByFirstNameAndLastName(String fname ,String lname);
}
