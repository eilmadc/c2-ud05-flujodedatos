/**
 * C2-T05: Ejercicio 9
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio9 {

	public void mostrarDecena() {

		System.out.println("· Números del 1 al 100 divisibles entre 2 y 3:");

		for (int i = 1; i < 101; i++) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.print(i + " ");
			}
		}
	}
}
