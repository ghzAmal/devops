package tn.esprit.spring.Services;

import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.Repositories.ChambreRepository;

import java.util.List;

public class ChambreService implements IChambreService {

     ChambreRepository chambreRepository;

    @Override
    public Chambre add(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> addAll(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }
    @Override
    public Chambre update(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> updateAll(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }



    @Override
    public Chambre selectById(long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Chambre> selectAll() {
        return chambreRepository.findAll();
    }

    @Override
    public void delete(Chambre chambre) {
        chambreRepository.delete(chambre);
    }

    @Override
    public void deleteById(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Chambre> chambres) {
        chambreRepository.deleteAll(chambres);
    }

    @Override
    public void deleteAll() {
        chambreRepository.deleteAll();
    }

    @Override
    public long count() {
        return chambreRepository.count();
    }
}
