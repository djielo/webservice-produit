package com.service;

import com.entity.Produit;

import java.util.List;

public interface ProduitService {
    // recuperer la liste des produits
    public List<Produit>  findAll();
    public Produit save(Produit produit);
    public Produit findProduitById(int id);
    public Produit UpdateProduit(Produit produit);
    public Produit searchProduit(String nom, double prix);
    public List<Produit> searchProduitByPrix(double prix);
}
