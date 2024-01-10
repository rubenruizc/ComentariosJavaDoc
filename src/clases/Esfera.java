package clases;

/**
 * Clase donde se realizan diferentes métodos para calcular operaciones relacionadas con una esfera
 * 
 * @author rruiz
 */
public class Esfera {

	/**
	 * Atributo inicializado que contiene el radio de la esfera
	 */
	double radio = 1.0;

	/**
	 * Constructor vacío
	 */
	public Esfera() {
		super();
	}

	/**
	 * Constructor que inicializa el radio
	 * 
	 * @param radio Parámetro que nos indica el valor del radio de la esfera
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * Función en la que se calcula la operación para obtener la superficie 
	 * @return Devuelve la operación para calcular la superficie
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}

	/**
	 * Función en la que se calcula la operación para obtener el volumen
	 * @return Devuelve la operación para calcular el volumen
	 */
	public double volumen() {
		double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		return volumen;
	}
}
