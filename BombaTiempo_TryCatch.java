package ejerc2;

import java.util.concurrent.TimeUnit;

public class BombaTiempo_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=5;
	while (i>0) { 	//instrucción se ejecuta hasta llegar a cero, ahí termina
		System.out.printf("%d\n",i);
		i--;			//en cada iteración se descuenta 1
		
		try {
			TimeUnit.SECONDS.sleep(1);		//instrucción que se ejecuta si no hay problemas, indica que espera será de 1 segundo
		}catch (Exception e) {
			// TODO: handle exception		//instrucciones cuando se produce una excepción
			e.printStackTrace();
		}
	}
}
}

