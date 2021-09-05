package restaurant;

import java.util.List;

/**
 * Clase que permite crear un pedido con los productos necesarios para completar
 * el mismo
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */
public class Pedido {
	static int nextID = 0;

	List<ItemPedido> items;
	Usuario usuario;
	String estado;
	int id;

	/**
	 * Permite instanciar la clase pedido
	 */
	public Pedido() {
		super();
		this.items = items;
		this.usuario = usuario;
	}

	/**
	 * Este metodo permite obtener el ID del siguiente pedido
	 * 
	 * @return retorna el identificador del siguiente pedido
	 */
	public static int getNextID() {
		return nextID;
	}

	/**
	 * Este metodo permite definir el id del siguiente pedido
	 * 
	 * @param nextID sera el numero del siguiente pedido
	 */
	public static void setNextID(int nextID) {
		Pedido.nextID = nextID;
	}

	/**
	 * Metodo que permite obtener el id del pedido
	 * 
	 * @return retorna el numero identificador dle producto
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo que permite definir el id del producto
	 * 
	 * @param id es un numero que será asignado como identificador del producto
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo que permite instanciar al clase pedido
	 * 
	 * @param items   es una lista de lo necesario para el pedido
	 * @param usuario es el usuario a quien pertenece el pedido
	 */
	public Pedido(List<ItemPedido> items, Usuario usuario) {
		super();
		this.items = items;
		this.usuario = usuario;
		estado = null;
	}

	/**
	 * Metodo que permite agregar un item a la lista del pedido
	 * 
	 * @param item es lo que se agregara al pedido
	 */
	void agregarItem(ItemPedido item) {
		if (estado == null)
			estado = "ABIERTO";
		items.add(item);
	}

	/**
	 * Metodo que permite quitar un item de la lista del pedido
	 * 
	 * @param item es lo que se sustraera del pedido
	 */
	void eliminarItem(ItemPedido item) {
		items.remove(item);
	}

	/**
	 * Metodo que permite obtener el valor total del pedido sumando todos los items
	 * de la lista y multiplicandolos por la cantidad de los mismos
	 * 
	 * @return retorna un valor
	 */
	float totalPedido() {
		float acum = 0.0f;
		for (int i = 0; i < items.size(); i++) {
			acum += items.get(i).cantidad * items.get(i).getReceta().getPrecioVenta();
		}
		return acum;
	}

	/**
	 * Metodo que permite completar el pedido, descontar el monto al usuario y
	 * modificar el estado del pedido
	 */
	void completarPedido() {
		float total = totalPedido();
		try {
			this.getUsuario().descontarSaldo(total);
			this.setEstado("ENVIADO");
		} catch (SinSaldoException e) {
			System.out.println(e);
		} finally {

		}

	}

	/**
	 * permite obtener la lista de items del pedido
	 * @return retorna una lista de items
	 */
	public List<ItemPedido> getItems() {
		return items;
	}

	/**
	 * permite agregar una lista de items al pedido
	 * @param items es una lista de items
	 */
	public void setItems(List<ItemPedido> items) {
		this.items = items;
	}

	/**
	 * Permite obtener el usuario al que pertenece el pedido
	 * @return retorna el objeto usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	
	/**
	 * Permite definir el usuario dueño del pedido
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Permite obtener el estado del pedido
	 * @return retorna el estado del pedido
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Permite definir el estado del pedido
	 * @param estado es el estado a asignar al pedido
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
