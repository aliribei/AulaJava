import Extras.calculadora.Calculadora;
import org.junit.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testeSoma(){
        Calculadora calc  = new Calculadora();

        int valorEsperado = 20;
        int valorObtido  = calc.somar(10,10);
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void testeSubtracao(){
        Calculadora calc  = new Calculadora();

        int valorEsperado = 20;
        int valorObtido  = calc.subtrair(30,10);
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void testeMultiplicacao(){
        Calculadora calc  = new Calculadora();

        int valorEsperado = 20;
        int valorObtido  = calc.multiplicar( 5, 4);
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void testeDivisao(){
        Calculadora calc  = new Calculadora();

        int valorEsperado = 5;
        int valorObtido  = calc.dividir(20 , 4);
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void testeResto(){
        Calculadora calc  = new Calculadora();

        int valorEsperado = 1;
        int valorObtido  = calc.restar( 21, 5);
        assertEquals(valorEsperado, valorObtido);
    }
}