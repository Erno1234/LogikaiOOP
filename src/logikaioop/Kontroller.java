package logikaioop;

import java.util.Scanner;

public class Kontroller {

    private static final Scanner scr = new Scanner(System.in);

    public int bekeres(){
        System.out.println("Meliyk válasz a helyes?");
        return scr.nextInt();
    } 
}
