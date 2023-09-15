package zooAnimales;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	Animal() {
		totalAnimales++;
	}
	
	public void movimiento() {
		
	}
	public void totalPorTipo() {
		System.out.println("Mamiferos: " + Mamifero.cantidadMamiferos);
	}
	public String toString() {
		
	}
}
