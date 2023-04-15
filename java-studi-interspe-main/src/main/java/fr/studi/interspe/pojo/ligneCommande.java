package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class ligneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ligne;

    @ManyToOne
    @JoinColumn(name = "id_prod")
    private produit produit;

    @ManyToOne
    @JoinColumn(name = "id_commande")
    private commande commande;

    private int quantite;
    private float prix_total;



}
