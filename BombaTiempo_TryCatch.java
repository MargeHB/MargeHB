package ejerc2;

import java.util.concurrent.TimeUnit;

public class BombaTiempo_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=5;
	while (i>0) { 	//instrucci�n se ejecuta hasta llegar a cero, ah� termina
		System.out.printf("%d\n",i);
		i--;			//en cada iteraci�n se descuenta 1
		
		try {
			TimeUnit.SECONDS.sleep(1);		//instrucci�n que se ejecuta si no hay problemas, indica que espera ser� de 1 segundo
		}catch (Exception e) {
			// TODO: handle exception		//instrucciones cuando se produce una excepci�n
			e.printStackTrace();
		}
	}
}
}

