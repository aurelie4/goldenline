package fr.studi.interspe.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_categ;

    private String nom_categ;

    public categorie(String nom_categ) {
        this.nom_categ = nom_categ;
    }

    public categorie (){

    }
}
