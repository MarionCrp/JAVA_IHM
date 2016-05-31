/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb_premiers;

/**
 *
 * @author Freja
 */
public class NbPremiers {
    public static boolean est_premier(int nb){
        if(nb == 0 || nb == 1){
            return false;
        } else {
            for (int i = 2; i < nb; i++){
                if(nb % i == 0) return false;
            }
            return true;
        }
    }
    
}
