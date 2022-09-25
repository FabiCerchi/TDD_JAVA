package tdd_tp.ejercicioTres;

import java.util.ArrayList;

public class CaculadoraPalindromo {
    public int cambiarBase(int numero){
        int diviendo = numero;
        ArrayList<String> binarioInvertido = new ArrayList<String>();
        do {
            if (diviendo%2 == 0){
                binarioInvertido.add(String.valueOf(0));
                diviendo = diviendo/2;
            } else if (diviendo%2 == 1) {
                binarioInvertido.add(String.valueOf(1));
                diviendo = diviendo/2;
            }
        }while (diviendo>0);
        ArrayList<String> binario = reverseArr(binarioInvertido);
        String result = "";
        for (String str:binario){
            result+=str;
        }

        return Integer.parseInt(result);
    }
    public  ArrayList<String> reverseArr(ArrayList<String> arr){
        ArrayList<String> arrAux = new ArrayList<>();
        int iArr = 0;
        for (int i = arr.size()-1; i >= 0; i--){
            arrAux.add(iArr,arr.get(i));
            iArr++;
        }
        return arrAux;
    }

    public boolean esPalindromoBinario(int numero){
        int binarioUno = cambiarBase(numero);
        String binarioDos = new StringBuilder(String.valueOf(cambiarBase(numero))).reverse().toString();
        return binarioUno == Integer.parseInt(binarioDos);
    }
    public  boolean esPalindromoDecimal(int numero){
        String decimalDos = new StringBuilder(String.valueOf(numero)).reverse().toString();
        return numero == Integer.parseInt(decimalDos);
    }

    public int sumaPalindromosDecBin(){
        int suma = 0;
        for (int i = 0; i < 10000; i++) {
            if (esPalindromoBinario(i) || esPalindromoDecimal(i)){
                suma+=i;
            }
        }
        return suma;
    }

}
