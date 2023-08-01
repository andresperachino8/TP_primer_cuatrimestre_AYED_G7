import java.util.Random;

public class Resultados {
    String campeon;
    String subcampeon;
    String jugador_goleador;

    public void simulaResultados(Equipo[] e) {
        // Generar un índice aleatorio
        Random random = new Random();
        int indiceEquipoAleatorio = random.nextInt(e.length);
        int indiceEquipoAleatorio1;

        do {
            indiceEquipoAleatorio1 = random.nextInt(e.length);
        } while (indiceEquipoAleatorio1 == indiceEquipoAleatorio);

        int indiceJugadorAleatorio = random.nextInt(e[indiceEquipoAleatorio].cant_jugadores);

        // Acceder al elemento aleatorio en el array
        Equipo equipoCampeon = e[indiceEquipoAleatorio];
        Equipo equipoSubcampeon = e[indiceEquipoAleatorio1];

        Jugador jugadorGoleador = e[indiceEquipoAleatorio].jugadores[indiceJugadorAleatorio];

        // Imprimir el elemento aleatorio
        System.out.println("Equipo campeón: " + equipoCampeon.nombre);
        System.out.println("Equipo Subcampeón: " + equipoSubcampeon.nombre);
        System.out.println("Jugador goleador del torneo: " + jugadorGoleador.nombre + " " + jugadorGoleador.apellido);
    }
}
