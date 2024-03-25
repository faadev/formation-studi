package org.studi.restaurantreservation.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableID;

    //Une table dispose d'une liste de clients
    @OneToMany(mappedBy = "table")
    private Set<Client> clientSet = new HashSet<>();



}
