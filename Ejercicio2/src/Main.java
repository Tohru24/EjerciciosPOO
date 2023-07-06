public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Mascota
        Mascota mascota1 = new Mascota();
        Mascota mascota2 = new Mascota();
        Mascota mascota3 = new Mascota();

        // Capturar y mostrar datos para cada instancia
        System.out.println("Ingrese los datos para la mascota 1");
        mascota1.capturarDatos();
        System.out.println("Datos de la mascota 1:");
        mascota1.mostrarDatos();

        System.out.println("Ingrese los datos para la mascota 2");
        mascota2.capturarDatos();
        System.out.println("Datos de la mascota 2:");
        mascota2.mostrarDatos();

        System.out.println("Ingrese los datos para la mascota 3");
        mascota3.capturarDatos();
        System.out.println("Datos de la mascota 3:");
        mascota3.mostrarDatos();
    }
}
