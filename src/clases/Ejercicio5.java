/**
 * C2-T05: Ejercicio 5
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Ejercicio5 {

	public int leeNumero() {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número: ", "EJERCICIO 5",
				JOptionPane.QUESTION_MESSAGE));
		return num;
	}

	public void esPar() {
		int num = leeNumero();
		if (num % 2 == 0) {
			System.out.println(num + " es un número Par");
		} else {
			System.out.println(num + " es un número Impar");
		}
	}
}
