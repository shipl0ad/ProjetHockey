package com.example.a6105160.projethockey.Modeles;

public class Equipe {

    private Integer id;
    private String nom;
    private String ligue;
    private String ville;

    public Equipe(Integer id, String nom, String ligue, String ville) {
        this.id = id;
        this.nom = nom;
        this.ligue = ligue;
        this.ville = ville;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getLigue() {
        return ligue;
    }

    public String getVille() {
        return ville;
    }
}
