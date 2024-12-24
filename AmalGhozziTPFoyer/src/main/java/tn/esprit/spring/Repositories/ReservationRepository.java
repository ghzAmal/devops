package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.Entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    //1- Recherche des réservations validées
    List<Reservation> findByEstValide(Boolean valid);

    // 2- Recherche des réservations par l'id de l'étudiant
    List<Reservation> findByEtudiantsIdEtudiant(Long idEtudiant);

    // 3- Recherche des réservations par année universitaire et validité
    List<Reservation> findByAnneeUniversitaireAndEstValide(LocalDate anneeUniversitaire, Boolean estValide);

    @Modifying
    @Query(value = "UPDATE reservation r set r.est_valide=:estValide where r.id_reservation=:idReservation  ", nativeQuery = true)
    void updateValidite(@Param("estValide") Boolean estValide,
                        @Param("idReservation") String idReservation);
}
