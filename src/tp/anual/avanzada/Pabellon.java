package tp.anual.avanzada;

public class Pabellon {
	
	private double tama�o;
	private String nombre;
	private String direccion;
	
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
	
	public Pabellon(double tama�o, String nombre, String direccion) {
		
		this.tama�o = tama�o;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Pabellon() {
		
	}
	
	
	
}
