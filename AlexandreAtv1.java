import java.util.Scanner;

public class AlexandreAtv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        boolean validacaoNota;

        do {
            System.out.println("Digite uma nota de 1 a 10: ");
            nota = scanner.nextDouble();
            validacaoNota = nota < 0 || nota > 10;
            if (validacaoNota) {
                System.out.println("Nota invalida, digite outra.");
            }
        } while(nota < 0 || nota > 10);

        System.out.println("Nota: " + nota);
    }
}