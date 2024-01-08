
package logikaioop;

import java.util.Objects;

public class Allitasok {
    String a1,a2,a3;

    public Allitasok() {
        this.a1 = "Az 1. állitás";
        this.a2 = "A 2. állitás!";
        this.a3 = "A 3. állitás!";
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    @Override
    public String toString() {
        return "Allitasok{" + "a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.a1);
        hash = 53 * hash + Objects.hashCode(this.a2);
        hash = 53 * hash + Objects.hashCode(this.a3);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Allitasok other = (Allitasok) obj;
        return true;
    }
    
    
}
