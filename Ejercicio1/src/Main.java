// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Materia
        Materia poo = new Materia(0, "", "", new int[5]);
        Materia alg1 = new Materia(0, "", "", new int[5]);
        Materia progra1 = new Materia(0, "", "", new int[5]);

        System.out.println("Ingrese los datos para POO:");
        poo.solicitarDatosYCalcularPromedio();

        System.out.println("Ingrese los datos para Alg1:");
        alg1.solicitarDatosYCalcularPromedio();

        System.out.println("Ingrese los datos para Progra1:");
        progra1.solicitarDatosYCalcularPromedio();


    }
    }
