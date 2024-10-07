/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

public class Personne {
    private int id;
    private String nom;
    private double salaire;
    private Manager manager;

    // Constructeur
     public Personne(String nom, double salaire, Manager manager) {
        this.nom = nom;
        this.salaire = salaire;
        this.manager=manager;
    }
       public Personne(int id , String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
        this.id=id;
        this.manager=null;
    }
    
    public Personne(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
        this.manager=null;
    }

    // Getters et setters
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public String toString() {
        return "employé{" + "id=" + id + ", nom=" + nom + ", salaire=" + salaire + '}';
    }
    
    
}
    
