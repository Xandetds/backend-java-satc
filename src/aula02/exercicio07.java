public class exercicio07 {
    private String modelo;
    private String placa;
    private int ano;
    private boolean alugado;
    private int quilometragem;

    public exercicio07(String modelo, String placa, int ano, int quilometragem) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.quilometragem = Math.max(0, quilometragem);
        this.alugado = false;
    }

    public boolean alugar() {
        if (alugado) return false;
        alugado = true;
        return true;
    }

    public boolean devolver(int kmRodados) {
        if (!alugado || kmRodados < 0) return false;
        quilometragem += kmRodados;
        alugado = false;
        return true;
    }

    public String exibirStatus() {
        return String.format("Modelo: %s | Placa: %s | Ano: %d | Km: %d | Alugado: %s",
                modelo, placa, ano, quilometragem, alugado ? "Sim" : "Não");
    }
}
