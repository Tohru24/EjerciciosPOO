import java.util.Scanner;

public class Paises {
    private String nombre;
    private String idioma;
    private double extensionTerritorial;

    private static Scanner scanner = new Scanner(System.in);

    public void solicitarInformacion() {
        nombre = obtenerEntrada("Ingrese el nombre del país: ");
        idioma = obtenerEntrada("Ingrese el idioma oficial: ");
        extensionTerritorial = obtenerDouble("Ingrese la extensión territorial (en km²): ");
    }

    private String obtenerEntrada(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private double obtenerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: entrada no válida. Por favor, ingrese un número válido.");
            }
        }
    }

    public String obtenerInformacion() {
        return String.format("%s es un país hermoso, su idioma oficial es el %s y su extensión territorial es %.2f km²",
                nombre, idioma, extensionTerritorial);
    }
}
