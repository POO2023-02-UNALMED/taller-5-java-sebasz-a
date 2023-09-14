package test;

public class Anfibio extends Animales{
	private Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Anfibio[] listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.listado = listado;
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	Anfibio() {
		this(Anfibio[],0,0,"",false);
	}
	
	public void cantidadAnfibios() {
		
	}
	public void movimiento() {
		
	}
	public void crearRana() {
		
	}
	public void crearSalamandra() {
		
	}
}
