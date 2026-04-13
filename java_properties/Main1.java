class Student {

    String name;
    int age;
    String course;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "nothing";
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "nothing";
    }

    // Constructor with two parameters
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age + "Course: " + course);
    }
}

public class Main1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Nithish");
        Student s3 = new Student("Rahul", 20,"CSE");

        s1.display();
        s2.display();
        s3.display();
    }
}

