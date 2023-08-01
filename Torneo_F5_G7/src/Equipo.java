import java.util.Scanner;

public class Equipo {
    String nombre;
    int cant_jugadores;
    int cant_comodines;
    String zona; // (A o B)
    Jugador[] jugadores;

    Equipo[] equipos;

    public int cantEquipos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE EQUIPOS QUE PARTICIPARAN DEL TORNEO: ");
        int nequipos = Integer.parseInt(sc.next());
        return nequipos;
    }

    // Método constructor
    public Equipo(String nombre, int cant_jugadores, int cant_comodines, String zona) {
        this.nombre = nombre;
        this.cant_jugadores = cant_jugadores;
        this.cant_comodines = cant_comodines;
        this.zona = zona;
        this.jugadores = new Jugador[cant_jugadores];
    }

    public Equipo() {
        this.nombre = "";
        this.cant_jugadores = 0;
        this.cant_comodines = 0;
        this.zona = "";
    }

    public void altaEquipo() {
        int nequipos = cantEquipos();
        equipos = new Equipo[nequipos];

        Scanner sc = new Scanner(System.in);

        int contador = 0;

        Jugador j = new Jugador();

        while (contador < nequipos) {

            System.out.println("-----INGRESO NUEVO EQUIPO-----");

            System.out.println("Ingrese el nombre del equipo [" + (contador + 1) + "/" + nequipos + "] ");
            nombre = sc.nextLine();

            System.out.println(
                    "Ingrese la cantidad de jugadores del equipo [" + (contador + 1) + "/" + nequipos
                            + "] (Mínimo 9 - Máximo 14)");
            cant_jugadores = Integer.parseInt(sc.nextLine());

            // Valida cantidad minima y maxima
            while (cant_jugadores < 1 || cant_jugadores > 14) {
                System.out.println("Cantidad incorrecta. Debe ingresar un Minimo de 9 jugadores y un maximo de 14");
                System.out.println(
                        "Ingrese la cantidad de jugadores del equipo [" + (contador + 1)
                                + "/" + nequipos + "] (Mínimo 9 - Máximo 14)");
                cant_jugadores = Integer.parseInt(sc.nextLine());
            }

            System.out
                    .println("Ingrese la cantidad de comodines que posee el equipo [" + (contador + 1)
                            + "/" + nequipos + "]: (Hasta 2)");
            cant_comodines = Integer.parseInt(sc.nextLine());
            // Valida cantidad de comodines admitida
            while (cant_comodines < 0 || cant_comodines > 2) {
                System.out.println("Cantidad incorrecta. Debe ingresar un maximo de 2");
                System.out.println("Ingrese la cantidad de comodines del equipo [" + (contador + 1) + "/" + nequipos
                        + "] (Máximo 2)");
                cant_comodines = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Ingrese la zona del equipo [" + (contador + 1) + "/" + nequipos + "] (A o B)");
            zona = sc.nextLine();

            Equipo ne = new Equipo(nombre, cant_jugadores, cant_comodines, zona);

            System.out.println("\n" +
                    "INGRESE LOS " + cant_jugadores + " JUGADORES DEL EQUIPO ");
            for (int i = 0; i < cant_jugadores; i++) {
                System.out.println("Jugador " + (i + 1) + "/" + cant_jugadores);
                ne.jugadores[i] = j.altaJugador(i, cant_jugadores);
            }

            equipos[contador] = ne;

            contador++;
        }
    }

    public void muestraEquipos(Equipo[] e) {
        System.out.println("Equipos cargados: ");

        // Encabezado de la grilla
        System.out.println("+------------+-----------+-----------+------+");
        System.out.println("| Nombre     | Jugadores | Comodines | Zona |");
        System.out.println("+------------+-----------+-----------+------+");

        for (int i = 0; i < e.length; i++) {
            System.out.printf("| %-10s | %-9s | %-9s | %-4s |\n", e[i].nombre, e[i].cant_jugadores, e[i].cant_comodines,
                    e[i].zona);
        }

    }

    /*
     * public void muestraJugadores(Equipo[] e) {
     * System.out.println("Jugadores cargados: ");
     * 
     * // Encabezado de la grilla
     * System.out.println(
     * "+------------+------------+----------+-----------+--------+---------------+-------------------+--------------+--------------+"
     * );
     * System.out.println(
     * "| Nombre     | Apellido   | Capitán  | Subcapitán| Comodín| Fotocopia DNI | Fotocopia prepaga | Apto médico  |    Equipo     "
     * );
     * System.out.println(
     * "+------------+------------+----------+-----------+--------+---------------+-------------------+--------------+---------------"
     * );
     * 
     * for (Equipo equipo : e) {
     * 
     * for (Jugador jugador : equipo.jugadores) {
     * System.out.
     * printf("| %-10s | %-10s | %-8s | %-12s | %-8s | %-9s | %-6s | %-13s | %-13s |\n"
     * ,
     * jugador.nombre, jugador.apellido,
     * jugador.capitan ? "Sí" : "No", jugador.subcapitan ? "Sí" : "No",
     * jugador.comodin ? "Sí" : "No",
     * jugador.fotocopia_dni ? "Sí" : "No", jugador.fotocopia_prepaga ? "Sí" : "No",
     * jugador.apto_medico ? "Sí" : "No",
     * equipo.nombre);
     * }
     * 
     * System.out.println(
     * "+------------+------------+------+--------------+----------+-----------+-------+---------------+------------------+--------------+"
     * );
     * }
     * }
     */

    public void muestraJugadores(Equipo[] e) {
        System.out.println("Jugadores cargados: ");

        // Encabezado de la grilla
        System.out.println(
                "+----------------+--------------+-----------+------------+---------+---------------+-------------------+--------------+---------------");
        System.out.println(
                "|     Nombre     |   Apellido   |  Capitán  | Subcapitán | Comodín | Fotocopia DNI | Fotocopia prepaga | Apto médico  |    Equipo     ");
        System.out.println(
                "+----------------+--------------+-----------+------------+---------+---------------+-------------------+--------------+---------------");

        for (Equipo equipo : e) {
            for (Jugador jugador : equipo.jugadores) {
                System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-7s | %-13s | %-18s | %-12s | %-13s |\n",
                        jugador.nombre, jugador.apellido,
                        jugador.capitan ? "Sí" : "No", jugador.subcapitan ? "Sí" : "No",
                        jugador.comodin ? "Sí" : "No",
                        jugador.fotocopia_dni ? "Sí" : "No", jugador.fotocopia_prepaga ? "Sí" : "No",
                        jugador.apto_medico ? "Sí" : "No",
                        equipo.nombre);
            }

            System.out.println(
                    "+------------+------------+-------+--------------+--------+---------------+-------------------+--------------+---------------");
        }
    }

}
