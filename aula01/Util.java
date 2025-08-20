package aula01;

import java.util.Scanner;

public class Util {
    String nome;
    int idade;
    char sexo;
    char estadoCivil;
    double salario;

    static Scanner scanner = new Scanner(System.in);

    public static boolean validarNome(String nome) {
        return nome.length() > 3;
    }

    public static boolean validarIdade(int idade) {
        return idade >= 0 && idade <= 150;
    }

    public static boolean validarSexo(char sexo) {
        return sexo == 'f' || sexo == 'm';
    }

    public static boolean validarEstadoCivil(char estadoCivil) {
        return estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd';
    }

    public static boolean validarSalario(double salario) {
        return salario > 0;
    }
    public static String getString() {
        String nome;
        System.out.print("Digite um nome: ");
        nome = scanner.nextLine();
        return nome;
    }
    public static int getIdade() {
        int idade;
        System.out.print("Digite uma idade: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Idade inválida. Digite um número inteiro.");
            scanner.next();
        }
        idade = scanner.nextInt();
        scanner.nextLine();
        return idade;
    }
    public static char getSexo() {
        char sexo;
        System.out.print("Digite 'f' para feminino ou 'm' para masculino: ");
        sexo = scanner.next().toLowerCase().charAt(0);
        scanner.nextLine();
        return sexo;
    }
    public static char getEstadoCivil() {
        char estadoCivil;
        System.out.print("Digite seu estado civil ('s'=solteiro, 'c'=casado, 'v'=viúvo, 'd'=divorciado): ");
        estadoCivil = scanner.next().toLowerCase().charAt(0);
        scanner.nextLine();
        return estadoCivil;
    }
    public static double getSalario() {
        double salario;
        System.out.print("Digite um salário: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Salário inválido. Digite um número.");
            scanner.next();
        }
        salario = scanner.nextDouble();
        scanner.nextLine();
        return salario;
    }
}
