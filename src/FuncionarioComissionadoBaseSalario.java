import java.math.BigDecimal;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private BigDecimal salario;

    public FuncionarioComissionadoBaseSalario(String nome, String cpf, BigDecimal taxaComissao, BigDecimal vendasBrutas, BigDecimal salario) {
        super(nome, cpf, taxaComissao, vendasBrutas);
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
        return  super.toString() +
                "Salário = " + salario;
    }
}