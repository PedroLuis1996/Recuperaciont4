package ejercicio2;

public class P2Principal {
    public static void main(String[] args) {
        Fiesta f1 = new Fiesta(100);
        InvitadoVip v1 = new InvitadoVip("chanel");
        Invitado i1 = new InvitadoVip("bisbal");

        System.out.println(i1);
        System.out.println(v1);
        System.out.println(v1.getFiesta());
        f1.entrar(v1);
        System.out.println(v1.getFiesta());

    }
}
