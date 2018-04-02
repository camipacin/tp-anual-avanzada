package tp.anual.avanzada;

public class Alumno {

		private String nombre;
		private String apellido;
		private long dni;
		private String direccion;
		private Carrera idcarrera;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public long getDni() {
			return dni;
		}
		public void setDni(long dni) {
			this.dni = dni;
		}
		
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		public Carrera getIdCarrera() {
			return idcarrera;
		}
		public void setIdCarrera(Carrera idcarrera) {
			this.idcarrera = idcarrera;
		}
		
		public Alumno(String nombre, String apellido, long dni,
				String direccion, Carrera idcarrera) {
			
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.direccion = direccion;
			this.idcarrera = idcarrera;
		}
		
		public Alumno() {
		
		}
		
		
		
		
}
