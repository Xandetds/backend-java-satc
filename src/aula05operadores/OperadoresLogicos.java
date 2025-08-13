package aula05operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);

		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2 +"\n");
		
		boolean verdadeiro = true;
		boolean falso = false;

		System.out.print("Verdadeiro && Falso: ");//Todos devem ser True
		System.out.println(verdadeiro && falso);
		System.out.print("Verdadeiro || Falso: ");//Pelo Menos um dever ser True
		System.out.println(verdadeiro || falso);
		System.out.print("Verdadeiro ^ Falso: ");//XOR ou OU-OU
		System.out.println(verdadeiro ^ falso);//São casais, ou seja, diferentes
		System.out.print("Verdadeiro || Falso: ");
		System.out.println(!verdadeiro || falso);
	}

}
