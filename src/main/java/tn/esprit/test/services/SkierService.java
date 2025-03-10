package tn.esprit.test.services;
import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.test.Repositories.ISkierRepository;
import tn.esprit.test.entities.Piste;
import tn.esprit.test.entities.Skier;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.Repositories.ISkierRepository;
import tn.esprit.test.Repositories.IPisteRepository;


import tn.esprit.test.entities.Skier;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor

@Service
public class SkierService  implements ISkierService{

    @Autowired //le cablage automatique entre service et repository dans ce cas ( coublage entre interface est faible alors que entre les classes est fort)<<
    private ISkierRepository skierRepository;

    // Ajouter un skieur
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    // Récupérer un skieur par son ID
    public Optional<Skier> getSkierById(Long id) {
        return skierRepository.findById(id);
    }

    // Récupérer tous les skieurs
    public List<Skier> getAllSkiers() {
        return (List<Skier>) skierRepository.findAll();
    }

    // Mettre à jour un skieur
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    // Supprimer un skieur par son ID
    public void deleteSkier(Long id) {
        skierRepository.deleteById(id);
    }

    // Rechercher des skieurs par prénom et nom
    public List<Skier> findSkierByName(String firstName, String lastName) {
        return skierRepository.findByFirstNameAndLastName(firstName, lastName);
    }

  @override
public Piste assignToSkier(Long numPiste , Long numSkier) {
      PisteRepository  piste = Piste.findById(numPiste).orElse(other null);
      Skier skier = skierRepository.findById(numSkier).orElse(other null);
      piste.getSkiers().add(skier);
      return PisteRepository.save(piste);
  }
}




