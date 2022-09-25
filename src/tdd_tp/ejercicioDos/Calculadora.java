package tdd_tp.ejercicioDos;

public class Calculadora {
    public static void main(String[] args) {

    }
    public int sumar(int numero, int numeroDos){
        return numero + numeroDos;
    }

    public boolean estaVacio(int[] arr){
        return arr.length == 0;
    }
    public int sumarArray(int[] arr){
        int result = 0;
        if (!estaVacio(arr)){
            for (int i = 0; i < arr.length; i++) {
                result+= arr[i];
            }
       }
        return result;
    }
}
