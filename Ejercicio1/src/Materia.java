import java.util.Scanner;

public class Materia {
    private int carnet;
    private String nombre;
    private String apellido;
    private int[] evaluaciones;

    private static Scanner scanner = new Scanner(System.in);

    public Materia(int carnet, String nombre, String apellido, int[] evaluaciones) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.evaluaciones = evaluaciones;
    }
    public void solicitarDatosYCalcularPromedio() {
        System.out.print("Ingrese el carnet: ");
        carnet = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de leer el entero

        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        apellido = scanner.nextLine();

        evaluaciones = new int[5];
        int suma = 0;
        for (int i = 0; i < evaluaciones.length; i++) {
            System.out.print("Ingrese la evaluación " + (i + 1) + ": ");
            evaluaciones[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero
            suma += evaluaciones[i];
        }

        double promedio = (double) suma / evaluaciones.length;
        System.out.println("El promedio de las evaluaciones es: " + promedio);
    }

    // Getters y setters para los atributos

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int[] getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(int[] evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    // Método para cerrar el scanner
    public static void cerrarScanner() {
        scanner.close();
    }
}
