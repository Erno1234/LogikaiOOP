
package logikaioop;


public class Lada {
    private String allitsa, anyag;
    private boolean kincs;

    public Lada(String allitsa, String anyag, boolean kincs) {
        this.allitsa = allitsa;
        this.anyag = anyag;
        this.kincs = kincs;
    }

    public String getAllitsa() {
        return allitsa;
    }

    public void setAllitsa(String allitsa) {
        this.allitsa = allitsa;
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
        return "Lada{" + "allitsa=" + allitsa + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }
    
    
            
}
