package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Introducir {
/**
 * Para recoger un float por teclado.
 * 
 * @param text
 * @param Float
 */

public static float leeFloat (String text) {
	boolean numeroCorrecto = false;
	Scanner teclado = new Scanner(System.in);
	float num = -1;
	
	do {
		try {
			System.out.print(text);
			num = teclado.nextFloat();
			if (num < 0) {
				System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
				numeroCorrecto = true;
			}else {
				numeroCorrecto = false;
			}
		} catch (InputMismatchException ex) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		} catch (Exception e) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		}
	} while (numeroCorrecto = false);
	return num;
}

/**
 * Para devolver un int.
 * 
 * @param text
 * @return Int
 */

public static int leeEntero(String text) {
	boolean numeroCorrecto = false;
	Scanner teclado = new Scanner(System.in);
	int num = -1;
	
	do {
		try {
			System.out.print(text);
			num = teclado.nextInt();
			if (num < 0) {
				System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
				numeroCorrecto = true;
			}else {
				numeroCorrecto = false;
			}
		} catch (InputMismatchException ex) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		} catch (Exception e) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		}
	} while (numeroCorrecto = false);
	return num;
}

/**
 * Para devolver un String escrito por teclado.
 * 
 * @param text
 * @return texto as string
 */

public static String leeString (String text){
    Scanner scan = new Scanner(System.in);
    String texto;

    texto = scan.nextLine();

    return texto;
  }

/**
 * Método para rellenar un array con valores enteros.
 * 
 * @param myArray
 * @return Int[] myArray
 */

public static int[] rellenaArray(int[] miArray){
    for (int i = 0; i < miArray.length; i++) {
    miArray[i] = leeEntero("Introduce número para la posición " + i + " :");
    }
    return miArray;
}

/**
 * Método para rellenar un array con valores decimales (menores)
 * 
 * @param miArray
 * @return Float[] myArray
 */

public static float[] rellenaArray(float[] miArray){
    for (int i = 0; i < miArray.length; i++) {
    miArray[i] = leeFloat("introduce número para la posición " + i + " :");
    }
    return miArray;
}

}