package tp.anual.avanzada;

public class Pabellon {
	
	private double tamaño;
	private String nombre;
	private String direccion;
	
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Pabellon(double tamaño, String nombre, String direccion) {
		
		this.tamaño = tamaño;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Pabellon() {
		
	}
	
	
	
}
