import java.util.Scanner;

public class Calculadora {
    private static Scanner scanner = new Scanner(System.in);
    private static int num1;
    private static int num2;

    public static void capturarDatos() {
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
    }

    public static int suma() {
        return num1 + num2;
    }

    public static int resta() {
        return num1 - num2;
    }

    public static int multiplicacion() {
        return num1 * num2;
    }

    public static double division() {
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir entre 0.");
            return 0.0;
        } else {
            return (double) num1 / num2;
        }
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
