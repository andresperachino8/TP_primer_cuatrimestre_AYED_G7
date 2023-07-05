import java.util.Scanner;

public class Torneo_F5 {

    static int contador = 0;

    public static void main(String[] args) throws Exception {
        int opc = 110;
        Scanner sc = new Scanner(System.in);

        Equipo equipo = new Equipo();
        equipo.altaEquipo();

        equipo.muestraEquipos(equipo.equipos);

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
        sc.close();
    }
}
