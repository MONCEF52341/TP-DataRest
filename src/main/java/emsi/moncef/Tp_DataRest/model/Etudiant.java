package emsi.moncef.Tp_DataRest.model;

import emsi.moncef.Tp_DataRest.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "etudiants")
public class Etudiant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom_etudiant", nullable = false)
    private String name;

    @Column(name = "prenom_etudiant")
    private String prenom;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;
    @ManyToOne
    @JoinColumn(name = "centre_id")
    Centre centre;
}