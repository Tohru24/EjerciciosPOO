import java.util.Scanner;

public class Auto {
    private double distancia;
    private double tiempo;

    private static Scanner scanner = new Scanner(System.in);

    public void solicitarInformacion() {
        System.out.print("Ingrese la distancia recorrida (en kilómetros): ");
        distancia = scanner.nextDouble();

        System.out.print("Ingrese el tiempo transcurrido (en horas): ");
        tiempo = scanner.nextDouble();
    }

    public double calcularVelocidad() {
        return distancia / tiempo;
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
