/** fichier.java Gestion de fichiers
 *
 *
 * AUTEUR : M.RAMBURRUN
 */
import java.io.*;
import java.util.*;

public class Fichier
{
 public static void main( String[] args )
 {
   String[] noms={
                  "Albert Camus",
                  "Jean Paul Sartre",
                  "Jean Jacques Rousseau"
                 };
   Arrays.sort( noms ); // noms trié en croissant
   // Arrays.sort( noms, Collections.reverseOrder() ); // en décroissant
   try
   {
     FileWriter fw = new FileWriter( "noms.txt" );
     BufferedWriter fsor = new BufferedWriter( fw );
     for( String poste : noms )
     {
       fsor.write( poste + "\r\n" ); // "\n" suffit sous UNIX
     }
     /* autre façon plus classique
     for( int i = 0; i < noms.length; i++ )
     {
       fsor.write( noms[i] + "\r\n" ); // "\n" suffit sous UNIX
     }
     */
     fsor.close();
     fw.close();

     FileReader fr = new FileReader( "noms.txt" );
     BufferedReader fent = new BufferedReader( fr );
     String enr = null;

     while (  ( enr = fent.readLine() ) != null  )
     {
	   System.out.println( enr );
     }
     fent.close();
     fr.close();
   }catch ( FileNotFoundException e )
    {
      System.out.println("Fichier \"noms.txt\" non trouve");
      System.exit(0);
    }
    catch( IOException e )
    {
		System.out.println(e);
    }

 } // fin main
} // fin Fichier

