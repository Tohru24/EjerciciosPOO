public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        System.out.println("Ingrese los datos del empleado 1:");
        empleado1.capturarDatos();
        System.out.println();
        empleado1.mostrarDatos();

        System.out.println();

        System.out.println("Ingrese los datos del empleado 2:");
        empleado2.capturarDatos();
        System.out.println();
        empleado2.mostrarDatos();

        Empleado.cerrarScanner();
    }
}
