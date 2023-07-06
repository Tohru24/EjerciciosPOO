public class Main {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

        System.out.println("Ingrese los datos para el primer calculo:");
        calculadora1.capturarDatos();
        System.out.println("Suma: " + calculadora1.suma());
        System.out.println("Resta: " + calculadora1.resta());
        System.out.println("Multiplicación: " + calculadora1.multiplicacion());
        System.out.println("División: " + calculadora1.division());

        System.out.println("Ingrese los datos para el segundo calculo:");
        calculadora2.capturarDatos();
        System.out.println("Suma: " + calculadora2.suma());
        System.out.println("Resta: " + calculadora2.resta());
        System.out.println("Multiplicación: " + calculadora2.multiplicacion());
        System.out.println("División: " + calculadora2.division());

        Calculadora.cerrarScanner();
    }
}
