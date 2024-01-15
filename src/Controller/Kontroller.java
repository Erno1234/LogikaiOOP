
package Controller;
 
import View.ConsoleView;
import modell.Lada;
 
public class Kontroller {
 
    ConsoleView cv = new ConsoleView();
    private Lada[] ladak;
 
    public Kontroller() {
        ladak = new Lada[3];
        System.out.println("Minden láda 1-1 állítást tartalmaz, csak az egyik igaz. Melyikben van kincs?");
        ladak[0] = new Lada("én rejtem a kincset!", " Arany láda: ", false);
        ladak[1] = new Lada("nem én rejtem a kincset!", " Ezüst láda: ", true);
        ladak[2] = new Lada("az arany hazudik ", " Bronz láda: ", false);
 
        for (Lada lada : ladak) {
            cv.ladaLeiras(lada);
        }
        eredemeny();
 
    }
 
    private void eredemeny() {
        int valasz = cv.valasz();
        boolean helyesE = (valasz == 2);
        cv.eredmeny(helyesE);
    }
 
}