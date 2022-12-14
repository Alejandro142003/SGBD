package Controlador;

import Modelo.*;

import Utilidades.Introducir;

import Vista.Menu;

public class Control {
	  /**
	   * Funcion para realizar las diferentes opciones del men� principal
	   * 
	   * @param E1 Objeto de la Clase Empleado para modificar sus par�metros
	   * @param op La opcion del men� elegida
	   */
	public static void menuPrincipal(int op) {
		
		int rec = 0;
		
		Almacen S = Generador.generaAlmacen();
		
		switch(op) {
			case 1:
				
				rec++;
				Generador.generaArticulos(rec, S);
				System.out.println("");
				System.out.println("");
				
				break;
			
			case 2:
				
				System.out.println("");
				System.out.println("");
				Menu.menuIntroducir();
				modificarArticulos(A1);
				break;
				
			case 3:
				
				System.out.println("");
				System.out.println("");
				break;
				
			case 4:
				
				System.out.println("");
				System.out.println("");
				Menu.menuPrincipal();
				int codArticulo = Introducir.leeEntero("Introduce el codigo del articulo que quieres ver:");
				Almacen.muestraPorCodigo(codArticulo);
		        break;
		        
		    default:
		    	
		    	break;
		}
	}
	public static void modificarArticulos(Articulos A){
		
		
		boolean salir = false;
		Menu.menuSiNo("¿Quieres modificar articulos?");
		
		while(!salir) {
			if(Menu.chooseSiNo()==1) {
				switch(Menu.chooseOpcion()) {
					case 1:
						
						A.setNombre(Introducir.leeString("Introduce el nombre del articulo: "));
						System.out.println(A);
						break;
						
					case 2:
						
						A.setUnidades(Introducir.leeEntero("Introducela cantidad de articulos: "));
						System.out.println(A);
						break;
						
					case 3:
						
						A.setPrecio(Introducir.leeDouble("Introduce el precio del articulo: "));
						System.out.println(A);
						break;
						
					case 4:

						A.setDescripcion(Introducir.leeString("Introduce la descripcion del articulo: "));
						System.out.println(A);
						break;
						
					default:
						
						System.out.println("Introduce una opción valida");
						break;
				}
			}else {
				salir=true;
			}
		}
	}
	public static void crearArticulos() {
		
		Menu.menuSiNo("¿Quieres crear un nuevo articulo?");
		if(Menu.chooseSiNo()==1) {
			
		}
	}
}