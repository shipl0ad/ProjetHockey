package com.example.a6105160.projethockey.Modeles;

public class Joueur {

    private Integer id;
    private String nom;
    private String prenom;
    private String position;
    private Integer numero;
    private Integer buts;
    private Integer assistances;
    private Integer equipe_id;

    public Joueur(Integer id, String nom, String prenom, String position, Integer numero, Integer buts, Integer assistances, Integer equipe_id) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.position = position;
        this.numero = numero;
        this.buts = buts;
        this.assistances = assistances;
        this.equipe_id = equipe_id;
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

    public Integer getButs() {
        return buts;
    }

    public Integer getAssistances() {
        return assistances;
    }

    public Integer getEquipeId() {
        return equipe_id;
    }
}
