/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.beans.Developpeur;
import ma.projet.beans.Manager;
import ma.projet.service.DeveloppeurService;
import ma.projet.service.ManagerService;

/**
 *
 * @author DELL
 */
public class Entreprise {
    public static void main(String[] args) {
        // Créer deux développeurs
        Developpeur dev1 = new Developpeur("Alice", 4000);
        Developpeur dev2 = new Developpeur("Bob", 4500);
        DeveloppeurService ds = new DeveloppeurService();
        ds.create(dev1);
        ds.create(dev2);
        
         // Créer un manager qui gère les deux développeurs
        Manager manager = new Manager("Charlie", 6000);
        ManagerService ms = new ManagerService();
        ms.create(manager);
        dev1.setManager(manager);
        dev2.setManager(manager);
        // Créer un 3ème développeur
        Developpeur dev3 = new Developpeur("David", 5000);
        ds.create(dev3);
        
        // Créer un directeur général qui gère le manager et le 3ème développeur
        Manager directeurGeneral = new Manager("Directeur Général", 8000);
        ms.create(directeurGeneral);
        manager.setManager(directeurGeneral);
        // Afficher les employés
        System.out.println("Liste des managers:");
        for(Manager e : ms.getAll())
            System.out.println(e);
         System.out.println("Liste des developpeurs:");
        for(Developpeur e : ds.getAll())
            System.out.println(e);
        
        
       
        
        
        

    }
}
    

