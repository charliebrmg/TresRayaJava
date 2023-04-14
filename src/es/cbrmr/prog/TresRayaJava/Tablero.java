package es.cbrmr.prog.TresRayaJava;
class Tablero {
    private char[][] tablero = new char[3][3];
    private int filas;
    private int columnas;
    public Tablero() {
        for(int i=0; i<tablero.length; i++) {
            for(int j=0; j<tablero[i].length; j++) {
                tablero[i][j] = '_';
            }
        }
        filas = 3;
        columnas = 3;
    }
    public void ponFicha(char ficha, Coordenada coordenada) {
        int x = coordenada.getFila();
        int y = coordenada.getColumna();
        tablero[x][y] = ficha;
    }
    public void quitarFicha(Coordenada coordenada) {
        int x = coordenada.getFila();
        int y = coordenada.getColumna();
        tablero[x][y] = '_';
    }
    public boolean esVacia(Coordenada coordenada) {
        int x = coordenada.getFila();
        int y = coordenada.getColumna();
        if(tablero[x][y] == '_') {
            return true;
        } else {
            return false;
        }
    }
    public boolean hayFicha(char ficha, Coordenada coordenada) {
        int x = coordenada.getFila();
        int y = coordenada.getColumna();
        if(tablero[x][y] == ficha) {
            return true;
        } else {
            return false;
        }
    }
    public boolean hayTresEnRaya() {
        for (int i=0;i<filas;i++) { // Comprobación filas
            if (tablero[i][0]==tablero[i][1] && tablero[i][0]==tablero[i][2] && tablero[i][0]!='_'){
                return true;
            }
        }
        for (int i=0;i<columnas;i++) { // Comprobación columnas
            if (tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i] && tablero[0][i]!='_'){
                return true;
            }
        }
        // Comprobación diagonales
        return (tablero[0][0] != '_' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) ||
                (tablero[0][2] != '_' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]);
    }
    public void mostrar() {
        System.out.println("F0: " + tablero[0][0] + " " + tablero[0][1] + " " + tablero[0][2]);
        System.out.println("F1: " + tablero[1][0] + " " + tablero[1][1] + " " + tablero[1][2]);
        System.out.println("F2: " + tablero[2][0] + " " + tablero[2][1] + " " + tablero[2][2]);
    }
}
