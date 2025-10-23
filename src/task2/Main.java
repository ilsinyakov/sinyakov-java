package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter string 'a':");
        String a = scan.next();

        System.out.println("Please, enter string 'b':");
        String b = scan.next();

        CompareStrings compareStrings = new CompareStrings(a, b);
        compareStrings.checkStringsEqual();
    }
}
