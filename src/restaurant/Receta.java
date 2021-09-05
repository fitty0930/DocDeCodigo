package restaurant;

import java.util.List;

/**
 * Esta clase crea el objeto receta que le permite al restaurant llevar un
 * registro de las instrucciones para preparar un determinado plato
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */

public class Receta {
	List<ItemReceta> ingredientes;
	String nombre;
	String tiempoDeCoccion;
	float precioVenta;

	/**
	 * Este metodo retorna el precio de este plato
	 * 
	 * @return retorna el precio de venta de este plato
	 */
	public float getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Este metodo permite definir el precio con el cual el plato se va a vender
	 * 
	 * @param precioVenta es el precio que asignaremos al plato
	 */
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * Este metodo permite conocer el nombre del plato
	 * 
	 * @return retorna el nombre del plato
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Este metodo permite dar un nombre al plato en cuestión
	 * 
	 * @param nombre es el nombre que tendrá el plato
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Este metodo nos permite conocer el tiempo de cocción del plato a preparar
	 * 
	 * @return retorna el tiempo que debe cocinarse el plato
	 */
	public String getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}

	/**
	 * Este metodo permite definir el tiempo durante el cual el plato debe ser
	 * cocinado
	 * 
	 * @param tiempoDeCoccion es el tiempo que el plato debe ser cocinado
	 */
	public void setTiempoDeCoccion(String tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}

	/**
	 * Este metodo permite agregar un ingrediente a la receta
	 * 
	 * @param i es un ingrediente nuevo para la receta
	 */
	public void addIngrediente(ItemReceta i) {
		ingredientes.add(i);
	}

	/**
	 * Este metodo nos permite agregar un producto y una cantidad como ingrediente a
	 * la receta
	 * 
	 * @param producto es un determinado producto del stock
	 * @param cantidad es el monto del producto a utilizar
	 */
	public void addIngrediente(Producto producto, int cantidad) {
		ItemReceta item = new ItemReceta(producto, cantidad);
		ingredientes.add(item);
	}
}
