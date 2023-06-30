import java.util.Scanner;

public class Jugador {
    // Propiedades de clase
    String nombre;
    String apellido;
    int dni;
    String telefono;
    String domicilio;
    int edad;
    String nacionalidad;
    String nombre_equipo;
    boolean capitan; // true o false
    boolean subcapitan; // true o false
    boolean comodin; // true o false
    boolean fotocopia_dni; // true o false / obligatorio
    boolean fotocopia_prepaga; // true o false / obligatorio
    boolean apto_medico; // true o false / obligatorio

    // Método constructor
    public Jugador() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.edad = 0;
        this.nacionalidad = "";
        this.nombre_equipo = "";
        this.capitan = false;
        this.subcapitan = false;
        this.comodin = false;
        this.fotocopia_dni = false;
        this.fotocopia_prepaga = false;
        this.apto_medico = false;
    }

    // Método para dar de alta nuevo jugador / faltan validaciones de datos
    public void altaJugador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----INGRESO NUEVO JUGADOR-----");
        System.out.println("Ingrese el nombre del jugador: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del jugador: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el DNI del jugador: ");
        dni = sc.nextInt();
        System.out.println("Ingrese la nacionalidad del jugador: ");
        nacionalidad = sc.nextLine();
        System.out.println("Ingrese el nombre del equipo del jugador: ");
        nombre_equipo = sc.nextLine();
        System.out.println("El jugador ingresado es capitán de su equipo? (true/false) ");
        capitan = sc.nextBoolean();
        System.out.println("El jugador ingresado es subcapitán de su equipo? (true/false) ");
        subcapitan = sc.nextBoolean();
        System.out.println("El jugador ingresado es comodín de su equipo? (true/false) ");
        comodin = sc.nextBoolean();
        System.out.println("El jugador ingresado entregó la fotocopia del DNI? (true/false) ");
        fotocopia_dni = sc.nextBoolean();
        System.out.println("El jugador ingresado entregó la fotocopia de la prepaga? (true/false) ");
        fotocopia_prepaga = sc.nextBoolean();
        System.out.println("El jugador ingresado posee apto médico? (true/false) ");
        apto_medico = sc.nextBoolean();

        sc.close();
    }

}
