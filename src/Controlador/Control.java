package Controlador;

import Modelo.*;

import Utilidades.Introducir;

import Vista.Menu;

public class Control {
	  /**
	   * Metodo para realizar las diferentes opciones del men� principal
	   * 
	   * @param E1 Objeto de la Clase Empleado para modificar sus par�metros
	   * @param op La opcion del men� elegida
	   */
	public static void menuPrincipal(int op) {
		
		int rec = 1;
		Almacen S = Generador.generaAlmacen();
		Articulos A = Generador.generaArticulos(rec, S);

		switch(op) {
			case 1:
				
				rec++;
				System.out.println();
				System.out.println();
				A = Generador.generaArticulos(rec, S);
				
				break;
			
			case 2:
				
				System.out.println();
				System.out.println();
				Menu.menuIntroducir();
				modificarArticulos(A, S);
				break;
				
			case 3:
				
				System.out.println();
				System.out.println();
				Menu.menuPrincipal();
				eliminarArticulos(A,S);
				
				break;
				
			case 4:
				
				System.out.println();
				System.out.println();
				
				
		        break;
		        
		    default:
		    	
		    	break;
		}
	}
	
	/**
	 * Metodo donde se van a modificar los articulos
	 * 
	 * @param Articulo para modificar
	 * @param Almacen donde se encuentra el articulo a modificar
	 */
	
	public static void modificarArticulos(Articulos Articulo, Almacen Almacen){
		
		boolean salir = false;
		Menu.menuSiNo("¿Quieres modificar articulos?");
		
		while(!salir) {
			if(Menu.chooseSiNo()==1) {
				
				System.out.println();
				int cod = Introducir.leeEntero("Introduce el codigo de articulo que quiere modificar: ");
				Menu.menuModificar();
				
				
				switch(Menu.chooseOpcion()) {
					case 1:
						
						Articulo = Almacen.muestraPorCodigo(cod);
						if(Articulo==null) {
							System.out.println("El codigo de articulo que ha introducido no existe");
						}else {
							String nombre = Introducir.leeString("Introduce el nuevo nombre de articulo: ");
							Articulo.setNombre(nombre);
						}
						
						break;
						
					case 2:
						
						Articulo = Almacen.muestraPorCodigo(cod);
						if(Articulo==null) {
							System.out.println("El codigo de articulo que ha introducido no existe");
						}else {
							int cantidad = Introducir.leeEntero("Introduce la cantidad de articulos: ");
							Articulo.setUnidades(cantidad);
						}
						
						break;
						
					case 3:
						
						Articulo = Almacen.muestraPorCodigo(cod);
						if(Articulo==null) {
							System.out.println("El codigo de articulo que ha introducido no existe");
						}else {
							Double precio = Introducir.leeDouble("Introduce el nuevo precio de articulo: ");
							Articulo.setPrecio(precio);
						}
						
						break;
						
					case 4:

						Articulo = Almacen.muestraPorCodigo(cod);
						if(Articulo==null) {
							System.out.println("El codigo de articulo que ha introducido no existe");
						}else {
							String descripcion = Introducir.leeString("Introduce la nuevo descripcion de articulo: ");
							Articulo.setDescripcion(descripcion);
						}
						
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
	
	/**
	 * Funcion para elimminar un articulo
	 * @param Articulo
	 * @param Almacen
	 */
	
	public static void eliminarArticulos(Articulos Articulo, Almacen Almacen) {
		System.out.println();
		int cod = Introducir.leeEntero("Introduce el codigo de articulo que quiere eliminar: ");
		
		Articulo = Almacen.muestraPorCodigo(cod);
		if(Articulo==null) {
			System.out.println("El codigo de articulo que ha introducido no existe");
		}else {
			Almacen.eliminaArticulo(Articulo);
		}
	}
	
	/**
	 * Funcion para mostrar un articulo
	 * @param Articulo
	 * @param Almacen
	 */
	
	public static void mostrarArticulos(Articulos Articulo, Almacen Almacen) {
		System.out.println();
		int cod = Introducir.leeEntero("Introduce el codigo de articulo que quiere mostrar: ");
		
		Articulo = Almacen.muestraPorCodigo(cod);
		if(Articulo==null) {
			System.out.println("El codigo de articulo que ha introducido no existe");
		}else {
			System.out.println(Articulo);
		}
	}
}