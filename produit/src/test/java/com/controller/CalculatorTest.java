package com.controller;

import com.entity.Produit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        double a = 2.0;
        double b = 2.0;
        double resultat = 4.0;
        Assert.assertTrue(Calculator.add (a, b) == resultat);
    };

    @Test
    public void getNom(){
        Produit produit = new Produit (1,"jerome",500);

        Assert.assertTrue (produit.getNom () == "jerome");
    }
}