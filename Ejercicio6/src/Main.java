public class Main {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento("Manzana", "Frutas", "Árbol", 2.50);
        Alimento alimento2 = new Alimento("Arroz", "Cereales", "Planta", 1.75);

        System.out.println("Información del alimento 1:");
        alimento1.mostrarInformacion();

        System.out.println();

        System.out.println("Información del alimento 2:");
        alimento2.mostrarInformacion();
    }
}
