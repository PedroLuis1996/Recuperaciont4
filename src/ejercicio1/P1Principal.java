package ejercicio1;

public class P1Principal {
    public static void main(String[] args) {

        Elfo e1 = new Elfo("legolas", 1);
        Dragon d1 = new Dragon("alduin", 1);
        HombreLobo h1 = new HombreLobo("fantasma", 1);
        Mago m1 = new Mago("aprendiz", 1, 30);
        Mago m2 = new Mago("merlin", 1, 100);


        h1.realizarAccion();
        d1.realizarAccion();
        e1.realizarAccion();
        m1.realizarAccion();
        m2.realizarAccion();

        d1.volar();


    }
}
