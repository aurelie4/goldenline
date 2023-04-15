package fr.studi.interspe.pojo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter

public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_client;

    private int nd_enfant;

    private String cat_sociopro;

    public client(int nd_enfant, String cat_sociopro) {
        this.nd_enfant = nd_enfant;
        this.cat_sociopro = cat_sociopro;
    }

    public client(){

    }
}

