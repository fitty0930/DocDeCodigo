package restaurant;

/**
 * Esta clase permite crear el objeto item menu que representa una linea del
 * menu
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */
public class ItemMenu {
	static int nextID;
	int id;
	String nombre;
	float precio;
	Receta receta;
	String tipo;

	/**
	 * Permite obtener el nombre del plato en cuestion
	 * 
	 * @return retorna el nombre del plato
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Permite definir el nombre del plato en cuestion
	 * 
	 * @param nombre es el nombre a asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Permite obtener el precio del plato en cuestion
	 * 
	 * @return retorna el precio del plato
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Permite definir el precio del plato
	 * 
	 * @param precio es el valor a asignar como precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * Permite obtener la receta del plato
	 * 
	 * @return retorna la receta del plato
	 */
	public Receta getReceta() {
		return receta;
	}

	/**
	 * Permite definir la receta a utilizar para crear el plato
	 * 
	 * @param receta es la receta que se usara
	 */
	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	/**
	 * Permite obtener el tipo de plato
	 * 
	 * @return retorna el tipo de plato
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Permite definir el tipo de plato
	 * 
	 * @param tipo es el tipo de plato
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Permite crear el objeto ItemMenu
	 * 
	 * @param nombre es el nombre del plato
	 * @param precio es el valor del plato
	 * @param receta es la receta que se usa para crear el plato
	 * @param tipo   define el tipo de comida que es el plato
	 */
	public ItemMenu(String nombre, float precio, Receta receta, String tipo) {
		super();
		this.id = nextID;
		nextID++;
		this.nombre = nombre;
		this.precio = precio;
		this.receta = receta;
		this.tipo = tipo;
	}

}
