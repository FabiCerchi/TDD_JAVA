package ejercicioException1;

public class ejercicioExcepcion {

    public static void rrhh(String datos) {
        try {
            String datosEmpleado = datos;
            String[] arrStr = datosEmpleado.split(",");
            for (int i = 0; i < 3; i++) {
                if (arrStr[i].equals("")) {
                    throw new Exception("Empty String" + i);
                } else {
                    System.out.print(arrStr[i] + " ");
                }
            }

            // Si el string que pasa por param es nulo
            // Si la pos del array es vacia
            // Si esta fuera de index*****
            // si indic[3 <=
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error índice fuera de rango " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Otra clase de error " + e.getMessage());
        }

    }

    public static int sumarArr(String[] datos) {
        int suma = 0;
        try {
            for (int i = 0; i < datos.length; i++) {
                try {
                    suma += Integer.parseInt(datos[i]);
                } catch (Exception e) {
                    System.out.println("Pase por el catch del for");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Clausula fanally");
        }
        return suma;
    }

    public static void main(String[] args) {
        //ejercicioExcepcion.rrhh("asd,123,-12132");
        String[] arrPrueba = {"2", "3", "10e2"};
        //ejercicioExcepcion.sumarArr(arrPrueba);

    }
}


