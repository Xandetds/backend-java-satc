package aula05operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("valor1 == valor2: " + (valor1 == valor2));
		System.out.println("valor1 != valor2: " + (valor1 != valor2));
		System.out.println("valor1 > valor2: " + (valor1 > valor2));
		System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
		System.out.println("valor1 < valor2: " + (valor1 < valor2));
		System.out.println("valor1 <= valor2: " + (valor1 <= valor2));

		System.out.println("\n***==***");
		int a = 5;
		int b = 5;
		boolean resultado = (a == b); // resultado será true
		System.out.println("a = " + a + " & b = " + b);
		System.out.println("a == b: " + resultado);

		System.out.println("\n***!=***");
		int a2 = 5;
		int b2 = 7;
		boolean resultado2 = (a2 != b2); // resultado será true
		System.out.println("a = " + a2 + " & b = " + b2);
		System.out.println("a != b: " + resultado2);

		System.out.println("\n***>***");
		int a3 = 5;
		int b3 = 7;
		boolean resultado3 = (a3 > b3); // resultado será false
		System.out.println("a = " + a3 + " & b = " + b3);
		System.out.println("a > b: " + resultado3);

		System.out.println("\n***>=***");
		int a4 = 5;
		int b4 = 7;
		boolean resultado4 = (a4 >= b4); // resultado será false
		System.out.println("a = " + a4 + " & b = " + b4);
		System.out.println("a >= b: " + resultado4);

		System.out.println("\n***<***");
		int a5 = 5;
		int b5 = 7;
		boolean resultado5 = (a5 < b5); // resultado será true
		System.out.println("a = " + a5 + " & b = " + b5);
		System.out.println("a < b: " + resultado5);

		System.out.println("\n***<=***");
		int a6 = 5;
		int b6 = 7;
		boolean resultado6 = (a6 <= b6); // resultado será true
		System.out.println("a = " + a6 + " & b = " + b6);
		System.out.println("a <= b: " + resultado6);

		System.out.println("\n***equals***");
		String a7 = "hello";
		String b7 = "world";
		boolean resultado7 = (a7.equals(b7)); // resultado será false
		System.out.println("a = " + a7 + " & b = " + b7);
		System.out.println("a.equals(b): " + resultado7);

		System.out.println("\n***Teste True***");
		int a8 = 5;
		boolean resultado8 = (a8 == 5); // resultado será true
		System.out.println("a = " + a8);
		System.out.println("a == 5: " + resultado8);

		System.out.println("\n***Teste False***");
		int a9 = 5;
		boolean resultado9 = (a9 == 7); // resultado será false
		System.out.println("a = " + a9);
		System.out.println("a == 7: " + resultado9);

	}

}
