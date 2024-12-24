package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.Foyer;

import java.util.List;
import java.util.Optional;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {

    //  1- Recherche des foyers d'un bloc spécifique
    List<Foyer> findFoyersByBlocsIdBloc(Long idBloc);

    //  2- Recherche du foyer par son idFoyer pour un bloc donné
    Foyer findFoyerByIdAndBlocsIdBloc(Long idFoyer, Long idBloc);

    //  3- Recherche des foyers d'un bloc ayant une capacité spécifique
    List<Foyer> findFoyerByBlocsIdBlocAndCapaciteFoyer(Long idBloc, Long capacite);

    //  4- Recherche du foyer d'un bloc spécifique dans une université donnée
    Foyer findFoyerByBlocsIdBlocAndUniversiteIdUniversite(Long idBloc, Long idUniversite);

    Foyer findByNomFoyer(String nomFoyer);
}
