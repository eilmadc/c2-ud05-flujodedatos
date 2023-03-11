/**
 * 
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Ejercicio12 {

	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "EJERCICIO 12", JOptionPane.QUESTION_MESSAGE);
	}

	public String pedirPassword(String mensaje) {

		String password = "";

		password = (JOptionPane.showInputDialog(null, mensaje, "EJERCICIO 12", JOptionPane.QUESTION_MESSAGE));

		return password;
	}

	public void verificaPassword() {

		String password1 = "";
		String password2 = "";

		password1 = pedirPassword("Introduce PASSWORD: ");

		if (password1 == null) {
			System.out.println("Password vacía");
		} else {

			password2 = pedirPassword("Verifica PASSWORD: ");
			if (password2 == null) {
				System.out.println("Password vacía");
			} else {
				coincidePassword(password1, password2);
			}

		}
	}

	public void coincidePassword(String password1, String password2) {

		int cont = 3;
		boolean coincidencia = false;

		while (!coincidencia || cont > 1) {
			cont--;

			if ((password1.equals(password2))) {
				mostrarMensaje("Enhorabuena");
				coincidencia = true;
			} else {
				password2 = pedirPassword("Error de contraseña. Te quedan " + cont + " intentos.");
			}
		}
	}
}
