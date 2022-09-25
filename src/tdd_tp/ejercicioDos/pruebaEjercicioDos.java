package tdd_tp.ejercicioDos;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class pruebaEjercicioDos {
    Calculadora cal = new Calculadora();
    @Test
    public void sumaDosNumeros(){
        int result = cal.sumar(3,5);
        Assert.assertEquals(8,result);

    }

    @Test
    public void sumaArrayNull(){
        //Si no tiene elementos
        int[] arr ={};
        int result = cal.sumarArray(arr);
        Assert.assertEquals(0,result);
    }

    @Test
    public void sumaArray0(){
        // Cuando un elemento sea 0
        int[] arr ={0};
        int result = cal.sumarArray(arr);
        Assert.assertEquals(0,result);
    }

    @Test
    public void sumaArray1(){
        //Cuando hay un solo elemento
        int[] arr = {1};
        int result = cal.sumarArray(arr);
        Assert.assertEquals(1,result);
    }

    @Test
    public void sumaArray123(){
        //Varios
        int[] arr = {1,2,3};
        int result = cal.sumarArray(arr);
        Assert.assertEquals(6,result);
    }
    @Test
    public void sumaArrayVarios(){
        //Funcionando
        int[] arr = {10,20,25,50,115};
        int result = cal.sumarArray(arr);
        Assert.assertEquals(220,result);
    }

}
