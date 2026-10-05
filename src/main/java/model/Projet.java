package model;

import java.util.ArrayList;

public class Projet {
    private int id;
    private String nom;
    private int nbJoursPrevu;
    private int budgetPrevu;

    // Relation OTM vers Affectation
    private ArrayList<Affectation> affectations = new ArrayList<>();

    public Projet() {
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbJoursPrevu() {
        return nbJoursPrevu;
    }

    public void setNbJoursPrevu(int nbJoursPrevu) {
        this.nbJoursPrevu = nbJoursPrevu;
    }

    public int getBudgetPrevu() {
        return budgetPrevu;
    }

    public void setBudgetPrevu(int budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }
}
