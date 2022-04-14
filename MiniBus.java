package desafio5_1;
	
		//creacion clase MiniBus, hereda de Bus con atributo tipoViaje
		public class MiniBus extends Bus {
		private String tipoViaje;

		//get-set tipoViaje
		public String getTipoViaje() {
			return tipoViaje;
		}

		public void setTipoViaje(String tipoViaje) {
			this.tipoViaje = tipoViaje;
		}
		
		//constructor MiniBus
		public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
			super(color, patente, cantidadDeAsientos);
			this.tipoViaje = tipoViaje;
		}
		
		
		//método imprimeBus
		public void ImprimeBus() {
			String todosAtrib;
		//Crear instancia Persona, atributo persona
			Persona persona = new Persona("10.000.000-0","Pedro",45);
			Cliente cliente = new Cliente("1.111.111-1","Elena",23);
			Vendedor vendedor = new Vendedor ("24.500.003-3", "José",33, "Polo Norte #44");
			Vehiculo vehiculo = new Vehiculo("rojo", "wjrt-11");
			Taxi taxi = new Taxi ("techito Amarillo", "ttxx-11",2000);
			Bus bus = new Bus ("blanco", "micr-88", 3);
			MiniBus minibus = new MiniBus ("verde","viaj-99",15,"Paseo Curso");
					
			
			todosAtrib =  persona.getNombre()+persona.getRut()+ persona.getEdad() + cliente.getNombre()+ cliente.getRut()+cliente.getEdad() + vendedor.getRut()+ vendedor.getNombre()+ vendedor.getEdad()+ vendedor.getDirección() + vehiculo.getColor()+ vehiculo.getPatente() + taxi.getColor()+ taxi.getPatente()+taxi.getValorPasaje()+bus.getColor()+bus.getColor()+bus.getCantidadDeAsientos()+ minibus.getColor()+ minibus.getPatente()+ minibus.getCantidadDeAsientos()+ minibus.getTipoViaje();
			
			
			System.out.printf(todosAtrib);
			}

			
		
		}
	
	
		


