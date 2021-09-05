package restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase nos permite conocer la cantidad de productos que se encuentran a
 * disposición en el restaurant
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */
public class Stock {
	List<Producto> stock;

	/**
	 * Constructor para la clase Stock, crea la lista de productos en stock
	 */
	public Stock() {
		stock = new ArrayList<Producto>();
	}

	/**
	 * Metodo que permite agregar distintas cantidades de un determinado producto al
	 * stock
	 * 
	 * @param p        es el producto a agregar con sus caracteristicas asociadas
	 * @param cantidad es el numero de productos de ese tipo que se agregan al stock
	 */
	public void agregar(Producto p, int cantidad) {
		if (stock.indexOf(p) >= 0)
			p.setStock(p.getStock() + cantidad);
		else {
			p.setStock(cantidad);
			stock.add(p);
		}

	}
}
