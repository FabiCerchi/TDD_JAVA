package ejercicioJunit1;

public class Numero {
    //atributo
    private int n = 0;

    //constructor
    public Numero(int x) {n = x; }

    //siguiente
    public int siguiente() {
        return n + 1;
    }

    //es negativo?
    public boolean esNegativo() {
        return (n < 0);
    }
}