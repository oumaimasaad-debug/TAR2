/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

public class Developpeur extends Personne {
    public Developpeur( String nom, double salaire) {
        super( nom, salaire);
    }
    public Developpeur( int id,String nom, double salaire) {
        super( nom, salaire);
    }
}