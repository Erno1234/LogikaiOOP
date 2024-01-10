
package logikaioop;

import java.util.Scanner;

public class Kontroller {

    private Lada[] ladak;
    private static final Scanner scr = new Scanner(System.in);

    public Kontroller() {
        ladak = new Lada[3];
        System.out.println("Minden láda 1-1 állítást tartalmaz, csak az egyik igaz. Melyikben van kincs?");
        ladak[0]= new Lada("én rejtem a kincset!", " Arany láda: ", false);
        ladak[1] = new Lada("nem én rejtem a kincset!", " Ezüst láda: ", true);
        ladak[2] = new Lada("az arany hazudik ", " Bronz láda: ", false);   
        
         for (Lada lada : ladak) {
            System.out.println(lada.getAnyag()+ " "+lada.getAllitas());
        }
        eredemeny();
        
    }

    public int bekeres() {
        System.out.println("Meliyk válasz a helyes?");
        return scr.nextInt();
    }

    private void eredemeny() {
        int valasz = bekeres();
        if(valasz == 2){
            System.out.println("A válasz jó");
        }
        else{
            System.out.println("A válasz rossz");
        }
    }

}
