package aula04entradaesaidadedados.aula02entrada;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura de dados com Scanner
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Está empregado? (true/false): ");
        boolean empregado = scanner.nextBoolean();

        // Exemplo de uso de next()
        System.out.print("Digite novamente nome completo: ");
        String primeiroNome = scanner.next();

        // Saída de dados usando println, print, printf
        System.out.println("\n--- Saída com println ---");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Empregado: " + empregado);
        System.out.println("Nome completo next(): " + primeiroNome);
    }
}
