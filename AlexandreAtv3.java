import java.util.Scanner;

public class AlexandreAtv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        char sexo;
        char estadoCivil;

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
                scanner.next();
            }
            idade = scanner.nextInt();
            scanner.nextLine();
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

        System.out.println("\nDados inseridos corretamente!");
        System.out.printf("Nome: %s%nIdade: %d%nSexo: %c%nEstado Civil: %c%n",
                nome, idade, sexo, estadoCivil);
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
}
