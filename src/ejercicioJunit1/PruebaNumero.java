package ejercicioJunit1;

import org.junit.Test;
import org.junit.Assert;

public class PruebaNumero {

    @Test
    public void siguienteDe5() {
        Numero n = new Numero(5);
        int s = n.siguiente();
        Assert.assertEquals(6, s);
    }
    @Test
    public void siguienteDe_1() {
        Numero n = new Numero(-1);
        int s = n.siguiente();
        Assert.assertEquals(0, s);
    }

    @Test
    public void esNegativo_1() {
        Numero n = new Numero(5);
        Assert.assertTrue(n.esNegativo());
    }
}