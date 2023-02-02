import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComissionadoTest {
    private Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        BigDecimal taxaComissao = new BigDecimal(20);
        BigDecimal vendasBrutas = new BigDecimal(10);
        
        funcionario = new FuncionarioComissionado("João da Silva", "392.372.680-50", taxaComissao, vendasBrutas);
    }

    @Test
    void getRendimentos() {
        BigDecimal esperado = new BigDecimal("2.00");
        assertEquals(esperado, funcionario.getRendimentos());
    }
}