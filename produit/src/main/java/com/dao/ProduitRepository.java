package com.dao;

import com.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    @Query(value = "select p from Produit p where p.nom = :nom and p.prix = :prix")
    Produit searchProduit(@Param ("nom") String nom, @Param ("prix") double prix);

    @Query(value = "select p from Produit p where p.prix = :prix")
    Produit searchProduit( @Param ("prix") double prix);
    @Query(value = "select sum(p.prix) from Produit p")
    public double sommeTotal();

}
