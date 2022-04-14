package desafio3_1;
/**
 * Desafío 3_1 -2
 * Marcela Hermansen
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SmartWatch {
		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		// Creacion Array SmartList	
			ArrayList <Integer> smartList = new ArrayList <Integer>();
			smartList.add(300);
			smartList.add(405);
			smartList.add(403);
			smartList.add(506);
			smartList.add(100020040);
			smartList.add(45006);
			smartList.add(1044);
			
			//ordenar lista y mostrarla por pantalla
			Collections.sort(smartList);
			System.out.println("La lista original ordenada es: "+smartList);
			
			// Recorrer array y filtrar valores que cumplan con condición 200 > array < 100000
			ArrayList cleanList = new ArrayList<>();
		for (int i = 0; i < smartList.size(); i++) {
			if (smartList.get(i) > 200 && smartList.get(i) < 100000){
				cleanList.add(smartList.get(i));
			}
		}			
			//Lista filtrada y tamaño de lista Filtrada
			//System.out.println(cleanList);
			System.out.println("esta es la lista filtrada:" + cleanList);
			System.out.println("el tamaño de la lista es:" +cleanList.size());
	
					
			//sumar valores cleanList
			int suma= 0;
			int promedio= 0;
			for (int x=0; x<cleanList.size(); x++) {
				//System.out.println(cleanList.get(x));
				int numero= (Integer)cleanList.get(x);
				suma= suma+numero;
			}
			System.out.println("Esta es la suma de todos los pasos:"+suma);
			promedio= suma/cleanList.size();
			System.out.println("Este es el promedio de pasos:"+promedio+ " pasos");
			
			}
	}	
	