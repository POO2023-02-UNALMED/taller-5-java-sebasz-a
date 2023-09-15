package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
	private ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	Pez() {
		listado.add(this);
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
	public void movimiento() {
		
	}
	public void crearSalmon() {
		
	}
	public void crearBacalao() {
		
	}
}
