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
                case 2:
                    e.muestraEquipos(e.equipos);
                    break;
                case 3:
                    e.muestraJugadores(e.equipos);
                    break;
                case 4:
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
    }
}
