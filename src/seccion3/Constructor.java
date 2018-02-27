package seccion3;

public class Constructor {
	public Constructor()	{
		System.out.println("Hola soy el Constructor!");
		System.out.println("Hola Mundo!");
	}
	
	public Constructor( int a, int b) {
		int suma = a + b;
		System.out.println("La suma es: " + suma);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Constructor cons1 = new Constructor();
		@SuppressWarnings("unused")
		Constructor cons2 = new Constructor(5, 6);
	}

}
