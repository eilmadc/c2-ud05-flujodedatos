/**
 * 
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Ejercicio11 {

	public String pedirDiaSemana(String message) {

		String dia = "";

		dia = JOptionPane.showInputDialog(null, message, "EJERCICIO 11", JOptionPane.QUESTION_MESSAGE);

		return dia;
	}

	public void esDiaLaboral() {

		String dia = pedirDiaSemana("Introduce el DIA SEMANA (sin acentos):");

		if (dia == null) {
			System.out.println("No has escrito nada.");

		} else {

			switch (dia.toUpperCase()) {
			case "LUNES":
			case "MARTES":
			case "MIERCOLES":
			case "JUEVES":
			case "VIERNES":
			case "SABADO":
				System.out.println(dia + " : es un día laboral");
				break;
			case "DOMINGO":
				System.out.println(dia + " : no es un día laboral");
				break;
			default:
				System.out.println(dia + " : no has escrito un día de la semana(Lunes a Domingo sin acentos.)");
			}
		}
	}
}
