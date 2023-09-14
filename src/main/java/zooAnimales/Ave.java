package zooAnimales;

public class Ave extends Animal{
	private Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Ave[] listado, int halcones, int aguilas, String colorPlumas) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
	}
	
	Ave() {
		this(Ave[],0,0,"");
	}
	
	public void cantidadAves() {
		
	}
	public void movimiento() {
		
	}
	public void crearHalcon() {
		
	}
	public void crearAguila() {
		
	}
}
