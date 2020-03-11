package com.service;

import com.dao.ProduitRepository;
import com.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll ();
    }

    @Override
    public Produit save(Produit produit) {
        return produitRepository.save (produit);
    }

    @Override
    public Produit findProduitById(int id) {
        return  produitRepository.findOne(id);
    }

    @Override
    public Produit UpdateProduit(Produit produit) {
        return produitRepository.save (produit);
    }

    @Override
    public Produit searchProduit(String nom, double prix) {
        return produitRepository.searchProduit(nom,prix);
    }

    @Override
    public List<Produit> searchProduitByPrix(double prix) {
        return produitRepository.findAll ();
    }

    @Override
    public double prixTotal() {
        return produitRepository.prixTotal ();
    }
}
