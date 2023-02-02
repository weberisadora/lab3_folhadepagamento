import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioAssalariadoTest {
    private Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        BigDecimal salario = new BigDecimal("2300.00");

        funcionario = new FuncionarioAssalariado("João da Silva", "392.372.680-50", salario);
    }

    @Test
    void getRendimentos() {
        BigDecimal esperado = new BigDecimal("2300.00");
        assertEquals(esperado, funcionario.getRendimentos());
    }
}