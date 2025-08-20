import java.util.Scanner;

public class AlexandreAtv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            double paisA, taxaA, paisB, taxaB;

            while (true) {
                System.out.print("Digite a população inicial do país A: ");
                if (scanner.hasNextDouble()) {
                    paisA = scanner.nextDouble();
                    if (paisA > 0) break;
                    System.out.println("A população deve ser maior que zero.");
                } else {
                    System.out.println("Valor inválido. Digite um número.");
                    scanner.next();
                }
            }

            while (true) {
                System.out.print("Digite a taxa de crescimento anual do país A (%): ");
                if (scanner.hasNextDouble()) {
                    taxaA = scanner.nextDouble();
                    if (taxaA > 0) break;
                    System.out.println("A taxa deve ser maior que zero.");
                } else {
                    System.out.println("Valor inválido. Digite um número.");
                    scanner.next();
                }
            }

            while (true) {
                System.out.print("Digite a população inicial do país B: ");
                if (scanner.hasNextDouble()) {
                    paisB = scanner.nextDouble();
                    if (paisB > 0) break;
                    System.out.println("A população deve ser maior que zero.");
                } else {
                    System.out.println("Valor inválido. Digite um número.");
                    scanner.next();
                }
            }

            while (true) {
                System.out.print("Digite a taxa de crescimento anual do país B (%): ");
                if (scanner.hasNextDouble()) {
                    taxaB = scanner.nextDouble();
                    if (taxaB > 0) break;
                    System.out.println("A taxa deve ser maior que zero.");
                } else {
                    System.out.println("Valor inválido. Digite um número.");
                    scanner.next();
                }
            }

            if (paisA >= paisB) {
                System.out.println("A população do país A já é maior ou igual à do país B. Nenhum cálculo necessário.");
            } else {
                int anos = 0;
                double popA = paisA;
                double popB = paisB;

                while (popA < popB) {
                    popA += popA * (taxaA / 100);
                    popB += popB * (taxaB / 100);
                    anos++;
                }

                System.out.printf(
                        "Com as populações e taxas informadas, serão necessários %d anos para que a população do país A ultrapasse ou se iguale à do país B.%n",
                        anos
                );
            }

            System.out.print("Deseja realizar outra simulação? (S/N): ");
            continuar = scanner.next().trim().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Programa encerrado.");
    }
}
