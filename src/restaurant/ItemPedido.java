package restaurant;

/**
 * Esta clase permite crear el objeto itempedido que contiene un plato y cuantas
 * veces fue pedido
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */
public class ItemPedido {
	int cantidad;
	Receta receta;

	/**
	 * Permite obtener la cantidad de un determinado plato
	 * 
	 * @return retorna la cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * Permite definir la cantidad de un determinado plato
	 * 
	 * @param cantidad es el numero de platos que se desean pedir
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Permite obtener la receta del plato pedido
	 * 
	 * @return retorna la receta
	 */
	public Receta getReceta() {
		return receta;
	}

	/**
	 * Permite definir el plato a ordenar
	 * 
	 * @param receta es la receta del plato ordenado
	 */
	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	/**
	 * Crea el objeto itempedido
	 * 
	 * @param cantidad es la cantidad del plato que se requerira
	 * @param receta   es el plato que se requiere
	 */
	public ItemPedido(int cantidad, Receta receta) {
		super();
		this.cantidad = cantidad;
		this.receta = receta;
	}

	/**
	 * Permite encargar un item del pedido
	 * 
	 * @throws SinSuficientesIngredientesException permite alertar que no hay
	 *                                             suficientes ingredientes para el
	 *                                             pedido
	 */
	public void encargar() throws SinSuficientesIngredientesException {

	}
}
