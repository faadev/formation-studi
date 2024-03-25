package org.studi.restaurantreservation.pojo;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String nom;
    private String prenom;

    @ManyToOne
    @JoinColumn(name = "tableId")
    private Table table;


}


