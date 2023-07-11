import java.util.Scanner;

public class Equipo {
    String nombre;
    int cant_jugadores;
    int cant_comodines;
    String zona; // (A o B)
    Jugador[] jugadores;

    int nequipos = 8;
    Equipo equipos[] = new Equipo[nequipos];

    // Método constructor
    public Equipo(String nombre, int cant_jugadores, int cant_comodines, String zona) {
        this.nombre = nombre;
        this.cant_jugadores = cant_jugadores;
        this.cant_comodines = cant_comodines;
        this.zona = zona;
        this.jugadores = new Jugador[cant_jugadores];
        // CREAR METODO DE ALTA JUGADORES LUEGO DE LA CARGA DEL EQUIPO
    }

    public Equipo() {
        this.nombre = "";
        this.cant_jugadores = 0;
        this.cant_comodines = 0;
        this.zona = "";
    }

    public void altaEquipo() {

        int contador = 0;

        Scanner sc = new Scanner(System.in);

        while (contador < 8) {

            System.out.println("-----INGRESO NUEVO EQUIPO-----");

            System.out.println("Ingrese el nombre del equipo [" + (contador + 1) + "/8] ");
            nombre = sc.nextLine();

            System.out.println(
                    "Ingrese la cantidad de jugadores del equipo [" + (contador + 1) + "/8] (Mínimo 9 - Máximo 14)");
            cant_jugadores = Integer.parseInt(sc.nextLine());

            // Valida cantidad minima y maxima
            while (cant_jugadores < 9 || cant_jugadores > 14) {
                System.out.println("Cantidad incorrecta. Debe ingresar un Minimo de 9 jugadores y un maximo de 14");
                System.out.println(
                        "Ingrese la cantidad de jugadores del equipo [" + (contador + 1)
                                + "/8] (Mínimo 9 - Máximo 14)");
                cant_jugadores = Integer.parseInt(sc.nextLine());
            }

            System.out
                    .println("Ingrese la cantidad de comodines que posee el equipo [" + (contador + 1)
                            + "/8]: (Hasta 2)");
            cant_comodines = Integer.parseInt(sc.nextLine());
            // Valida cantidad de comodines admitida
            while (cant_comodines < 0 || cant_comodines > 2) {
                System.out.println("Cantidad incorrecta. Debe ingresar un maximo de 2");
                System.out.println("Ingrese la cantidad de comodines del equipo [" + (contador + 1) + "/8] (Máximo 2)");
                cant_comodines = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Ingrese la zona del equipo [" + (contador + 1) + "/8] (A o B)");
            zona = sc.nextLine();

            Equipo ne = new Equipo(nombre, cant_jugadores, cant_comodines, zona);
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
}
