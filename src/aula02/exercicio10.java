import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exercicio10 {
    private String aluno;
    private double valor;
    private LocalDate dataVencimento;
    private boolean pago;
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM");

    public exercicio10(String aluno, double valor, LocalDate dataVencimento) {
        this.aluno = aluno;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.pago = false;
    }

    public void pagar() {
        pago = true;
    }

    public boolean verificarAtraso(LocalDate dataAtual) {
        return !pago && dataAtual.isAfter(dataVencimento);
    }

    public String exibirStatus() {
        String situacao = pago ? "Pago" : "Em aberto";
        return String.format("Aluno: %s | Valor: %.2f | Vencimento: %s | Situação: %s",
                aluno, valor, dataVencimento.format(FMT), situacao);
    }
}
