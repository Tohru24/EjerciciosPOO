public class Main {
    public static void main(String[] args) {
        Paises pais = new Paises();

        System.out.println("Ingrese la información del país:");
        pais.solicitarInformacion();

        String informacion = pais.obtenerInformacion();
        System.out.println(informacion);
    }
}
