public class Menues {
    public static String menu_general = "Bienvenido al Torneo de Fútbol 5 \n" + "\n" + "Menú de opciones: \n" + "\n"
            + "Seleccione una opción: " + "\n" + "1. Nuevo Equipo. \n" + "2. Nuevo Jugador. \n"
            + "3. Listar Equipos. \n" + "4. Listar Jugadores. \n"
            + "5. Listar Equipos por zona. \n" + "\n" + "0. Salir";

    public static void muestraMenuGeneral() {
        String[] lineas = menu_general.split("\n");
        int longitudLinea = 0;

        // Determinar la longitud de la línea más larga
        for (String linea : lineas) {
            if (linea.length() > longitudLinea) {
                longitudLinea = linea.length();
            }
        }

        // Imprimir el marco superior
        System.out.println("*".repeat(longitudLinea + 4));

        // Imprimir las líneas con el marco lateral
        for (String linea : lineas) {
            int espacios = longitudLinea - linea.length();
            String marcoLateral = "* " + linea + " ".repeat(espacios) + " *";
            System.out.println(marcoLateral);
        }

        // Imprimir el marco inferior
        System.out.println("*".repeat(longitudLinea + 4));
    }

}
