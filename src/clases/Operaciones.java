package clases;

/**
 * Clase donde se realizan diferentes operaciones con dos números introducidos por el usuario
 * 
 * @author rruiz
 */
public class Operaciones {
	/**
	 * Atributo que contiene el primer número del usuario
	 */
	double num1;

	/**
	 * Atributo que contiene el segundo número del usuario
	 */
	double num2;

	/**
	 * Constructor vacío
	 */
	public Operaciones() {

	}

	/**
	 * Constructor que inicializa el número 1 y el número 2
	 * 
	 * @param num1 Parámetro que nos indica el valor del primer número del usuario
	 * @param num2 Parámetro que nos indica el valor del segundo número del usuario
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Función que calcula la suma del número 1 y el número 2
	 * 
	 * @return Devuelve la suma de los dos números
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Función que calcula la resta del número 1 y el número 2
	 * 
	 * @return Devuelve la resta de los dos números
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Función que calcula la multiplicación del número 1 y el número 2
	 * 
	 * @return Devuelve la multiplicación de los dos números
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Función que calcula la división del número 1 y el número 2
	 * 
	 * @return Devuelve la división de los dos números
	 */
	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 * Función que nos indica cual de los dos números introducidos por el usuario es
	 * mayor
	 * 
	 * @return Devuelve el número con mayor valor introducido por el usuario
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Función que nos indica cual de los dos números introducidos por el usuario es
	 * menor
	 * 
	 * @return Devuelve el número con menor valor introducido por el usuario
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
