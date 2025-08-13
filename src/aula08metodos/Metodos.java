package aula08metodos;

public class Metodos {

    // Método sem parâmetros e sem retorno
    public void exibirSaudacao() {
        System.out.println("Olá! Este é um exemplo de métodos em Java.");
    }

    // Método com parâmetros e retorno int
    public int somar(int a, int b) {
        return a + b;
    }

    // Método com parâmetros e sem retorno
    public void verificarMaior(int a, int b) {
        if (a > b) {
            System.out.println(a + " é maior que " + b);
        } else if (b > a) {
            System.out.println(b + " é maior que " + a);
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
