public class Alimento {
    private String tipoAlimento;
    private String grupoAlimenticio;
    private String origenAlimenticio;
    private double precio;

    public Alimento(String tipoAlimento, String grupoAlimenticio, String origenAlimenticio, double precio) {
        this.tipoAlimento = tipoAlimento;
        this.grupoAlimenticio = grupoAlimenticio;
        this.origenAlimenticio = origenAlimenticio;
        this.precio = precio;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getGrupoAlimenticio() {
        return grupoAlimenticio;
    }

    public void setGrupoAlimenticio(String grupoAlimenticio) {
        this.grupoAlimenticio = grupoAlimenticio;
    }

    public String getOrigenAlimenticio() {
        return origenAlimenticio;
    }

    public void setOrigenAlimenticio(String origenAlimenticio) {
        this.origenAlimenticio = origenAlimenticio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInformacion() {
        String[] encabezados = {"Tipo Alimento", "Grupo Alimenticio", "Origen Alimenticio", "Precio"};
        String[] datos = {tipoAlimento, grupoAlimenticio, origenAlimenticio, String.valueOf(precio)};

        int columnaAnchoMaximo = obtenerAnchoMaximo(encabezados, datos) + 2;

        imprimirLineaSeparadora(columnaAnchoMaximo);
        imprimirFila(encabezados, columnaAnchoMaximo);
        imprimirLineaSeparadora(columnaAnchoMaximo);
        imprimirFila(datos, columnaAnchoMaximo);
        imprimirLineaSeparadora(columnaAnchoMaximo);
    }

    private int obtenerAnchoMaximo(String[] encabezados, String[] datos) {
        int anchoMaximo = 0;
        for (String encabezado : encabezados) {
            if (encabezado.length() > anchoMaximo) {
                anchoMaximo = encabezado.length();
            }
        }
        for (String dato : datos) {
            if (dato.length() > anchoMaximo) {
                anchoMaximo = dato.length();
            }
        }
        return anchoMaximo;
    }

    private void imprimirLineaSeparadora(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private void imprimirFila(String[] datos, int columnaAnchoMaximo) {
        for (String dato : datos) {
            System.out.print("| ");
            System.out.print(ajustarTexto(dato, columnaAnchoMaximo));
            System.out.print(" ");
        }
        System.out.println("|");
    }

    private String ajustarTexto(String texto, int longitud) {
        if (texto.length() > longitud) {
            return texto.substring(0, longitud - 3) + "...";
        } else {
            return String.format("%-" + longitud + "s", texto);
        }
    }
}
