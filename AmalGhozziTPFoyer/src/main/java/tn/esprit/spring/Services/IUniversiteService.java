package tn.esprit.spring.Services;

import tn.esprit.spring.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    
    Universite add(Universite universite);
    List<Universite> addAll(List<Universite> universites);
    Universite update(Universite universite);
    List<Universite> updateAll(List<Universite> universites);
    Universite selectById(long id);
    List<Universite> selectAll();
    void delete(Universite universite);
    void deleteById(long id);
    void deleteAll(List<Universite> universites);
    void deleteAll();
    long count();
}
