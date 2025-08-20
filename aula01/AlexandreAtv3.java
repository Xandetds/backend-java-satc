import java.util.Scanner;

public class AlexandreAtv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        char sexo;
        char estadoCivil;
        double salario;

        do {
            System.out.print("Digite um nome: ");
            nome = scanner.nextLine();
            if (!validarNome(nome)) {
                System.out.println("Nome inválido. Deve ter mais que 3 caracteres.");
            }
        } while (!validarNome(nome));

        do {
            System.out.print("Digite uma idade: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Idade inválida. Digite um número inteiro.");
                scanner.next(); // descarta entrada inválida
            }
            idade = scanner.nextInt();
            scanner.nextLine(); // limpa buffer
            if (!validarIdade(idade)) {
                System.out.println("Idade inválida. Digite um valor entre 0 e 150.");
            }
        } while (!validarIdade(idade));

        do {
            System.out.print("Digite 'f' para feminino ou 'm' para masculino: ");
            sexo = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            if (!validarSexo(sexo)) {
                System.out.println("Sexo inválido. Use 'f' para feminino ou 'm' para masculino.");
            }
        } while (!validarSexo(sexo));

        do {
            System.out.print("Digite seu estado civil ('s'=solteiro, 'c'=casado, 'v'=viúvo, 'd'=divorciado): ");
            estadoCivil = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            if (!validarEstadoCivil(estadoCivil)) {
                System.out.println("Estado civil inválido. Use 's', 'c', 'v' ou 'd'.");
            }
        } while (!validarEstadoCivil(estadoCivil));

        do {
            System.out.print("Digite um salário: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Salário inválido. Digite um número.");
                scanner.next();
            }
            salario = scanner.nextDouble();
            scanner.nextLine();
            if (!validarSalario(salario)) {
                System.out.println("Salário inválido. Digite um valor maior que 0.");
            }
        } while (!validarSalario(salario));

        System.out.println("\nDados inseridos corretamente!");
        System.out.printf("Nome: %s%nIdade: %d%nSexo: %c%nEstado Civil: %c%nSalário: %.2f%n",
                nome, idade, sexo, estadoCivil, salario);

    }

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
}
