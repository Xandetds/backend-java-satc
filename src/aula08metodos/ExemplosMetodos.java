package aula08metodos;

public class ExemplosMetodos {
    public static void main(String[] args) {
        // Criando um objeto da classe Metodos para chamar métodos de instância
        Metodos metodo = new Metodos();

        // Chamando Método sem parâmetros e sem retorno
        metodo.exibirSaudacao();

        // Chamando Método com parâmetros e com retorno int
        int numero1 = 8;
        int numero2 = 5;
        int soma = metodo.somar(numero1, numero2);
        System.out.println("Soma: " + soma);

        // Chamando Método com parâmetros e sem retorno
        metodo.verificarMaior(numero1, numero2);

        // Chamando Método statico que retorna double
        double media = Metodos2.calcularMedia(7.5, 8.2);
        System.out.println("Média: " + media);

        // Método que retorna String
        String mensagem = Metodos2.gerarMensagem("João", 9.5);
        System.out.println(mensagem);

        // Método que retorna boolean
        boolean aprovado = Metodos2.estaAprovado(media);
        System.out.println("Aprovado? " + aprovado);

        // Método que retorna char
        char conceito = Metodos2.obterConceito(media);
        System.out.println("Conceito: " + conceito);
    }
}
