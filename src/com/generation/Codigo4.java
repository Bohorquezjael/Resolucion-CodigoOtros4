/*
 * El siguiente programa es un juego de piedra, papel o tijeras
 * El programa solicita al usuario que introduzca la elección de ambos jugadores y determina el ganador
 */

package com.generation;
//Coloque el archivo en el paquete correcto

import java.util.Scanner;

//coloque variables mas descriptvas
public class Codigo4 {

	// no estaba el metodo main Y le di indentacion a todo el codigo
	public static void main(String[] args) {

		// Faltaba el import de la clase scanner, y no se llamaba correctamente al
		// constructor
		Scanner sc = new Scanner(System.in);

		// el metodo print no añadia el salto de linea y elimine el scanner repetido
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String player1 = sc.nextLine();

		System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String player2 = sc.nextLine();
		// cerre el scanner para evitar el uso de recursos innecesarios
		sc.close();

		// hice un refactor en como se evaluaban las opciones de los jugadores y lo
		// encapsule en un metodo
		if (!player1.equalsIgnoreCase(player2)) {
			System.out.println(selectWinner(player1, player2));
		} else {
			System.out.println("Empate");
		}

		/*
		 * elimine un parentesis de mas y cambie la forma en que se comparaban los
		 * objetos String
		 * cambie los if para que en caso de no recibir un valor, no de un
		 * NullPointerException
		 * ademas cambie e equals para que ignore el case
		 * 
		 * 
		 * if (player1.equalsIgnoreCase(player2)) {
		 * System.out.println("Empate");
		 * } else {
		 * int winner = 2;
		 * // el switch no tenia break
		 * switch (player1) {
		 * case "piedra":
		 * if ("tijeras".equalsIgnoreCase(player2)) {
		 * winner = 1;
		 * }
		 * break;
		 * // no estaba cerrada una llave del condicional
		 * case "papel":
		 * if ("piedra".equalsIgnoreCase(player2)) {
		 * winner = 1;
		 * }
		 * break;
		 * case "tijera":
		 * if ("papel".equalsIgnoreCase(player2)) {
		 * winner = 1;
		 * }
		 * break;
		 * default:
		 * }
		 * System.out.println("Gana el jugador " + winner);
		 * }
		 */

	}

	private static String selectWinner(String player1, String player2) {
		return switch(player1){
			case "piedra" -> "tijeras".equalsIgnoreCase(player2) ? "Gana el jugador 1" : "Gana el jugador 2";
			case "papel" -> "piedra".equalsIgnoreCase(player2) ? "Gana el jugador 1" : "Gana el jugador 2";
			case "tijeras" -> "papel".equalsIgnoreCase(player2) ? "Gana el jugador 1" : "Gana el jugador 2";
			default -> "Opcion no valida";
		};
	}
}