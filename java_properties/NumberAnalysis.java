public class NumberAnalysis {
    public static void main(String[] args) {

        int[] numbers = {12, 7, 25, 8, 19};

        int sum = 0;
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is Even");
            } else {
                System.out.println(numbers[i] + " is Odd");
            }
        }

        System.out.println("Total Sum: " + sum);
        System.out.println("Largest Number: " + largest);
    }
}