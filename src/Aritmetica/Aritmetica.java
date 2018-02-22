package Aritmetica;

import java.util.Scanner;

public class Aritmetica {

	private static Scanner scan;

	public static void main(String[] args) {

		int i;
		int j;
		int suma;
		int resta;
		int mult;
		int div;
		int modulo;
		
		System.out.println("Ingrese el primer número:");
		scan = new Scanner(System.in);
		i = scan.nextInt();
		System.out.println("Ingrese el segundo número:");
		j = scan.nextInt();
		
		suma = i + j;
		resta = i - j;
		mult = i * j;
		div = i / j;
		modulo = i % j;
		
		System.out.println("El resultado de la Suma es: "+ suma);
		System.out.println("El resultado de la Resta es: "+ resta);
		System.out.println("El resultado de la Multiplicación es: "+ mult);
		System.out.println("El resultado de la División es: "+ div);
		System.out.println("El resultado del Módulo es: "+ modulo);
	}

}
