package es.cbrmr.prog.TresRayaJava;
class Turno {
    private int turno;
    public Turno() {
        turno = 0;
    }
    public int quienToca() {
        return turno;
    }
    public int quienNoToca() {
        if(turno == 0) {
            return 1;
        } else if(turno == 1) {
            return 0;
        } else {
            throw new NullPointerException();
        }
    }
    public void cambiar() {
        if(turno == 0) {
            turno = 1;
        } else if(turno == 1) {
            turno = 0;
        } else {
            throw new NullPointerException();
        }
    }
}
