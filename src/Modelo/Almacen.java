package Modelo;

public class Almacen {
	private String nombre;
	private String direccion;
	private String telefono;
	private int superficie = 0;
	private int tamano = 100;
	private Articulos [] misArticulos;
	@SuppressWarnings("unused")
	private Almacen() {
		
	}
	
	public Almacen (String nombre, String direccion, String telefono, int superficie,int tamano) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.superficie = superficie;
		this.tamano = tamano;
		this.misArticulos = new Articulos[tamano];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	


	public Articulos[] getMisArticulos() {
		return misArticulos;
	}

	public void setMisArticulos(Articulos[] misArticulos) {
		this.misArticulos = misArticulos;
	}

	@Override
	public String toString() {
		return "Nombre de almacen = " + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", superficie="
				+ superficie + "\n";
	}
	
	/**
	 * Aquí controlamos la el tamano del array que debe tener
	 * @return el tamano del array
	 */
	public int tamanoArray() {
		//int tamano=0;
		for(int i = 0; i < misArticulos.length; i++) {
			if(misArticulos[i]!=null) {
				tamano++;
			}
		}
		return tamano;
	}
	
	
	/**
	 * Busca una zona vacía dentro del array y una vez encontrada la iguala las direccioones de memoria.
	 * También implementa que no se pueda registrar dos artículos con el mismo código
	 * @param a Artículo a introducir
	 * @return Devuelve boolean
	 */
	public boolean insertaArticulo(Articulos a) {
		boolean result = false;
		if(a!=null && tamanoArray()<tamano && muestraPorCodigo(a.getCodArticulo())==null) {
			for(int i = 0; i < misArticulos.length && !result; i++) {
				if(misArticulos[i]==null) {
					misArticulos[i]=a;
					result = true;
				}
			}
		}
		return result;
	}
	
	/*public Articulos[] muestraTodos(){
		return getMisArticulos();
	}*/
	
	/**
	 * Devuelve el articulo que coincide con el codigo de dicho artículo
	 * @param codArticulo: el codigo que se va a buscar
	 * @return: Devuelve el articulo o null si no está
	 */
	public Articulos muestraPorCodigo(int codArticulo) {
		Articulos a = null;
		if(misArticulos!=null && tamanoArray() > 0) {
			for(int i = 0; i < misArticulos.length && a == null; i++) {
				if(misArticulos[i].getCodArticulo() == codArticulo) {
					a = misArticulos[i];
				}
			}
		}
		return a;
	}
	
	/**
	 * Nos muestra todos los articulos que tenemos
	 */
	public void verArticulos(){
		for(Articulos a : misArticulos) {
			System.out.println(a);
		}
	}
	
	/**
	 * Actualizamos un articulo
	 * @param a: Articulo a actualizar
	 * @return: Hace que interrumpa el for
	 */
	public boolean actualizaArticulo(Articulos a) {
		boolean result = false;
		if(a!=null && muestraPorCodigo(a.getCodArticulo())!=null) {
			for (int i=0; i<misArticulos.length && !result; i++) {
				if(misArticulos[i].equals(a)) {
					misArticulos[i]=a;
					result = true;
				}
			}
		}
		return result;
	}
	
	/**
	 * Elimina un artículo
	 * @param a: Articulo a borrar
	 * @return: Hace que se interrumpa el for
	 */
	public boolean eliminaArticulo(Articulos a) {
		boolean result = false;
		if(a!=null && muestraPorCodigo(a.getCodArticulo())!=null) {
			for (int i=0; i<misArticulos.length && !result; i++) {
				if(misArticulos[i].equals(a)) {
					misArticulos[i]=null;
					result = true;
				}
			}
		}
		return result;
	}
	
	
	
}

