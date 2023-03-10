/**
 * C2-T05: Ejercicio 4
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Ejercicio4 {

	public void calculaAreaCirculo() {

		double radio = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Introduce el radio del círculo: ", "EJERCICIO 4", JOptionPane.QUESTION_MESSAGE));

		double area = Math.PI * Math.pow(radio, 2);
		mostrarMensaje(area, radio);

	}

	public void mostrarMensaje(double area, double radio) {

		System.out.println("  Radio = " + radio);
		System.out.println("  Area = " + area);

	}
}
