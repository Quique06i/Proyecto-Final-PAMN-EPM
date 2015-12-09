/*Enrique Pérez Martinez
  Proyecto Final PAMN
	Nombre del Proyecto: Tus Rolas
*/
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class LeerCancion{
	public void lee(){
			try{
				//Presentacion
				System.out.println("-------------------------------------------");
				System.out.println("-------------------------------------------");
				System.out.println("----------Bienvenido a Tus rolas :)--------");
				System.out.println("Esta Aplicacion Busca la letra de tus canciones ");
				System.out.println("Ingrese su nombre:    ");

				//Lee nombre
				String nombre = "";
            	Scanner entradaEscaner = new Scanner (System.in);
            	nombre = entradaEscaner.nextLine ();
            
            	System.out.println(" \n" + nombre + " Ingresa el nombre de la cancion que buscas");
            	
            	//Lee Cancion
            	String cancion = "";
            	Scanner entradaEscaner2 = new Scanner (System.in);
            	cancion = entradaEscaner2.nextLine ();
            	System.out.println ("La cancion que estas buscando es: \"" + cancion +"\"");


            	//abre cancion en el cmd
				FileReader fr = new FileReader(""+cancion+".txt");
				BufferedReader br = new BufferedReader(fr);
				String cadena="";
				System.out.println("La letra es: \n");
				while(cadena != null){
				cadena = br.readLine();
				System.out.println(cadena);
				}
			}
			catch(IOException ioe){}//Ecepcion
	}	
}
