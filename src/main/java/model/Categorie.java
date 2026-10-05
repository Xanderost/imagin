package model;

import java.util.ArrayList;

public class Categorie {
    private int id;
    private String nom;
    private Intervenant Intervenant ;

    private ArrayList<Intervenant> Intervenants = new ArrayList<>();

    public Categorie() {
    }

    public Categorie(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Intervenant getIntervenant() {
        return Intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        Intervenant = intervenant;
    }

    public ArrayList<Intervenant> getIntervenants() {
        return Intervenants;
    }

    public void setIntervenants(ArrayList<Intervenant> intervenants) {
        Intervenants = intervenants;
    }
}
