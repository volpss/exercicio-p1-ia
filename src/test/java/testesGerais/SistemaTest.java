package testesGerais;

import br.unibave.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {

    @Test
    public void testFuncionarioSalarioNegativo() {
        Funcionario f = new Funcionario("Ana", -1000);
        assertEquals(0, f.calcularSalarioFinal());
    }

    @Test
    public void testFuncionarioSalarioValido() {
        Funcionario f = new Funcionario("Carlos", 2000);
        assertEquals(2000, f.calcularSalarioFinal());
    }

    @Test
    public void testVendedorSalarioNegativo() {
        Vendedor v = new Vendedor("Paulo", -1500, 100, 5);
        // salário base = 0, comissão = 100 * 5 = 500
        assertEquals(500, v.calcularSalarioFinal());
    }

    @Test
    public void testVendedorComissaoNegativa() {
        Vendedor v = new Vendedor("Julia", 1500, -50, 10);
        // comissão = 0, então salário final = 1500
        assertEquals(1500, v.calcularSalarioFinal());
    }

    @Test
    public void testVendedorQuantidadeVendasNegativa() {
        Vendedor v = new Vendedor("Lucia", 1200, 30, -3);
        // vendas = 0, então salário final = 1200
        assertEquals(1200, v.calcularSalarioFinal());
    }

    @Test
    public void testVendedorSalarioCompletoValido() {
        Vendedor v = new Vendedor("Miguel", 1000, 50, 10);
        assertEquals(1500, v.calcularSalarioFinal());
    }

    @Test
    public void testFuncionarioEVendedorSemVendasMesmoSalario() {
        Funcionario f = new Funcionario("Maria", 2000);
        Vendedor v = new Vendedor("João", 2000, 100, 0);
        assertEquals(f.calcularSalarioFinal(), v.calcularSalarioFinal());
    }

    @Test
    public void testFuncionarioEVendedorComVendas() {
        Funcionario f = new Funcionario("Lucas", 2000);
        Vendedor v = new Vendedor("Pedro", 2000, 100, 10);
        assertNotEquals(f.calcularSalarioFinal(), v.calcularSalarioFinal());
        assertEquals(3000, v.calcularSalarioFinal());
    }
}