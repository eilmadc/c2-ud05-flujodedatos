import javax.swing.JOptionPane;

/**
 *  C2-T05: Ejercicio 13
 */

/**
 * @author elena-01
 *
 */
public class CalculadoraInversaApp {

	/**
	 * @param args
	 */
	final static String TITULO = "EJERCICIO 13 : CALCULADORA";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n****************************************");
		System.out.println("************** CALCULADORA **************");
		System.out.println("****************************************");

		new CalculadoraInversaApp().pideDatos();
	}

	public void pideDatos() {

		try {
			// Pide operandos 1 y 2
			int operando1 = leeOperando("OPERANDO 1: ");
			mostrarMensaje("Operando 1 = " + operando1);
			int operando2 = leeOperando("OPERANDO 2: ");
			mostrarMensaje("Operando 2 = " + operando2);

			// Pide Operacion
			String signo = leeOperacion("OPERACION ( + - * / ^ %  ) : ");
			if (signo == null) {
				mostrarMensaje("No has introducido OPERACION");
			} else {
				mostrarMensaje("Operación = " + signo);
				calculadora(operando1, operando2, signo);
			}
		} catch (Exception e) {
			mostrarMensaje("No has introducido dato");
		}
	}

	public void calculadora(int operando1, int operando2, String signo) {

		switch (signo) {
		case "+":
			int suma = operando1 + operando2;
			mostrarMensaje("SUMA = " + suma);
			mostrarMensajeDialog("RESULTADO = " + suma);
			break;
		case "-":
			int resta = operando1 - operando2;
			mostrarMensaje("RESTA = " + resta);
			mostrarMensajeDialog("RESULTADO = " + resta);
			break;
		case "*":
			int multiplicacion = operando1 * operando2;
			mostrarMensaje("MULTIPLICACION = " + multiplicacion);
			mostrarMensajeDialog("RESULTADO = " + multiplicacion);
			break;
		case "/":
			double division = (double) operando1 / (double) operando2;
			mostrarMensaje("DIVISION = " + String.format("%.6f", division));
			mostrarMensajeDialog("RESULTADO = " + String.format("%.6f", division));
			break;
		case "^":
			int potencia = (int) Math.pow(operando1, operando2);
			mostrarMensaje("POTENCIA = " + potencia);
			mostrarMensajeDialog("RESULTADO = " + potencia);
			break;
		case "%":
			int resto = operando1 % operando2;
			mostrarMensaje("RESTO = " + resto);
			mostrarMensajeDialog("RESULTADO = " + resto);
			break;
		default:

		}
	}

	//
	public int leeOperando(String mensaje) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, TITULO, JOptionPane.QUESTION_MESSAGE));
		return num;
	}

	public String leeOperacion(String mensaje) {

		String operacion = "";

		operacion = (JOptionPane.showInputDialog(null, mensaje, TITULO, JOptionPane.QUESTION_MESSAGE));

		return operacion;
	}

	public void mostrarMensajeDialog(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, TITULO, JOptionPane.QUESTION_MESSAGE);
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
