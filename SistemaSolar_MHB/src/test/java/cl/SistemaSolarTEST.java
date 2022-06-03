package cl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import cl.desafiolatam.Luna;
import cl.desafiolatam.Planeta;
/*
 * Probar:.
 * - cantidad de lunas por planeta ==> assertEquals
 * - nombre de planetas
 * - ingreso correcto de sus lunas ==> assertTrue
 * - cantidades de lunas ==> assertTrue
 * @author marge
 */
@SpringBootTest
public class SistemaSolarTEST {
	private Planeta planeta;
	private Luna luna;
	List<Luna> lunast= new ArrayList<Luna>();
	
	
@Before
public void test() {
Luna moon1 = new Luna("Deimos", 8, 1263);
Luna moon2= new Luna ("Phobos", 560, 0.319);
Planeta mars = new Planeta("Marte", 6794, 22794,2);
mars.setLunas(moon1);
mars.setLunas(moon2);
System.out.println(mars.getLunas().get(2));

//**Probar:cantidad de lunas por planeta ==> assertEquals*/
	assertEquals(2, mars.getNlunas());
		
//**Probar:.- nombre planeta creado ==> assertEquals*/
	assertEquals("Marte",mars.getNombre());
	
//** Probar: - ingreso correcto de sus lunas ==> assertTrue*/
	assertTrue (moon1.getDiametro()==8);

	
//agregar usando Junit las pruebas unitarias de las cantidades de Lunas por planeta (utilice assertEquals).(Opcional)
	assertTrue (mars.getNlunas()==2);
}
}

