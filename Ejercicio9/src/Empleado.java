import java.util.Scanner;

public class Empleado {
    private String codigo;
    private String nombre;
    private String genero;
    private double salario;

    private static Scanner scanner = new Scanner(System.in);

    public void capturarDatos() {
        System.out.print("Ingrese el código del empleado: ");
        codigo = scanner.nextLine();

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el género del empleado: ");
        genero = scanner.nextLine();

        System.out.print("Ingrese el salario del empleado: ");
        salario = scanner.nextDouble();
    }

    public double calculoRenta() {
        return salario * 0.1;
    }

    public void mostrarDatos() {
        System.out.println("Información del empleado:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Salario: $" + salario);
        System.out.println("Descuento Renta: $" + calculoRenta());
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
