package com.example.a6105160.projethockey;

public class Joueur {

    private Integer id;
    private String nom;
    private String prenom;
    private String position;
    private Integer numero;

    public Joueur(Integer id, String nom, String prenom, String position, Integer numero) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.position = position;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPosition() {
        return position;
    }

    public Integer getNumero() {
        return numero;
    }
}
