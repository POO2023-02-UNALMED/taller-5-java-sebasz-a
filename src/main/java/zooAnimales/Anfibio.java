package test;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	Anfibio() {
		listado.add(this);
	}
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	public void movimiento() {
		
	}
	public void crearRana() {
		
	}
	public void crearSalamandra() {
		
	}
}
