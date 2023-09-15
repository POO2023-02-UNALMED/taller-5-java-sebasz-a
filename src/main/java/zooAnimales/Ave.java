package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
	}
	
	Ave() {
		listado.add(this);
	}
	
	public int cantidadAves() {
		return listado.size();
	}
	public void movimiento() {
		
	}
	public void crearHalcon() {
		
	}
	public void crearAguila() {
		
	}
}
