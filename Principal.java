
package ejercicios;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Solo Test");
		//instancia de auto (creacion de objeto)
		Auto autito = new Auto("toyota","corolla","azul",100);		//al imprimir esto luego de agregar los nuevos parametros a toString
																	//en pantalla1:  Auto [marca=toyota, modelo=corolla, color=azul, velocidadActual=110, patente=false, permisoCirculacion=false, revisionTecnica=0]  pues no le indiqué valores para los últimos 3 atributos
		String marca = autito.getMarca();
		
		System.out.println(marca);
		
		//llama a método aumentar velocidad sin parámetros (suma en 10 la velocidad actual)
		System.out.println(autito.aumentarVelocidad());
		
		//llamado de instancia de auto (autito) y su llamada a método sobrecarga de toString. esta es la referencia de la instancia y los números son la memoria reservada 
		System.out.println(autito.toString());		//impresionPorPantalla ejercicios.Auto@cac736f
		
		//llamada a método circulacionCIudad para la instancia autito y se llama al toString para representar la ejecución del método en un String
		autito.circulacionCiudad(false, false, 0);
		
		//se muestra en pantalla a través de la representación que hace la sobrecarga de toString
		System.out.println(autito.toString());
	}

}
