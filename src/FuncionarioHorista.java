import java.math.BigDecimal;

public class FuncionarioHorista extends Funcionario {
    private BigDecimal salarioPorHora;
    private double horasTrabalhadas;
    private BigDecimal salario;

    public FuncionarioHorista(String nome, String cpf, double horasTrabalhadas, BigDecimal salarioPorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
        this.salario = calculaSalario();
    }

    private BigDecimal calculaSalario() {
        BigDecimal salario = new BigDecimal("0.00");
        BigDecimal horasTrabalhadas = new BigDecimal(this.horasTrabalhadas);

        if (this.horasTrabalhadas <= 40)
            salario = salario.add(salarioPorHora.multiply(horasTrabalhadas));

        else if (this.horasTrabalhadas > 40)
            salario = salario.add(new BigDecimal(40)
                            .multiply(salarioPorHora))
                    .add((horasTrabalhadas
                            .subtract(new BigDecimal(40)))
                            .multiply(salarioPorHora)
                            .multiply(new BigDecimal("1.5")));

        return salario;
    }

    @Override
    public BigDecimal getRendimentos() {
        return super.getRendimentos().add(salario);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Salário por hora = " + salarioPorHora +
                " | Horas trabalhadas = " + horasTrabalhadas +
                " | Salário = " + salario;
    }
}
