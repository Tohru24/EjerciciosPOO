import java.util.Scanner;

public class Mascota {
    private String nombre;
    private String raza;
    private int edad;

    private static Scanner scanner = new Scanner(System.in);

    public void capturarDatos() {
        System.out.print("Ingrese el nombre de la mascota: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la raza de la mascota: ");
        raza = scanner.nextLine();

        System.out.print("Ingrese la edad de la mascota en años: ");
        edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de leer el entero
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }

    // Getters y setters para los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
