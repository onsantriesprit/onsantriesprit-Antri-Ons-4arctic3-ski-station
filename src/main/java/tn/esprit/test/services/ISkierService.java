package tn.esprit.test.services;

import tn.esprit.test.entities.Skier;

import java.util.List;
import java.util.Optional;

public interface ISkierService {
    Skier addSkier(Skier skier);
    public Skier updateSkier(Skier skier);
    public void deleteSkier(Long id);
    public List<Skier> findSkierByName(String firstName, String lastName);
    public Optional<Skier> getSkierById(Long id);
    public List<Skier> getAllSkiers();
}
