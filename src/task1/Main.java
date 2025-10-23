package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter number 'a':");
        int a = scan.nextInt();

        System.out.println("Please, enter number 'b':");
        int b = scan.nextInt();

        NumbersOperations numbersOperations = new NumbersOperations(a, b);
        numbersOperations.compareNumbers();
        numbersOperations.operationsWithNumbers();
    }
}
