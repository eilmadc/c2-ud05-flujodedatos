/**
 * C2-T05: Ejercicio 10
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Ejercicio10 {

	public double leeNumeroVentas(String mensaje) {

		double num = 0;

		try {
			num = Double.parseDouble(
					JOptionPane.showInputDialog(null, mensaje, "EJERCICIO 10", JOptionPane.QUESTION_MESSAGE));
			if(mensaje.contains("NÚMERO")) {
				System.out.println(mensaje + " = " + (int)num);
			}else {
			System.out.println(mensaje + " = " + String.format("%.2f", num));
			}
		} catch (Exception e) {
			System.out.println("No has introducido un valor");
		}
		return num;
	}

	public void sumaVentas() {

		try {
			
			double numVentas = leeNumeroVentas("NÚMERO DE VENTAS: ");
			double valorVenta=0;
			double sumaVentas=0;
			
			for(int i=1;i<=numVentas;i++) {
				valorVenta = leeNumeroVentas("VENTA "+i);
				sumaVentas = sumaVentas + valorVenta;
			}
			
			System.out.println("--> SUMA : "+String.format("%.2f", sumaVentas));

		} catch (Exception e) {

		}

	}

}
