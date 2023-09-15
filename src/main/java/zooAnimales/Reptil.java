package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	Reptil() {
		listado.add(this);	
	}
	
	public int cantidadReptiles() {
		retrun listado.size();
	}
	public void movimiento() {
		
	}
	public void crearIguana() {
		
	}
	public void crearSerpiente() {
		
	}
}
