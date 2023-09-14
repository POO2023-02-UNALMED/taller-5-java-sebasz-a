package zooAnimales;

public class Pez extends Animal{
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Pez[] listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	Pwz() {
		this(Pez[],0,0,"",0);
	}
	
	public void cantidadPeces() {
		
	}
	public void movimiento() {
		
	}
	public void crearSalmon() {
		
	}
	public void crearBacalao() {
		
	}
}
