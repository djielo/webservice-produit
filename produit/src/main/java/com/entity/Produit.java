package com.entity;

import javax.persistence.*;

@Entity
@Table(name="produit")
public class Produit {
    @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
   @Column(name="id")
   private Integer  id;

   @Column(name="nom")
   private String nom;

    @Column(name="prix")
   private double prix;

    public Produit() {
    }

    public Produit(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
