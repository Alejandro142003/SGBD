package Modelo;

import java.util.Objects;

public class Articulos {
	private int codArticulo = 0;
	
	private String nombre;
	private String descripcion;
	private int unidades = 0;
	private double precio = 0.0;
	@SuppressWarnings("unused")

	public Articulos(int codArticulo, String nombre, String descripcion, int unidades, double precio) {
		this.codArticulo = codArticulo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.precio = precio;
	}
	
	public int getCodArticulo() {
		return this.codArticulo;
	}

	public void setCodArticulo(int codArticulo) {
		this.codArticulo = codArticulo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Codigo de Articulo: "+codArticulo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", unidades=" + unidades + ", precio=" + precio + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codArticulo, descripcion, nombre, precio, unidades);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulos other = (Articulos) obj;
		return codArticulo == other.codArticulo && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& unidades == other.unidades;
	}
	
	

}

