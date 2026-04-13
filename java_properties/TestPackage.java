import mathoperations.Addition;

public class TestPackage {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int result = obj.add(10, 20);
        System.out.println("The sum is: " + result);
    }
}
