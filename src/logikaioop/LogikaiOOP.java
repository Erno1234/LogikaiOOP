
package logikaioop;

    
public class LogikaiOOP {
    
    
    public static void main(String[] args) {
        Bekeres b1 = new Bekeres(1);
        Bekeres b2 = new Bekeres(2);
        Bekeres b3 = new Bekeres(3);
        System.out.println("Leírás");
        System.out.println("Az "+b1.toString()+". állítás!");
        System.out.println("A "+b2.toString()+". állítás!");
        System.out.println("A "+b3.toString()+". állítás!");
        System.out.println("Melyik:");
        System.out.println("A válasz jó | rossz");
    }
    
}
