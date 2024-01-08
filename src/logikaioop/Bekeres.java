
package logikaioop;


public class Bekeres {
    private int allitas;

    public Bekeres(int allitas) {
        this.allitas = allitas;
    }
    
    public int getAllitas() {
        return allitas;
    }

    public void setAllitas(int allitas) {
        this.allitas = allitas;
    }

    @Override
    public String toString() {
        return ""+allitas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.allitas;
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
        final Bekeres other = (Bekeres) obj;
        return this.allitas == other.allitas;
    }
    
    
    
}
