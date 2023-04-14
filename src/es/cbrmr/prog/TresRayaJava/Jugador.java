package es.cbrmr.prog.TresRayaJava;
import java.util.Scanner;
class Jugador {
    private String nombre;
    private char ficha;
    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }
    public Jugador(char ficha) {
        this.ficha = ficha;
        nombre = null;
    }
    public void putNombre() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Nombre del jugador: ");
        nombre = kbd.nextLine();
    }
    public void colocarFicha(Tablero tablero) {
        Coordenada coord = Coordenada.pedirPorTeclado();
        if(tablero.esVacia(coord)) {
            tablero.ponFicha(ficha, coord);
        } else {
            colocarFicha(tablero);
        }
    }
    public void mueveFicha(Tablero tablero) {
        Coordenada del = Coordenada.pedirPorTeclado();
        if(tablero.hayFicha(ficha, del)) {
            Coordenada move = Coordenada.pedirPorTeclado();
            if(tablero.esVacia(move)) {
                tablero.quitarFicha(del);
                tablero.ponFicha(ficha, move);
            } else {
                colocarFicha(tablero);
                tablero.quitarFicha(del);
            }
        } else {
            mueveFicha(tablero);
        }
    }
    public void haGanado(Tablero tablero) {
        if(tablero.hayTresEnRaya()) {
            System.out.println("El jugador " + nombre + " ha ganado.");
        }
    }
}
