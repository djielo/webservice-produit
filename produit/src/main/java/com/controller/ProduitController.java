package com.controller;

import com.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import com.service.ProduitService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping(value = "/produits")
    public List<Produit> findAll() {
        return produitService.findAll ();
    }

    @PostMapping("/produits")
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.save (produit);
    }

    @GetMapping(value = "/produits/{id}")
    public Produit chercherUnProduit(@PathVariable("id") int id){
        return produitService.findProduitById (id);
    }

    @PostMapping(value = "/produits/{id}")
    public Produit updateProduit(@PathVariable("id") int id, @RequestBody Produit produit){
         produit.setId (id);
        return  produitService.UpdateProduit (produit);
    }

    @GetMapping(value = "/find")
    public Produit searchProduit(@RequestParam ("nom") String nom, @RequestParam("prix") double prix){
        return produitService.searchProduit (nom, prix);
    }

    @GetMapping(value = "/search/")
    public List<Produit> seachProduitsById(@RequestParam("prix") double prix){
        return produitService.searchProduitByPrix (prix);
    }
}
