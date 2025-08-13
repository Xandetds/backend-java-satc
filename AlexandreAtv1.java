import java.util.Scanner;

public class AlexandreAtv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; 

        do {
            System.out.println("Digite um numero de 1 a 10: ");
            numero = scanner.nextInt();
            if (numero < 0 || numero > 10) {
                System.out.println("Numero invalido. Por favor, digite outro.");
            }
        } while(numero < 0 || numero > 10);

        System.out.println("Numero: " + numero); 
        scanner.close();
    }
}