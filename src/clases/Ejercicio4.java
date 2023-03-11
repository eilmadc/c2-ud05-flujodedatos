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

		try {
			double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el radio del círculo: ",
					"EJERCICIO 4", JOptionPane.QUESTION_MESSAGE));

			double area = Math.PI * Math.pow(radio, 2);
			mostrarMensaje(area, radio);

		} catch (Exception e) {
			System.out.println("No has introducido un valor para radio, y no es posible calcular el área del círculo.");
		}
	}

	public void mostrarMensaje(double area, double radio) {

		System.out.println("  Radio = " + String.format("%.2f", radio));
		System.out.println("  Area = " + String.format("%.2f", area));

	}
}
