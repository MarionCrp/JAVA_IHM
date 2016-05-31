/**
 * Oiseau.java
 *
 * @Author M.RAMBURRUN
 *
 */

package animal;

public class Oiseau extends Animal
{

/**
 * 
 * @param nom nom de l'animal domestique
 */    
 public Oiseau(String nom)
 {
	 super(nom);
 }

@Override
public void cri()
 {
	 System.out.println(" : Gazouillement");
 }

} //fin Oiseau


