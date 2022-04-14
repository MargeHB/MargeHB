package desafio5_1;

	//Crear clase Bus que se extiende de vehiculo + atributo cantidadDeAsientos
	public class Bus extends Vehiculo{
		private int cantidadDeAsientos;
		
		//get-set de cantidadDeAsientos
		public int getCantidadDeAsientos() {
			return cantidadDeAsientos;
		}

		public void setCantidadDeAsientos(int cantidadDeAsientos) {
			this.cantidadDeAsientos = cantidadDeAsientos;
		}
		

		//constructor herenciaVehiculo + cantidadDeAsientos()int
		public Bus(String color, String patente, int cantidadDeAsientos) {
			super(color, patente);
			this.cantidadDeAsientos = cantidadDeAsientos;
		}

		//método asientos disponibles
		public int asientosDisponibles(int cantidadAsientosDisponibles) {
			return cantidadAsientosDisponibles;
		}
						
		}
		

	
