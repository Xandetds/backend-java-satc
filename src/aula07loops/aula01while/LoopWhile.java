package aula07loops.aula01while;

public class LoopWhile {

	public static void main(String[] args) {
		
		int contador = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (contador <= max) {
			System.out.println("Valor de i: " + contador);
			contador++; // i = i + 1; ou i += 1;
		}
		
		System.out.println(contador); //valor de 11
		
		do {
			contador++;
			System.out.println("Valor de i: " + contador);
		} while (contador < 13);
		
		System.out.println(contador);
	}

}
