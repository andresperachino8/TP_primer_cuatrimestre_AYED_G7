import java.util.Scanner;

public class Torneo_F5 {

    static Equipo[] equipos = new Equipo[8];
    static int contador = 0;

    public static void main(String[] args) throws Exception {
        int opc = 110;
        Scanner sc = new Scanner(System.in);

        // Menu general
        while (opc != 0) {
            Menues.muestraMenuGeneral();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    // Desarrollar alta de equipo con bucle de creacion de objetos
                    Equipo equipo1 = new Equipo();
                    equipos[contador] = equipo1;
                    equipos[contador].altaEquipo();
                    contador++;
                    break;
                case 2:
                    // Desarrollar alta de jugador con bucle de creacion de objetos
                    Jugador jugador1 = new Jugador();
                    jugador1.altaJugador();
                    break;
                case 3:
                    // Listar equipos
                    break;
                case 4:
                    // Listar jugadores
                    break;
                case 5:
                    // Listar zonas
                    break;
            }
        }
        System.out.println("Saliendo...");

        sc.close();

    }
}
