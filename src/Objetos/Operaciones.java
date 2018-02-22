package Objetos;

import java.util.Scanner;

public class Operaciones {
	
	int numero1, numero2, sumar, restar, mult, div;
	
	public void leerNumeros() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el primer número:");
		numero1 = sc.nextInt();
		System.out.println("Escriba el segundo número:");
		numero2 = sc.nextInt();
	}
	
	public void sumar() {
		sumar = numero1 + numero2;
	}
	
	public void restar() {
		restar = numero1 - numero2;
	}
	
	public void multiplicar() {
		mult = numero1 * numero2;
	}
	
	public void dividir() {
		div = numero1 / numero2;
	}
	
	public void mostrarResultado() {
		System.out.println("El resultado de la Suma es: " + sumar);
		System.out.println("El resultado de la Resta es: " + restar);
		System.out.println("El resultado de la Multiplicación es: " + mult);
		System.out.println("El resultado de la División es: " + div);
	}
	
	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		
		op.leerNumeros();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
		op.mostrarResultado();
	}

}
