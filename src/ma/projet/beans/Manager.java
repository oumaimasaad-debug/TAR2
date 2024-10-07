/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.List;


public class Manager extends Personne {
    public Manager(String nom, double salaire) {
        super(nom, salaire);
    }
     public Manager(int id,String nom, double salaire) {
        super(id,nom, salaire);
    }
     
}
