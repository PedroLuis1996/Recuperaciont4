package ejercicio2;

abstract public class Invitado {
    private String nombre;
    private Fiesta fiesta;

    private int fama;

    public Invitado(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFama() {
        return fama;
    }

    public void setFama(int fama) {
        this.fama = fama;
    }

    @Override
    public String toString() {
        return nombre + "(" + fama + ")";
    }

    public Fiesta getFiesta() {
        return fiesta;
    }

    public void setFiesta(Fiesta fiesta) {
        this.fiesta = fiesta;
    }


}
