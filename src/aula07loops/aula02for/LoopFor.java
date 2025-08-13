package aula07loops.aula02for;

public class LoopFor {

	public static void main(String[] args) {

		for (int i=0; i < 5; i++){
			System.out.println("i tem valor: " + i);
		}

		for (int i=5; i > 0; i--){
			System.out.println("i tem valor: " + i);
		}

		for (int cont = 0; cont < 10; cont += 2){
			System.out.println("valor de cont: " + cont);
		}
	}
}
