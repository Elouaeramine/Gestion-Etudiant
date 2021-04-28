package com.gestion.Gestion_Etudiant;

public class Etudiant {
    private String nom;
    private String prenom;
    private String cin;

    public Etudiant(String nom , String prenom , String cin){
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
