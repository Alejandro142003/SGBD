package Vista;
import Utilidades.*;

public class Menu{  
	/*
	 *Esta función nos muestra el menu 
	 */
	 public static void menuPrincipal() {
		 System.out.println("");
	        System.out.println("@----------------------------@");
	        System.out.println("|            MENU            |");
	        System.out.println("|----------------------------|");
	        System.out.println("|Elige una opcion:           |");
	        System.out.println("| 1.Introducir articulos     |");
	        System.out.println("| 2.Modificar articulo       |");
	        System.out.println("| 3.Borrar articulo          |");
	        System.out.println("| 4.Salir                    |");
	        System.out.println("@----------------------------@");
	        System.out.println("");
	 }
	 /**
	  * Función que pide un entero entre 1 y 4,validandolo
	  * @return opcion 
	  */
	
 public static  int introduceOpcion() {
	 
	 int opcion=-1;
	 boolean valido=false;
	 do {
		 valido=false;
		 opcion=Introducir.leeEntero("Elige una opcion");
		 if((opcion<1)||(opcion>5)){
			System.out.println("Debe de introducir un opción valida");
			valido=true;
		 }
	 }while(valido);
	 return opcion;
 }
 
 /*
  * Funcion que nos muestra el menu
  */
 public static void menuIntroducir() {
	 System.out.println("");
     System.out.println("@-----------------------------@");
     System.out.println("|       MENU: INTRODUCIR      |");
     System.out.println("|-----------------------------|");
     System.out.println("|Elige una opcion:            |");
     System.out.println("| 1.Introducir el nombre      |");
     System.out.println("| 2.Introducir la cantidad    |");
     System.out.println("| 3.Introducir el precio      |");
     System.out.println("| 4.Introducir la descripcion |");
     System.out.println("@-----------------------------@");
     System.out.println("");
 }
 /**
  * Función que pide un entero entre 1 y 4,validandolo
  * @return opcion 
  */
 public static int introduceOp() {
	 int opcion=-1;
	 boolean valido=false;
	 do {
		 valido=false;
		 opcion=Introducir.leeEntero("Elige una opcion");
		 if((opcion<1)||(opcion>4)){
			System.out.println("Debe de introducir un opción valida");
			valido=true;
		 }
	 }while(valido);
	 return opcion;
 }
 /*
  * Funcion que nos muestra el menu
  */
 public static void menuModificar() {
	 System.out.println("");
     System.out.println("@---------------------------@");
     System.out.println("|       MENU: MODIFICAR     |");
     System.out.println("|---------------------------|");
     System.out.println("|Elige una opcion:          |");
     System.out.println("| 1.Modifica el nombre      |");
     System.out.println("| 2.Modifica la cantidad    |");
     System.out.println("| 3.Modifica el precio      |");
     System.out.println("| 4.Modifica la descripcion |");
     System.out.println("@---------------------------@");
     System.out.println("");
 }
 /**
  * Función que pide un entero entre 1 y 4,validandolo
  * @return opcion 
  */
 public static int chooseOpcion() {
	 System.out.println();
	 int opcion=-1;
	 boolean valido=false;
	 do {
		 valido=false;
		 opcion=Introducir.leeEntero("Elige una opcion");
		 if((opcion<1)||(opcion>4)){
			System.out.println("Debe de introducir un opción valida");
			valido=true;
		 }
	 }while(valido);
	 return opcion;
 }
 
/**
 * Funcion para preguntar al usuario si quiere hacer algo.
 * @param texto Texto que se va a mostrar por pantalla.
 */
 public static void menuSiNo(String texto) {
	 System.out.println(texto);
	 System.out.println("1.Si");
	 System.out.println("2.No");
 }
 /**
  * Función que pide un entero (1 o 2),validandolo
  * @return opcion 
  */
 public static int chooseSiNo() {
	 int opcion=-1;
	 boolean valido=false;
	 do {
		 valido=false;
		 opcion=Introducir.leeEntero("Elige una opcion");
		 if((opcion<1)||(opcion>2)) {
			 System.out.println("Debe de introducir una opcion valida");
			 valido=true;
		 }
	 }while(valido);
	 return opcion;
 }
 
 /**
  * Nos muestra  un texto de despedida
  */
 public static void textoFinal(){
   
     System.out.println("Gracias por usar nuestro programa");

   }
 }
