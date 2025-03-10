package tn.esprit.test.services;

import tn.esprit.test.entities.Piste;
import tn.esprit.test.Repositories.IPiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteServiceImp implements IPisteService {

 @Autowired
 private IPiste pisteRepository;

 @Override
 public Piste addPiste(Piste piste) {
  return pisteRepository.save(piste);
 }

 @Override
 public Piste update(Piste piste) {
  return pisteRepository.save(piste);
 }

 @Override
 public Piste RetrievePiste(Long numPiste) {
  return pisteRepository.findById(numPiste).orElse(null);
 }


 public void deletePiste(Long numPiste) {
  pisteRepository.deleteById(numPiste);
 }




}
