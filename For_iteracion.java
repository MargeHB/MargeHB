package ejerc2;

public class For_iteracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Repite hasta 1 > 10
		for(int i = 0;i<=10;i++) {
		System.out.println("Instrucciones 1 en 1---->"+i);
		}
		System.out.println("-------------");
		
		//Repite hasta i > 10, pero salta de dos en dos
		for(int i = 0;i<=10;i+=2) {
		System.out.println("Instrucciones 2 en 2---->"+i);
		}
		
		System.out.println("-------------");
		
		//Repite hasta que i sea menor que cero
		for(int i = 10;i>=0;i--) {
		System.out.print("Instrucciones 1 en 1 en reversa---->"+i+"\n");
		}
		
		//do while
		int i=0;
		do {
			System.out.print("Esto se mostrará 10 veces----->"+i+"\n");
			i+=1;			//contador
		}while (i<10);
		System.out.println("VALOR DE SALIDA PARA i--->"+i);
			
		}
	}

