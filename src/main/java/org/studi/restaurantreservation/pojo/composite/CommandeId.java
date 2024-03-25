package org.studi.restaurantreservation.pojo.composite;

import jakarta.persistence.*;

import org.studi.restaurantreservation.pojo.Plat;
import org.studi.restaurantreservation.pojo.Table;

import java.io.Serializable;

@Embeddable
public class CommandeId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "tableId")
    private Table tableId;


    @ManyToMany
    @JoinColumn(name = "platId")
    private Plat platId;

}
