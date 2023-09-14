package zooAnimales;

public class Reptil extends Animal{
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Reptil[] listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	Reptil() {
		this(Reptil[],0,0,"",0);
	}
	
	public void cantidadReptiles() {
		
	}
	public void movimiento() {
		
	}
	public void crearIguana() {
		
	}
	public void crearSerpiente() {
		
	}
}
