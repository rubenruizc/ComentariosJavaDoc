package clases;

import java.util.Random;

/**
 * Clase donde se recoge los distintos métodos para jugar al busca el tesoro
 * 
 * @author rruiz
 */
public class Tesoro {
	
	/**
	 * Atributo constante y estático que contiene el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;
	
	/**
	 * Atributo estático que contiene la posición x del tesoro
	 */
	static int xTesoro;
	
	/**
	 * Atributo estático que contiene la posición y del tesoro
	 */
	static int yTesoro;
	
	/**
	 * Atributo que contiene la posición del jugador en el eje x
	 */
	int xJugador = 1;
	
	/**
	 * Atributo que contiene la posición del jugador en el eje y
	 */
	int yJugador = 1;
	
	/**
	 * Función que establece una posición aleatoria al tesoro tanto en el eje y como el x
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}
	
	/**
	 * Función que pinta las casillas del tablero
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}
	
	/**
	 * Función que permite al jugador moverse indicando una serie de valores
	 * @param movimiento Parámetro que nos dice hacia donde se mueve el jugador
	 * @return Devuelve la posición donde se queda el usuario después de introducir un valor
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}		
		
		return res;
	}
	
	/**
	 * Función que nos indica si los jugadores han empatado
	 * @return Devuelve a los usuarios la situación de empate
	 */
	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
