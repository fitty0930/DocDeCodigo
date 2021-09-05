package restaurant;

/**
 * Esta clase crea el objeto item pedido que consta de un producto y una
 * cantidad del mismo
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */

public class ItemReceta {
	Producto p;
	int cantidad;

	/**
	 * Permite crear el objeto item receta
	 * 
	 * @param p        es el producto que lleva el item
	 * @param cantidad del producto que lleva el item
	 */
	public ItemReceta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}

}
