package restaurant;

import java.util.Date;

/**
 * Esta clase define el objeto usuario que le permite al restaurant llevar un
 * registro de sus clientes
 * 
 * @author Martin
 * @version 1.0.1
 * @see https://github.com/fitty0930
 */

public class Usuario {
	static int nextID;
	int id;
	String nombreYApellido;
	int tipoUsuario;
	float saldoCuenta;
	Date ultimaRecarga;
	String email;

	/**
	 * Constructor para la clase Usuario
	 * 
	 * @param nombreYApellido indica los datos personales del cliente
	 * @param tipoUsuario     define la jerarquia del usuario
	 * @param saldoCuenta     indica el saldo en la cuenta del cliente
	 * @param email           permite almacenar un email de contacto del cliente
	 */
	public Usuario(String nombreYApellido, int tipoUsuario, float saldoCuenta, String email) {
		super();
		this.nombreYApellido = nombreYApellido;
		this.tipoUsuario = tipoUsuario;
		this.saldoCuenta = saldoCuenta;
		this.email = email;
	}

	/**
	 * Metodo que permite agregar dinero al saldo del cliente
	 * 
	 * @param cuanto indica la cantidad de dinero a agregar
	 */
	public void cargarCredito(float cuanto) {
		saldoCuenta += cuanto;

	}

	/**
	 * Metodo que permite descontar saldo de la cuenta del cliente
	 * 
	 * @param cuanto indica el monto gastado por el cliente, que se descontará de su
	 *               saldo
	 * @return devuelve el saldo final de la cuenta luego de la transacción
	 * @throws SinSaldoException indica que el cliente no tiene saldo suficiente
	 *                           para la transacción
	 */
	float descontarSaldo(float cuanto) throws SinSaldoException {
		if ((saldoCuenta - cuanto) < 0)
			throw new SinSaldoException();
		else
			saldoCuenta -= cuanto;
		return saldoCuenta;

	}
}
