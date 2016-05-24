
/** TestFile.java pour récupérer des infos système sur un fichier
 * à partir du SGF.
 *
 * On utilise la classe File du package java.io
 *
 * AUTEUR : M.RAMBURRUN
 */

package testfile;

import java.io.*;
import java.util.*;

public class TestFile
{
 public static void main( String args[] ) throws IOException
 {
  Scanner s = new Scanner( System.in );
  String nomfich;
  boolean ok;
  File fich1; // définition d'une référence
  
  do
  {
   do
   {
    ok = true;
    System.out.print( "Entrer le nom d'un objet du SGF : " );
    nomfich = s.nextLine();
    fich1 = new File( nomfich) ;
    if ( ! fich1.exists() )
    {
		ok = false;
		System.out.println( "L'objet \"" + nomfich + "\" n'existe pas!!!" );
    }
   }while ( nomfich.length() == 0 || !ok );

   System.out.println( "\nL'objet \"" + fich1.getName() + "\"" +
(fich1.isFile()?" est bien enregistré comme type \"fichier\"(dans SGF)\n":
    " est un répertoire ou un canal nommé\n") );

   System.out.println( "TAILLE : " + fich1.length() + " octets\n" );

   System.out.println( "CHEMIN RELATIF : " + fich1.getPath() + "\n" );

   System.out.println( "CHEMIN ABSOLUE : " + fich1.getAbsolutePath()+"\n" );

   System.out.println( fich1.canRead() ?
     "La lecture est autorisée\n":
     "La lecture n'est pas autorisée\n" );

   System.out.println( fich1.canWrite() ? "L'écriture est autorisée\n" :
     "L'écriture n'est pas autorisée\n" );

   System.out.println( fich1.isDirectory() ? "L'objet est un répertoire\n":
     "L'objet n'est pas un répertoire\n" );

   System.out.print( "Recommencer (o/n) ? " );


  }while ( ! s.nextLine().equalsIgnoreCase( "n" ) );

 }// fin main

}// fin TestFile
