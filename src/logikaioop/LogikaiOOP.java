package logikaioop;

import java.util.Scanner;
    
public class LogikaiOOP {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Allitas allitas1 = new Allitas("1. Állitás!");
        Allitas allitas2 = new Allitas("2. Állitás!");
        Allitas allitas3 = new Allitas("3. Állitás!");
        System.out.println("Leírás");
        System.out.println(allitas1);
        System.out.println(allitas2);
        System.out.println(allitas3);
        System.out.println("Melyik:");
        String beker = sc.nextLine();
        System.out.println("A válasz jó | rossz");
    }

}
