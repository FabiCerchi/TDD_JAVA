package tdd_tp.ejercicio7;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Ejercicio7 {

    //Un número perfecto es un número para el que la suma de sus divisores propios es exactamente
    //igual al número. Por ejemplo, la suma de los divisores propios de 28 sería 1 + 2 + 4 + 7 + 14 = 28, lo
    //que significa que 28 es un número perfecto

   //Primero hice esto
   @Test
   public void logicaParaElCasoNumeroPerfecto28(){

      int numeroElegido = 28;
      int sumaParcialDivisores= 0;
      for (int i=1; i< 28; i++){
            if(28%i==0){
            sumaParcialDivisores= sumaParcialDivisores + i;
         }
      }

      //if (sumaParcialDivisores==numeroElegido){
         //System.out.println("Es numero perfecto!");
      //}

      assertEquals(sumaParcialDivisores, numeroElegido);
   }

   //Tercero hice este test
   @Test
   public void numeroOnceDebeSerDeficiente(){
      boolean resultado = esDeficiente(11);
      assertEquals(true, resultado);
   }

   //Cuarto este test
   @Test
   public void numero12EsAbundante(){
      boolean resultado = esAbundante(12);
      assertEquals(true, resultado);
   }

   @Test
   public void numero6EsAbundante(){
      boolean resultado = esAbundante(6);
      assertEquals(true, resultado);
   }

   //Segundo hice estas funciones
   public boolean esDeficiente(int numero){
      int sumaParcialDivisores= 0;
      int divisores = 0;
      for (int i=1; i< numero; i++){
         if(numero%i==0){
            divisores++;
            sumaParcialDivisores= sumaParcialDivisores + i;
         }
      }

      if (numero == divisores) {
         //System.out.println("El numero es PERFECTO");
         return false;
      } else if (sumaParcialDivisores<numero){
         //System.out.println("El numero es deficiente");
         return true;
      } else {
         //sSystem.out.println("El numero es abundante");
         return false;
      }

   }

   public boolean esAbundante(int numero){
      int sumaParcialDivisores= 0;
      int divisores = 0;
      for (int i=1; i< numero; i++){
         if(numero%i==0){
            divisores++;
            sumaParcialDivisores= sumaParcialDivisores + i;
         }
      }

      if (numero == divisores) {
         //System.out.println("El numero es PERFECTO");
         return false;
      } else if (sumaParcialDivisores<numero){
         //System.out.println("El numero es deficiente");
         return false;
      } else {
         //System.out.println("El numero es abundante");
         return true;
      }

   }

   //se puede demostrar que todos los números enteros mayores que 28123 pueden escribirse como la
   //suma de dos números abundantes. Sin embargo, este límite superior no puede reducirse más por
   //análisis, aunque se sabe que el mayor número que no puede expresarse como suma de dos
   //números abundantes es menor que este límite.
   //Encuentre la suma de todos los números enteros positivos que no se pueden escribir como
   //la suma de dos números abundantes.


   //Entonces limite de numeros que NO se puede escribir como suma de dos abundantes es < 28123

   //Encuentro una forma de retornar los numeros abundantes entre ese rango
   public ArrayList<Integer> encontrarNumerosAbundantesHasta28123(){

      ArrayList<Integer> numerosAbundantes = new ArrayList<>();

      for(int i=0; i<28123; i++){
         if(esAbundante(i)){
            numerosAbundantes.add(i);
         }
      }

      for(Integer abundante : numerosAbundantes){
         System.out.println(abundante+"\n");
      }

      return numerosAbundantes;
   }

   @Test
   public void numerosAbundantesMenoresA28123NoDebeSerNulo(){
      ArrayList<Integer> abundantes = encontrarNumerosAbundantesHasta28123();

      assertNotNull(abundantes);
      //Primer numero abundante es el 6
      assertEquals(Integer.valueOf(6), abundantes.get(0));
      //Imprimo la qty de numeros abundantes hasta el limite superior
      System.out.println("La cantidad de numeros abundantes menores a 28123 es: "+ abundantes.size());
   }
}
