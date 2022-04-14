
package ejercicios;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Solo Test");
		//instancia de auto (creacion de objeto)
		Auto autito = new Auto("toyota","corolla","azul",100);		//al imprimir esto luego de agregar los nuevos parametros a toString
																	//en pantalla1:  Auto [marca=toyota, modelo=corolla, color=azul, velocidadActual=110, patente=false, permisoCirculacion=false, revisionTecnica=0]  pues no le indiqu� valores para los �ltimos 3 atributos
		String marca = autito.getMarca();
		
		System.out.println(marca);
		
		//llama a m�todo aumentar velocidad sin par�metros (suma en 10 la velocidad actual)
		System.out.println(autito.aumentarVelocidad());
		
		//llamado de instancia de auto (autito) y su llamada a m�todo sobrecarga de toString. esta es la referencia de la instancia y los n�meros son la memoria reservada 
		System.out.println(autito.toString());		//impresionPorPantalla ejercicios.Auto@cac736f
		
		//llamada a m�todo circulacionCIudad para la instancia autito y se llama al toString para representar la ejecuci�n del m�todo en un String
		autito.circulacionCiudad(false, false, 0);
		
		//se muestra en pantalla a trav�s de la representaci�n que hace la sobrecarga de toString
		System.out.println(autito.toString());
	}

}
