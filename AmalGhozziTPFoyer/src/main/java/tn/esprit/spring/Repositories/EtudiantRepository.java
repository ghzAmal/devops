package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.Etudiant;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // 1- Recherche par nom et prénom de l'étudiant
    List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt);

    // 2- Recherche par CIN de l'étudiant
    Etudiant findByCin(int cin);

    // 3- Recherche des étudiants par date de naissance après une certaine date
    List<Etudiant> findByDateNaissanceAfter(LocalDate date);

    // 4- Recherche des étudiants par nom d'école
    List<Etudiant> findByEcole(String ecole);

    // 5- Recherche des étudiants par réservation (id de réservation)
    List<Etudiant> findByReservationsIdReservation(String idReservation);

    // 6- Recherche des étudiants par réservation (année de réservation)
    List<Etudiant> findByReservationsAnneeUniversitaire(LocalDate anneeUniversitaire);

    // 7- Recherche des étudiants par nom d'école et date de naissance après une certaine date
    List<Etudiant> findByEcoleAndDateNaissanceAfter(String ecole, LocalDate date);

    // 8- Recherche des étudiants par réservation pour une année donnée et triés par date de naissance
    List<Etudiant> findByReservationsAnneeUniversitaireOrderByDateNaissance(LocalDate anneeUniversitaire);

    // 9- Afficher le nombre total des étudiants
    long count();
}
