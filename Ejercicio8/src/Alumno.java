import java.util.Scanner;

public class Alumno {
    private String carnet;
    private String nombres;
    private String apellidos;
    private double nota1;
    private double nota2;
    private double nota3;

    private static Scanner scanner = new Scanner(System.in);

    public void capturarDatos() {
        System.out.print("Ingrese el carné del alumno: ");
        carnet = scanner.nextLine();

        System.out.print("Ingrese los nombres del alumno: ");
        nombres = scanner.nextLine();

        System.out.print("Ingrese los apellidos del alumno: ");
        apellidos = scanner.nextLine();

        System.out.print("Ingrese la nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        nota3 = scanner.nextDouble();
    }

    public double obtenerPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    public void mostrarDatos() {
        System.out.println("INFORMACIÓN DEL ALUMNO:");
        System.out.println("****************************************************");
        System.out.println("Carné: " + carnet);
        System.out.println("Nombre Completo: " + nombreCompleto());
        System.out.println();
        System.out.println("Parcial 1: " + nota1);
        System.out.println("Parcial 2: " + nota2);
        System.out.println("Parcial 3: " + nota3);
        System.out.println("Promedio: " + obtenerPromedio());
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
