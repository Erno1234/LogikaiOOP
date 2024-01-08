
package logikaioop;

import java.util.Objects;


public class Allitas {
    private String allitas;

    public Allitas() {
        this.allitas1 = "Az 1. állítás!";
        this.allitas2 = "A 2. állítás!";
        this.allitas3 = "A 3. állítás!";
    }

    public String getAllitas1() {
        return allitas1;
    }

    public void setAllitas1(String allitas1) {
        this.allitas1 = allitas1;
    }

    public String getAllitas2() {
        return allitas2;
    }

    public void setAllitas2(String allitas2) {
        this.allitas2 = allitas2;
    }

    public String getAllitas3() {
        return allitas3;
    }

    public void setAllitas3(String allitas3) {
        this.allitas3 = allitas3;
    }

    @Override
    public String toString() {
        return "Allitas{" + "allitas1=" + allitas1 + ", allitas2=" + allitas2 + ", allitas3=" + allitas3 + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.allitas1);
        hash = 97 * hash + Objects.hashCode(this.allitas2);
        hash = 97 * hash + Objects.hashCode(this.allitas3);
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
        final Allitas other = (Allitas) obj;
        if (!Objects.equals(this.allitas1, other.allitas1)) {
            return false;
        }
        if (!Objects.equals(this.allitas2, other.allitas2)) {
            return false;
        }
        return Objects.equals(this.allitas3, other.allitas3);
    }
    
}
