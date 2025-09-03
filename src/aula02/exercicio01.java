public class exercicio01 {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;
    private boolean disponivel;

    public exercicio01(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public boolean emprestar() {
        if (!disponivel) return false;
        disponivel = false;
        return true;
    }

    public void devolver() {
        disponivel = true;
    }

    public String exibirInformacoes() {
        return String.format("Título: %s | Autor: %s | Ano: %d | ISBN: %s | Disponível: %s",
                titulo, autor, anoPublicacao, isbn, disponivel ? "Sim" : "Não");
    }
}
