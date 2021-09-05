package restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase permite crear un objeto administrador de ordenes
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */
public class AdminOrdenes {
	List<Pedido> pedidos;

	/**
	 * Permite crear el objeto administrador de ordenes que consta de una lista de
	 * pedidos
	 */
	public AdminOrdenes() {
		super();
		pedidos = new ArrayList<Pedido>();
	}

	/**
	 * Permite procesar un determinado pedido
	 */
	void procesar() {

	}

	/**
	 * Permite agregar un pedido a la lista de pedidos
	 * 
	 * @param p es el pedido a agregar
	 * @return retorna el id del pedido que se agrego
	 */
	int agregar(Pedido p) {
		p.setEstado("ENCARGADO");
		pedidos.add(p);
		int id = Pedido.getNextID();
		p.setId(id);
		Pedido.setNextID(id + 1);
		System.out.println("se ha generado el pedido con el id: " + id);
		return id;
	}

}
