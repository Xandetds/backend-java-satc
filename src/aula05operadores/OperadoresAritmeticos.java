package aula05operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		System.out.println("***ADIÇÃO***");
		int a = 5;
		int b = 10;
		int resultado = a + b; // resultado é igual a 15
		System.out.println("5 + 10: " + resultado);

		System.out.println("\n***SUBTRAÇÃO***");
		int a2 = 10;
		int b2 = 5;
		int resultado2 = a2 - b2; // resultado é igual a 5
		System.out.println("10 - 5: " + resultado2);

		System.out.println("\n***MULTIPLICAÇÃO***");
		int a3 = 5;
		int b3 = 3;
		int resultado3 = a3 * b3; // resultado é igual a 15
		System.out.println("5 * 3: " + resultado3);

		System.out.println("\n***DIVISÃO***");
		int a4 = 10;
		int b4 = 2;
		int resultado4 = a4 / b4; // resultado é igual a 5
		System.out.println("10 / 2: " + resultado4);

		System.out.println("\n***MODULO***");
		int a5 = 10;
		int b5 = 3;
		int resultado5 = a5 % b5; // resultado é igual a 1
		System.out.println("10 % 3: " + resultado5);

		System.out.println("\n***INCREMENTO***");
		int a6 = 5;
		System.out.println("Valor Inicial a6: " + a6);
		a6++;
		System.out.println("Resultado a6++: " + a6);
		a6 = a6 + 1;
		System.out.println("Resultado a6 = a6 + 1: " + a6);
		++a6;
		System.out.println("Resultado ++a6: " + a6);
		a6+=1;
		System.out.println("Resultado a6+=: " + a6);

		System.out.println("\n***DECREMENTO***");
		int a7 = 5;
		System.out.println("Valor Inicial a7: " + a7);
		a7--;
		System.out.println("Resultado a7--: " + a7);
		a7 = a7 - 1;
		System.out.println("Resultado a7 = a7 - 1: " + a7);
		--a7;
		System.out.println("Resultado --a7: " + a7);
		a7-=1;
		System.out.println("Resultado a7-=1: " + a7);

		System.out.println("\n*********************");
		String primeiroNome = "Esta é";
		System.out.println("Variável -> primeiroNome: " + primeiroNome);
		String segundoNome = " uma String concatenada.";
		System.out.println("Variável -> segundoNome: " + segundoNome);
		String terceiroNome = primeiroNome + segundoNome;
		System.out.print("Variável -> primeiroNome + segundoNome: ");
		System.out.println(terceiroNome + "\n");
	}

}
