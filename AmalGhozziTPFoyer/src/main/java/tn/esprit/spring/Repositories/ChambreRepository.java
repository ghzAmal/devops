package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.Entities.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    //1- Recherche par numéro de chambre
    Chambre findByNumeroChambre(long numeroChambre);

    //2- Recherche par type de chambre
   // List<Chambre> findByTypeC(String TypeChambre);

    //3- Recherche des chambres par bloc
    List<Chambre> findByBlocIdBloc(long blocId);

    //4- Recherche des chambres par bloc et type de chambre
 //   List<Chambre> findByBlocIdBlocAndTypeC(long blocId,String TypeChambre);

    //5- Recherche des chambres par numéro de chambre et type de chambre
 //List<Chambre> findChambreByNumeroChambreAndTypeC(String numeroChambre,String TypeChambre);

    //6- Récupérer des chambres en filtrant par le nom de l'université associée au
    //foyer, l'année de réservation, le nom de l'étudiant dans la réservation et le numéro de chambre
    @Query(value = "SELECT ch.* FROM chambre ch " +
            "JOIN bloc b ON ch.bloc_id = b.idBloc " +
            "JOIN foyer f ON b.foyer_id = f.id " +
            "JOIN universite u ON f.universite_id = u.id " +
            "JOIN reservation r ON ch.id = r.chambre_id " +
            "JOIN etudiant e ON r.etudiant_id = e.id " +
            "WHERE u.nomUniversite = :nomUniversite " +
            "AND YEAR(r.dateReservation) = :anneeReservation " +
            "AND e.nomEtudiant = :nomEtudiant " +
            "AND ch.numeroChambre = :numeroChambre",
            nativeQuery = true)
    List<Chambre> findChambresByFiltersNative(
            @Param("nomUniversite") String nomUniversite,
            @Param("anneeReservation") int anneeReservation,
            @Param("nomEtudiant") String nomEtudiant,
            @Param("numeroChambre") int numeroChambre);

    //7- Afficher le nombre des chambres qui ont le meme type que le type passé en paramétre du foyer qui a le meme nom que le nom passé en paramétre

}
