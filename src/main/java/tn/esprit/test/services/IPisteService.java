package tn.esprit.test.services;
import tn.esprit.test.entities.Piste;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste update(Piste piste);
    Piste RetrievePiste(Long numPiste);
}
