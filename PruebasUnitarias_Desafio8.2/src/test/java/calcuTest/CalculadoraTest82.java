package calcuTest;

import static org.junit.Assert.*;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import desafio_82.Calculadora82;

//crear clase de prueba CalculadoraTest
@DisplayName("Test Clase Calculadora82")	//fase verde
public class CalculadoraTest82 {
	
/*//FASE ROJA (test fallan)
	
	//prueba de M�todo SUMAR 
	@Test
	public void sumaTestRojo() {
	 fail("M�todo a�n no se ha implementado en clase Calculadora"); 
	 }
	//prueba de M�todo RESTAR 
	  @Test  
	  public void restaTestRojo() {
		  fail("M�todo a�n no se ha implementado en clase Calculadora"); 
	  }
	//prueba de M�todo MULTIPLICAR
	  @Test  
	  public void multiTestRojo() {
	  fail("M�todo a�n no se ha implementado en clase Calculadora"); 
	  }
	 
	//prueba de M�todo DIVIDIR 
	 @Test 
	 public void divTestRojo() {
	fail("M�todo a�n no se ha implementado en clase Calculadora"); 
	}*/
	 
	
//REFACTORIZACION: mejorando c�digo
	Calculadora82 calcu = new Calculadora82();
	private static Logger logger = Logger.getLogger ("Running calcuTest.CalculadoraTest82");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("------------\n T E S T S\n------------");
		logger.info("Info Refactorizaci�n CalculadoraTest82");
	}
//FASE VERDE: m�todos se ajustan para pasar test
	@Test
	public void sumaTestRojo() { 
		int respSuma = calcu.sumaTestRojo();
		assertEquals(8,respSuma);
		}  
	
	@Test
	public void restaTestRojo() { 
		int respResta = calcu.restaTestRojo();
		assertEquals(4,respResta);
		}  
	@Test 	
	public void multiTestRojo() { 
		int respMulti= calcu.multiTestRojo();
		assertEquals(12,respMulti);
		} 
	@Test
	public void divTestRojo() { 
		int respDiv = calcu.divTestRojo();
		assertEquals(3,respDiv);
		} 

//REFACTORIZACION
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("Build Success");
	}	
}