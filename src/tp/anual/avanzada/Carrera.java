package tp.anual.avanzada;

public class Carrera {
	
	private int aniosestimado;
	private int cantmaterias;
	private String nombre;
	
	public int getAniosestimado() {
		return aniosestimado;
	}
	public void setAniosestimado(int aniosestimado) {
		this.aniosestimado = aniosestimado;
	}
	
	public int getCantmaterias() {
		return cantmaterias;
	}
	public void setCantmaterias(int cantmaterias) {
		this.cantmaterias = cantmaterias;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Carrera(int aniosestimado, int cantmaterias, String nombre) {
		this.aniosestimado = aniosestimado;
		this.cantmaterias = cantmaterias;
		this.nombre = nombre;
	}
	
	public Carrera() {
		
	}
	
	
	

}
	