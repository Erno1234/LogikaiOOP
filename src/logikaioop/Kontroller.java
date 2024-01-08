package logikaioop;

public class Kontroller {

    private Lada lada1, lada2, lada3;

    public Kontroller() {
        this.lada1 = new Lada("Az 1. állítás!", " Cement ", false);
        this.lada2 = new Lada("A 2. állítás! ", " Fa ", false);
        this.lada3 = new Lada("A 3. állítás! ", " Kő ", true);
    }

    public Lada getL1() {
        return lada1;
    }

    public void setL1(Lada l1) {
        this.lada1 = l1;
    }

    public Lada getL2() {
        return lada2;
    }

    public void setL2(Lada l2) {
        this.lada2 = l2;
    }

    public Lada getL3() {
        return lada3;
    }

    public void setL3(Lada l3) {
        this.lada3 = l3;
    }

    @Override
    public String toString() {
        return  "Első láda: " + lada1 + " Második láda: " + lada2 + " Harmadik láda: " + lada3;
    }

    
}
