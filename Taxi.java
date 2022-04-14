package desafio5_1;

/**
 * creación clase Taxi con su atributo (instruccion no dice que hereda, aunque gráfico sí
	public class Taxi {
	private int valorPasaje; 
	{*/
	
//creación clase Taxi hereda de Vehículo + atributo propio de taxi
		public class Taxi extends Vehiculo{
		private int valorPasaje;

	//creación set-get para valorPasaje
	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	/*// creación ConstructorTaxi
	public Taxi(int valorPasaje) {
	this.valorPasaje = valorPasaje;
	}*/
	
	// creación ConstructorTaxi que hereda de Vehiculo
		public Taxi(String color, String patente, int valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
	}
	
	//creacion metodo pagarPasaje 
	public int pagarPasaje(int montoPasaje) {
		int devolverVuelto;
		
		//condicion antes de pagar pasaje
		if (montoPasaje > valorPasaje) {	
			devolverVuelto = (montoPasaje - valorPasaje);
		}else {
			 devolverVuelto = valorPasaje;
		}
			return devolverVuelto;
		
	}
	

}
