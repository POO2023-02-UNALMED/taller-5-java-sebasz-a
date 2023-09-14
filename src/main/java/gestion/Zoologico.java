package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
	Zoologico(String nombre, String ubicacion, Zona[] zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	Zoologico() {
		this("","",0)
	}
	
	public void agregarZonas() {
		
	}
	public void cantidadTotalAnimales() {
		
	}
}
