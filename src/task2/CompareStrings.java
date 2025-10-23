package task2;

public class CompareStrings {
    private final String a;
    private final String b;

    public CompareStrings(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void checkStringsEqual() {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
