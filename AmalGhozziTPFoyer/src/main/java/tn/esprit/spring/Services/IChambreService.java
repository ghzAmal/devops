package tn.esprit.spring.Services;


import tn.esprit.spring.Entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre add(Chambre Chambre);
    List<Chambre> addAll(List<Chambre> Chambres);
    Chambre update(Chambre Chambre);
    List<Chambre> updateAll(List<Chambre> Chambres);
    Chambre selectById(long id);
    List<Chambre> selectAll();
    void delete(Chambre Chambre);
    void deleteById(long id);
    void deleteAll(List<Chambre> Chambres);
    void deleteAll();
    long count();
}
