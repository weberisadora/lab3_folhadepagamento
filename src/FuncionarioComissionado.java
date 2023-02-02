import java.math.BigDecimal;

public class FuncionarioComissionado extends Funcionario {
    private BigDecimal taxaComissao;
    private BigDecimal vendasBrutas;

    public FuncionarioComissionado(String nome, String cpf, BigDecimal taxaComissao, BigDecimal vendasBrutas) {
        super(nome, cpf);
        this.taxaComissao = taxaComissao.divide(new BigDecimal(100));
        this.vendasBrutas = vendasBrutas;
    }

    public BigDecimal getTaxaComissao() {
        return taxaComissao;
    }

    public BigDecimal getVendasBrutas() {
        return vendasBrutas;
    }

    @Override
    public BigDecimal getRendimentos() {
        return super.getRendimentos().add(getVendasBrutas().multiply(getTaxaComissao()));
    }

    @Override
    public String toString() {
        return super.toString() +
                "Taxa de comissão = " + taxaComissao +
                " | Vendas brutas = " + vendasBrutas;
    }
}
