package tn.esprit.test.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.test.entities.Piste;

public interface IPiste extends CrudRepository<Piste ,Long> {
}
