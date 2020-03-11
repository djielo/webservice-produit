package com.service;

import com.entity.Produit;

import java.util.List;

public interface ProduitService {
    // recuperer la liste des produits
    public List<Produit>  findAll();
    //la creation d' un produit
    public Produit save(Produit produit);
    //rechercher un produit par son id
    public Produit findProduitById(int id);
    //mettre à jour un produit
    public Produit UpdateProduit(Produit produit);
   // rechercher un produit par son nom  prix
    public Produit searchProduit(String nom, double prix);
    //rechercher un produit par son prix
    public List<Produit> searchProduitByPrix(double prix);
}
