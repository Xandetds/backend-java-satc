package aula01;

import java.util.Scanner;

public class AlexandreAtv3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String nome;
        int idade;
        char sexo;
        char estadoCivil;
        double salario;

        do {
            nome = Util.getString();
            if (!Util.validarNome(nome)) {
                System.out.println("Nome inválido. Deve ter mais que 3 caracteres.");
            }
        } while (!Util.validarNome(nome));

        do {
            idade = Util.getIdade();
            if (!Util.validarIdade(idade)) {
                System.out.println("Idade inválida. Digite um valor entre 0 e 150.");
            }
        } while (!Util.validarIdade(idade));

        do {
            sexo = Util.getSexo();
            if (!Util.validarSexo(sexo)) {
                System.out.println("Sexo inválido. Use 'f' para feminino ou 'm' para masculino.");
            }
        } while (!Util.validarSexo(sexo));

        do {
            estadoCivil = Util.getEstadoCivil();
            if (!Util.validarEstadoCivil(estadoCivil)) {
                System.out.println("Estado civil inválido. Use 's', 'c', 'v' ou 'd'.");
            }
        } while (!Util.validarEstadoCivil(estadoCivil));

        do {
            salario = Util.getSalario();
            if (!Util.validarSalario(salario)) {
                System.out.println("Salário inválido. Digite um valor maior que 0.");
            }
        } while (!Util.validarSalario(salario));

        System.out.println("\nDados inseridos corretamente!");
        System.out.printf("Nome: %s%nIdade: %d%nSexo: %c%nEstado Civil: %c%nSalário: %.2f%n",
                nome, idade, sexo, estadoCivil, salario);

        scanner.close();
    }
}
