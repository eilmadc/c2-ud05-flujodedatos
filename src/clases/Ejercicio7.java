/**
 * C2-T05: Ejercicio 7
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio7 {

	public void muestraNumeros(int num) {
		int i=1;
		
		System.out.println("· Muestra números del "+i+" al "+num+" incluidos");
		while(i<(num+1)) {
			System.out.print(" "+i);
			i++;
		}
	}
}
