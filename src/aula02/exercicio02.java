public class exercicio02 {
    private String nome;
    private String cargo;
    private double salario;
    private String matricula;
    private String departamento;

    public exercicio02(String nome, String cargo, double salario, String matricula, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public void promover(String novoCargo, double aumento) {
        if (novoCargo != null && !novoCargo.isEmpty()) cargo = novoCargo;
        if (aumento > 0) salario += aumento;
    }

    public void transferir(String novoDepartamento) {
        if (novoDepartamento != null && !novoDepartamento.isEmpty()) departamento = novoDepartamento;
    }

    public String exibirDados() {
        return String.format("Nome: %s | Cargo: %s | Salário: %.2f | Matrícula: %s | Departamento: %s",
                nome, cargo, salario, matricula, departamento);
    }
}
