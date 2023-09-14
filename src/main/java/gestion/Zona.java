package gestion;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	Zona(String nombre, Zoologico zoo, Animal[] animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	Zona() {
		this("", null, null);
	}
	
	public void agregarAnimales() {
		
	}
	public void cantidadAnimales() {
		
	}
}
