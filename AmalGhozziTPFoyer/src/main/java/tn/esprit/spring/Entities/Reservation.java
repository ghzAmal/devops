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
public class Reservation {
    @Id
    String idReservation;

    @Column(nullable = false)
    LocalDate anneeUniversitaire;

    @Column(nullable = false)
    Boolean estValide;

    @ManyToMany
    List<Etudiant> etudiants;
}
