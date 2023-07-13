import java.util.Scanner;

public class Jugador {
    // Propiedades de clase
    String nombre;
    String apellido;
    int edad;
    String nombre_equipo;
    boolean capitan; // true o false
    boolean subcapitan; // true o false
    boolean comodin; // true o false
    boolean fotocopia_dni; // true o false / obligatorio
    boolean fotocopia_prepaga; // true o false / obligatorio
    boolean apto_medico; // true o false / obligatorio

    // LA CANTIDAD DE JUGADORES SE DETERMINA POR EL CAMPO cant_jugadores ASIGNADO EN
    // CADA EQUIPO
    // int njugadores = 3;
    // Jugador jugadores[] = new Jugador[njugadores];

    // Método constructor
    public Jugador() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.nombre_equipo = "";
        this.capitan = false;
        this.subcapitan = false;
        this.comodin = false;
        this.fotocopia_dni = false;
        this.fotocopia_prepaga = false;
        this.apto_medico = false;
    }

    // Método constructor con parámetros
    public Jugador(String nombre, String apellido, boolean capitan, boolean subcapitan,
            boolean comodin,
            boolean fotocopia_dni, boolean fotocopia_prepaga, boolean apto_medico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.capitan = capitan;
        this.subcapitan = subcapitan;
        this.comodin = comodin;
        this.fotocopia_dni = fotocopia_dni;
        this.fotocopia_prepaga = fotocopia_prepaga;
        this.apto_medico = apto_medico;
    }

    // Método para dar de alta nuevo jugador / faltan validaciones de datos
    public Jugador altaJugador(int contador, int njugadores) {
        // int contador = 0;
        Scanner sc = new Scanner(System.in);

        // while (contador < 3) {

        // System.out.println("-----INGRESO NUEVO JUGADOR-----");
        System.out.println("Ingrese el nombre del jugador [" + (contador + 1) + "/" + njugadores + "]");
        nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del jugador [" + (contador + 1) + "/" + njugadores + "]");
        apellido = sc.nextLine();

        System.out.println("Ingrese la edad del jugador [" + (contador + 1) + "/" + njugadores + "]");
        edad = Integer.parseInt(sc.nextLine());

        // System.out.println("Ingrese el nombre del equipo del jugador [" + (contador +
        // 1) + "/" + njugadores + "]");
        // nombre_equipo = sc.nextLine();

        System.out.println("El jugador ingresado es capitán de su equipo? (S/N) ");
        String c = sc.nextLine();
        while (!c.equals("S") && !c.equals("N")) {
            System.out.println("¡DATO INCORRECTO!");
            System.out.println("El jugador ingresado es capitán de su equipo? (S/N) ");
            c = sc.nextLine();
        }
        if (c.equals("S")) {
            capitan = true;
        } else if (c.equals("N")) {
            capitan = false;
        }

        // Valida si el jugador es capitan, entonces no es subcapitan
        if (capitan == true) {
            subcapitan = false;
        } else if (capitan == false) {
            System.out.println("El jugador ingresado es subcapitán de su equipo? (S/N) ");
            String s = sc.nextLine();
            while (!s.equals("S") && !s.equals("N")) {
                System.out.println("¡DATO INCORRECTO!");
                System.out.println("El jugador ingresado es subcapitán de su equipo? (S/N) ");
                s = sc.nextLine();
            }
            if (s.equals("S")) {
                subcapitan = true;
            } else if (s.equals("S")) {
                subcapitan = false;
            }
        }

        System.out.println("El jugador ingresado es comodín de su equipo? (S/N) ");
        String co = sc.nextLine();
        while (!co.equals("S") && !co.equals("N")) {
            System.out.println("¡DATO INCORRECTO!");
            System.out.println("El jugador ingresado es comodín de su equipo? (S/N) ");
            co = sc.nextLine();
        }
        if (co.equals("S")) {
            comodin = true;
        } else if (co.equals("N")) {
            comodin = false;
        }

        System.out.println("El jugador ingresado entregó la fotocopia del DNI? (S/N) ");
        String f = sc.nextLine();
        while (!f.equals("S") && !f.equals("N")) {
            System.out.println("¡DATO INCORRECTO!");
            System.out.println("El jugador ingresado entregó la fotocopia del DNI? (S/N) ");
            f = sc.nextLine();
        }
        if (f.equals("S")) {
            fotocopia_dni = true;
        } else if (f.equals("N")) {
            fotocopia_dni = false;
        }

        System.out.println("El jugador ingresado entregó la fotocopia de la prepaga? (S/N) ");
        String p = sc.nextLine();
        while (!p.equals("S") && !p.equals("N")) {
            System.out.println("¡DATO INCORRECTO!");
            System.out.println("El jugador ingresado entregó la fotocopia de la prepaga? (S/N) ");
            p = sc.nextLine();
        }
        if (p.equals("S")) {
            fotocopia_prepaga = true;
        } else if (p.equals("N")) {
            fotocopia_prepaga = false;
        }

        System.out.println("El jugador ingresado posee apto médico? (S/N) ");
        String a = sc.nextLine();
        while (!a.equals("S") && !a.equals("N")) {
            System.out.println("¡DATO INCORRECTO!");
            System.out.println("El jugador ingresado posee apto médico? (S/N) ");
            a = sc.nextLine();
        }
        if (a.equals("S")) {
            apto_medico = true;
        } else if (a.equals("N")) {
            apto_medico = false;
        }

        Jugador j = new Jugador(nombre, apellido, capitan, subcapitan, comodin, fotocopia_dni, fotocopia_prepaga,
                apto_medico);

        return j;
        // Jugador nj = new Jugador(nombre, apellido, edad, nombre_equipo,
        // capitan,subcapitan, comodin, fotocopia_dni, fotocopia_prepaga, apto_medico);
        // jugadores[contador] = nj;

        // contador++;
        // }

    }

    /*
     * public void muestraJugadores(Jugador[] e) {
     * System.out.println("Jugadores cargados: ");
     * 
     * // Encabezado de la grilla
     * System.out.println(
     * "+------------+------------+------+--------------+----------+-----------+--------+---------------+-------------------+--------------+"
     * );
     * System.out.println(
     * "| Nombre     | Apellido   | Edad | Nombre equipo| Capitán  | Subcapitán| Comodín| Fotocopia DNI | Fotocopia prepaga | Apto médico  |"
     * );
     * System.out.println(
     * "+------------+------------+------+--------------+----------+-----------+--------+---------------+-------------------+--------------+"
     * );
     * 
     * for (int i = 0; i < jugadores.length; i++) {
     * System.out.
     * printf("| %-10s | %-10s | %-4d | %-12s | %-8s | %-9s | %-6s | %-13s | %-16s | %-12s |\n"
     * ,
     * jugadores[i].nombre, jugadores[i].apellido, jugadores[i].edad,
     * jugadores[i].nombre_equipo,
     * jugadores[i].capitan ? "Sí" : "No", jugadores[i].subcapitan ? "Sí" : "No",
     * jugadores[i].comodin ? "Sí" : "No",
     * jugadores[i].fotocopia_dni ? "Sí" : "No", jugadores[i].fotocopia_prepaga ?
     * "Sí" : "No",
     * jugadores[i].apto_medico ? "Sí" : "No");
     * }
     * 
     * System.out.println(
     * "+------------+------------+------+--------------+----------+-----------+-------+---------------+------------------+--------------+"
     * );
     * }
     */

}
