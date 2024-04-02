package ejercicio1;

public class Elfo extends Criatura{
    public Elfo(String nombre, int edad) throws IllegalArgumentException {
        super(nombre, edad);
    }

    public void realizarAccion(){
        System.out.println("[" + getNombre() + "] dispara una flecha magica");
    }

}
