package seccion3.calculadora;

import javax.swing.JOptionPane;

public class Graficos {

	public static void main(String[] args) {
		String  n1 = JOptionPane.showInputDialog("Escribe el primer número");
		String  n2 = JOptionPane.showInputDialog("Escribe el segundo número");
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		
		Operaciones op = new Operaciones();
		
		double suma = op.sumar(num1, num2);
		double resta = op.restar(num1, num2);
		double mult = op.multiplicar(num1, num2);
		double div = op.dividir(num1, num2);
		
		JOptionPane.showConfirmDialog(null, "Suma: " + suma);
		JOptionPane.showConfirmDialog(null, "Resta: " + resta);
		JOptionPane.showConfirmDialog(null, "Multiplicación: " + mult);
		JOptionPane.showConfirmDialog(null, "División: " + div);
	}

}
