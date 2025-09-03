import java.util.ArrayList;
import java.util.List;

public class exercicio08 {
    private int numero;
    private List<String> itens;
    private double valorTotal;
    private String status;

    public exercicio08(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
        this.status = "em preparo";
    }

    public void adicionarItem(String item, double valor) {
        if (item != null && !item.isEmpty() && valor >= 0) {
            itens.add(item);
            valorTotal += valor;
        }
    }

    public boolean alterarStatus(String novoStatus) {
        if (novoStatus == null) return false;
        String s = novoStatus.toLowerCase();
        if (s.equals("em preparo") || s.equals("pronto") || s.equals("entregue")) {
            status = s;
            return true;
        }
        return false;
    }

    public String exibirResumo() {
        return String.format("Pedido #%d | Itens: %s | Total: %.2f | Status: %s",
                numero, String.join(", ", itens), valorTotal, status);
    }
}
