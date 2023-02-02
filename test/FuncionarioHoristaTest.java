import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {
    private Funcionario funcionario;
    private BigDecimal salarioPorHora;

    @BeforeEach
    public void setUp() {
        salarioPorHora = new BigDecimal("5.51");
    }

    @Test
    void getRendimentosSeHorasTrabalhadasMenorQueQuarenta() {
        funcionario = new FuncionarioHorista("João da Silva", "392.372.680-50", 30, salarioPorHora);
        BigDecimal esperado = new BigDecimal("165.30");
        assertEquals(esperado, funcionario.getRendimentos());
    }

    @Test
    void getRendimentosSeHorasTrabalhadasMaiorQueQuarenta() {
        funcionario = new FuncionarioHorista("João da Silva", "392.372.680-50", 50, salarioPorHora);
        BigDecimal esperado = new BigDecimal("303.050");
        assertEquals(esperado, funcionario.getRendimentos());
    }

    @Test
    void getRendimentosSeHorasTrabalhadasIgualAQuarenta() {
        funcionario = new FuncionarioHorista("João da Silva", "392.372.680-50", 40, salarioPorHora);
        BigDecimal esperado = new BigDecimal("220.40");
        assertEquals(esperado, funcionario.getRendimentos());
    }
}