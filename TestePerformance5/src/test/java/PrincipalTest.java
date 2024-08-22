import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalTest {
    @Test
    public void calcularFatorialTest(){
        int numero = 0;
        int esperado = 1;
        int resultado = Principal.calcularFatorial(numero);
        Assertions.assertEquals(esperado, resultado);
    }
}
