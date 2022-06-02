package testCalculadora;
import static org.junit.Assert.*;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import desafio8.*;

public class CalculadoraTest_8 {
	private static Logger logger = Logger.getLogger ("Desafio8.1.testCalculadora.CalculadoraTest_8"); //instancia de logger, con logger se registran eventos de forma descriptiva
	private final Calculadora calculadora = new Calculadora();		//Instancia de calculadora
		
@BeforeClass
public static void setUpBeforeClass() throws Exception{
	System.out.println("------------TEST------------");
}

	
@Test //prueba de Método SUMAR
	public void testSumar() {
	logger.info("Info test Sumar");
	int respuestaSuma = calculadora.sumar(1, 2);		//Se define variable que recibe respuesta del método y entregan parámetros al método a probar
	int sumaEsperada = 3;								//Resultado que el método debiese entregar de ejecutarse correctamente
	assertEquals(sumaEsperada, respuestaSuma);	//comparación entre resultado "real" y "esperado" para el método a probar
	}
	
	@Test	//prueba de Método RESTAR
	public void testRestar() {
		logger.info("Info test Restar");
		int respuestaRestar = calculadora.restar(4, 3);
		int restaEsperada = 1;
		assertEquals(respuestaRestar, restaEsperada);
		}

	@Test //prueba de Método MULTIPLICAR
	public void testMultiplicar() {
		logger.info("Info test Multiplicar");
		int respuestaMultip= calculadora.multiplicar(5, 6);
		int multipEsperada = 30;
		assertEquals(respuestaMultip, multipEsperada);
		}

	@Test //prueba de Método DIVIDIR
	public void testDividir() {
		logger.info("Info test Dividir");
		float respuestaDiv = calculadora.dividir(5, 2);
		float divEsperada = 5/2;
		assertEquals(divEsperada, respuestaDiv, 0);
		}

@AfterClass
public static void tearDownAfterClass() throws Exception{
	System.out.println("Build Success");
}
	
}