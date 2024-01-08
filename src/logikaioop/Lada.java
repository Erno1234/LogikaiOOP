
package logikaioop;


public class Lada {

    private String allitas, anyag;
    private boolean kincs;
 

    public Lada(String allitsa, String anyag, boolean kincs) {
        this.allitas = allitsa;
        this.anyag = anyag;
        this.kincs = kincs;
    }

    public String getAllitsa() {
        return allitas;
    }

    public void setAllitsa(String allitsa) {
        this.allitas = allitsa;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return "Lada{" + "allitsa=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }
    
    
            
}
