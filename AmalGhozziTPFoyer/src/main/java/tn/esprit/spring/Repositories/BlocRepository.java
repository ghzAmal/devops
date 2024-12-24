package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.Entities.Bloc;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc, Long> {

    //1- Recherche par nomBloc
    List<Bloc> findByNomBloc(String name);

    //2- Recherche par capaciteBloc
    List<Bloc> findBlocsByCapaciteBloc(long cap);

    //3- Recherche par nomBloc et capaciteBloc
    Bloc findByCapaciteBlocAndNomBloc(long cap, String nomBloc);

    //4- Recherche par nomBloc en ignorant la casse
    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);

    //5- Recherche par capaciteBloc supérieure à une valeur donnée
    List<Bloc> findByCapaciteBlocGreaterThan(long cap);

    //6- Recherche par nomBloc contenant une sous-chaîne
    List<Bloc> findByNomBlocContaining(String substring);

    //7- Tri par nomBloc par ordre alphabétique
    List<Bloc> findAllByOrderByNomBlocAsc();

    //8- Recherche par nomBloc ou capaciteBloc
    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, long capaciteBloc);

    //9- Recherche du bloc d'un foyer spécifique
    List<Bloc> findBlocByFoyerId(long foyerId);

    //JPQL
    @Query("SELECT b FROM Bloc b JOIN b.foyer f WHERE f.id = :foyerId")
    List<Bloc> getBlocsByFoyerId(@Param("foyerId") long foyerId);

    //10- Recherche du bloc pour un foyer d'une université donnée
    List<Bloc> findBlocByFoyerUniversiteIdUniversite(long universiteId);

    //JPQL
    @Query("SELECT b FROM Bloc b JOIN b.foyer f JOIN f.universite u WHERE u.idUniversite = :universiteId")
    List<Bloc> getBlocByFoyerUniversiteIdUniversite(@Param("universiteId") long universiteId);

}
