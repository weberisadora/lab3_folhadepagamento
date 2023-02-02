import java.math.BigDecimal;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private BigDecimal rendimentos;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        rendimentos = new BigDecimal("0.00");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public BigDecimal getRendimentos() {
        return rendimentos;
    }
    @Override
    public String toString() {
        return "Nome = " + nome +
                " | CPF = " + cpf +
                " | Rendimentos = " + getRendimentos() +
                " | ";
    }
}
