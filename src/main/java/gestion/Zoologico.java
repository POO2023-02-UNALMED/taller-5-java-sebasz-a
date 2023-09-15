package gestion;
import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	Zoologico() {
		
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int a;
		for (i = 0; i < zonas.size(); i++) {
			a += zonas[i].cantidadAnimales();
		}
		return a;
	}
}
