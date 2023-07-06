import java.util.Scanner;

public class Computadora {
    private String marca;
    private String procesador;
    private int memoria;
    private int discoDuro;

    private static Scanner scanner = new Scanner(System.in);

    public void capturarDatos() {
        System.out.print("Ingrese la marca de la computadora: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el procesador de la computadora: ");
        procesador = scanner.nextLine();

        System.out.print("Ingrese la cantidad de memoria de la computadora (en GB): ");
        memoria = scanner.nextInt();

        System.out.print("Ingrese la capacidad del disco duro de la computadora (en GB): ");
        discoDuro = scanner.nextInt();
    }

    public void mostrarMensaje() {
        System.out.println("El cliente necesita una computadora marca " + marca + ", con procesador " + procesador
                + ", memoria de " + memoria + " GB y un disco duro de " + discoDuro + " GB.");
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
