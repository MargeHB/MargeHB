package ejerc2;

//clase
public class Notas_alcanceVariables {
	int nota1;
	int nota2;
	
	//constructor
	public Notas_alcanceVariables(int n1, int n2) {	//m�todo constructor porque se llama igual que la clase
		this.nota1 = n1;	//a trav�s de this, pasamos el atributo de la clase como par�metro del constructor
		this.nota2 = n2;
	}
//otro m�todo de la clase
	public float promedio() {
		return (float)(nota1+nota2)/2.0f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
