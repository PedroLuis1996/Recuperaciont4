package ejercicio2;

import java.util.Objects;
import java.util.Optional;

public class Fiesta {
    private int glamur;
    private int aforo;
    private  int invitados_actuales;



    public Fiesta(int aforo) {
        this.glamur = 0;
        this.aforo = aforo;
        this.invitados_actuales = 0;
    }

    public int getGlamur() {
        return glamur;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getInvitados_actuales() {
        return invitados_actuales;
    }

    public void setInvitados_actuales(int invitados_actuales) {
        this.invitados_actuales = invitados_actuales;
    }


    public void entrar(Invitado i){
        if (i.getFiesta() != null){
            throw new InvitadoIncorrectoException("esta invitado en otro fiesta");
        } else {
            if (getAforo() == getInvitados_actuales()){
                throw new AfotoCompletoException();
            } else {
                glamur = glamur + i.getFama();
                i.setFiesta(this);

            }
        }

    }

    public void salir(Invitado i){
        if (i.getFiesta() != this){
            throw  new InvitadoIncorrectoException("el invitado no esta en la fiesta");
        } else {
            glamur = glamur - i.getFama();
            i.setFiesta(null);
        }
    }

    public void Fiesta_actual(){
        System.out.println("fiesta\n" +
                "Glamur: " + getGlamur() + "\n" +
                "Invitados actuales: " + getInvitados_actuales() + "\n" +
                "Aforo: "+ getAforo() + "\n");
    }

}
