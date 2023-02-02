import java.math.BigDecimal;

public class FuncionarioAssalariado extends Funcionario {
    private BigDecimal salario;

    public FuncionarioAssalariado(String nome, String cpf, BigDecimal salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public BigDecimal getRendimentos() {
        return super.getRendimentos().add(salario);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Salário = " + salario;
    }
}
