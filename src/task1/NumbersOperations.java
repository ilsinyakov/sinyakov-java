package task1;

public class NumbersOperations {
    private final int a;
    private final int b;

    public NumbersOperations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void compareNumbers() {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public void operationsWithNumbers() {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        if (b == 0) {
            System.out.println("Division by zero");
        } else {
            System.out.println("a / b = " + (double) a / b);
        }

        System.out.println("a * b = " + (a * b));
    }
}
