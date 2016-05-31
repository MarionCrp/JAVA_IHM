/**
 * Chat.java
 *
 * @Author M.RAMBURRUN
 *
 */

package animal;

public class Chat extends Animal
{

/**
 * 
 * @param nom nom de l'animal domestique
 */    
 public Chat(String nom)
 {
	 super(nom);
 }

@Override
public void cri()
 {
	 System.out.println(" : Miaulement");
 }

} //fin Chat


