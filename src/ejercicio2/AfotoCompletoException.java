package ejercicio2;

public class AfotoCompletoException extends IllegalArgumentException{
    public AfotoCompletoException(String s) {
        super(s);
    }

    public AfotoCompletoException() {
        System.out.println("Aforo completo");
    }
}
