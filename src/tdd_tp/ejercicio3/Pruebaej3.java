package tdd_tp.ejercicio3;

import org.junit.Assert;
import org.junit.Test;

public class Pruebaej3 {
    CaculadoraPalindromo calc = new CaculadoraPalindromo();
    @Test
    public void cambiarBase0(){
       int result = calc.cambiarBase(0);
        Assert.assertEquals(0,result);
    }
    @Test
    public void cambiarBase1(){
        int result = calc.cambiarBase(1);
        Assert.assertEquals(1,result);
    }
    @Test
    public void cambiarBase2(){
        int result = calc.cambiarBase(2);
        Assert.assertEquals(10,result);
    }
    @Test
    public void cambiarBase5(){
        int result = calc.cambiarBase(5);
        Assert.assertEquals(101,result);
    }

    @Test
    public void esPalindromoDecimal0(){
        boolean result = calc.esPalindromoDecimal(0);
        Assert.assertTrue(result);
    }
    @Test
    public void esPalindromoDecimal101(){
        boolean result = calc.esPalindromoDecimal(101);
        Assert.assertTrue(result);
    }
    @Test
    public void esPalindromoDecimal1010(){
        boolean result = calc.esPalindromoDecimal(1010);
        Assert.assertFalse(result);
    }
    @Test
    public void suma(){
        System.out.println(calc.sumaPalindromosDecBin());
    }

}
