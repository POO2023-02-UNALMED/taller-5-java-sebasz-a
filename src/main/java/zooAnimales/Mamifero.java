package zooAnimales;

public class Mamifero extends Animal {
	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Mamifero[] listado, int caballos, int leones, boolean pelaje, int patas) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.listado = listado;
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	Mamifero() {
		this(Mamifero[],0,0,false,0);
	}
	
	public void cantidadMamiferos() {
		
	}
	public void crearCaballo() {
		
	}
	public void crearLeon() {
		
	}
}
