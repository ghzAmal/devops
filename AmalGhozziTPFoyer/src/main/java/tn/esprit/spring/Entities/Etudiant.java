package tn.esprit.spring.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;

    @Column(nullable = false)
    String nomEt;
    @Column(nullable = false)
    String prenomEt;
    @Column(nullable = false, unique = true)
    int cin;
    @Column(nullable = false)
    String ecole;
    @Column(nullable = false)
    LocalDate dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    List<Reservation> reservations;

}
