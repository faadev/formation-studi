package org.studi.restaurantreservation.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long platID;

    private String libelle;
    private String description;
    private float prix;
}
