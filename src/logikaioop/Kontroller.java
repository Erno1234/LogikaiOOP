package logikaioop;

import java.util.Scanner;

public class Kontroller {

    private Lada lada1, lada2, lada3;
    private static final Scanner scr = new Scanner(System.in);

    public Kontroller() {
        this.lada1 = new Lada("Az 1. állítás!", " Cement ", false);
        this.lada2 = new Lada("A 2. állítás! ", " Fa ", false);
        this.lada3 = new Lada("A 3. állítás! ", " Kő ", true);
    }

    public int bekeres() {
        System.out.println("Meliyk válasz a helyes?");
        return scr.nextInt();
    }

}
