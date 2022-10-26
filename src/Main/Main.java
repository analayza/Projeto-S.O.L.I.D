package Main;


import Classes.Bruxo;
import Classes.Guerreiro;
import Classes.Mago;
import Classes.Paladino;
import Raca.Elfo;
import Raca.Humano;
import Raca.MortoVivo;
import Raca.Orc;

public class Main {
    public static void main(String[] args) {

        Elfo elfo1 = new Elfo("Layza", "Hetero", new Bruxo());
        System.out.println(elfo1);
        elfo1.poder1();
        elfo1.poder2();
        System.out.println("------------------------------------");


        Humano humano1 = new Humano("Bruno", "Hetero", new Guerreiro());
        System.out.println(humano1);
        humano1.poder1();
        humano1.poder2();
        System.out.println("------------------------------------");


        MortoVivo mortoVivo1 = new MortoVivo("Joao","Gay", new Mago());
        System.out.println(mortoVivo1);
        mortoVivo1.poder1();
        mortoVivo1.poder2();
        System.out.println("------------------------------------");


        Orc orc1 = new Orc("Venicio","Gay", new Paladino());
        System.out.println(orc1);
        orc1.poder1();
        orc1.poder2();
        System.out.println("------------------------------------");

    }
}
