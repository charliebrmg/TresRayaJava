package es.cbrmr.prog.TresRayaJava;
class TresEnRaya {
    private Tablero tablero;
    private Jugador[] jugadores = new Jugador[2];
    private Turno turno;
    private static final char fichaJugador1 = 'X';
    private static final char fichaJugador2 = 'O';
    public TresEnRaya() {
        this.turno = new Turno();
        this.tablero = new Tablero();
        jugadores[0] = new Jugador(fichaJugador1);
        jugadores[1] = new Jugador(fichaJugador2);
    }
    public void jugar() {
        System.out.println("A continuación, introduzca el nombre del jugador 1.");
        jugadores[0].putNombre();
        System.out.println("A continuación, introduzca el nombre del jugador 2.");
        jugadores[1].putNombre();
        System.out.println("Empieza el juego. Comienza el jugador 1.");
        while(!tablero.hayTresEnRaya()) {
            jugadores[turno.quienToca()].colocarFicha(tablero);
            turno.cambiar();
            tablero.mostrar();
            if(!tablero.hayTresEnRaya()) {
                System.out.println("Continúa el jugador " + (turno.quienToca() + 1));
            }
        }
        jugadores[turno.quienNoToca()].haGanado(tablero);
    }
}
