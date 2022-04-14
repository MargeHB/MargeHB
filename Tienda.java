package desafio5_1;

	//crear clase Tienda
	public class Tienda {
	private Vendedor vendedor;
	private Vehiculo vehiculo;
	private int stock;
	
	//get-set vendedor-vehiculo-stock
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//constructor
	public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.stock = stock;
	}
	
	//método existeStock() con retorno String stock
	public String existeStock() {
		return ("cantidad de stock es.." + getStock());
	}
	
   	
}
