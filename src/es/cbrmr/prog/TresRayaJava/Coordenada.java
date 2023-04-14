package es.cbrmr.prog.TresRayaJava;
import java.util.Scanner;
class Coordenada {
    private int fila;
    private int columna;
    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    public int getFila() {
        return fila;
    }
    public int getColumna() {
        return columna;
    }
    public static Coordenada pedirPorTeclado() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Fila: ");
        int filaTmp = kbd.nextInt();
//        kbd.next();
        System.out.print("Columna: ");
        int columnaTmp = kbd.nextInt();
        return new Coordenada(filaTmp, columnaTmp);
    }
}
