import java.util.Scanner;

public class AlexandreAtv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();

        if (senha.equals(nome)){
            System.out.println("Erro: a senha nao pode ser igual ao nome");
        } else {
            System.out.println("Nome: " + nome + ", senha: " + senha);
        }
    }
}
