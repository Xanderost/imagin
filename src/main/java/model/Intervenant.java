package model;

import java.util.ArrayList;

public class Intervenant {

    private int id;
    private String prenom;
    private String nom;

    private ArrayList<Affectation> affectations = new ArrayList<>();

    public Intervenant() {
    }

    public Intervenant(String prenom, int id, String nom) {
        this.prenom = prenom;
        this.id = id;
        this.nom = nom;
    }

    public ArrayList<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(ArrayList<Affectation> affectations) {
        this.affectations = affectations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}