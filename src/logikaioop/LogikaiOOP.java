
package logikaioop;

import java.util.Scanner;
    
public class LogikaiOOP {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Bekeres b1 = new Bekeres(1);
        Bekeres b2 = new Bekeres(2);
        Bekeres b3 = new Bekeres(3);
        System.out.println("Leírás");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println("Melyik:");
        String beker = sc.nextLine();
        System.out.println("A válasz jó | rossz");
    }
    
}
