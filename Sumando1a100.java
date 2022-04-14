package ejerc2;

public class Sumando1a100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;		//inicializar variable auxiliar
		int suma=0;		//variable que guarda la suma de números obtenidos en cada iteración
		while(i<100) {	//condicional con criterio fin ejecución
			i++;		//CONTADOR instrucción mientras se de la condición
			suma +=i;	//ACUMULADOR dado que suma e i comienzan en cero, debemos aumentar el valor de suma en 1, para que la suma sea desde 1 al 100 (sino sería desde 0 a 100)
		//System.out.println(suma);   	//si se coloca dentro del ciclo, va mostrando la suma en cada vuelta (ej: 1,3,6,10,15.... hasta 5050)
		}
		System.out.println(suma);    	//al dejarla fuera del ciclo, sólo muestra el número de la suma final, ej 5050
	}
	
	
}
