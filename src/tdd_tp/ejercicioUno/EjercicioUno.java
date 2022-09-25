package tdd_tp.ejercicioUno;



public class EjercicioUno {
    public static void main(String[] args) {
}

    public  boolean esMultiploomoDe_(int numero, int multiplo) {
        return numero%multiplo == 0;
    }

    public int sumaMultiplosDe3y5MenoresA_(int numero){
        int suma = 0;
        for (int i = 1; i <numero ; i++) {
            if (esMultiploomoDe_(i,3) || esMultiploomoDe_(i,5)){
                suma+=i;
            }
        }
        return suma;
    }
}
