package tp.anual.avanzada;

public class Profesor extends Empleado {
	
	private Clase idclase;

	public Clase getIdclase() {
		return idclase;
	}

	public void setIdclase(Clase idclase) {
		this.idclase = idclase;
	}

	public Profesor() {
		
	}
	public Profesor(String nombre, String apellido, long dni, String direccion,
			double sueldo, Clase idclase) {
		super(nombre, apellido, dni, direccion, sueldo);
		this.idclase=idclase;
	}
	
	
}
