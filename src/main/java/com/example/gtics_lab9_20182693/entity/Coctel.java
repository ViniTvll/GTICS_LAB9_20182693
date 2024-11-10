package com.example.gtics_lab9_20182693.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "drinks")
@Getter
@Setter

public class Coctel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDrink", nullable = false)
    private Integer id;

    @Column(name = "strDrink", nullable = false, length = 40)
    private String nombre;

    @Column(name = "strDrinkThumb", length = 255)
    private String imagenUrl;
}
