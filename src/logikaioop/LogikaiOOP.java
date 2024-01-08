package logikaioop;

import java.util.Scanner;

public class LogikaiOOP {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LadakFelhasznalas l1 = new LadakFelhasznalas();
        System.out.println("Leírás");
        System.out.println(l1.toString());
        String beker = sc.nextLine();
        System.out.println("A válasz jó | rossz");
    }

}
