package restaurant;

/**
 * Esta clase crea el objeto producto que representa la materia prima del
 * restaurant
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */
public class Producto {
	static int nextID;
	int id;
	int stock;
	String nombre;
	float precioCompra;

	/**
	 * El constructor de producto
	 * 
	 * @param nombre indica el nombre con el cual se identifica el producto
	 * @param stock  indica la cantidad disponible de ese producto
	 */
	public Producto(String nombre, int stock) {
		this.stock = stock;
		this.nombre = nombre;
	}

	/**
	 * Metodo que permite conocer la cantidad disponible de un producto
	 * 
	 * @return retorna la cantidad de productos disponibles
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Metodo que permite definir la cantidad disponible del producto
	 * 
	 * @param stock representa la cantidad disponible
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Metodo que permite conocer el nombre por el cual se identifica un determinado
	 * producto
	 * 
	 * @return retorna el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que permite definir el nombre del producto
	 * 
	 * @param nombre es el nombre que se le dara al producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que permite obtener el precio que cuesta adquirir el producto
	 * 
	 * @return retorna el valor del producto
	 */
	public float getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * Metodo que permite registrar el precio de mercado del producto
	 * 
	 * @param precioCompra representa lo que cuesta adquirir el producto
	 */
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
}
