package ejercicio1;

public class HombreLobo extends Criatura{

    public HombreLobo(String nombre, int edad) throws IllegalArgumentException {
        super(nombre, edad);
    }

    public void realizarAccion(){
        System.out.println("[" + getNombre() + "] aulla a la luna");
    }
}
