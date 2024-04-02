package ejercicio1;

public class Dragon extends Criatura implements Volar {
    public Dragon(String nombre, int edad) throws IllegalArgumentException {
        super(nombre, edad);
    }

    public void realizarAccion(){
        System.out.println("[" + getNombre() + "] escupe fuego");
    }

    @Override
    public void volar() {
        System.out.println("[" + getNombre() + "] vuela agilmente sobre los arboles");
    }
}
