package tn.esprit.test.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.test.entities.Piste;

public interface IPisteRepository extends CrudRepository<Piste ,Long> {
}
