package com.example.a6105160.projethockey.Modeles;

public class Equipe {

    private Integer id;
    private String nom;
    private String ville;

    public Equipe(Integer id, String nom, String ville) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }
}
