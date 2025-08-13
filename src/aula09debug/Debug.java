package aula09debug;

public class Debug {
	public static void main(String[] args) {
		int numero = 5;
		int resultado = fatorial(numero);
		System.out.println("Fatorial de " + numero + " é: " + resultado);
	}

	public static int fatorial(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total *= i; // ponto interessante para breakpoint
		}
		return total;
	}

}
