import java.util.ArrayList;
import java.util.List;

public class exercicio03 {
    private String nome;
    private String especie;
    private int idade;
    private double peso;
    private String dono;
    private List<String> historicoCuidados;

    public exercicio03(String nome, String especie, int idade, double peso, String dono) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.dono = dono;
        this.historicoCuidados = new ArrayList<>();
    }

    public void alimentar(double quantidadeKg) {
        if (quantidadeKg > 0) {
            peso += quantidadeKg * 0.02;
            historicoCuidados.add(String.format("Alimentado: %.2f kg", quantidadeKg));
        }
    }

    public void darBanho() {
        historicoCuidados.add("Banho");
    }

    public String exibirFicha() {
        return String.format("Nome: %s | Espécie: %s | Idade: %d | Peso: %.2f kg | Dono: %s | Cuidados: %s",
                nome, especie, idade, peso, dono, String.join(", ", historicoCuidados));
    }
}
