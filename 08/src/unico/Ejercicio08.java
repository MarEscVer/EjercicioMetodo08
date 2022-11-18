package unico;

public class Ejercicio08 {

	public static void main(String[] args) {

// Implementar un método llamado divisoresPrimos que muestre por consola, cuáles son los divisores primos del número que se le pasa como parámetro.

		int num;
		String mensaje;

		num = Util.leerInt("Introduzca un número: ");
		
		mensaje = divisoresPrimos(num);
				
		Util.escribir(mensaje);

	}

	public static String divisoresPrimos (int n) {
		String mensaje = "Los divisores de " + n + " son: ";
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && esPrimo(i)) {
				mensaje += i + " ";
			}
		}
		return mensaje;
	}

	public static boolean esPrimo(int n) {

		boolean esPrimo = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;

	}
}
