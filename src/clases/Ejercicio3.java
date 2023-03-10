/**
 * C2-T05: Ejercicio 3
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Ejercicio3 {

	public void mostrarBienvenida() {
		String nombre = pedirNombre();
		System.out.println("Bienvenid@ " + nombre);
	}

	public String pedirNombre() {
		return (JOptionPane.showInputDialog(null, "Introduce tu nombre:", "EJERCICIO 3", JOptionPane.QUESTION_MESSAGE));
	}
}
