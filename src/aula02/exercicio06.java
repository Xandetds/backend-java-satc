public class exercicio06 {
    private String nome;
    private String codigo;
    private double preco;
    private int estoque;

    public exercicio06(String nome, String codigo, double preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = Math.max(0, estoque);
    }

    public boolean vender(int quantidade) {
        if (quantidade <= 0 || quantidade > estoque) return false;
        estoque -= quantidade;
        return true;
    }

    public void repor(int quantidade) {
        if (quantidade > 0) estoque += quantidade;
    }

    public String exibirProduto() {
        return String.format("%s | Código: %s | Preço: %.2f | Estoque: %d", nome, codigo, preco, estoque);
    }
}
