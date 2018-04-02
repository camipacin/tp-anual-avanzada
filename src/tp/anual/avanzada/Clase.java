package tp.anual.avanzada;

public class Clase {

		private int numeroclase;
		private double ancho;
		private double largo;
		private int cantmesas;
		private String pizarron;
		private Pabellon idpabellon;
		
		public int getNumeroclase() {
			return numeroclase;
		}
		public void setNumeroclase(int numeroclase) {
			this.numeroclase = numeroclase;
		}
		
		public double getAncho() {
			return ancho;
		}
		public void setAncho(double ancho) {
			this.ancho = ancho;
		}
		
		public double getLargo() {
			return largo;
		}
		public void setLargo(double largo) {
			this.largo = largo;
		}
		
		public int getCantmesas() {
			return cantmesas;
		}
		public void setCantmesas(int cantmesas) {
			this.cantmesas = cantmesas;
		}
		
		public String getPizarron() {
			return pizarron;
		}
		public void setPizarron(String pizarron) {
			this.pizarron = pizarron;
		}
		
		public Pabellon getIdpabellon() {
			return idpabellon;
		}
		public void setIdpabellon(Pabellon idpabellon) {
			this.idpabellon = idpabellon;
		}
		
		public Clase(int numeroclase, double ancho, double largo,
				int cantmesas, String pizarron, Pabellon idpabellon) {
			this.numeroclase = numeroclase;
			this.ancho = ancho;
			this.largo = largo;
			this.cantmesas = cantmesas;
			this.pizarron = pizarron;
			this.idpabellon = idpabellon;
		}
		public Clase() {
			
		}
		
		
	
		
}
