package sn.esmt.emploi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="appcvs")

public class AppCvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150, nullable = false)
    private String nom;
    @Column(length = 150, nullable = false)
    private String prenom;
    @Column(length = 150, nullable = false)
    private int age;
    @Column(length = 150, nullable = false)
    private String adresse;
    @Column(length = 150, nullable = false)
    private String email;
    @Column(length = 150, nullable = false)
    private String telephone;
    @Column(length = 150, nullable = false)
    private String specialite;
    @Column(length = 150, nullable = false)
    private String niveauEtude;
    @Column(length = 150, nullable = false)
    private String experiencePro;

}
