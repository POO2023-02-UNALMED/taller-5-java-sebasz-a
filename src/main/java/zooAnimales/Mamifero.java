package zooAnimales;

public class Mamifero extends Animal {
	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	Mamifero() {
		
	}
	
	public void cantidadMamiferos() {
		
	}
	public void crearCaballo() {
		
	}
	public void crearLeon() {
		
	}
}