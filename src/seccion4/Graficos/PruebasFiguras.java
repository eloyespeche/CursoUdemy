package seccion4.Graficos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebasFiguras {

	public static void main(String[] args) {
		//Obtener decicion de usuario
		
		String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulo.\nEscriba 2 para dibujar ovalo.");
		int option = Integer.parseInt(entrada);
		Figuras fig = new Figuras(option);
		
		JFrame ventana = new JFrame();
		ventana.add(fig);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(300, 300);
		ventana.setVisible(true);
	}
}
