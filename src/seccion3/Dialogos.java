package seccion3;

import javax.swing.JOptionPane;

public class Dialogos {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "Operación ejecutada"); 
//		JOptionPane.showMessageDialog(null, "Operación ejecutada", "Titulo ventana", JOptionPane.WARNING_MESSAGE); 
		String  nombre = JOptionPane.showInputDialog("Escribe tu nombre");
		JOptionPane.showMessageDialog(null, "Hola " + nombre); 
	}

}
