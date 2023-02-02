import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComissionadoBaseSalarioTest {
    private Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        BigDecimal taxaComissao = new BigDecimal(10);
        BigDecimal vendasBrutas = new BigDecimal(38);
        BigDecimal salario = new BigDecimal("3500.00");

        funcionario = new FuncionarioComissionadoBaseSalario("João da Silva", "392.372.680-50", taxaComissao, vendasBrutas, salario);
    }

    @Test
    void getRendimentos() {
        BigDecimal esperado = new BigDecimal("3503.80");
        assertEquals(esperado, funcionario.getRendimentos());
    }
}