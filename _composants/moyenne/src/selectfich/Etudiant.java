/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectfich;

import java.util.ArrayList;

/**
 *
 * @author p1502716
 */
public class Etudiant {
    private String nom; 
    private ArrayList<Double> notes;
    
    public Etudiant(String nom, ArrayList<Double> notes){
        this.nom = nom;
        this.notes = notes;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public ArrayList<Double> getNotes(){
        return this.notes;
    }
    
    public double getNote1(){
        return this.notes.get(0);
    }
    
    public double getNote2(){
        return this.notes.get(1);
    }
    @Override
    public String toString(){
        return (this.nom+"       "+ (String.format("%.2f",this.getNote1()))+"           "+(String.format("%.2f",this.getNote2()))+"        "+this.moyenne());
    }
    
    
    public double moyenne(){
        double totalNote = 0;
        int taille = this.notes.size();
        for(Double note : this.notes){
            totalNote += note;
        }
        return totalNote/taille;
    }
    
    
}
