import clases.Ejercicio1;
import clases.Ejercicio2;
import clases.Ejercicio3;
import clases.Ejercicio4;
import clases.Ejercicio5;
import clases.Ejercicio6;
import clases.Ejercicio7;
import clases.Ejercicio8;
import clases.Ejercicio9;
import clases.Ejercicio10;
import clases.Ejercicio11;
import clases.Ejercicio12;
import clases.Ejercicio13;

/**
 * C2-UD05
 */

/**
 * @author elena-01
 *
 */
public class FlujoDeDatosApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("\n****************************************");
		System.out.println("************** C02 * TA05 **************");
		System.out.println("****************************************\n");

		// C2-T05: Ejercicio 1
		int X = 5;
		int Y = 6;

		System.out.println("************** Ejercicio 1 *************\n");
		Ejercicio1 ejercicio1 = new Ejercicio1();
		ejercicio1.mayor(X, Y);
		ejercicio1.mayor(8, 7);
		ejercicio1.mayor(8, 8);

		// C2-T05: Ejercicio 2
		String nombre = "Elena";
		System.out.println("\n************** Ejercicio 2 *************\n");
		Ejercicio2 ejercicio2 = new Ejercicio2();
		ejercicio2.mostrarBienvenida(nombre);
		ejercicio2.mostrarBienvenida("Pepe");

		// C2-T05: Ejercicio 3
		System.out.println("\n**************** Ejercicio 3 **************\n");
		Ejercicio3 ejercicio3 = new Ejercicio3();
		ejercicio3.mostrarBienvenida();

		// C2-T05: Ejercicio 4
		System.out.println("\n************** Ejercicio 4 *************\n");
		System.out.println("--- Circulo ---");
		Ejercicio4 ejercicio4 = new Ejercicio4();
		ejercicio4.calculaAreaCirculo();

		// C2-T05: Ejercicio 5
		System.out.println("\n************** Ejercicio 5 *************\n");
		Ejercicio5 ejercicio5 = new Ejercicio5();
		ejercicio5.esPar();

		// C2-T05: Ejercicio 6
		System.out.println("\n************** Ejercicio 6 *************\n");
		Ejercicio6 ejercicio6 = new Ejercicio6();
		ejercicio6.calculaPrecioIva();

		// C2-T05: Ejercicio 7
		System.out.println("\n************** Ejercicio 7 *************\n");
		Ejercicio7 ejercicio7 = new Ejercicio7();
		ejercicio7.muestraNumeros(100);
		System.out.println("\n");

		// C2-T05: Ejercicio 8
		System.out.println("\n************** Ejercicio 8 *************\n");
		Ejercicio8 ejercicio8 = new Ejercicio8();
		ejercicio8.muestraNumerosFor(100);
		System.out.println("\n");

		// C2-T05: Ejercicio 9
		System.out.println("\n************** Ejercicio 9 *************\n");
		Ejercicio9 ejercicio9 = new Ejercicio9();
		ejercicio9.mostrarDecena();
		System.out.println("\n");

		//C2-T05: Ejercicio 10
		System.out.println("\n************** Ejercicio 10 *************\n");
		Ejercicio10 ejercicio10 = new Ejercicio10();
		ejercicio10.sumaVentas();

		//C2-T05: Ejercicio 11
		System.out.println("\n************** Ejercicio 11 *************\n");
		Ejercicio11 ejercicio11 = new Ejercicio11();
		ejercicio11.esDiaLaboral();

		// C2-T05: Ejercicio 12
		System.out.println("\n************** Ejercicio 12 *************\n");
		Ejercicio12 ejercicio12 = new Ejercicio12();
		ejercicio12.verificaPassword();
		 
		// C2-T05: Ejercicio 13 *
		System.out.println("\n************** Ejercicio 13 *************\n");
		Ejercicio13 ejercicio13 = new Ejercicio13();
		
	}

}
