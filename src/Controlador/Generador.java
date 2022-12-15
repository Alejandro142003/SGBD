package Controlador;
import Modelo.Almacen;
import Modelo.Articulos;
import Utilidades.Introducir;
/**
 * 
 * @author Alejandro
 *
 */
public class Generador {
	
	/**
	 * Genera un almacen
	 * @return Almacen generado
	 */
	
	public static Almacen generaAlmacen(){
		
		String nombre = Introducir.leeString("Introduce el nombre del almacen: ");
		System.out.println();
		String direccion = Introducir.leeString("Introduce la direccion del almacen: ");
		System.out.println();
		String telefono = Introducir.leeString("Introduce el telefono del almacen: ");
		System.out.println();
		int superficie = Introducir.leeEntero("Introduce la superficie del almacen en m2: ");
		System.out.println();
		Almacen S = new Almacen(nombre, direccion, telefono, superficie); //S de Storage
		return S;
	}
	
	/**
	 * Funcion para generar articulos
	 * @param contador contador unico para generar los codigos
	 * @param almacen Almacen al que pertenece el articulo
	 * @return Articulo creado
	 */
	
	public static Articulos generaArticulos(int contador, Almacen almacen){
		
		String nombre = Introducir.leeString("Introduce el nombre del articulo: ");
		System.out.println();
		String descripcion = Introducir.leeString("Introduce la descripcion del articulo: ");
		System.out.println();
		int unidades = Introducir.leeEntero("Introduce la cantidad de articulos: ");
		System.out.println();
		float precio = Introducir.leeFloat("Introducir el precio del articulo: ");
		System.out.println();
		int codigo = contador;
		
		Articulos A = new Articulos(codigo, nombre, descripcion, unidades, precio);
		if(almacen.insertaArticulo(A)==true){
			System.out.println("Se ha creado correctamente");
		}else{
			System.out.println("Algo ha salido mal vuelvelo a intentar.");
		}
		return A;
	}
}