package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_prod;

    private String nom_prod;

    private Float prix_unitaire;

    @ManyToOne
    @JoinColumn(name = "id_categ")
    private categorie categorie;
}
