public class exercicio04 {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;

    public exercicio04(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
    }

    public boolean reservar() {
        if (ocupado) return false;
        ocupado = true;
        return true;
    }

    public void liberar() {
        ocupado = false;
    }

    public double calcularValor(int dias) {
        if (dias <= 0) return 0.0;
        return precoPorNoite * dias;
    }

    public String exibirStatus() {
        return String.format("Quarto %d | Tipo: %s | Preço/noite: %.2f | Ocupado: %s",
                numero, tipo, precoPorNoite, ocupado ? "Sim" : "Não");
    }
}
