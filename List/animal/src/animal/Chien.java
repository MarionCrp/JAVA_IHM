/**
 * Chien.java
 *
 * @Author M.RAMBURRUN
 *
 */

package animal;

public class Chien extends Animal
{

/**
 * 
 * @param nom nom de l'animal domestique
 */    
 public Chien(String nom)
 {
	 super(nom);
 }

@Override
public void cri()
 {
	 System.out.println(" : Aboiement");
 }

} //fin Chien


