/**
 * C2-T05: Ejercicio 6
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */

public class Ejercicio6 {

	final static double IVA = 0.21;

	public double leeNumero() {
		double num = Double.parseDouble(
				JOptionPane.showInputDialog(null, "PRECIO de producto: ", "EJERCICIO 6", JOptionPane.QUESTION_MESSAGE));
		return num;
	}

	public void calculaPrecioIva() {

		double precio = leeNumero();
		double precioIva = (precio * IVA) + precio;
		System.out.println("· Precio sin IVA = " + String.format("%.2f", precio));
		System.out.println("· IVA=" + (Math.round(IVA * 100)) + "%");
		System.out.println("· Precio con IVA = " + String.format("%.2f", precioIva));
	}

}
