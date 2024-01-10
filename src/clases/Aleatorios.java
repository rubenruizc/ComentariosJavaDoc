package clases;

import java.util.Random;

/**
 * Clase donde se recoge los distintos números aleatorios
 * 
 * @author rruiz
 */
public class Aleatorios {
	
	/**
	 * Función que imprime la cantidad de números aleatorios que el usuario desee
	 * @param cantidad Parámetro que nos indica la cantidad de números a generar 
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}
	
	/**
	 * Función que imprime una cantidad de números aleatorios cuyo valor máximo lo elije el usuario
	 * @param cantidad Parámetro que nos indica la cantidad de números a generar 
	 * @param max Parámetro que nos indica el valor máximo que tomarán los números aleatorios
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}
	
	/**
	 * Función que imprime una cantidad de números aleatorios entre el máximo y mínimo indicado por el usuario
	 * @param cantidad Parámetro que nos indica la cantidad de números a generar 
	 * @param minimo Parámetro que nos indica el valor mínimo que tomarán los números aleatorios
	 * @param maximo Parámetro que nos indica el valor máximo que tomarán los números aleatorios
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for (int i = 1; i <= cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo + 1);
			System.out.println(aleatorio);
		}
	}
}
