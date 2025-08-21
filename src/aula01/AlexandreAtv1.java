import java.util.Scanner;

public class AlexandreAtv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean notaInvalida;
        double nota;

        do {
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = scanner.nextDouble();
            notaInvalida = (nota < 0 || nota > 10);

            if (notaInvalida) {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10");
            }
        } while (notaInvalida);

        System.out.println("Nota registrada: " + nota);
        scanner.close();
    }
}