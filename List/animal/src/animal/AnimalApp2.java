/**
 * AnimalApp2.java utilisant un conteneur de type Vector qu'on va trier suivant
 * le crit�re d�fini dans la m�thode compareTo de l'interface Comparable
 *
 * @Author M.RAMBURRUN
 *
 */
package animal;

public class AnimalApp2 {

/**
 * 
 * @param args liste des args. pass�s sur la ligne de commande
 */
    public static void main(String[] args) {
        java.util.List<Animal> menagerie;
        menagerie = new java.util.ArrayList<>();

        menagerie.add(new Chat("Poueet"));
        menagerie.add(new Chien("Snoopy"));
        menagerie.add(new Oiseau("Piaf"));

        java.util.Collections.sort(menagerie);// r�sultat du tri dans menagerie

        System.out.println("APRES TRI suivant les noms des animaux :\n");

        for (Animal a : menagerie) // pour chaque animal a de la menagerie
        {
            System.out.printf("Cri de %-10s", a);
            if (a instanceof Chat) {
                System.out.printf("%-10s", "(Chat)");
            } else {
                if (a instanceof Chien) {
                    System.out.printf("%-10s", "(Chien)");
                } else {
                    if (a instanceof Oiseau) {
                        System.out.printf("%-10s", "(Oiseau)");
                    }
                }
            }
            a.cri();
        }

        /* AUTRE SOLUTION en passant par un it�rateur
         java.util.Iterator<Animal> i = menagerie.iterator(); // d�finition d'un it�rateur
         Animal a = null; // a : r�f�rence sur Animal servant de variable de travail
         while ( i.hasNext() )
         {
         a = i.next(); // a : animal couramment r�f�renc� par  i
         System.out.printf("Cri de %-10s",a);
         if (a instanceof Chat) {
         System.out.printf("%-10s", "(Chat)");
         } else {
         if (a instanceof Chien) {
         System.out.printf("%-10s", "(Chien)");
         } else {
         if (a instanceof Oiseau) {
         System.out.printf("%-10s", "(Oiseau)");
         }
         }
         }
         a.cri();
         }
         */

        /* AUTRE SOLUTION en utilisant un indice classique
         Animal a = null; // a : r�f�rence sur Animal servant de variable de travail
         for( int j=0; j < menagerie.size(); j++ )
         {
         a = menagerie.get(j);
         System.out.printf("Cri de %-10s",a);
         if (a instanceof Chat) {
         System.out.printf("%-10s", "(Chat)");
         } else {
         if (a instanceof Chien) {
         System.out.printf("%-10s", "(Chien)");
         } else {
         if (a instanceof Oiseau) {
         System.out.printf("%-10s", "(Oiseau)");
         }
         }
         }
         a.cri();
         }
         */

    }// fin main
}//fin AnimalApp2
