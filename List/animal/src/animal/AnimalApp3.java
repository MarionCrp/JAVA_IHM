/**
 * AnimalApp3.java utilisant l'outil TreeMap<K,V> pour d�finir un conteneur c en
 * acc�s direct et tri� par clef.
 * La clef d'acc�s peut �tre num�rique ou alphanum�rique.
 * Les principales m�thodes de TreeMap<K,V> : 
 * Pour savoir si le conteneur est vide ou pas : c.isEmpty();
 * premi�re clef         : c.firstKey()
 * derni�re clef         : c.lastKey()
 * taille du conteneur   : c.size()
 * Insertion par clef    : c.put(clef_d_acc�s,r�f_sur_un_item) 
 * Acc�s direct par clef : c.get(clef_d_acc�s) qui retourne une r�f sur un item
 * Suppression par clef  : c.remove(clef_d_acc�s)
 * R�cup�ration de l'ensemble des clefs d'un seul coup : Set<String> ensClefs = c.keySet( );
 * SortedMap<K,V> ensClefsInf = c.headMap(clefCourante ); // les clefs < clefCourante
 * SortedMap<K,V> ensClefsSupEgal = c.tailMap( clefCourante ); // les clefs >= clefCourante
 * Iterator<K> it = ensClefsSupEgal.keySet().iterator(); // clef=it.next(); pour avancer
 * Effacement complet du conteneur : c.clear();
 * Test d'existence par clef       : c.containsKey(clef_d_acc�s); 
 * Test d'existence par contenu    : c.containsValue(r�f�rence_sur_item);
 *
 * @Author M.RAMBURRUN
 */
package animal;

public class AnimalApp3 {
/**
 * 
 * @param args liste des args. pass�s sur la ligne de commande
 */
    public static void main(String[] args) {
        java.util.AbstractMap<String, Animal> menagerie;
        menagerie = new java.util.TreeMap<>();

        Animal a1 = new Chat("Poueet");
        Animal a2 = new Chien("Snoopy");
        Animal a3 = new Oiseau("Piaf");

        menagerie.put(a1.getNom(), a1);
        menagerie.put(a2.getNom(), a2);
        menagerie.put(a3.getNom(), a3);

        if (menagerie.containsKey(a3.getNom())) {
            System.out.print("Acces par clef    a \"  "
                    + menagerie.get(a3.getNom()) + "\"\t");
        }
        a3.cri();

        if (menagerie.containsValue(a1)) {
            System.out.print("Acces par contenu a \""
                    + menagerie.get(a1.getNom()) + "\"\t");
        }
        a1.cri();

        // affichage des entr�es du conteneur associatif

        if (menagerie.isEmpty()) {
            System.out.println("Aucun animal!!!");
        } else {
            System.out.println("Voici des informations sur la menagerie ( " + menagerie.size() + " animaux ) par ordre croissant de clef :");
            java.util.Set<String> ensClefs = menagerie.keySet(); // ensemble de clefs uniquement
            for (String clef : ensClefs) {
                System.out.println(menagerie.get(clef));
            }

            /* AUTRE POSSIBILITE IMPORTANTE
             java.util.Iterator<java.util.Map.Entry<K,V> > it = menagerie.entrySet().iterator();// it sur l'ens de couples(K,V)
             while ( it.hasNext() )
             {
             java.util.Map.Entry<K,V> entree = it.next(); // une entr�e correspond � un couple (K,V)
             // affichage des cl�s :    System.out.println(" cle : "    + entree.getKey()  );
             // affichage des valeurs : System.out.println(" valeur : " + entree.getValue());
             System.out.println( entree.getValue() );
             }
             */
        }
        menagerie.clear(); // effacement complet du conteneur
        System.out.println("Apres effacement, la menagerie "
                + (menagerie.isEmpty() ? "EST VIDE" : "N'EST PAS VIDE"));

    }// fin main
}//fin AnimalApp3

