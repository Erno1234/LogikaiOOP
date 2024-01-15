package View;

import java.util.Scanner;
import modell.Lada;

public class ConsoleView {

    private static final Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static void leiras() {
        System.out.println("Minden láda 1-1 állítást tartalmaz, csak az egyik igaz. Melyikben van kincs?");
    }

    public static void ladaLeiras(Lada lada) {
        System.out.println(lada.getAnyag() + " " + lada.getAllitas());
    }

    public static void eredmeny(boolean valasz) {
        if (valasz) {
            System.out.println("A válasz jó");
        } else {
            System.out.println("A válasz rossz");
        }
    }

    public static int valasz() {
        System.out.println("Melyik válasz a helyes?");
        return scr.nextInt();
    }

}
