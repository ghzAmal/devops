package tn.esprit.spring.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;

    @Column(nullable = false,unique = true)
    long numeroChambre;

    @Column(nullable = false)
    TypeChambre typeC;

    @ManyToOne
    Bloc bloc;

    @OneToMany
    List<Reservation> reservations;
}
