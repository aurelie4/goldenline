package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Setter
@Getter

public class commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_commande;

    private Float montant_total;

    private LocalDate date_achat;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private client client;

}
