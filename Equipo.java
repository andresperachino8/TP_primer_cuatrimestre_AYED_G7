import java.util.Scanner;

public class Equipo {
    String nombre;
    int cant_jugadores;
    int cant_comodines;
    String zona; // (A o B)

    // Método constructor
    public Equipo() {
        this.nombre = "";
        this.cant_jugadores = 0;
        this.cant_comodines = 0;
        this.zona = "";
    }

    public void altaEquipo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la cantidad de jugadores del equipo: (Mínimo 9 - Máximo 14)");
        cant_jugadores = sc.nextInt();
        // Valida cantidad minima y maxima
        while (cant_jugadores <= 9 || cant_jugadores >= 14) {
            System.out.println("Cantidad incorrecta. Debe ingresar un Minimo de 9 jugadores y un maximo de 14");
            System.out.println("Ingrese la cantidad de jugadores del equipo: (Mínimo 9 - Máximo 14)");
            cant_jugadores = sc.nextInt();
        }

        System.out.println("Ingrese la cantidad de comodines que posee el equipo: (Hasta 2)");
        cant_comodines = sc.nextInt();
        // Valida cantidad de comodines admitida
        while (cant_comodines < 0 || cant_comodines > 2) {
            System.out.println("Cantidad incorrecta. Debe ingresar un maximo de 2");
            System.out.println("Ingrese la cantidad de comodines del equipo: (Máximo 2)");
            cant_comodines = sc.nextInt();
        }

        System.out.println("Ingrese la zona del equipo: (A o B)");

        zona = sc.next();

        sc.close();
    }
}
