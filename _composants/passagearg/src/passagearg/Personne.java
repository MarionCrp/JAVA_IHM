/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagearg;

/**
 *
 * @author mooneswar.ramburrun
 */
public class Personne {

    String nom;
    String sport;

    /**
     *
     * @param nom nom d'une personne
     * @param sport sport pratiqué
     */
    public Personne(String nom, String sport) {
        this.nom = nom;
        this.sport = sport;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

}
