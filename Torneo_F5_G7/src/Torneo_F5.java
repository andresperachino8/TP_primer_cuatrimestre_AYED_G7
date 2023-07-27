import java.util.Scanner;

public class Torneo_F5 {

    static int contador = 0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Equipo e = new Equipo();
        Jugador j = new Jugador();
        Resultados r = new Resultados();

        int opcion = 0;
        Menues.muestraMenuGeneral();
        System.out.println("Seleccione una opción: ");
        opcion = Integer.parseInt(sc.nextLine());

        // while (opcion != 6) {
        while (opcion != 5) {

            switch (opcion) {
                case 1:
                    e.altaEquipo();
                    break;
                // case 2:
                // j.altaJugador();
                // break;
                // case 3:
                case 2:
                    e.muestraEquipos(e.equipos);
                    break;
                case 3:
                    // j.muestraJugadores(j.jugadores);
                    e.muestraJugadores(e.equipos);
                    break;
                case 4:
                    // r.simulaResultados(e.equipos, j.jugadores);
                    r.simulaResultados(e.equipos);
                    break;
                // case 6:
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            Menues.muestraMenuGeneral();
            System.out.println("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

        }
        sc.close();

        // PRUEBAS ALTA EQUIPO

        /*
         * Equipo equipo = new Equipo();
         * equipo.altaEquipo();
         * 
         * equipo.muestraEquipos(equipo.equipos);
         */

        // PRUEBAS ALTA JUGADOR
        /*
         * Jugador j = new Jugador();
         * j.altaJugador();
         * 
         * j.muestraJugadores(j.jugadores);
         */

        /*
         * // Menu general
         * while (opc != 0) {
         * 
         * Menues.muestraMenuGeneral();
         * System.out.println("Ingresa una opcion: ");
         * opc = sc.nextInt();
         * switch (opc) {
         * case 1:
         * // Desarrollar alta de equipo con bucle de creacion de objetos
         * Equipo equipo = new Equipo();
         * equipo.altaEquipo();
         * 
         * break;
         * 
         * case 2:
         * // Desarrollar alta de jugador con bucle de creacion de objetos
         * Jugador jugador1 = new Jugador();
         * jugador1.altaJugador();
         * break;
         * case 3:
         * // Listar equipos
         * break;
         * case 4:
         * // Listar jugadores
         * break;
         * case 5:
         * // Listar zonas
         * break;
         * case 0:
         * System.out.println("Saliendo...");
         * break;
         * default:
         * System.out.println("Opcion invalida...");
         * break;
         * }
         * System.out.println("------------------------------------");
         * }
         */
    }
}
