
package View;
import javax.swing.JOptionPane;
import modell.Lada;

public class JOptionView {

    public static void leiras() {
        JOptionPane.showMessageDialog(null, "Minden láda 1-1 állítást tartalmaz, csak az egyik igaz. Melyikben van kincs?");
    }

    public static void ladaLeiras(Lada lada) {
        JOptionPane.showMessageDialog(null, lada.getAnyag() + " " + lada.getAllitas(), "Láda információ", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void eredmeny(int valasz) {
        if(valasz == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "A válasz jó");
        }else{
            JOptionPane.showMessageDialog(null, "A válasz rossz");
        }
    }

    public static void eredmeny(boolean valasz) {
        if (valasz) {
            JOptionPane.showMessageDialog(null, "A válasz jó", "Eredmény", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A válasz rossz", "Eredmény", JOptionPane.ERROR_MESSAGE);
        }
    }
}
