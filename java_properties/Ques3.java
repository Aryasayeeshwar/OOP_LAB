class Employee {
    void calculateSalary() {
        System.out.println("Base salary");
    }
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary: 50000");
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary: 20000");
    }
}

class ContractEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary: 30000");
    }
}

class Ques3 {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee();
        e.calculateSalary();

        e = new PartTimeEmployee();
        e.calculateSalary();

        e = new ContractEmployee();
        e.calculateSalary();
    }
}