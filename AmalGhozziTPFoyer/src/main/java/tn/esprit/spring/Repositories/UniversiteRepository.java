package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.Universite;

import java.time.LocalDate;
import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    //1- Afficher la liste des universités qui ont des étudiants dont leurs noms contiennet la chaine de caractère en paramètre et
    // leurs dates de naissance entre deux dates passées en paramètre
  //  List<Universite> getByFoyerBlocsChambresReservationsEtudiantsNomEtLikeAndFoyerBlocsChambresReservationsEtudiantsdateNaissanceBetween(String nomEt, LocalDate date1, LocalDate date2);
}
