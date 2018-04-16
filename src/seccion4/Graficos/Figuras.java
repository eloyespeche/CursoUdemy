package seccion4.Graficos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel{
	
	//Variable para elegir la figura a dibujar
	private int opcion;

	public Figuras(int opcionUsuario) {
		
		opcion = opcionUsuario;
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		for(int i = 0; i < 10; i++) {
			switch(opcion) {
			case 1:
				int xRect = 10 + i * 10;
				int yRect = 10 + i * 10;
				int anchoRect = 50 + i * 10;
				int altoRect = 50 + i * 10;
				g.drawRect(xRect, yRect, anchoRect, altoRect);
				break;
			case 2:
				int xOval = 10 + i * 10;
				int yOval = 10 + i * 10;
				int anchoOval = 50 + i * 10;
				int altoOval = 50 + i * 10;
				g.drawOval(xOval, yOval, anchoOval, altoOval);
				break;
			}
		}
	}
}
