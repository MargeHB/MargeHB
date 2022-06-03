package cl.desafiolatam;

import java.util.ArrayList;

public class SistSolar {
		//ArrayList<Planeta>
		private ArrayList<Planeta> planet = new ArrayList<Planeta>();

		//getter-setter
		public ArrayList<Planeta> getPlanet() {
			return planet;	}

		public void setPlanet(ArrayList<Planeta> planet) {
			this.planet = planet;	}

		//constructor vacio
		public SistSolar() {
			super();
		}

//Mostrar lista Planetas
		
	//poblar lista Planetas
		public void addplanet(Planeta planeta) {
			this.planet.add(planeta);
		}
	//recorrer y mostrar lista	
		public void mostrarPlanetas() {
			for(int i=0; this.planet.size() < i; i++) {
				System.out.println(this.planet.get(i).toString());
			}
		}
		
//mostrar info planetas y lunas
		//poblar lista Planeta+Lunas
		public void PlanetasLunas() {
			//planetas
			for(int i=0; this.planet.size()>i; i++) {
				System.out.println(this.planet.get(i).toString());
				//lunas		
				for(int x=0; this.planet.get(i).getLunas().size()>x; x++) {
				System.out.println(this.planet.get(i).getLunas().get(x).toString());
		}	System.out.println("-------------------------------------------------------------------------------------------------------------------");
}}
}