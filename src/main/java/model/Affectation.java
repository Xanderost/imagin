package model;

public class Affectation {

    private int annee;
    private String semaine;
    private int tempsPasse;
    private Intervenant intervenant;
    private Projet Projet;
    public Affectation() {
    }

    public Affectation(String semaine, int annee, int tempsPasse) {
        this.semaine = semaine;
        this.annee = annee;
        this.tempsPasse = tempsPasse;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Projet getProjet() {
        return Projet;
    }

    public void setProjet(Projet projet) {
        Projet = projet;
    }

    public int getTempsPasse() {
        return tempsPasse;
    }

    public void setTempsPasse(int tempsPasse) {
        this.tempsPasse = tempsPasse;
    }

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }
}