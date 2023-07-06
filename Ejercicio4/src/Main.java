public class Main {
    public static void main(String[] args) {
        Auto nissan = new Auto();
        Auto toyota = new Auto();
        Auto ferrari = new Auto();

        System.out.println("Ingrese los datos para el auto Nissan:");
        nissan.solicitarInformacion();
        double velocidadNissan = nissan.calcularVelocidad();
        System.out.println("La velocidad del auto Nissan es: " + velocidadNissan + " km/h");

        System.out.println("Ingrese los datos para el auto Toyota:");
        toyota.solicitarInformacion();
        double velocidadToyota = toyota.calcularVelocidad();
        System.out.println("La velocidad del auto Toyota es: " + velocidadToyota + " km/h");

        System.out.println("Ingrese los datos para el auto Ferrari:");
        ferrari.solicitarInformacion();
        double velocidadFerrari = ferrari.calcularVelocidad();
        System.out.println("La velocidad del auto Ferrari es: " + velocidadFerrari + " km/h");

        Auto.cerrarScanner();
    }
}
