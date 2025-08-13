package aula08metodos;

public class Metodos2 {

    // Método estático com retorno double
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // Método estático com retorno String
    public static String gerarMensagem(String nome, double nota) {
        return "O aluno " + nome + " teve média " + nota;
    }

    // Método estático com retorno boolean
    public static boolean estaAprovado(double media) {
        return media >= 7.0;
    }

    // Método estático com retorno char
    public static char obterConceito(double media) {
        if (media >= 9.0) return 'A';
        else if (media >= 7.0) return 'B';
        else if (media >= 5.0) return 'C';
        else return 'D';
    }
}
