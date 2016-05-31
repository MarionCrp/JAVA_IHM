/**
 * Animal.java pour la gestion des animaux domestiques
 *
 * @Author M.RAMBURRUN
 *
 */

package animal;

// l'interface Comparable n'est présente que parcequ'on veut
// illustrer le concept de tri d'un conteneur
public abstract class Animal implements Comparable<Animal>
{
   protected String nom; // éventuellement ddn, couleur, etc...

/**
 * 
 * @param nom nom de l'animal domestique
 */   
   public Animal(String nom)
   {
	 this.nom = nom;
   }

/**
 * 
 * @return accès au nom en dehors du package
 */   
   public String getNom() 
   {
	 return nom;
   }

/**
 *  méthode abstraite (virtuelle en C++)
 */
   abstract void cri(); 

   @Override
   public int compareTo( Animal a)
   {
	   return ( this.nom.compareTo( a.nom )  );
   }

   @Override
   public String toString()
   {
	 return nom; // peut être une chaîne plus complète
   }

} //fin Animal


