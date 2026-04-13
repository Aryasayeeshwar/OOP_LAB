public class ViewGrade {
    public static void main(String[] args) {

        String name = "Rahul";
        int maths = 85;
        int physics = 90;      // corrected variable name
        int chemistry = 78;

        int total = maths + physics + chemistry;
        double average = total / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}