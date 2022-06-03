package cl.desafiolatam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainSistSolar{

	public static void main(String[] args) {
		SpringApplication.run(MainSistSolar.class, args);
			System.out.println("Hola");
		
		//info planetas Planeta (String nombre, int tamanio, int distanciaSol, int nlunas) 
		/*Planeta mercurio = new Planeta ("Mercurio", 4880, 5791, 0);
		Planeta venus = new Planeta("Venus", 12104, 10820,0);
		Planeta tierra = new Planeta("Tierra", 12756, 14960,1);
		Planeta marte = new Planeta("Marte", 6794, 22794,2);
		Planeta jupiter = new Planeta("Jupiter", 142984,77833,79);
		Planeta saturno = new Planeta("Saturno", 108728, 142940,82);
		Planeta urano = new Planeta("Urano", 51118, 287099, 27);
		Planeta neptuno = new Planeta("Neptuno", 49532, 450430, 14);*/
		
		
		//info lunas  Luna(String nombreLuna, int diametro, double tpOrbita)
		//Luna luna = new Luna();
		 Luna tierra1 = new Luna ("Luna", 3476, 27322);
				 		 
		 Luna marte1 = new Luna ("Deimos", 8, 1263);
		 Luna marte2= new Luna ("Phobos", 560, 0.319);
		 
		 Luna jupiter1 = new Luna ("Callisto", 4800, 16.689);
		 Luna jupiter2 = new Luna ("Ganymede", 5276, 7.155);
		 
		 Luna saturno1 = new Luna ("Atlas", 999, 0.602);
		 Luna saturno2 = new Luna ("Titan", 5150, 15.945);
		 
		 Luna urano1 = new Luna ("Oberon", 1526, 13.463);
		 Luna urano2 = new Luna ("Umbriel", 1190, 4.144);
		 
		 Luna neptuno1 = new Luna ("Thalassa", 90, 0.31);
		 Luna neptuno2 = new Luna ("Triton", 2705, 5.877);
		 		 
		 
		//mostrar info planetas + lunas  Planeta(String nombre, int tamanio, int distanciaSol, int nlunas, ArrayList<Luna> lunas) 
		 	//Planeta planeta = new Planeta ();
		 	Planeta mercurio = new Planeta ("Mercurio", 4880, 5791, 0); 
			Planeta venus = new Planeta("Venus", 12104, 10820,0);
			Planeta tierra = new Planeta("Tierra", 12756, 14960,1); tierra.setLunas(tierra1);
			
			Planeta marte = new Planeta("Marte", 6794, 22794,2);
			marte.setLunas(marte1);
			marte.setLunas(marte2);
			
			Planeta jupiter = new Planeta("Jupiter", 142984,77833,79); 
			jupiter.setLunas(jupiter1);
			jupiter.setLunas(jupiter2);
			
			Planeta saturno = new Planeta("Saturno", 108728, 142940,82);
			saturno.setLunas(saturno1);
			saturno.setLunas(saturno2);
			
			Planeta urano = new Planeta("Urano", 51118, 287099, 27);
			urano.setLunas(urano1);
			urano.setLunas(urano2);
			
			Planeta neptuno = new Planeta("Neptuno", 49532, 450430, 14);
			neptuno.setLunas(neptuno1);
			neptuno.setLunas(neptuno2);
		
		
		//agregar a list planet
			SistSolar ssolar = new SistSolar();
			ssolar.addplanet(mercurio);
			ssolar.addplanet(venus);
			ssolar.addplanet(tierra);
			ssolar.addplanet(marte);
			ssolar.addplanet(jupiter);
			ssolar.addplanet(saturno);
			ssolar.addplanet(urano);
			ssolar.addplanet(neptuno);
			
		ssolar.PlanetasLunas();
	}

}
