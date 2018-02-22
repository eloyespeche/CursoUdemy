package Objetos;

public class Objetos {
	String nombre;
	String color;
	
	public static void main(String[] args) {
		
		Objetos obj1 = new Objetos();
		Objetos obj2 = new Objetos();
		
		obj1.nombre = "Objeto1";
		obj2.nombre = "Objeto2";
		
		obj1.color = "Azul";
		obj2.color = "Rojo";
		
		System.out.println("El nombre del primer Objeto es " + obj1.nombre + " y su color es " + obj1.color + ".");
		System.out.println("El nombre del segundo Objeto es " + obj2.nombre + " y su color es " + obj2.color + ".");
	}

}
