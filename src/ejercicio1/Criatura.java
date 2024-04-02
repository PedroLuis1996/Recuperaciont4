package ejercicio1;

abstract public class Criatura {

    private String nombre;
    private int edad;
    private int nivel_energia;

    public Criatura(String nombre, int edad) throws IllegalArgumentException{
        if (nombre.isBlank()|| nombre == null|| edad < 0 ){
           throw new IllegalArgumentException("error en los datos");
        } else {
            this.nombre = nombre;
            this.edad = edad;
        }





    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel_energia() {
        return nivel_energia;
    }

    public void setNivel_energia(int nivel_energia) {
        this.nivel_energia = nivel_energia;
    }


}
