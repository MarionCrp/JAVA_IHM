/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectfich;
import static java.lang.Math.pow;
import java.util.ArrayList;


/**
 *
 * @author Freja
 */
public class Ds {
    private String nom; 
    private ArrayList<Double> notes;
    
    public Ds(String nom, ArrayList<Double> notes){
        this.nom = nom;
        this.notes = notes;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public ArrayList<Double> getNotes(){
        return this.notes;
    }
    
    public double getNote(int n){
        return this.notes.get(n);
    }

    /*@Override
    public String toString(){
        return (this.nom+"       "+ (String.format("%.2f",this.getNote1()))+"           "+(String.format("%.2f",this.getNote2()))+"        "+this.moyenne());
    }*/
    
    public double moyenne(){
        double totalNote = 0;
        for(Double note : this.notes){
            totalNote += note;
        }
        return totalNote/this.notes.size();
    }
    
    public double totalNoteAuCarre(){
        double total = 0;
        for(Double note : this.notes){
            total += pow(note,2);
        }
        return total;
    }
    
    public double ecartType(){
        return Math.sqrt((this.totalNoteAuCarre()/this.notes.size()) - pow(this.moyenne(),2));
    }
}
