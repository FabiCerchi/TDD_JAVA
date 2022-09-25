package tdd_tp.ejercicioUno;
import org.junit.Test;
import org.junit.Assert;

public class PruebaEjercicioUno {
    EjercicioUno calculadoraMultiplo = new EjercicioUno();
    @Test
    public void esMultiplo3de3() {
        boolean result = calculadoraMultiplo.esMultiploomoDe_(3,3);
        Assert.assertTrue(result);
    }
    @Test
    public void esMultiplo9de3() {
        boolean result = calculadoraMultiplo.esMultiploomoDe_(9,3);
        Assert.assertTrue(result);
    }
    @Test
    public void esMultiplo10de5() {
        boolean result = calculadoraMultiplo.esMultiploomoDe_(10,5);
        Assert.assertTrue(result);
    }
    @Test
    public void sumaMultiplo3y5(){
        int result = calculadoraMultiplo.sumaMultiplosDe3y5MenoresA_(10);
        Assert.assertEquals(result,23);
    }

}
