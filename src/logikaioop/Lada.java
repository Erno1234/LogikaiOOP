package logikaioop;

public class Lada {

    private String allitas, anyag;
    private boolean kincs;
 

<<<<<<< HEAD
    public Lada(String allitas, String anyag, boolean kincs) {
        this.allitas = allitas;
=======
    public Lada(String allitsa, String anyag, boolean kincs) {
        this.allitas = allitsa;
>>>>>>> origin/Marton
        this.anyag = anyag;
        this.kincs = kincs;
    }



    public String getAllitsa() {
        return allitas;
    }

    public void setAllitsa(String allitsa) {
        this.allitas = allitsa;
<<<<<<< HEAD

=======
>>>>>>> origin/Marton
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
<<<<<<< HEAD
  
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
=======
        return  allitas + ", anyag=" + anyag + ", kincs=" + kincs ;
>>>>>>> origin/Marton
    }


    

}
