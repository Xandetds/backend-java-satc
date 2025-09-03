import java.util.ArrayList;
import java.util.List;

public class exercicio05 {
    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private List<Double> notas;

    public exercicio05(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0.0;
        double soma = 0.0;
        for (double n : notas) soma += n;
        return soma / notas.size();
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0;
    }
}
