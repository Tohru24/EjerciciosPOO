public class Main {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora();
        Computadora computadora2 = new Computadora();

        System.out.println("Ingrese los datos para la computadora 1:");
        computadora1.capturarDatos();
        computadora1.mostrarMensaje();

        System.out.println();

        System.out.println("Ingrese los datos para la computadora 2:");
        computadora2.capturarDatos();
        computadora2.mostrarMensaje();

        Computadora.cerrarScanner();
    }
}
