package ejercicio1;

public class Mago extends Criatura{
    private int nivel_Mago;

    public Mago(String nombre, int edad, int nivel_Mago) throws IllegalArgumentException {
        super(nombre, edad);
        this.nivel_Mago = nivel_Mago;
    }

    public int getNivel_Mago() {
        return nivel_Mago;
    }

    public void setNivel_Mago(int nivel_Mago) {
        this.nivel_Mago = nivel_Mago;
    }

    public void realizarAccion(){
        if(nivel_Mago >= 50){
            System.out.println("[" + getNombre() + "] lanza un poderoso hechizo");
        } else if (nivel_Mago < 50){
            System.out.println("[" + getNombre() + "] genera una pequeña chispa");
        }

    }
}
