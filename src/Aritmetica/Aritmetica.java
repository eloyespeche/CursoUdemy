package Aritmetica;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int suma;
		int resta;
		int mult;
		int div;
		int modulo;
		
		System.out.println("Ingrese el primer n�mero:");
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		System.out.println("Ingrese el segundo n�mero:");
		j = scan.nextInt();
		
		suma = i + j;
		resta = i - j;
		mult = i * j;
		div = i / j;
		modulo = i % j;
		
		System.out.println("El resultado de la Suma es: "+ suma);
		System.out.println("El resultado de la Resta es: "+ resta);
		System.out.println("El resultado de la Multiplicaci�n es: "+ mult);
		System.out.println("El resultado de la Divisi�n es: "+ div);
		System.out.println("El resultado del M�dulo es: "+ modulo);
	}

}
