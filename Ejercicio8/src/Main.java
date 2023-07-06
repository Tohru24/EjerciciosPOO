public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();

        System.out.println("Ingrese los datos para el alumno 1:");
        alumno1.capturarDatos();
        System.out.println();
        alumno1.mostrarDatos();

        System.out.println();

        System.out.println("Ingrese los datos para el alumno 2:");
        alumno2.capturarDatos();
        System.out.println();
        alumno2.mostrarDatos();

        Alumno.cerrarScanner();
    }
}
