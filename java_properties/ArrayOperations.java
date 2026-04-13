public class ArrayOperations {
    public static void main(String[] args) {

        int[] marks = {80, 75, 90, 60, 85};

        int sum = 0;
        int max = marks[0];
       
        for (int i = 0; i < marks.length; i++) {

            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }
        }

        double average = sum / (double) marks.length;

        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + max);
    }
}