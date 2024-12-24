package tn.esprit.spring.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    long idUniversite;

    @Column(nullable = false)
    String nomUniversite;
    @Column(nullable = false)
    String adresse;
    @OneToOne(cascade = CascadeType.ALL)
    Foyer foyer;
}
