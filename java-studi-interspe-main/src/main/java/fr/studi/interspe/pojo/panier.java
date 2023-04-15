package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_panier;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private client client;
}
