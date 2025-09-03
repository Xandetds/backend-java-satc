import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class exercicio09 {
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidade;
    private List<String> inscritos;
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM");

    public exercicio09(String nome, LocalDate data, String local, int capacidade) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = Math.max(0, capacidade);
        this.inscritos = new ArrayList<>();
    }

    public boolean inscrever(String nomePessoa) {
        if (inscritos.size() >= capacidade) return false;
        if (nomePessoa == null || nomePessoa.isEmpty()) return false;
        inscritos.add(nomePessoa);
        return true;
    }

    public int verificarDisponibilidade() {
        return capacidade - inscritos.size();
    }

    public String exibirDetalhes() {
        return String.format("Evento: %s | Data: %s | Local: %s | Capacidade: %d | Inscritos: %d | Vagas: %d",
                nome, data.format(FMT), local, capacidade, inscritos.size(), verificarDisponibilidade());
    }
}
