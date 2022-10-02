package tdd_tp.ejercicio6;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio6 {

    /*
    2520 es el número más pequeño que se puede dividir por cada uno de los números del 1 al 10 sin
    que quede ningún resto.
    ¿Cuál es el número positivo más pequeño que es divisible por todos los números del 1 al 20?
    * */

    long num1=232792560l;

    @Test
    public void es_Divisible_Con_Resto_Cero(){
        int divisiblePor=2;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_2(){
        int divisiblePor=2;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_3(){
        int divisiblePor=3;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_4(){
        int divisiblePor=4;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_5(){
        int divisiblePor=5;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_6(){
        int divisiblePor=6;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_7(){
        int divisiblePor=7;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_8(){
        int divisiblePor=8;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_9(){
        int divisiblePor=9;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_10(){
        int divisiblePor=10;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_11(){
        int divisiblePor=11;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_12(){
        int divisiblePor=12;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_13(){
        int divisiblePor=13;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_14(){
        int divisiblePor=14;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_15(){
        int divisiblePor=15;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_16(){
        int divisiblePor=16;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_17(){
        int divisiblePor=17;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_18(){
        int divisiblePor=18;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_19(){
        int divisiblePor=19;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void es_Divisible_por_20(){
        int divisiblePor=20;

        Assert.assertTrue(esDivisibleConRestoCero(num1, divisiblePor));
    }
    @Test
    public void mostrar_el_dividendo_mas_chico_que_se_puede_dividir_del_1_al_20_con_resto_cero(){
        long num1=2520l;
        int divisiblePor=1;

        Assert.assertEquals(232792560, buscarDividendoMasChicoV2(num1, divisiblePor));
    }

    //METODOS
    private boolean esDivisibleConRestoCero(long num, int divisor) {
        return num%divisor == 0;
    }
    private long buscarDividendoMasChicoV2(long num, int divisor) {
        boolean finalizado = false;

        for (long valorIngresado = num; !finalizado; valorIngresado++) {
            int div = divisor;
            while (esDivisibleConRestoCero(valorIngresado, div)) {
                div++;
                if (div == 20) {
                    finalizado = true;
                    num = valorIngresado;
                    System.out.println("El valor más pequeño es: " + valorIngresado);
                }
            }
        }
        return num;
    }
    private long buscarDividendoMasChico(long num) {
        boolean encontrado = false;
        while(!encontrado){
            if (num%2==0 && num%3==0 && num%4==0 && num%5==0 && num%6==0 && num%7==0) {
                if (num%8==0 && num%9==0 && num%10==0 && num%11==0 && num%12==0) {
                    if (num%13==0 && num%14==0 && num%15==0 && num%16==0 && num%17==0 && num%19==0 && num%20==0) {
                        encontrado=true;
                    }else num +=1;
                }else num +=1;
            }else num +=1;
        } System.out.println(num);
        return num;
    }




   /* @Test
    public void mostrar_el_dividendo_mas_chico_que_se_puede_dividir_del_1_al_20_con_resto_cero(){
        buscarDividendoMasChico();
        Assert.assertEquals(232792560, dividendo);
    }
*/
    /*Métodos
    private boolean tieneRestoCero(long dividendo, int divisor) {
        return dividendo%divisor == 0;
    }
    private int incrementarDivisor() {
        return divisor++;
    }
    private long incrementarDividendo() {
        return dividendo++;
    }

    private void buscarDividendoMasChico() {
       boolean finalizado = false;

       for (long valorInicial = 2520l; !finalizado; valorInicial++) {
            int i=1;
            while(valorInicial % i == 0){
                i++;
                if (i == 20){
                    finalizado = true;
                    System.out.println("El valor más pequeño es: " + valorInicial);
                }
            }
        }
    }*/
}

  /*  public static void main(String[] args) {

        int Contador = 0;
        int Residuo = 1;
        int GuardarNumero = 0;

        for(int i = 1; i <= 999999999;i++)
        {
            Contador = 0;
            for(int x  = 1; x <=20;x++){

                Residuo = i % x;

                if(Residuo == 0){
                    Contador = Contador + 1;
                }
                if(Contador == 20){
                    GuardarNumero = i;
                    Contador = 0;
                }
                if(GuardarNumero > 0){
                    System.out.println(GuardarNumero);
                    return;
                }
            }
        }
    }
}*/
